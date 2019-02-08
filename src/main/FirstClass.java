package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = 0;
        int a = 0;
        int b = 0;
        int i = 0;
        do {
            i++;
            if (i != 1) {
                System.out.println("Musbet tam  ededler daxil edin ve bu ededler interval daxilinde olsun: ");
            }
            System.out.print("Ureyinizde bir eded tutun: ");
            try{
               n = Integer.parseInt(in.next());
            }
            catch (Exception e){
                continue;
            }
            System.out.println("Ededler intervalini bildirin: ");
            System.out.print("Birinci eded: ");
            try {
                a = Integer.parseInt(in.next());
            }
            catch (Exception e){
                continue;
            }
            System.lineSeparator();
            System.out.print("Ikinci eded: ");
            try {
                b = Integer.parseInt(in.next());
            }
            catch (Exception e){
                continue;
            }
            System.lineSeparator();
        } while (!(n > a && n < b && n > 0) );
        String change;
        int z;
        List<Integer> list = new ArrayList<>();
        do {
            if (a < b) {
                z = (int) Math.floor(Math.random() * (b - a) + a);
            } else {
                z = (int) Math.floor(Math.random() * (a - b) + b);
            }
            if (list.contains(z)){
                continue;
            }

            System.out.println("Edediniz budur: " + z);
            list.add(z);

            if (z == n) {
                System.out.println("TEBRIKLER");
                break;

            } else {
                do {
                    System.out.print("Sehvdir. Yuxari (y) ya asagi (a) ? :");
                    change = in.next();
                    System.lineSeparator();
                } while (!change.toUpperCase().equals("Y") && !change.toUpperCase().equals("A"));

            }
            if (change.toUpperCase().equals("Y")) {
                a = z;
            } else if (change.toUpperCase().equals("A")) {
                b = z;
            }
        }while (z != n);
    }


    }


