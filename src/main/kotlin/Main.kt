fun main() {
    salary (6,1500)
    salary (5,1500)
    salary (2,1500)
    salary (4,1500)
    salary (7,1500)
}

    fun salary(numOfHours:Int, hourlyRate:Int):Int{
        var total = numOfHours * hourlyRate
        println (total)
        return total
    }
