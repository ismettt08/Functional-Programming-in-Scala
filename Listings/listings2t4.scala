object listings2t4 {
  def findFirst[A](as: Array[A], p: A => Boolean) : Int = {
    @annotation.tailrec
    def loop(n: Int): Int = {
        if (n >= as.length) -1
        else if (p(as(n))) n
        else loop(n + 1)
    }
    loop(0)
  }

  def stringCheck(n: String): Boolean = {
      if(n == "ac") true
      else false
  }

  def main(args: Array[String]): Unit = {
      println(findFirst(Array("aa", "ab", "ac", "ad", "ae"), stringCheck))
  }
}
