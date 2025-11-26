package com.Demo.MavenProject2;
class Order<T> {
	private T item;
 
	public T getItem() {
		return item;
	}
 
	public void setItem(T item) {
		this.item = item;
	}
 
	@Override
	public String toString() {
		return "Order [item=" + item + "]";
	}
 
	public Order(T item) {
		this.item = item;
	}
}
 
class Item {
	private int id;
	private String name;
	private int price;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	public Item(int id, String name, int price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
 
	
	
}
 
public class DemoOnGenerics {
	
	public static <T> void display(T data) {
		System.out.println("data is" + data);
	}
	public static <T extends Number,U extends Number> void add(T t1,U u1) {
		System.out.println(t1);
		
	}
	public static void main(String[] args) {
		Item[] items = {
	            new Item(1, "Laptop", 50000),
	            new Item(2, "Phone", 30000),
	            new Item(3, "Tablet", 20000)
	        };
 
	        Order<Item[]> order = new Order<>(items);
    
	        System.out.println(order);
 
	        for (Item item : order.getItem()) {
	            System.out.println(item);
	        }
	}
}
 


