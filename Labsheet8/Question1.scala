object Question1 {

  def encrypt(plaintext: String, shift: Int): String = {
    plaintext.map {
      case c if c.isLetter =>
        val shiftAmount = if (c.isLower) 'a' else 'A'
        ((c - shiftAmount + shift) % 26 + shiftAmount).toChar
      case c => c 
    }
  }

  def decrypt(ciphertext: String, shift: Int): String = {
    encrypt(ciphertext, 26 - shift) // Decryption is encryption with (26 - shift)
  }


  def cipher(text: String, shift: Int, cipherFunction: (String, Int) => String): String = {
    cipherFunction(text, shift)
  }

  def main(args: Array[String]): Unit = {
    val plaintext = "Hello, World!"
    val shift = 3

    val encryptedText = cipher(plaintext, shift, encrypt)
    println(s"Encrypted Text: $encryptedText")

    val decryptedText = cipher(encryptedText, shift, decrypt)
    println(s"Decrypted Text: $decryptedText")
  }
}
