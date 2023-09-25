public abstract class T11Car {
    /*
    Create a Class Car that would have the following fields: carPrice and
color and method calculateSalePrice() which should be returning a
price of the car.
Create 2 sub classes: Sedan and Truck. The Truck class has a field
as weight and has its own implementation of calculateSalePrice()
method in which returned price is calculated as following: if
weight>2000 then returned price car should include 10% discount,
otherwise 20% discount.
The Sedan class has field as length and also does it is own
implementation of calculateSalePrice(): if length of sedan is >20 feet
then returned car price should include 5% discount, otherwise 10%
discount
     */
 double carPrice;
 String color;
 abstract double calculateSalePrice();

}
class Truck extends T11Car{
    double weight;

    @Override
    double calculateSalePrice() {
        if(weight>2000){
            return carPrice-(carPrice*0.1);
        }else {
            return carPrice-(carPrice*0.2);
        }
    }
}
class Sedan extends T11Car{
    double length;

    @Override
    double calculateSalePrice() {
        if(length>20){
            return carPrice-(carPrice*0.05);
        }else {
            return carPrice-(carPrice*0.1);
        }
    }
}

class CarTest{
    public static void main(String[] args) {
        Truck t1 = new Truck();
        double p1=t1.carPrice=45000;
        String c1=t1.color="Black";
        t1.weight = 3000;
       double s1=t1.calculateSalePrice();
        System.out.println("Price of "+c1+" Truck is "+ " and the Sales price is "+s1);
       Sedan s=new Sedan();
       double p2=s.carPrice=30000;
       String c2=s.color="White";
       s.length=25;
       double r1=s.calculateSalePrice();
        System.out.println("Price of "+c2+" Sedan is "+" and the Sales price is "+r1);
    }
}
