package com.company;

abstract class Transportation{
    String name;
    public String toString(){
        return"View Transportation: " + name;
    }
}
abstract  class TransportationFatory{
    public abstract Transportation createTransport();
}
class TruckFactory extends TransportationFatory{
    public Transportation createTransport(){
        return new Truck();
    }
}
class AirplaneFactory extends TransportationFatory{
    public Transportation createTransport(){
        return new Airplane();
    }
}
class Truck extends Transportation{
    public Truck(){
        name = "Delivery by truck";
    }
}
class Airplane extends Transportation{
    public Airplane(){
        name = "Delivery by sky";
    }
}
class ShipFactory extends TransportationFatory{
    public Transportation createTransport(){
        return new Ship();
    }
}
class Ship extends Transportation{
    public Ship(){
        name = "Shipping by sea";
    }
}
public class Main {

    public static void main(String[] args) {
        TransportationFatory airplaneDelivery = new AirplaneFactory();
        TransportationFatory truckDelivery = new TruckFactory();
        TransportationFatory oceanDelivery = new ShipFactory();
        Transportation airDel = airplaneDelivery.createTransport();
        Transportation truckDel = truckDelivery.createTransport();
        Transportation oceanDel = oceanDelivery.createTransport();
        System.out.println(airDel);
        System.out.println(truckDel);
        System.out.println(oceanDel);

    }
}









