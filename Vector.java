public class Vector {
    private double[] data;

    public Vector(double[] data) {
        this.data = data;
    }

    public double add(Vector other) {
        double result = 0;
        for (int i = 0; i < data.length; i++) {
            result += data[i] + other.data[i];
        }
        return result;
    }

    public static double addVectors(Vector v1, Vector v2) {
        double result = 0;
        for (int i = 0; i < v1.data.length; i++) {
            result += v1.data[i] + v2.data[i];
        }
        return result;
    }

    public static void main(String[]args){
        double[] data1 = {1.0, 2.0, 3.0};
        double[] data2 = {4.0, 5.0, 6.0};
        Vector v1 = new Vector(data1);
        Vector v2 = new Vector(data2);
        System.out.println("v1 + v2= " +  v1.add(v2));
        System.out.println("v1 + v2= " + Vector.addVectors(v1, v2));
    }
}


