package edu.AlexWhiteHorse;


import static java.lang.Math.pow;

public class Functions {


    static double f_1(double x){
        return 2 * pow(x, 3) + 5 * pow(x, 2) + 9 * x + 11;
    }
    static double f_2(double x){
        return x - Math.log(0.9 + x) - 0.6;
    }
    static double f_3(double x){
        return  7 * Math.sin((x * x * x * x) + 2 * (x * x * x) + (x * x));
    }
}
