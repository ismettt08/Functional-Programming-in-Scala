// Write a recursive function to get get the nth fibonacci number
object Exercise2t1{
    def fibonacci(n: Int): Int = {
        @annotation.tailrec
        def go(n: Int, cur: Int, acc: Int): Int = {
        if(n <= 0) acc
        else go(n-1, acc, acc + cur) 
        }
        go(n, 1, 0)
    }
    def main(args: Array[String]): Unit = {
        println(fibonacci(5))
    }
}