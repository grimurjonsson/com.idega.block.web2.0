draw2d.MyOutputPort=function(_4ee9){draw2d.OutputPort.call(this,_4ee9);};draw2d.MyOutputPort.prototype=new draw2d.OutputPort;draw2d.MyOutputPort.prototype.type="MyOutputPort";draw2d.MyOutputPort.prototype.onDrop=function(port){if(this.getMaxFanOut()<=this.getFanOut()){return;}if(this.parentNode.id==port.parentNode.id){}else{var _4eeb=new draw2d.CommandConnect(this.parentNode.workflow,this,port);_4eeb.setConnection(new draw2d.ContextmenuConnection());this.parentNode.workflow.getCommandStack().execute(_4eeb);}};