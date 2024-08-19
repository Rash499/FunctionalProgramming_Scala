object Question3 {
    def toUpper(name: String): String = name.toUpperCase
    def toLower(name: String): String = name.toLowerCase
    def formatNames(name: String, formatFunc: String => String): String = formatFunc(name)


    def main(args: Array[String]): Unit = {
        val names = List("Benny","Niroshan","Saman","Kumara")

        val formattedNames = names.map {
            case "Benny" => formatNames("Benny",toUpper)
            case "Niroshan" => formatNames("Ni",toUpper) + formatNames("roshan",toLower)
            case "Saman" => formatNames("Saman",toLower)
            case "Kumara" => "Kumar" + formatNames("a", toUpper)
        }

        formattedNames.foreach(println)
    }
}