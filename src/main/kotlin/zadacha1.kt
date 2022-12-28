fun main() {
    val transferFee: Double = 0.075
    val minTransferFee: Double = 35.00
    val transferAmount: Double = 1001.30
    val feeAmount: Double = if (transferFee * transferAmount < minTransferFee) {
        minTransferFee
    } else {
        transferAmount * transferFee
    }
    println("Your fee will be: " + "%.2f".format(feeAmount))

}