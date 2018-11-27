package edu.AlexWhiteHorse;
interface Func{
    double func(double x);
}

public class Methods {
    public void monteCarlo (Func fd, double x){
        System.out.println(fd.func(x) + x);

    }





}
