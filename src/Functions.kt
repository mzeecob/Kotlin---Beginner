fun main() {

   fun normal(){
       println("vip")
   }

//    function with parameters
    fun withParameters(line: String){
        println(line)
    }

    fun withReturn(num1: Int, num2: Int): Int{

        var sum = num1 + num2

        return sum
    }


//    normal()
    withParameters("mzee")
//    print(withReturn(5, 4))

}