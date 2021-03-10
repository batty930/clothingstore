package com.fashion;

public class Customer {
    public static void main(String[] args) {

        List[] lists = {
                new List("0013", 490, 0),
                new List("0052", 1000, 100),
                new List("0081", 290, 0),
                new List("2122", 2000, 200)
        };
        System.out.println("ID / cost / Discount / Total");
        for (int i = 0; i < lists.length; i++) {
            lists[i].print();
        }
    }
}