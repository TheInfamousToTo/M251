package MOCK_MTA;

import java.util.ArrayList;

public class sale {
    private String item;
    private double price;
    public sale(String item, double price){
        this.item = item;
        this.price = price;
    }
    public String getItem(){
        return item;
    }
    public double getPrice(){
        return price;
    }
    public void setItem(String item){
        this.item = item;
    }
    public void setPrice(double price){
        this.price = price;
    }
    public String toString(){
        return "Item: " + item + " Price: " + price;
    }
    public double bill(){
        return price;
    }
    public static void main(String[] args) {
        String str1="abc" , str2="abcc";
        sale s = new sale("Apple", 1.99);
        System.out.println(s);
        System.out.println(s.bill());
        DiscountSale ds = new DiscountSale("Apple", 1.99, 10);
        System.out.println(ds);
        System.out.println(ds.bill());
        ArrayList<sale> sales = new ArrayList<sale>();
        sales.add(new sale("Atomic coffee mug", 111.00));
        sales.add(new sale("Cup holder", 11.90));
        sales.add(new DiscountSale("Floor mat", 10.90, 10));
        sales.add(new DiscountSale("Map", 7.95, 0));
        for(sale ss : sales){
            System.out.println(ss);
        }



        System.out.println("Total bill: " + SalesTest.totalBill(sales));

    }
}
class DiscountSale extends sale{
    private double discount;
    public DiscountSale(String item, double price, double discount){
        super(item, price);
        this.discount = discount;
    }
    public double getDiscount(){
        return discount;
    }
    public void setDiscount(double discount){
        this.discount = discount;
    }
    public String toString(){
        return "Item: " + getItem() + " Price: " + getPrice() + " Discount: " + discount;
    }
    public double bill(){
        return (1-discount/100)*getPrice();
    }
    

}
class SalesTest {
    public static double totalBill(ArrayList<sale> sales) {
        double total = 0;
        for (sale ss : sales) {
            total += ss.bill();
        }
        return total;
    }
}