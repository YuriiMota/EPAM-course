package epam.flowersShop;

import epam.flowersShop.Decorator.Bouquet;
import epam.flowersShop.Decorator.DeliveryDecorator;
import epam.flowersShop.Decorator.PotDecorate;
import epam.flowersShop.Decorator.WrapperDecorate;
import epam.flowersShop.enums.Delivery;
import epam.flowersShop.enums.Pot;
import epam.flowersShop.enums.Wrapper;
import first.Input;

public class Test  {
    public static void main(String args[]){

        Order order =  PlantFactory.getPlant("Tulip");

        System.out.println("Total price: "+order.getPrice());

        order = new Bouquet(PlantFactory.getPlant("Rose"),order.getPrice());
        System.out.println("Total price: "+order.getPrice());

        order = new Bouquet(PlantFactory.getPlant("Marigold"),order.getPrice());
        System.out.println("Total price: "+order.getPrice());

        order= new WrapperDecorate(order, Wrapper.PAPER);
        System.out.println("Total price: "+order.getPrice());

        order= new PotDecorate(order,Pot.M);
        System.out.println("Total price: "+order.getPrice());

        order= new DeliveryDecorator(order, Delivery.NovaPoshta);
        System.out.println("Total price: "+order.getPrice());
    }
}
