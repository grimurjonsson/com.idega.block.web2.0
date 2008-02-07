package com.idega.block.web2.business;


import java.rmi.RemoteException;

import com.idega.business.IBOService;
import com.idega.business.SpringBeanName;

@SpringBeanName("web2bean")
public interface Web2Business extends IBOService {
	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToBehaviourLib
	 */
	public String getBundleURIToBehaviourLib() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToSoundManager2Lib
	 */
	public String getBundleURIToSoundManager2Lib() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToSoundManager2FlashFile
	 */
	public String getBundleURIToSoundManager2FlashFile() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToSoundManager2TestSoundFile
	 */
	public String getBundleURIToSoundManager2TestSoundFile();

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToReflectionLib
	 */
	public String getBundleURIToReflectionLib() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToPrototypeLib
	 */
	public String getBundleURIToPrototypeLib() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToPrototypeLib
	 */
	public String getBundleURIToPrototypeLib(String scriptaculousLibraryVersion) throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToDojoLib
	 */
	public String getBundleURIToDojoLib() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToScriptaculousLib
	 */
	public String getBundleURIToScriptaculousLib() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToScriptaculousLib
	 */
	public String getBundleURIToScriptaculousLib(String scriptaculousLibraryVersion) throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToScriptaculousLibRootFolder
	 */
	public String getBundleURIToScriptaculousLibRootFolder() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToScriptaculousLibRootFolder
	 */
	public String getBundleURIToScriptaculousLibRootFolder(String scriptaculousLibraryVersion) throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToMootoolsLib
	 */
	public String getBundleURIToMootoolsLib() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToMootoolsLib
	 */
	public String getBundleURIToMootoolsLib(String mootoolsLibraryVersion) throws RemoteException;
	
	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToJQueryLib
	 */
	public String getBundleURIToJQueryLib() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToJQueryLib
	 */
	public String getBundleURIToJQueryLib(String jqueryLibraryVersion) throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToMootoolsStyleFile
	 */
	public String getBundleURIToMootoolsStyleFile() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToScriptsFolder
	 */
	public String getBundleURIToScriptsFolder() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToLibsFolder
	 */
	public String getBundleURIToLibsFolder() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIWithinLibsFolder
	 */
	public String getBundleURIWithinLibsFolder(String uriExtension) throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIWithinScriptsFolder
	 */
	public String getBundleURIWithinScriptsFolder(String uriExtension) throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleIdentifier
	 */
	public String getBundleIdentifier() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToRicoLib
	 */
	public String getBundleURIToRicoLib() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToRico
	 */
	public String getBundleURIToRico() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToJMakiWidgetsFolder
	 */
	public String getBundleURIToJMakiWidgetsFolder() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToJMakiLib
	 */
	public String getBundleURIToJMakiLib() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToLightboxLibRootFolder
	 */
	public String getBundleURIToLightboxLibRootFolder() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToLightboxLibRootFolder
	 */
	public String getBundleURIToLightboxLibRootFolder(String versionNumber) throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getLightboxImagesPath
	 */
	public String getLightboxImagesPath() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getLightboxScriptPath
	 */
	public String getLightboxScriptPath() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getLightboxStylePath
	 */
	public String getLightboxStylePath() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getLightboxScriptFilePath
	 */
	public String getLightboxScriptFilePath() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getLightboxStyleFilePath
	 */
	public String getLightboxStyleFilePath() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToThickboxLibRootFolder
	 */
	public String getBundleURIToThickboxLibRootFolder() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToThickboxLibRootFolder
	 */
	public String getBundleURIToThickboxLibRootFolder(String versionNumber) throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getThickboxScriptPath
	 */
	public String getThickboxScriptPath() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getThickboxStylePath
	 */
	public String getThickboxStylePath() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getThickboxScriptFilePath
	 */
	public String getThickboxScriptFilePath() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getThickboxStyleFilePath
	 */
	public String getThickboxStyleFilePath() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToJQueryLib
	 */
	public String getBundleURIToJQueryLibOLD() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getPrototypeScriptFilePath
	 */
	public String getPrototypeScriptFilePath(String version) throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToControlModalLib
	 */
	public String getBundleURIToControlModalLib() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getNiftyCubeScriptFilePath
	 */
	public String getNiftyCubeScriptFilePath() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getMootoolsBasedBehaviourScriptFilePath
	 */
	public String getMootoolsBasedBehaviourScriptFilePath() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getMoodalboxScriptFilePath
	 */
	public String getMoodalboxScriptFilePath(boolean needFullScript) throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getMoodalboxStyleFilePath
	 */
	public String getMoodalboxStyleFilePath() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getMoodalboxStylePath
	 */
	public String getMoodalboxStylePath() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getMoodalboxScriptPath
	 */
	public String getMoodalboxScriptPath() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToMoodalboxLibRootFolder
	 */
	public String getBundleURIToMoodalboxLibRootFolder() throws RemoteException;

	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToMoodalboxLibRootFolder
	 */
	public String getBundleURIToMoodalboxLibRootFolder(String versionNumber) throws RemoteException;
	
	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getTranscornersScriptFilePath
	 */
	public String getTranscornersScriptFilePath();
	
	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getReflectionForMootoolsScriptFilePath
	 */
	public String getReflectionForMootoolsScriptFilePath();
	
	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getCodePressScriptFilePath
	 */
	public String getCodePressScriptFilePath();
	
	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToMootoolsLib
	 */
	public String getBundleURIToMootoolsLib(boolean needFullScript) throws RemoteException;
	
	/**
	 * @see com.idega.block.web2.business.Web2BusinessBean#getBundleURIToMootoolsLib
	 */
	public String getBundleURIToMootoolsLib(String mootoolsLibraryVersion, boolean needFullScript) throws RemoteException;
	
	public String getBundleURIToYUIScript(String version, boolean needFullScript);
	
	public String getBundleURIToYUIScript(boolean needFullScript);
	
	public String getBundleURIToYUIScript();
	
	public String getBundleUriToMootabsScript(String version);
	
	public String getBundleUriToMootabsScript();
	
	public String getBundleUriToMootabsStyle(String version);
	
	public String getBundleUriToMootabsStyle();
	
	public String getBundleUriToMooRainbowScript(String version);
	
	public String getBundleUriToMooRainbowScript();
	
	public String getBundleUriToMooRainbowStyle(String version);
	
	public String getBundleUriToMooRainbowStyle();
	
	public String getSlimboxScriptFilePath();
	public String getSlimboxStyleFilePath();
}