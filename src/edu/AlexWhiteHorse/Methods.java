package edu.AlexWhiteHorse;

import edu.AlexWhiteHorse.Func;

class Method_MonteCarlo {
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
class Method_BisectionV2{
   public double numbisectionV2(Func func,double a,double b,double epsilon, int maxIter, boolean visible){

       int n = 0;
       double c, result = 0;
       while (n < maxIter){

           c = (a + b)/2; // new midpoint
           if (visible){
               System.out.println(n + ". " + c);
           }
           if(func.func(c) == 0 || (b-a)/2 < epsilon) { //solution found

               result = c;
               break;
           }

           n++;
           //new interval
           if(Math.signum(func.func(c)) == Math.signum(func.func(a))){
               a = c;
           }else{
               b = c;
           }

       }
       return result;
   }
}
class Derivatives{
    double derivative(Func func,double x0, double h){
        double x1 = x0 + h,
                x2 = x1 + h,
                x3 = x2 + h,
                x4 = x3 + h;
        double x_1 = x0 - h,
                x_2 = x_1 - h;
        System.out.println("3 - point Prcedure: ");
        double f3 = ( func.func(x1 + h) - func.func(x1 - h) ) / 2*h;
        System.out.println(f3 + "\n" );

        System.out.println("4 - point");

        double f4 = (-2*func.func(x_1) - 3*func.func(x0) + 6 * func.func(x1) - func.func(x2)) / 6 *h;
        double f4_2 = (-11 * func.func(x0) + 18 * func.func(x1) - 9 * func.func(x2) + 2 * func.func(x3)) / 6 * h;

        System.out.println(f4 + "\n" + f4_2);

        System.out.println("5 - point");

        double f5 = (func.func(x_2) - 8 * func.func(x_1) + 8 * func.func(x1) - func.func(x3)) / 12 * h;
        double f5_2 = (-3 * func.func(x_1) - 10* func.func(x0) + 18 * func.func(x1) - 6 * func.func(x2) + func.func(x3))/12*h;
        double f5_3 = (-25* func.func(x0) + 48 * func.func(x1) - 36 * func.func(x2) + 16 * func.func(x3) - 3 * func.func(x4))/12*h;

        System.out.println(f5 + "\n" + f5_2 + "\n" + f5_3);
        return  0;
    }



}