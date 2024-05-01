package com.driver;

public class Main
{
    public static void main(String[] args)
    {
        RWOnly rwOnly=new RWOnly();
        //'name' has private access in 'com.driver.RWOnly'
        //Identifier expected
        //Unexpected token
        rwOnly.setName("Yashas");
        System.out.println("Name: "+ rwOnly.getName());
    }
}