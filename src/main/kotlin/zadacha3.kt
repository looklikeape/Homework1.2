fun main() {
    val purchaseSum = 10002.32
    val minDiscount = 100.00
    val maxDiscount = purchaseSum * 0.05
    val regularMaxDiscount = (purchaseSum + maxDiscount) * 0.01 + maxDiscount
    val regularMinDiscount = (purchaseSum + minDiscount) * 0.01 + minDiscount
    val regularCustomer = false
    if (purchaseSum <= 1_000.00) {
        println("Ваша скидка составила : 0 руб")
    } else if (purchaseSum >= 1_001.00 && purchaseSum < 10_000.00) {
        if (regularCustomer === true) {
            println("Ваша скидка составила :" + "%.2f".format(regularMinDiscount) + "руб")
        } else {
            println("Ваша скидка составила :" + "%.2f".format(minDiscount) + "руб")
        }
    } else if (purchaseSum >= 10_001.00) {
        if (regularCustomer === true) {
            println("Ваша скидка составила :" + "%.2f".format(regularMaxDiscount) + "руб")
        } else {
            println("Ваша скидка составила :" + "%.2f".format(maxDiscount) + "руб")
        }
    }

}