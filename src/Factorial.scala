import scala.io.StdIn.readInt

object Factorial {
   def sumatoria(inicio:Int,n1:Int, resultado:Int): Unit ={
    if(inicio<=n1){
      //println(resultado*n1)
      sumatoria(inicio+1, n1, resultado*inicio)
    }
    else{
      println("El resultado es: "+resultado)
    }
  }
  
  
  def main(args: Array[String]): Unit = {
    
    println("Ingrese el numero: ")
    val n1= readInt()
    
    
    sumatoria(1, n1, 1)
    
  }
}