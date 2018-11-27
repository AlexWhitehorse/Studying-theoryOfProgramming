package edu.AlexWhiteHorse;

public class Main {

    public static void main(String[] args) {
        double c = 2;
        Methods mtd = new Methods();
        double output = mtd.monteCarlo(Functions::f_1, -20, 20, 0.0000001, true);
        System.out.println(output);


    }


}
