draw2d.ToolShowGrid=function(_53df){draw2d.ToggleButton.call(this,_53df);};draw2d.ToolShowGrid.prototype=new draw2d.ToggleButton;draw2d.ToolShowGrid.prototype.type="ToolShowGrid";draw2d.ToolShowGrid.prototype.execute=function(){if(this.isDown()){this.getToolPalette().getWorkflow().setBackgroundImage("grid_10.png",true);}else{this.getToolPalette().getWorkflow().setBackgroundImage(null,false);}};