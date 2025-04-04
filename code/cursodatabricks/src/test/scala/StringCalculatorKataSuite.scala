import org.scalatest.funsuite.AnyFunSuite

class StringCalculatorKataSuite extends AnyFunSuite{
  test("First test"){
    StringCalculatorKata.configura()
  }

  test("Valida Cadena vacía"){
    val resultado = StringCalculatorKata.Add("")
    assert(resultado == 0)
  }

  test("Valida Cadena valor 1"){
    val resultado = StringCalculatorKata.Add("1")
    assert(resultado == 1)
  }

  test("Valida Cadena valor 10"){
    val resultado = StringCalculatorKata.Add("6,4")
    assert(resultado == 10)

  }

  test("Valida Cadena 2,4,6,8 igual a 20"){
    val resultado = StringCalculatorKata.Add("2,4,6,8")
    assert(resultado == 20)
  }

  test("Valida separadores") {
    val resultado = StringCalculatorKata.Add("100,200\n300")
    assert(resultado == 600)
  }
  test("Valida sin separadores al final") {

    assertThrows[Exception] {
      val resultado = StringCalculatorKata.Add("1,2,")
    }
  }
  test("Valida sin salto de linea al final") {
    assertThrows[Exception] {
      val resultado = StringCalculatorKata.Add("1,2\n")
    }
  }


  test("Valida solo comas") {
    assertThrows[Exception] {
      val resultado = StringCalculatorKata.Add(",")
    }
  }

  test("Valida enter") {
    assertThrows[Exception] {
      val resultado = StringCalculatorKata.Add("\n")
    }
  }

}
