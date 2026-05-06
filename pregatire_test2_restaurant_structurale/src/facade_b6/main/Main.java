package facade_b6.main;

import facade_b6.clase.Masa;
import facade_b6.clase.Ospatar;
import facade_b6.facade.RestaurantFacade;

public class Main {
    public static void main(String[] args) {
        Masa masa1=new Masa(1,true,true,true);
        Masa masa2=new Masa(2,true,true,false);
        Masa masa3=new Masa(3,false,true,true);

        Ospatar ospatar=new Ospatar("Andreea");

        RestaurantFacade restaurantFacade=new RestaurantFacade(ospatar);
        restaurantFacade.verificaMasa(masa1);
        restaurantFacade.verificaMasa(masa2);
        restaurantFacade.verificaMasa(masa3);
        masa3.setEsteLibera(true);
        restaurantFacade.verificaMasa(masa3);
    }
}
