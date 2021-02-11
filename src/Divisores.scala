import scala.io.StdIn.readInt

object Divisores {
  
  def divisores(n:Int, cont:Int): Unit={
    if(cont>0){
    if(n%cont == 0){
      println(cont) 
    }
    divisores(n, cont-1)}
  }
  
  def main(args: Array[String]): Unit = {
    println("Ingrese el numero para conocer sus divisores: ")
    val n = readInt()
    divisores(n, n)
  }
}