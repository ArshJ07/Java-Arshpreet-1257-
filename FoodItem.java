public class FoodItem {
    int itemId;
    String itemName;
    double price;
    static String cafeteriaName="UCampus Cafeteria";
    static double serviceCharge=10.0;
    static int FoodItems=0;

    void addFoodItem(int id,String name,double price1){
        itemId=id;
        itemName=name;
        price=price1;
        FoodItems+=1;
    }
    double calculateFinalPrice(){
        return price+(price*serviceCharge/100);
    }
    void displayItemDetails(){
        System.out.println("Item Id:"+itemId);
        System.out.println("Item Name:"+itemName);
        System.out.println("Original price:"+price);
        System.out.println("Final price:"+calculateFinalPrice());
    }
    static void changeServiceCharge(double newCharge){
        serviceCharge=newCharge;
    }
    static void displayCafeteriaDetails(){
         System.out.println("Name of Cafeteria:"+cafeteriaName);
         System.out.println("Current service charge:"+serviceCharge);
         System.out.println("Total food items"+FoodItems);
    }
    public static void main(String[] args){
        FoodItem item1=new FoodItem();
        FoodItem item2=new FoodItem();
        FoodItem item3=new FoodItem();
        item1.addFoodItem(101,"Veg Sandwich",80);
        item2.addFoodItem(102,"Cold coffee",120);
        item3.addFoodItem(103,"Paneer Wrap",150);
        FoodItem.displayCafeteriaDetails();
        item1.displayItemDetails();
        item2.displayItemDetails();
        item3.displayItemDetails();
        FoodItem.changeServiceCharge(15);
        System.out.println("After updating service charge");
        item1.displayItemDetails();
        item2.displayItemDetails();
        item3.displayItemDetails();

    }
}

