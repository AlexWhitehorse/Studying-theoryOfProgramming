package edu.AlexWhiteHorse;
interface Func{
    double func(double x);
}

public class Methods {
    public double monteCarlo (Func fnc, double x_left, double x_right, double epsilon, boolean visualisation){
        //b - a
        double func_left = fnc.func(x_left);
        double func_right = fnc.func(x_right);

        double a = Math.min(fnc.func(x_left), fnc.func(x_right));
        double b = Math.max(fnc.func(x_left), fnc.func(x_right));

        if(fnc.func(x_left) * fnc.func(x_right) >= 0){
            System.out.println("There are no roots!");
            return func_left;
        }

        double c = (a + b)/ 2.0;
        while ((b - a)/2.0 > epsilon){

            // visualisation
            if (visualisation){
                System.out.println(c);
            }


            if (fnc.func(c) == 0){
                return c;
            }
            else if(fnc.func(a) * fnc.func(c) < 0){
                b = c;
            }
            else {
                a = c;
            }
            c = (a+b)/2;

        }
        return c; // result

    }





}
