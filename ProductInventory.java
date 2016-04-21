/*
 * ProductInvetory.java
 * 
 * Copyright 2016 graf <graf@chillosphere.spacepotato>
 * 
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301, USA.
 * 
 * 
 */


public class ProductInventory {
	
	private double price;
	private int stock;
	private String id;
	
	public void setUpInventory(String newId, int newStock, double newPrice){
		id = newId;
		stock = newStock;
		price = newPrice;
		}	
	public void changeProduct(String newId){
		id = newId;
		System.out.println("id changed to: " + newId);
		}
	public void changePrice(double newPrice){
		price = newPrice;
		System.out.println("price changed to: " + newPrice);
		}
	public void getInventory(){
		System.out.println("identification: " + id);
		System.out.println("items available: " + stock);
		System.out.println("price: " + price);
		}
	public void purchaseItem(int numBought){
		if (stock - numBought < 0){
			System.out.println("not enough in stock");
			}
		else {
			stock = stock - numBought;
			System.out.println("sold " + numBought + " for " + (price * (double)numBought));
			}	
		}
	public void addStock(int toBeAdded){
		stock += toBeAdded;
		System.out.println("added " + toBeAdded + " to inventory");
		}
	
	
	
	public static void main (String args[]) {
		
		ProductInventory demo = new ProductInventory();
		demo.setUpInventory("thingy", 5, 2.50);
		demo.getInventory();
		demo.purchaseItem(6);
		demo.purchaseItem(4);
		demo.getInventory();
		demo.addStock(6);
		demo.purchaseItem(6);
		demo.changeProduct("spatulas");
		demo.changePrice(19.99);
		
		
	
	}
}

