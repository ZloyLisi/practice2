fun main(args: Array<String>) {

    // Задание 1
    val age1: Int = 42
    val age2: Int = 21


    // Задание 2
    /*при расчете среднего арифметического значения выдает
    в константу avg1 целую часть, а не точное значение.
     */
    val avg1: Int = (age1 + age2) / 2


    // Задание 3
    //при преоброзавание из Int в Double получается точное значение
    val avg2: Double = (age1.toDouble() + age2.toDouble()) / 2


    //Задание 4
    //создание строковых констант
    val firstName: String = "Александр"
    val lastName: String = "Паразихин"


    //Задание 5
    //разделение имени и фамилии пробелом
    val fullName: String = firstName + ' ' +lastName


    //Задание 6
    //использование строкового шаблона
    val  myDetails: String = "Привет, меня зовут $fullName!"


    //Задание 7
    //создания константы, которая будет хранит дату
    val triple = Triple(8, 26, 2005)


    //Задание 8
    //извлечение в 3 константы
    val (month, day, year) = triple


    //Задание 9
    //значение месяца и года
    val (month1, _ , year1)= triple

    //Задание 10
    //изменение месяца, создания paira с заносом в него новых значений
    var month2: Int = month
    month2 = 5
    val pair = Pair (month2, year)
}