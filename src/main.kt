fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    val flatHead = Cat("Flathead", 7, 10)
    val cupra = Cat("Cupra", 2, 7)

    binnie.walk(2)
    clyde.walk(3)

    binnie.eat()
    clyde.eat()
    flatHead.walk(5)
    cupra.walk(2)
    flatHead.eat()
    cupra.eat()

    println(binnie)
    println(clyde)
    println(flatHead)
    println(cupra)
}