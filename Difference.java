public class Difference {
    private double[] data;

    public Difference(double[] data) {
        this.data = data;
    }

    public double diff(Difference other) {
        double result = 0;
        for (int i = 0; i < data.length; i++) {
            result += data[i] - other.data[i];
        }
        return result;
    }

    public static double diffVectors(Difference v1, Difference v2) {
        double result = 0;
        for (int i = 0; i < v1.data.length; i++) {
            result += v1.data[i] - v2.data[i];
        }
        return result;
    }

    public static void main(String[]args){
        double[] data1 = {1.0, 2.0, 3.0};
        double[] data2 = {4.0, 5.0, 6.0};
        Difference v1 = new Difference(data1);
        Difference v2 = new Difference(data2);
        System.out.println("v1 - v2= " +  v1.diff(v2));
        System.out.println("v1 - v2= " + Difference.diffVectors(v1, v2));
    }
}


