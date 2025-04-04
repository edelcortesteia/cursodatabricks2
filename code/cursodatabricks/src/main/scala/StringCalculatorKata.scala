object StringCalculatorKata {

  def configura(): Unit = {
    println("Configurando")

  }

  def Add(valor: String): Int = {



    if (valor.endsWith(",")) {
      throw new Exception("No valido")
    }
    if (valor.endsWith("\n")) {
      throw new Exception("No valido")
    }
    if (valor == "") {
      0
    }
    else {

      val splitVal = valor.split("[,\n]").map(a=> a.toInt)
      splitVal.reduce((a,b) => {a+b} )


    }

  }

}
