package enums;

public enum Vehicles {

    CAR(10,"WHITE"),
    BIKE(7,"BLACK"),
    CYCLE(5,"BLUE"),
    CAR_2(20,"GREEN");

    Vehicles(int price, String color) {
        this.price = price;
        this.color = color;
    }

    final int price;
    final  String color;


}
