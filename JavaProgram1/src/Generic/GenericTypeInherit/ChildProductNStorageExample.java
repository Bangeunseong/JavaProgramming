package Generic.GenericTypeInherit;

public class ChildProductNStorageExample {
    public static void main(String[] args){
        ChildProduct<TV,String,String> product = new ChildProduct<>();
        product.setKind(new TV());
        product.setModel("SmartTV");
        product.setCompany("Samsung");

        Storage<TV> storage = new StorageImp1<TV>(100);
        storage.add(new TV(), 0);
        TV tv = storage.get(0);
    }
}
