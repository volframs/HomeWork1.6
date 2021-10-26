package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //task 1,2,3
        int[] arr = generateRandomArray();
        int sum=0;
        int min;
        int max;
        min=arr[0];
        max=arr[0];
        double average=0.0;

        for (int i = 0; i < arr.length; i++) {
            if(min>arr[i])
                min=arr[i];
            if(max<arr[i])
                max=arr[i];
            System.out.println(arr[i]);
            sum = sum + arr[i];

        }
        average=sum/30;
        System.out.println("Сумма трат за месяц составила " +sum+" рублей");
        System.out.println("Минимально выплаченная сумма " +min+" рублей");
        System.out.println("Максимально выплаченная сумма " +max+" рублей");
        System.out.println("Средняя выплата за месяц составила " +average+" рублей");

        //task 4

        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for(int j = reverseFullName.length-1;j>=0;j--){
            System.out.print(reverseFullName[j]);
        }
        System.out.println();

        //task 5 Создайте матрицу 3х3 (двумерный массив типа int). Заполните единицами обе диагонали матрицы и напечатайте ее в консоль. Постарайтесь заполнить обе диагонали в одном цикле.

        int a=3;
        int b=3;
        int[][] matrix = new int[a][b];
        for(int r=0;r<a;r++)
            for (int c=0;c<b;c++) {
                if (r == c || r == a - c - 1) {
                    matrix[r][c] = 1;
                }
            }

        for (int[] row : matrix) {
            for (int column : row) {
               System.out.print(column + " ");
            }
            System.out.println();
        }

        //task 6

        int[] notRight = {5, 4, 3, 2, 1};
        int[] right = new int[5];
        for(int z=0;z<notRight.length;z++){
            right[right.length-1-z] = notRight[z];
        }
        System.out.println(Arrays.toString(notRight));
        System.out.println(Arrays.toString(right));

        //task 7

        int[] notRight2 = {5, 8, 2, 3, 9};
        int count=notRight2.length;
        for (int l = 0; l <=count/2; l++) {
            int t  =  notRight2[count-1-l];
            notRight2[count-1-l]=notRight2[l];
            notRight2[l] = t;
        }
        System.out.println(Arrays.toString(notRight2));
        System.out.println();

        //task 8 Необходимо найти два числа, сумма которых равна −2. {−6, 2, 5, −8, 8, 10, 4, −7, 12, 1}

        int[] summ = {-6, 2, 5, -8, 8, 10, 4, -7, 12, 1};
        int countOfSumm=summ.length;
        for(int x=0;x<countOfSumm;x++)
            for(int y=0;y<countOfSumm;y++){
                if(summ[y]+summ[x]==-2){
                    int xY=summ[y]+summ[x];
                    System.out.print(summ[y]+"+"+summ[x]+"="+xY+" ");
                }
            }


    }


    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }
}
