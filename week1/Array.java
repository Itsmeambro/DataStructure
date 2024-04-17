package week1;

import java.util.*;

/**
 * Day one for DSA
 * 
 */
public class Array {
    int n = 10;
    int size = 0;

    int[] arr = new int[n];

    public static void main(String args[]) {
        Array a = new Array();
        a.insert(4);
        a.insert(5);
        a.insert(7);
        a.insert(9);

        a.delete(7);
        a.delete(4);
        a.dis();
    }

    void insert(int no) {
        if (size < n) {
            arr[size] = no;
            System.out.println(no + " inserted into Array");
            size = size + 1;
        } else {
            System.out.println("Array is full");
        }
    }

    void delete(int no) {
        int i = 0;
        while (i < size) {
            if (no == arr[i]) {
                break;
            }
            i++;
        }
        while (i < size - 1) {
            arr[i] = arr[i + 1];
            i++;
        }
        size = size - 1;
    }

    void dis() {
        System.out.println(" Display Array");
        for (int i = 0; i < size; i++) {
            System.out.print(" " + arr[i]);

        }
    }
}