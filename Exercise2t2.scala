//Implement isSorted, which checks whether an Array[A] is sorted according to a given comprasion function
object Exercise2t2 {
    private def isSorted [A](as: Array[A], ordered : (A, A) => Boolean): Boolean = {
        if(as.length <= 1) return true
        
        @annotation.tailrec
        def loop(n: Int): Boolean = {
            if(n >= as.length - 1) true
            else if (!ordered(as(n), as(n+1))) false
            else loop(n+1)
        }
        loop(0)
    }

    private def compSmaller(n: Int, m: Int): Boolean = {
        n <= m
    }

    def main(args: Array[String]): Unit = {
        println(isSorted(Array(1, 2, 3, 4, 5), compSmaller))
        println(isSorted(Array(1, 2, 0, 4, 5), compSmaller))
        println(isSorted(Array(5, 5, 6, 7, 1), compSmaller))
        //compBigger
        println(isSorted(Array(5, 4, 3, 1, 1), (n: Int, m: Int) => (n>=m)))
    }
}
