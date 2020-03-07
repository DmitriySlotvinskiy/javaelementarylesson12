package com.slotvinskiy;

public class Iterator {

    private int[][] matrix;
    private int totalLength;
    private int commonCurrent;
    private int[] currents;

    public Iterator(int[][] matrix) {
        this.matrix = matrix;
        totalLength = getTotalLength(matrix);
        currents = getLengthOfArraysInMatrix(matrix);
    }

    public boolean hasNext() {
        if (commonCurrent < totalLength) {
            return true;
        } else {
            return false;
        }
    }

    public int next() {
        int currentMin = getFirstNotPrinted();
        boolean isCurrentMinChanged = false;
        for (int i = 0; i < matrix.length; i++) {
            if (currents[i] >= matrix[i].length) {
                continue;
            }
            if (matrix[i][currents[i]] < currentMin) {
                currentMin = matrix[i][currents[i]];
                currents[i]++;
                isCurrentMinChanged = true;
            }
        }
        if (!isCurrentMinChanged) {
            currents[0]++;
        }
        commonCurrent++;
        return currentMin;
    }

    private int getFirstNotPrinted() {
        for (int i = 0; i < currents.length; i++) {
            if (currents[i] < matrix[i].length) {
                return matrix[i][currents[i]];
            }
        }
        return -1;
    }

    private int getTotalLength(int[][] matrix) {
        int totalLength = 0;
        for (int i = 0; i < matrix.length; i++) {
            totalLength += matrix[i].length;
        }
        return totalLength;
    }

    private int[] getLengthOfArraysInMatrix(int[][] matrix) {
        return new int[matrix.length];
    }
}
