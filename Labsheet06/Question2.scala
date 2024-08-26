import scala.io.StdIn

object Question2 {

  // Function to get student information
  def getStudentInfo(): (String, Int, Int, Double, Char) = {
    val (name, marks, totalMarks) = getStudentInfoWithRetry()
    val percentage = calculatePercentage(marks, totalMarks)
    val grade = assignGrade(percentage)
    (name, marks, totalMarks, percentage, grade)
  }

  // Function to print student record
  def printStudentRecord(student: (String, Int, Int, Double, Char)): Unit = {
    val (name, marks, totalMarks, percentage, grade) = student
    println(f"\nName: $name%-10s Marks: $marks%-5d Total Possible Marks: $totalMarks%-5d Percentage: $percentage%-6.2f Grade: $grade")
  }

  // Function to validate input
  def validateInput(name: String, marks: Int, totalMarks: Int): (Boolean, Option[String]) = {
    if (name.isBlank) {
      (false, Some("Name cannot be empty."))
    } else if (marks < 0 || marks > totalMarks) {
      (false, Some("Marks must be a positive integer and not exceed the total possible marks."))
    } else if (totalMarks <= 0) {
      (false, Some("Total possible marks must be a positive integer."))
    } else {
      (true, None)
    }
  }

  // Function to prompt for input until valid data is provided
  def getStudentInfoWithRetry(): (String, Int, Int) = {
    var valid = false
    var name = ""
    var marks = 0
    var totalMarks = 0

    while (!valid) {
      println("Enter the student's name:")
      name = StdIn.readLine()

      println("Enter the marks obtained by the student:")
      marks = StdIn.readInt()

      println("Enter the total possible marks:")
      totalMarks = StdIn.readInt()

      val (isValid, errorMessage) = validateInput(name, marks, totalMarks)

      if (isValid) {
        valid = true
      } else {
        println(s"Invalid input: ${errorMessage.getOrElse("Unknown error")}. Please try again.")
      }
    }

    (name, marks, totalMarks)
  }

  // Function to calculate percentage
  def calculatePercentage(marks: Int, totalMarks: Int): Double = {
    (marks.toDouble / totalMarks) * 100
  }

  // Function to assign grade based on percentage
  def assignGrade(percentage: Double): Char = percentage match {
    case p if p >= 90 => 'A'
    case p if p >= 75 => 'B'
    case p if p >= 50 => 'C'
    case _            => 'D'
  }

  def main(args: Array[String]): Unit = {
    val studentInfo = getStudentInfo()
    printStudentRecord(studentInfo)
  }
}
