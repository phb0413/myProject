package com.myspring.test.shop;

import lombok.Data;

@Data
public class Cart {
	private int cart_number;
    private String cart_buyer;
    private int cart_buycount;
    private int cart_fruitnumber;
    private String item_name;
    private int item_price;
    private String item_image;
    
}
