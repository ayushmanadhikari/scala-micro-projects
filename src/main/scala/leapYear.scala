import scala.util.control.Breaks.break
import scala.math.pow
object leapYear extends App {


  //finding if a given number is Leap Year or Not
  implicit class leapOrNot(arg: Int) {
    var isLeap = false
    def isLeapOrNot() {
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
  //needs fixing
 def decToBin(x: Int): Double = {
   var rem = x%2
   var quo = x/2
   var finalBin: Double = rem
   var flag: Boolean = true
   var count = 1
   while (flag == true) {
     rem = quo%2
     quo = quo/2
     var power = pow(10, count)
     finalBin = finalBin + 1*power
     count = count + 1
     if (quo==1 | quo == 0) flag=false
   }
   finalBin
 }
  val x = decToBin(4)
  println(x)


  //inbuilt function to convert decimal to binary
  val inputDecimal = 10
  val binary = inputDecimal.toBinaryString.toInt

  val secretHandshake = binary match {
    case 1 => "wink"
    case 10 => "double blink"
    case 100 => "close your eye"
    case 1000 => "jump"
    case _ => //calling a func
  }

  def binarySplit(x: Int): Int = {
    var flag = true
    while (flag) {
      var binarySplitList: List[Int] = List()
      var quo = x/10
      var rem = x%10
      
      if (quo ==0 | quo ==1) break()

    }

    x
  }


}
