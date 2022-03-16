object leapYear extends App {


  //finding if a given number is Leap Year or Not
  implicit class leaOrNot(arg: Int) {
    var isLeap = false
    def isLeapoOrNot() {
      if (arg % 4 == 0 && arg % 100 == 0 && arg % 400 == 0) {isLeap = true}
      else {isLeap = false}
    print(isLeap)}
  }


  //printing grettings according to userInput
  val anotherTuple: Any = ("ayushman", "adhikari")
  //val anotherTuple:Any = 1234
  val returnSentence = anotherTuple match {
    case (n1,n2) => s"one for $n1, one for $n2"
    case _: Any => s"one for you, one for me"
  }
  //print(returnSentence)


  //finding age of one person in 4 planets
  val userAgeInSeconds = 12312423
  class calculateAge(val ageInSeconds: Double) {

    def calculateAgeInEveryPlanet(): List[Double] = {
      val earthDays = 31557600
      val earthAge = (ageInSeconds / earthDays)
      val mercuryAge = (ageInSeconds / earthDays) * 0.2408467
      val venusAge = (ageInSeconds / earthDays) * 0.61519726
      val marsAge = (ageInSeconds / earthDays) * 1.8808158
      val x = List(earthAge, mercuryAge, venusAge, marsAge)
      x
    }
  }
  val Dipak = new calculateAge(315576003)
  val y = Dipak.calculateAgeInEveryPlanet()
  println(y)


  class Bob {
    def statementType(s: String): Unit = {
      val response = s match {
        case s if s.isEmpty => "Fine. Be that way!"
        case s if shouting(s) => "Calm down, I know what i'm doing"
        case s if question(s) => "Sure."
        case _ => "Whatever."
      }
      println(response)
    }

    def shouting(s: String): Boolean = s.toUpperCase() == s
    def question(s: String): Boolean = s.takeRight(1) == "?"

  }
  val bob = new Bob
  bob.statementType("WHAT sP?")



  //converting a decimal into a secret handshake

  //converting decimal into binary
  val inputDecimal:Int = 4

  def decimalToBinary(ip: Int): Unit = {
    var quotient: Int = ip
    var flag: Boolean = true
    var zeroOneSeq: List[Int] = List()
    while (flag) {
      var remainder0or1: Int = quotient % 2
      quotient = quotient/2
      zeroOneSeq :+ remainder0or1
      println(zeroOneSeq)
      if (quotient == 0 | 1) break
    }
  }
  decimalToBinary(4)



}
