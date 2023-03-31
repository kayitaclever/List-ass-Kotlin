import javax.swing.tree.FixedHeightLayoutCache

fun main() {

println(listOfNames(listOf("mutoni","Kaliza","Ineza","Liza","Mahoro","Peace")))

println(peoplelist(listOf(45,45,60,75,55,80)))

    println(createPersonlist())

    var cars = listOf(
        Car("Rangerover",1230.0),
        Car("Benz",269.0),
        Car("Toyota",261.9),
        Car("Suzuki",1892.70)



    )
    var avgmileage = calculate(cars)
    println("The average mileage is :$avgmileage")

}



//Given a list of 10 strings, write a function that returns a list of the strings
//at even indices i.e index 2,4,6 etc

fun listOfNames(names:List<String>):List<String>{
   var evenIndicesList= mutableListOf<String>()
    for (i in names)

if (names.indexOf(i)%2==0){
     evenIndicesList.add(i)
}
    return evenIndicesList
   }
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height



fun peoplelist(Heights: List<Int>):String{

     val g= Heights.sum()
    val k= Heights.average()
    var x=  "The average Height is $k,the total Height is$g "
    return x
}

//Given a list of Person objects, each with the attributes, name, age,
//height and weight. Sort the list in order of descending age

data class Person(var Name:String,var Age:Int,var height:Double,var Weight:Double)
fun createPersonlist(){
    val pers1 = Person("Marisa",17,1.5,50.0)
    val pers2= Person("Ityaku",34,1.6,70.5)
    val pers3= Person("Ivy",22,1.8,55.4)
    var people= listOf(pers1,pers2,pers3)
    val sortedpeople= people.sortedByDescending { person -> person.Age }
    println(sortedpeople)
//Given a list similar to the one above, write a function in which you will
//create 2 more people objects and add them to the list at one go.
    val pers4= Person("Becky", 21,1.8,70.6)
    val pers5= Person("Lyna",20,1.5,50.5)
    var morepeople= listOf(pers4,pers5)
    val resultlist= mutableListOf<Person>()
     resultlist.addAll(people)
    resultlist.addAll(morepeople)
    println(resultlist)

}




//Write a function that takes in a list of Car objects each with a
//registration and mileage attribute and returns the average mileage of
//all the vehicles in the list.

data class Car(var registration:String,var mileage:Double)
fun calculate(cars:List<Car>):Double{

    var totalmileage = 0.0
    for(car in cars){
        totalmileage+=car.mileage
    }
    return totalmileage/cars.size
}