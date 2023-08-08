object Q2 {
  def calculateSquare(numbers: List[Int]): List[Int] = {
    numbers.map(number => number * number)
  }

  def main(args: Array[String]): Unit = {
    val inputList = List(1, 2, 3, 4, 5, 6)
    val squaredNumbers = calculateSquare(inputList)
    println(squaredNumbers)
  }

}
