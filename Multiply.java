public class Multiply {
    private double[] data = null;

    public Multiply(double[] data) {
        this.data = data;
    }
    
    public double multiply(double scalar) {
        double result = 0;
        for (int i = 0; i < data.length; i++) {
            result += data[i] * scalar;
        }
        return result;
    }

    public static double multiply(Multiply vector, double scalar) {
        double result = 0;
        for (int i = 0; i < vector.data.length; i++) {
            result += vector.data[i] * scalar;
        }
        return result;
    }
    public static void main(String[] args) {
        double[] data1 = {1, 2, 3};

        Multiply v1 = new Multiply(data1);
        System.out.println("v1 * n: " + Multiply.multiply(v1, 2));

        double[] data2 = {4, 5, 6};

        Multiply v2 = new Multiply(data2);
        System.out.println("v1 * n: " + v2.multiply(2));
    }
    
}