package com.slotvinskiy;

public class MainTask2 {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 5},
                {2, 3},
                {1, 3, 4, 7}
        };

        Iterator iterator = new Iterator(arr);
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // [1,1,2,2,3,3,4,5,7]

    }
}
