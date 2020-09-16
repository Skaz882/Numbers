fun main() {
    var userAns: Int
    var totalCost = 0
    val tax = .025
    val tip = .175

    println("Please enter your items, then enter zero.")

    do {
        print("Please enter prices: ")
        userAns = readLine()!!.toDouble().toInt()
        if (userAns != 0) {
            totalCost += userAns
        }
    } while (userAns != 0)
    println("Total: $totalCost")

    val finalCost = (totalCost * tax * tip)

    println("Your total is $$finalCost.")



}