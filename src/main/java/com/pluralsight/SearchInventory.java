package com.pluralsight;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SearchInventory {
    package com.pluralsight;

import java.util.ArrayList;

    public class SearchInventory {
        public static void main(String[] args) {
            ArrayList<Product> inventory = getInventory();

            Collections.sort(inventory, new Comparator<Product>() {
                @Override
                public int compare(Product firstPrduct, Product secondProduct) {
                    return firstPrduct.getName().compareTo(secondProduct.getName());
                }
            });

            System.out.println("*****Store Inventory*****");
            System.out.println();

            for (Product product : inventory) {
                System.out.println(product);
            }
            System.out.println();
            System.out.println("Total products in Inventory: " + inventory.size());

        }

        public static ArrayList<Product> getInventory() {
            ArrayList<Product> inventory = new ArrayList<>();

            try {
                FileReader fileReader = new FileReader("inventory.csv");
                BufferedReader bufferedReader = new BufferedReader(fileReader);

                String line = bufferedReader.readLine();

                while (line != null) {
                    String[] parts = line.split("\\|");

                }



            }

            return inventory;
        }
    }

}
