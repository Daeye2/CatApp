fun main() {
    val binnie = Cat("Binnie", 10, 10)
    val clyde = Cat("Clyde", 5, 5)
    val flatHead = Cat("Flathead", 7, 10)
    val cupra = Cat("Cupra", 2, 7)

    binnie.walk(2)
    clyde.walk(4)

    binnie.eat(3)
    clyde.eat(4)
    flatHead.walk(5)
    cupra.walk(2)
    flatHead.eat(4)
    cupra.eat(3)

    println(binnie)
    println(clyde)
    println(flatHead)
    println(cupra)
}