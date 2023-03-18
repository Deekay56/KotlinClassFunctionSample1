//first class

class MyCalc { //Caps. Even Calc is OK
    
    init{
        println("This is a simple calculator from the first class.") //always note that when you instantiate the init block in the main function,
                                                                    //it will print out the contents every time
                                                                   //so only instantiate it once and use that to call all other methods in the class
    }
    
    fun add(num1: Int, num2: Int): Int{
        var sum: Int
        sum = num1 + num2
        return sum
    }
    
    fun subtract(num1: Int, num2: Int): Int{
        var diff: Int
        diff = num1 - num2
        return diff
    }
    
    fun divide(num1: Int, num2: Int): Double{
        
        var quotient: Double = 0.0
  
        if(num2 == 0 ){
            println("You cannot divide by 0")
        }else{
            quotient = num1.toDouble() / num2.toDouble()
        }
        return quotient
   
    }
    
    companion object{ //this allows us not to have an instance of the class in the main function
        
    fun myName(fName: String, lName: String): String{
        
       // var customName: String
        
        var customName = "$fName $lName"
        
        return customName
    }
    
    }
    
}

//second class

class Hobbies(val myHobbies: List<String>){ //Note! This class has parameters, so any time you instantiate the class in the main function, these HAVE to be passed.
    
    init{
        println("This is a simple integer list from the second class.")
    }
    
    
}

fun main() {
    
  var myClass = MyCalc() //Note that Each time you create a new instance of the class, the init block is executed.
                        //If you want to see the output of the init block only once,
                       //you can create an instance of the class once and then use that instance to call the methods
  
  println()
  
  var mySum = myClass.add(5,6)
  var myDiff = myClass.subtract(5,6)
  var myQuotient = myClass.divide(5,6)
  
  var myName = MyCalc.myName("David", "Maina") //calling a companion object from the main class doesn't need an instance of the class,
                                              //and can just access the class directly
  
  println("The sum is: $mySum.")
  println("The difference is: $myDiff.")
  println("The quotient is: $myQuotient.")
 

 println("My name is $myName.")
 
 println()
 
 var myHobbyList = Hobbies(listOf("eating", "sleeping", "drinking", "more sleeping"))
 
 println()
 
 println("I like ${myHobbyList.myHobbies.joinToString(", ")}.")
  
}
