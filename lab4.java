package com.company;
import java.util.Scanner;
import java.util.Arrays;
public class Lab4 {
//Написать программу, удаляющую из целочисленного массива A размерности N элементы, равныецелому числу X.
//В результате должен получиться массив не большей размерности.
//На экран должны выводиться как оригинальное состояние массива, так и итоговое.
    public static void main(String[] args) {
	    Scanner in = new Scanner (System.in);

        int[] Newarray = null;

        System.out.print("Введите размерность массива: ");
        int s = in.nextInt();
        int [] array = new int[s];
        for(int i = 0; i<s; i++){
            System.out.print ("Введите число в массив: ");
            array[i] = in.nextInt();
        }

        System.out.print("Введите число, которое нужно удалить: ");
        int deleted = in.nextInt();

        for (int i=0; i< array.length - 1; i++){
            if (array[i] == deleted){
                Newarray = new int[array.length - 1];
                for (int en = 0; en< i; en++){
                    Newarray[en] = array[en];
                }
                for (int j = i; j < array.length - 1; j++){
                    Newarray[j] = array[j+1];
                }
                break;
            }
        }
        System.out.println("Исходный массив: " + Arrays.toString(array));
        System.out.println("Новый массив: " + Arrays.toString(Newarray));

        in.close();
    }
}