package com.fashion;

public class List {
    String id;
    int cost;
    int discount;


    public List(String id, int cost, int discount) {
        this.id = id;
        this.cost = cost;
        this.discount = discount;
    }

    public void print() {
        if (discount==0){
            System.out.println(id + "\t" + cost + "\t\t" + discount + "\t\t" + (cost-discount));
         }else {System.out.println(id + "\t" + cost + "\t" + discount + "\t\t" + (cost-discount));
        }
    }
}
