class Cat (val name: String, var age: Int, var weight: Int) {

    fun walk(times:  Int = 1) {
        weight-= times
    }

    // 🐟 New method: increases the cat’s weight by 1
    fun eat(times: Int = 1) {
        weight+= times
    }

    override fun toString() : String {
        return "Name: $name Age: $age Weight: $weight"
    }
}


