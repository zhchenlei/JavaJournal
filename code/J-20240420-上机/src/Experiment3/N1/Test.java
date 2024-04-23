package Experiment3.N1;

// 自定义异常类
class MoneyException extends Exception {
    public MoneyException(String message) {
        super(message);
    }
}

// 存款账户类
class MoneyAccount {
    private double yu; // 存款余额

    public MoneyAccount(double initialBalance) {
        this.yu = initialBalance;
    }

    // 存款操作
    public void putMoney(double money) {
        yu += money;
    }

    // 取款操作
    public void getMoney(double money) throws MoneyException {
        if (yu < money) {
            throw new MoneyException("当前余额不足，不能取款。");
        }
        yu -= money;
    }

    // 获取余额
    public double getYu() {
        return yu;
    }
}

// 测试类
public class Test {
    public static void main(String[] args) {
        MoneyAccount account = new MoneyAccount(1000.0); // 初始余额为1000元
        try {
            // 存款
            account.putMoney(500.0);
            System.out.println("存款后的余额： " + account.getYu());
            account.getMoney(200.0);
            account.getMoney(2000.0);
        } catch (MoneyException e) {
            System.out.println(e.getMessage());
        }
    }
}
