import scala.io.StdIn.readInt

object cantidadDivisores {
   def divisores(n:Int, cont:Int, cont2:Int): Unit={
    var contx=cont2
    if(cont>0){
    if(n%cont == 0){
      println(cont) 
      contx+=1
    }
    divisores(n, cont-1, contx)
    }else{
      println("El resultado es: "+cont2)
    }
  }
  
  def main(args: Array[String]): Unit = {
    println("Ingrese el numero para conocer sus divisores: ")
    val n = readInt()
    divisores(n, n, 0)
  }
}