package com.company;

public class test3 {
    public static void main(String[] args) {
        String [] store = new String[6] ;
        store [0] = "apple" ;
        store [1] = "banana" ;
        store [2] = "grape" ;
        store [3] = "strawberry" ;
        store [4] = "blueberry" ;
        store [5] = "kiwi" ;
        for (int x = 0; x <store.length ; x++) {
            System.out.println(store[x]);

        }
for(String grocery: store) {
    System.out.println(grocery);
}

    }
}
