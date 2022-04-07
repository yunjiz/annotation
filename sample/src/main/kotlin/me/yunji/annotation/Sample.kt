package me.yunji.annotation

fun main(){
    println("hello")
}

@MyAnnotation("a", "b")
fun myFunc(){

}

@MyAnnotation("a", "b")
class MyClass()