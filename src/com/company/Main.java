package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Įveskite savo svorį KG");
	float a = sc.nextFloat();
	System.out.println("Įveskite savo ūgį M");
	float b = sc.nextFloat();
	System.out.println("Jūsų KMI: " + (a/(b*b)));
    }
}
