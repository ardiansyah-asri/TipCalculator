package com.example.tipcalculator

fun main(){
    val officeOpen = 7
    val officeClose = 16
    val now = 20
    val isOpen = now > officeOpen

    if(!isOpen){
        print("true")
    }else{
        print("false")
    }
}