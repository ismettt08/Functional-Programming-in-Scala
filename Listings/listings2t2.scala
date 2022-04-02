object MyModule {
    private def abs(n: Int): Int = {
        if(n<0) -n
        else n
    }

    private def factorial(n: Int): Int = {
        @annotation.tailrec
        def go(n: Int, acc: Int): Int = {
            if(n<=0) return acc
            go(n-1, acc * n)
        }
        go(n, 1)
    }

    private def formatAbs(n: Int) = {
        val msg = "the Absolute Value of %d is %d."
        msg.format(n, factorial(n))
    }

    private  def formatFactorial(n: Int) = {
        val msg = "The factorial of %d is %d."
        msg.format(n, factorial(n))
    }

    def formatResult(name: String, n: Int, f: Int => Int) = {
        val msg = "The %s of %d is %d."
        msg.format(name, n, f(n))
    }

    def main(args: Array[String]): Unit = {
        println(formatAbs(-20))
        println(formatFactorial(7))
        println(formatResult("absoulte value", -152, abs))
    }
}