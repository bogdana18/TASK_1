package org.example;

import org.example.inventory.Inventory;

public class Initialization {

    public static void InitProducts()
    {
        Inventory inventory = new Inventory();
        inventory.AddProduct(1, "bread", 12345.1, "2 breads", Category.PRODUCTS);
        inventory.AddProduct(3, "crown", 124427.32, "Made of silver", Category.ACCESSORIES);
        inventory.AddProduct(4, "lipstick", 1425.743, "For lips coloring", Category.BEAUTY);
        inventory.AddProduct(5, "ball", 100.00, "Small ball for cats", Category.PET_SUPPLIES);
        inventory.AddProduct(6, "cucumber", 527.34, "1500 gr", Category.PRODUCTS);
        inventory.AddProduct(7, "candy", 1345.1, "15 candies", Category.PRODUCTS);
        inventory.AddProduct(8, "Sprite", 120.24, "2L", Category.PRODUCTS);
        inventory.AddProduct(9, "bracelet", 51227.32, "Made of gold", Category.ACCESSORIES);
        inventory.AddProduct(11, "tomato", 500.13, "1 kg", Category.PRODUCTS);
    }
}
