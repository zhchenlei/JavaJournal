package Experiment2.n02;

// 类A
class A {
    // 私有整型变量data
    private int data;

    // 设置变量data的方法
    public void setData(int value) {
        this.data = value;
    }

    // 获取变量data的方法
    public int getData() {
        return this.data;
    }
}
// 测试类TestA
public class TestA {
    public static void main(String[] args) {
        // 创建类A的实例
        A a = new A();

        // 设置data的值
        a.setData(10);

        // 获取并打印data的值
        System.out.println("Initial data: " + a.getData());

        // 修改data的值
        a.setData(20);

        // 再次获取并打印data的值
        System.out.println("Modified data: " + a.getData());
    }
}
