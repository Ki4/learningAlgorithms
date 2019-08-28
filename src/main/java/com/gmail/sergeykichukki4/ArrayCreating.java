package com.gmail.sergeykichukki4;

import java.util.Scanner;

public class ArrayCreating {
    public ArrayCreating() {
    }

    public int[] arrayFilling(int [] operatingArray){
        for(int counter = 0; counter < operatingArray.length; counter++){
            operatingArray[counter] = generateRandomPositiveIntNumber();
        }
        return operatingArray;
    }

    public int generateRandomPositiveIntNumber(){
        return (int)(Math.random()*50 + 1);
    }

    public int inputIntValue(){
        Scanner scanner = new Scanner(System.in);
        while(!scanner.hasNext()){
            System.out.println("Wrong input, enter integer! ");
            scanner.next();
        }
        return  scanner.nextInt();
    }

    public void printArray(int [] array){
        for(int show : array){
            System.out.print(show + " ");
        }
    }
}
