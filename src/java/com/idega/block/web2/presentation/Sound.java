package com.idega.block.web2.presentation;

import javax.faces.context.FacesContext;

import org.apache.myfaces.renderkit.html.util.AddResource;
import org.apache.myfaces.renderkit.html.util.AddResourceFactory;

import com.idega.block.web2.business.Web2Business;
import com.idega.business.IBOLookup;
import com.idega.business.IBOLookupException;
import com.idega.idegaweb.IWApplicationContext;
import com.idega.idegaweb.IWMainApplication;
import com.idega.presentation.Block;
import com.idega.presentation.IWContext;
import com.idega.presentation.Page;
import com.idega.presentation.PresentationObjectUtil;
import com.idega.presentation.text.Text;

/**
 * Adds sound support using SoundManager2 and a hidden flash object. You must wait until onload has finished to use it window.<br>
 * Using for example window.onload = function() { your code }. Also you must add Sound before everything else
 * @author eiki
 *
 */
public class Sound extends Block {

	private String id = "";

	public Sound() {
		super();
	}

	public Sound(String id) {
		super();
		this.id = id;
	}
	
	public void main(IWContext iwc) {
		
		Page parentPage = PresentationObjectUtil.getParentPage(this);
		if (parentPage != null) {
			try {

				Web2Business business = getWeb2(iwc);

				String soundURI = business.getBundleURIToSoundManager2Lib();
				String flashFile = business.getBundleURIToSoundManager2FlashFile();

				//hack until WFPage can add scripts and stylesheets
				//TODO remove when myfaces extensions filter in Script works
				AddResource resourceAdder = AddResourceFactory.getInstance(iwc);
				//add a javascript to the header :)
				resourceAdder.addJavaScriptAtPosition(iwc, AddResource.HEADER_BEGIN,soundURI);

				StringBuffer scriptString = new StringBuffer();
				scriptString.append("<script type=\"text/javascript\" > \n")
				.append("\tsoundManager.url = '").append(flashFile).append("'; \n")
				.append("\tsoundManager.defaultOptions.debugMode = false; // disable debug output \n")
				.append("</script> \n");
				this.getChildren().add(new Text(scriptString.toString()));
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	protected Web2Business getWeb2(IWApplicationContext iwac) throws IBOLookupException {
		Web2Business business = (Web2Business) IBOLookup.getServiceInstance(iwac, Web2Business.class);
		return business;
	}

	/**
	 * Remember you cannot call the method before window.onload is called.
	 * @param soundName
	 * @param soundFileURL
	 * @return a scriptlet for playing a sound file
	 */
	public String getPlayScriptlet(String soundName, String soundFileURL) {
		StringBuffer scriptString = new StringBuffer();
		scriptString.append("\tsoundManager.play('").append(soundName).append("','").append(soundFileURL).append("'); \n");
		return scriptString.toString();
	}
	
	/**
	 * Remember you cannot call the method before window.onload is called.
	 * @param soundName
	 * @param soundFileURL
	 * @return a scriptlet for stopping a sound file
	 */
	public String getStopScriptlet(String soundName, String soundFileURL) {
		StringBuffer scriptString = new StringBuffer();
		scriptString.append("\tsoundManager.stop('").append(soundName).append("','").append(soundFileURL).append("'); \n");
		return scriptString.toString();
	}
	
	public String getTestSoundURI() {
		try {
			return getWeb2(IWMainApplication.getDefaultIWApplicationContext()).getBundleURIToSoundManager2TestSoundFile();
		} catch (IBOLookupException e) {
			e.printStackTrace();
		}
		return "LOOKUP FAILED SEE LOGS";
	}
	
	public Object clone(){
		Sound obj = (Sound) super.clone();
		obj.id = id;
		return obj;
	}
	
	
	public Object saveState(FacesContext context) {
		Object values[] = new Object[3];
		values[0] = super.saveState(context);
		values[1] = this.id;
		return values;
	}
	
	public void restoreState(FacesContext context, Object state) {
		Object values[] = (Object[])state;
		super.restoreState(context, values[0]);
		this.id = (String) values[1];
	}

	public String getFamily() {
		return null;
	}

}
