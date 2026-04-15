/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.myfirstapp;

/**
 *
 * @author muthu
 */
public class ReverseString {
    public void reverseString(){
        String name="muthu";
        StringBuilder sb=new StringBuilder();
        for(int i=name.length()-1;i>=0;i--){
            sb.append(name.charAt(i));
        }
        System.out.println(sb);
    }
    
}
