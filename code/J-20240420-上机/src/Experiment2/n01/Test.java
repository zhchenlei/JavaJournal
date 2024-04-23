package Experiment2.n01;

// 交通工具基类
class Vehicle {
    // 交通工具的运行方法
    public void run() {
        System.out.println("这是交通工具run方法");
    }
}
// 汽车类
class Motor extends Vehicle {
    // 汽车的运行方法
     
    public void run() {
        System.out.println("汽车正在行驶");
    }
}
// 船类
class Ship extends Vehicle {
    // 船的运行方法
    public void run() {
        System.out.println("船正在航行");
    }
}
// 飞机类
class Aeroplane extends Vehicle {
    // 飞机的运行方法
    public void run() {
        System.out.println("飞机正在飞行");
    }
}
// 公共汽车类
class Bus extends Motor {
    // 公共汽车的运行方法

    public void run() {
        System.out.println("公共汽车正在运行");
    }
}
// 轿车类
class Car extends Motor {
    // 轿车的运行方法
    public void run() {
        System.out.println("轿车正在行驶");
    }
}
// 测试类
public class Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
        Motor motor = new Motor();
        Ship ship = new Ship();
        Aeroplane aeroplane = new Aeroplane();
        Bus bus = new Bus();
        Car car = new Car();

        vehicle.run();
        motor.run();
        ship.run();
        aeroplane.run();
        bus.run();
        car.run();
    }
}
