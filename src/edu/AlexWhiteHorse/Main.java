package edu.AlexWhiteHorse;
//import edu.AlexWhiteHorse.methods.Method_MonteCatlo;

public class Main {

    public static void main(String[] args) {

        Method_MonteCarlo mtd = new Method_MonteCarlo();
        /**
        double output = mtd.monteCarlo(Functions::f_1, -20, 20, 0.00000001, true);
        System.out.println(output);
        */
        Derivatives mn = new Derivatives();
        double output = mn.derivative(Functions::f_3, 0.1312, 0.0217);
        System.out.println("Result: " + output);
    }


}
