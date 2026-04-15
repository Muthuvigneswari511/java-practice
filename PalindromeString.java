    /*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
     */
    package com.mycompany.myfirstapp;

    /**
     *
     * @author muthu
     */
    public class PalindromeString {
        public void palindromeString(){
            String name="madam";
            StringBuilder rev=new StringBuilder();
            for(int i=name.length()-1;i>=0;i--){
                rev.append(name.charAt(i));
            }
            if(rev.toString().equals(name)){
                System.out.println("Palindrome string");
            }
            else{
                System.out.println("Not palindrome String");
            }
        }

    }
