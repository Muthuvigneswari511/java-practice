/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstapp;

/**
 *
 * @author muthu
 */
public class PalindromeNumber {
    public void palindrome(){
        int num=10;
        int rev=0,org=num;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num/=10;
        }
        if(org==num){
            System.out.println("palindrome number");
        }
        else{
            System.out.println("Not palindrome number");
        }
        
        
    }
}
