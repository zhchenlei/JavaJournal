package Experiment2.n03;

class VolumeCalculator {
    // 计算立方体体积，参数a是边长
    public int volume(int a) {
        return a * a * a;
    }

    // 计算长方体体积，参数a,b,c分别是长方体的长、宽和高
    public int volume(int a, int b, int c) {
        return a * b * c;
    }

    // 计算圆柱体体积，参数r,h分别是圆柱体的半径和高
    public double volume(double r, double h) {
        return Math.PI * r * r * h;
    }
}

public class Test {
    public static void main(String[] args) {
        VolumeCalculator calculator = new VolumeCalculator();

        // 计算立方体体积
        int cubeVolume = calculator.volume(3);
        System.out.println("立方体体积： " + cubeVolume);

        // 计算长方体体积
        int rectangleVolume = calculator.volume(2, 3, 4);
        System.out.println("长方体体积： " + rectangleVolume);

        // 计算圆柱体体积
        double cylinderVolume = calculator.volume(3.0, 5.0);
        System.out.println("圆柱体体积： " + cylinderVolume);
    }
}
