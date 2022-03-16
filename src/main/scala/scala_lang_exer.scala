import java.io.FileNotFoundException

object scala_lang_exer extends App {
  //list..map
  val numberList = List(1,2,3,4,5)
  val lettersList = List('a','b','c','d','e')
  val ratings = Map(
    'a' -> 1,
    'b' -> 2,
    'c' -> 3
  )
  for((let, num) <- ratings) (println(s"$let, $num"))


  //match expression
  val count = 4
  val response = count match {
    case x if (count ==1) => "one is lonely"
    case x if (count==2) | (count==3) => "two or three"
    case _ => "other stupid numbers"
  }
  println(response)

  //try,catch, throw
  var fileContents = ""
  try {scala.io.Source.fromFile("filename.txt")}
  catch {
    case a: FileNotFoundException => println("Your file was not found mate!")
    case _  => println("Had an IOException trying to read that file")
  }

  val score_old:Map[Char, Int] = Map(
    'a'->1,'e'->1,'i'->1,'o'->1,'u'->1,'l'->1,'n'->1,'r'->1,'s'->1,'t'->1,
    'd'->2,'g'->2,
    'b'->3,'c'->3,'m'->3,'p'->3,
    'f'->4,'h'->4,'v'->4,'w'->4,'y'->4,
    'k'->5,'j'->8,'x'->8,'q'->10,'z'->10
  )
  println(score_old.getOrElse('~', 0))



}
