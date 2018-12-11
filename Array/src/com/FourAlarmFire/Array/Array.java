package com.FourAlarmFire.Array;

public class Array {
    // Find the Biggest element in the Array
    public int FindMax (int[] array)
    {
        int max = array[0];
        int N = array.length;

        for (int i = 0; i < N; i++)
        {
            if (array[i] > max)
                max = array[i];
        }

        return max;
    }

    // Calculate the Average value of a Array
    public int CalculateAVG(int[] array)
    {
        int N = array.length;
        int sum = 0;

        for (int i = 0; i < N; i++)
            sum += array[i];
        int avg = sum/N;

        return avg;
    }

    // Copy the Array
    public void copyArray (int[] array)
    {
        int N = array.length;
        int[] newArray = new int[N];

        /* The wrong way to copy the Array, which will make two alias point at the same Array address.
        newArray = array;
        */

        for (int i = 0; i < N; i++)
                newArray[i] = array[i];

        for (int j = 0; j < N; j++)
                System.out.print(newArray[j] + " ");
        System.out.println();
    }

    // Reverse the Array
    public void reverseArray(int[] array)
    {
        int N = array.length;
        for (int i = 0; i < N/2; i++)
        {
            int temp = array[i];
            array[i] = array[N-1-i];
            array[N-1-i] = temp;
        }

        for (int j = 0; j < N; j++)
                System.out.print(array[j] + " ");
    }

    public static void main(String[] args)
    {
        int[] array = {1, 3, 4, 5, 6, 7, 9, 14, 44, 22, 31};
        Array array1 = new Array();
        System.out.println("The max value is: " + array1.FindMax(array));
        System.out.println("The Average value of the Array is: " + array1.CalculateAVG(array));
        array1.copyArray(array);
        array1.reverseArray(array);
    }
}
