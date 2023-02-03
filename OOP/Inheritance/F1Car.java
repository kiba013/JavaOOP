package Inheritance;

public class F1Car extends Car{

    public void pitStop() {

    }


    public static void main(String[] args) {
        F1Car car1 = new F1Car();
        car1.gas();
        car1.brake();
        car1.pitStop();
    }
}
