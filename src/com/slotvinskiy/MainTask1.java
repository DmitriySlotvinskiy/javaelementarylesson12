package com.slotvinskiy;

import java.util.ArrayList;
import java.util.List;

public class MainTask1 {

    public static void main(String[] args) {

        String string = "man has dog";
        string = reverse(string);
        System.out.println(string);
    }

    private static String reverse(String string) {
        List<String> list = new ArrayList<>();
        String[] strArray = string.split("\\s");
        for (int i = strArray.length - 1; i >= 0; i--) {
            list.add(strArray[i]);
        }
        StringBuilder sb = new StringBuilder(string.length());
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                sb.append(list.get(i));
            } else {
                sb.append(list.get(i)).append(" ");
            }
        }
        return sb.toString();
    }
}
