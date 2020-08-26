package com.qa.practiceprograms;

public class ArrayRotation {


    public static void main(String[] args)
    {
        ArrayRotation rotate = new ArrayRotation();
        int arr[] = { 1, 2, 3, 4, 5, 6, 7 };
        rotate.rotateOneByOne(arr, 2, 7);
        rotate.printArray(arr, 7);
    }

    private void rotateOneByOne(int[] arr, int nos, int size) {

        for(int i=0; i<nos;i++){
            rightRotate(arr,size);
        }

    }

    private void leftRotate(int[] arr, int size) {
        int i=0;
        int temp = arr[i];
        for(i=0;i<size-1;i++)
            arr[i]=arr[i+1];

        arr[i] =temp;

    }

    private void rightRotate(int[] arr, int size) {
        int i=size-1;
        int temp = arr[i];
        for(i=size-1;i>0;i--)
            arr[i]=arr[i-1];

        arr[i] =temp;

    }


    private void printArray(int[] arr, int i) {

        for(int a : arr)
            System.out.print(a + " ");
    }
}
