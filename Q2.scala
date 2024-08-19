import scala.collection.mutable.Set
import scala.io.StdIn.readLine

// Define a case class for Book
case class Book(title: String, author: String, isbn: String)

object Q2{
  // Initialize a mutable Set to store books
  val library: Set[Book] = Set(
    Book("Scala Programming", "Martin Odersky", "978-0981531687"),
    Book("Java in a Nutshell", "Benjamin J. Evans", "978-1492037255"),
    Book("Clean Code", "Robert C. Martin", "978-0132350884")
  )
  
  // Function to add a new book to the library
  def addBook(book: Book): Unit = {
    library += book
    println(s"Added: $book")
  }
  
  // Function to remove a book by its ISBN
  def removeBook(isbn: String): Unit = {
    val removed = library.find(_.isbn == isbn)
    removed match {
      case Some(book) =>
        library -= book
        println(s"Removed: $book")
      case None =>
        println(s"No book found with ISBN: $isbn")
    }
  }
  
  // Function to check if a book is in the library by its ISBN
  def containsBook(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }
  
  // Function to display current library collection
  def displayLibrary(): Unit = {
    println("\nCurrent Library Collection:")
    library.foreach(book => println(s"${book.title} by ${book.author}, ISBN: ${book.isbn}"))
  }
  
  // Function to search for a book by its title
  def searchByTitle(title: String): Unit = {
    val found = library.find(_.title.toLowerCase == title.toLowerCase)
    found match {
      case Some(book) =>
        println(s"Book found: ${book.title} by ${book.author}, ISBN: ${book.isbn}")
      case None =>
        println(s"No book found with title: $title")
    }
  }
  
  // Function to display all books by a specific author
  def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author.toLowerCase == author.toLowerCase)
    if (booksByAuthor.nonEmpty) {
      println(s"\nBooks by $author:")
      booksByAuthor.foreach(book => println(s"${book.title}, ISBN: ${book.isbn}"))
    } else {
      println(s"No books found by author: $author")
    }
  }
  
  def main(args: Array[String]): Unit = {
    displayLibrary()
    
    // Example usage
    val newBook = Book("Design Patterns", "Erich Gamma", "978-0201633610")
    addBook(newBook)
    
    displayLibrary()
    
    removeBook("978-1492037255")
    
    displayLibrary()
    
    searchByTitle("Scala Programming")
    
    displayBooksByAuthor("Robert C. Martin")
  }
}
