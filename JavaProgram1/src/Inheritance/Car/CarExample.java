package Inheritance.Car;

public class CarExample {
    public static void main(String[] args){
        Car car = new Car();
        for(int i = 0; i < 10; i++){
            int problemLocation = car.run();

            switch(problemLocation){
                case 1:
                System.out.print(car.tires[0].location + "changed to ");
                car.tires[0] = new KumhoTire(car.tires[0].location, 15);
                System.out.println(car.tires[0].getTireName());
                break;
                case 2:
                System.out.print(car.tires[1].location + "changed to ");
                car.tires[1] = new KumhoTire(car.tires[1].location, 13);
                System.out.println(car.tires[1].getTireName());
                break;
                case 3:
                System.out.print(car.tires[2].location + "changed to ");
                car.tires[2] = new KumhoTire(car.tires[2].location, 14);
                System.out.println(car.tires[2].getTireName());
                break;
                case 4:
                System.out.print(car.tires[3].location + "changed to ");
                car.tires[3] = new KumhoTire(car.tires[3].location, 17);
                System.out.println(car.tires[3].getTireName());
                break;
            }
            System.out.println("----------------------------------------");
        }
    }
}
