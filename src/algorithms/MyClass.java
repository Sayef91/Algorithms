/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author Sayef
 */
public class MyClass extends Object{
    
    //experiment with object class

    public static void main(String[] args) {
        // Your algorithm goes here.

        int[] list = {3, 2, 4, 5, 3, 4, 5, 11};
        printList(list);
        SelectionSort(list);
        printList(list);

    }

    public static void BubbleSort(int[] list) {
        for (int j = 0; j < list.length - 1; j++) {

            for (int i = 0; i < list.length - 1; i++) {
                if (list[i] > list[i + 1]) {
                    swap(list, i + 1, i);
                }
            }
        }
    }

    //3,2,4,5,3,4,5,11
    //0,1,2,3,4,5,6, 7
    public static void SelectionSort(int[] list) {
        int min;

        for (int i = 0; i < list.length-1; i++) {
            min = i;
            for (int j = i + 1; j < list.length; j++) {
                if (list[j] < list[min]) {
                    min = j;
                }

            }
            swap(list, min, i);

        }
    }

    public static void printList(int[] list) {
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

    }

    public static void swap(int[] list, int from, int to) {
        int temp = list[from];
        list[from] = list[to];
        list[to] = temp;
    }
}
