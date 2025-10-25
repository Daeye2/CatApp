class Cat (val name: String, var age: Int, var weight: Int) {

    /*fun walk(times:  Int = 1) {
        weight-= times
    }*/
    fun walk(times: Int) {
        weight -= times
        if (weight < 0) {
            weight = 0
            println("$name has walked too far and lost all its weight!")
        }
    }

    // 🐟 New method: increases the cat’s weight by 1
    /*fun eat(times: Int = 1) {
        weight+= times
    }*/

    fun eat() {
        if (weight >= 20) {
            println("Error: $name cannot eat anymore — already at maximum weight (20).")
        } else {
            weight++
        }
    }

    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
}


