package Experiment2.n04;
// 接口myItfc
interface myItfc {
    double area(double value);
}
// 实现接口myItfc的类MyClass
class MyClass implements myItfc {
    public double area(double value) {
        return value * value * value;
    }
}
public class Test {
    public static void main(String[] args) {
        // 创建MyClass的实例
        MyClass calculator = new MyClass();
        // 调用area方法并输出结果
        double result = calculator.area(3.0);
        System.out.println("The cube of the argument is: " + result);
    }
}
