package com.company;

import java.util.ArrayList;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer>arrayList1 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 50; i++) {
            int a = random.nextInt(100);
            if (a % 2 == 0){
                arrayList.add(a);
            }
            if (a % 2 != 0){
                arrayList1.add(a);
            }
            System.out.print(a+" ");
        }
        System.out.println("\n JUP   SANDAR "+arrayList);
        System.out.println("TAK SANDAR "+arrayList1);

    }
}
