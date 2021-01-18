package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
    int coutage = 15;
    int salary = 100;
    double premium = 15;
    if (coutage < 5)  {premium = salary*0.1;}
    if (coutage > 5 && coutage < 10)  {premium = salary*0.15;}
        if (coutage >= 10 && coutage < 15) {
            premium = salary * 0.25;
        }
            if (coutage >= 15 && coutage < 20) {
                premium = salary * 0.35;
            }
                if (coutage >= 20 && coutage < 25) {
                    premium = salary * 0.45;
                }
                    if (coutage >= 25) { premium = salary*0.5;}

                    System.out.println(premium);




    }

}
