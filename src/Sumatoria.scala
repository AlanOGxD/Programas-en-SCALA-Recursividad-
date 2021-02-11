import scala.io.StdIn.readInt

object Sumatoria {
  
  def sumatoria(n1:Int, n2:Int, resultado:Int): Unit ={
    if(n1<=n2){
      //println(resultado+n1)
      sumatoria(n1+1, n2, resultado+n1)
    }
    else{
      println("El resultado es: "+resultado)
    }
  }
  
  
  def main(args: Array[String]): Unit = {
    
    println("Ingrese el limite inicial: ")
    val n1= readInt()
    println("Ingrese el limite final: ")
    val n2= readInt()
    
    sumatoria(n1, n2, 0)
    
  }
}