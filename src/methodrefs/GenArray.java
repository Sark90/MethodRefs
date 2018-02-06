package methodrefs;

import java.util.Random;

public abstract class GenArray {

    public static Double[] genDoubleArray(int size) {
        Random random = new Random();
        Double[] arr = new Double[size];
        for(int i=0; i<size; i++) {
            arr[i] = random.nextDouble() * 100;
        }
        System.out.println("Generated array:");
        for(double d: arr) {
            System.out.println(d);
        }
        return arr;
    }
}
