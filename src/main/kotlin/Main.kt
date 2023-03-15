fun main() {
    printOddNumbers()
    println(countNames(arrayOf("Sheila", "Leo", "Charles", "Dommy", "Ian", "Frank")))
    (drinks(9))
    numbers()

}
fun printOddNumbers() {
    for (number in 1..100) {
        if(number % 2==1)
        println(number)
    }
}
fun countNames(names: Array<String>): Int {
    var count = 0
    for (name in names) {
        if (name.length > 5) {
            count++
        }
    }
    return count
}
fun drinks(age:Int){
    if(age in 0..5){
        println("A glass of milk")

    }
    else if(age in 7..14){
        println("A bottle of Fanta Orange")
    }

    else{
        println("Bottle of cocacola")
    }

}
//Write a function that prints each number from 1 to 100 on a new line. For each
//multiple of 3, print "Fizz" instead of the number. For each multiple of 5, print
//"Buzz" instead of the number. For numbers which are multiples of both 3 and
//5, print "FizzBuzz" instead of the number.
fun numbers() {
    for (number in 1..100) {
        if (number %3==0&&number%5==0)
            println("Fizz")
        else if(number %5==0){
            println("Buzz")
        }
        else if(number%3==0){
            println("FizzBuzz")

        }
    }

}



