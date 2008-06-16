ArrowLine=function(){
this.lineColor=new Color(0,0,0);
this.stroke=1;
this.canvas=null;
this.workflow=null;
this.html=null;
this.graphics=null;
this.id=this.generateUId();
this.startX=30;
this.startY=30;
this.endX=100;
this.endY=100;
this.zOrder=Line.ZOrderBaseIndex;
this.setSelectable(true);
this.setDeleteable(true);
this.arrowWidth=8;
this.arrowLength=20;
this.lineWidth=2;
};
ArrowLine.prototype=new Line;
ArrowLine.prototype.type="ArrowLine";
ArrowLine.prototype.paint=function(){
if(this.graphics==null){
this.graphics=new jsGraphics(this.id);
}else{
this.graphics.clear();
}
this.graphics.setStroke(this.stroke);
this.graphics.setColor(this.lineColor.getHTMLStyle());
var endY=this.getLength();
var _3541=[0,0,endY-this.arrowLength,endY-this.arrowLength,endY,endY-this.arrowLength,endY-this.arrowLength,0];
var _3542=[-this.lineWidth,+this.lineWidth,+this.lineWidth,this.lineWidth+this.arrowWidth/2,0,-(this.lineWidth+this.arrowWidth/2),-this.lineWidth,-this.lineWidth];
var _3543=this.getAngle()*Math.PI/180;
var rotX=new Array();
var rotY=new Array();
for(var i=0;i<_3541.length;i++){
rotX[i]=this.startX+_3541[i]*Math.cos(_3543)-_3542[i]*Math.sin(_3543);
rotY[i]=this.startY+_3541[i]*Math.sin(_3543)+_3542[i]*Math.cos(_3543);
}
this.graphics.drawPolyLine(rotX,rotY);
this.graphics.paint();
};
