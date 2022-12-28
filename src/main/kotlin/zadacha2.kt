//если правильно просклонял числительные то все числительные более 1 либо кончаются
//на 1 (кроме 11) будут "человеками" остальные будут называться "люди"

fun main() {
    val likes: Int = 13211
    val lastChar: Int = likes % 10
    val last2Char: Int = likes % 100
    if (lastChar == 1 && last2Char != 11) {
        println("Понравилось $likes человеку")
    } else if (likes == 0) {
        println("Пока никому не нравится")
    } else {
        println("Понравилось $likes людям")
    }
}