package Generic.GenericType;

public class ProductExample {
    public static void main(String[] args){
        Product<Tv, String> product1 = new Product<Tv, String>();
        product1.setKind(new Tv());
        product1.setModel("SmartTv");

        Product<Car, String> product2 = new Product<Car, String>();
        product2.setKind(new Car());
        product2.setModel("Diesel");

        Tv tv = product1.getKind();
        Car car = product2.getKind();

        String tvModel = product1.getModel();
        String carModel = product2.getModel();
    }
    static class Tv{}
    static class Car{}
}
