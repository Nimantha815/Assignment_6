case class Point(a:Int,b:Int){
  def x:Int=a
  def y:Int=b
  
  def +(that:Point)=Point(this.x+that.x,this.y+that.y) 
  
  def move(dx:Int,dy:Int)=Point(this.x+dx,this.y+dy)
  
  def -(that:Point)=Point(this.x-that.x,this.y-that.y) 
  def DisOfpoints(that:Point):Double=
  {
   val distance=math.sqrt((this.x)*(this.x)+(this.y)*(this.y))
   return distance
  }

  def InvertOfpoint(that:Point)=Point(this.y,this.x)
}

object Pointer {
   def main(args:Array[String])
  {
   val u=Point(4,9)
   val v=Point(8,15)
   
   println("method1:Add "+u+" and "+v+"="+(u+v))
   println("")
   println("method2:Move a "+u+" by given distance="+u.move(3, 7))
   println("")
   val w=u-v

   println("method3:Distance between "+u+" and "+v+"="+w.DisOfpoints(w))
   println("")
   println("method4:Invert of "+u+"="+u.InvertOfpoint(u))
  }
}