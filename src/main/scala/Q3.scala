object Q3 {
  def isPrime(number: Int): Boolean = {
    if (number <= 1) false
    else if (number <= 3) true
    else if (number % 2 == 0 || number % 3 == 0) false
    else {
      var i = 5
      while (i * i <= number) {
        if (number % i == 0 || number % (i + 2) == 0)
          return false
        i += 6 //this is a researched method and is called 6k+1 and this reduces checking count and makes it efficient
      }
      true
    }
  }
  //I have to go to the above approach because of argument mismatch when putting it to the filter function
  /*
  * def isPrime(number: Int, divisor: Int = 2): Boolean = {
    if (number <= 1) {
      false
    } else if (divisor >= math.sqrt(number)) {
      true
    } else if (number % divisor == 0) {
      false
    } else {
      isPrime(number, divisor + 1)
    }
  }
  * */

  def main(args: Array[String]): Unit = {
    def filterPrime(numbers: List[Int]): List[Int] = {
      numbers.filter(isPrime)
    }

    val inputList = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val primeNumbers = filterPrime(inputList)
    println(primeNumbers)
  }

}
