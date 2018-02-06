package methodrefs;

interface IFunc/*<T extends Number>*/ {
    public Double func(Double[] arr);
}

class Count/*<T extends Number>*/ {

    double getMin(Double[] arr) {
        Double min = arr[0].doubleValue();
        for(Double d: /*(Double[])*/ arr) {
            if (d < min) {
                min = d;
            }
        }
        return min;
    }
}

class Main/*<T extends Number>*/ {
    static /*<T extends Number>*/ double demo(IFunc iFunc, Double[] arr) {
        return iFunc.func(arr);
    }

    public static  void main(String[] args) {
        // String s = "Лямбда-выражения повышают эффективность Java";
        Count/*<Double>*/ count = new Count/*<>*/();
        System.out.println("MIN: " + demo(count::getMin, GenArray.genDoubleArray(20)));
    }
}

