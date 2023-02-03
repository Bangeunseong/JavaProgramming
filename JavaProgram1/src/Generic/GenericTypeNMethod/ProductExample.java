package Generic.GenericTypeNMethod;

public class ProductExample {
    public static void main(String[] args){
        class TV{
            private String modelID;
            private int price;

            TV(String modelID, int price){this.modelID = modelID; this.price = price;}
        }
        class Car{
            private String modelID;
            private int price;

            Car(String modelID, int price){this.modelID = modelID; this.price = price;}
        }

        Product<TV,String> product1 = new Product<TV,String>();
        product1.setkind(new TV("141521256", 350000));
        product1.setmodel("Smart TV");
        TV tv = product1.getkind();
        String tvmodel = product1.getmodel();

        Product<Car,String> product2 = new Product<Car,String>();
        product2.setkind(new Car("S_131215", 35000000));
        product2.setmodel("Diesel");
        Car car = product2.getkind();
        String carmodel = product2.getmodel();
    }
}
