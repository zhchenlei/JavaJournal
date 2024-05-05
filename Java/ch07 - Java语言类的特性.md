# 第七章、Java语言类的特性
7个知识点，3个例子

- 方法重载
- 类的静态成员`static`
- 对象的应用
### 方法重载

实现多态的方法之一
- 重载：
	- 不同参数（<mark style="background: #FFB86CA6;">个数、类型、顺序</mark>），相同名字
	- 只有<mark style="background: #ABF7F7A6;">返回值不同</mark>不能形成重载；
		- 编译时已经完成了方法；

### 静态成员
- 实例成员static
	- 没有用static修饰的是普通成员方法
	- 被`static`修饰是**类成员**，可以**直接用类名访问**； 
	- 在第一次使用时被初始化，对该类的……，static成员变量只有一个
	- 在内存的**数据区**分配空间
		- 静态方法在调用时不会将对象的引用传递给它，而是在程序执行时就分配
	- 只有成员变量可以用访问控制权限，其它的都不能 
	- 对某类的任何一个具体对象而言，<font color=#FF0212>静态变量是一个公共的存储单元</font>
	- 访问或修改在同一个存储单元操作
	- 使用方：
		```java
		类名.静态变量名；//建议使用
		对象名.静态变量名；
		```
- 静态方法
	- 加载时优先加载
		- 代码段对所有对象共用 
	- static**只能访问**static成员变量和static方法
		- 不能使用this和super(非静态)
	- main方法的访问权限为何public static 
		- 开始加载时优先调用main方法，属于所有的类
	- static修饰的`{}`的语句组，他的作用与构造方法相似_静态初始化器_初始化器(多少对象多少初始化器)
		- <font color=#ED7002>静态初始化器</font>><font color=#ED7002>初始化器</font>><font color=#ED7002>构造方法</font>
	- 静态初始化器与构造方法的区别
		- 构造：多少个对象调用多少次 / 
		- 静态初始化器：只加载一次 /
		- 初始化器：创建一次对象


### 对象的赋值与比较
- 对象是<font color=#ED7002>引用型变量</font>
	- 使用对象时没有使用new仍然可以为对象赋值
- <font color=#FF0212>Object类</font>——所有java类的根基类
	- extends Object (所有类继承自Object类)
- 重写
	- 哈希码：唯一的![在这里插入图片描述](https://img-blog.csdnimg.cn/direct/5a129f228b064e568250364e31acb3e3.png)
	- 重写tostring()方法后![在这里插入图片描述](https://img-blog.csdnimg.cn/direct/088a7b9e4da846f09f256f835b9da506.png)

### equals方法
- public boolean equals(Object obj)  //在Object类中定义
	- 提供两对象是否相等的逻辑(引用_属性)
	- new完的对象后是一个随机的哈希码 

```java
Cat c1 = new Cat(1,2,3);
	Cat c2 = new Cat(1,2,3);

	System.out.println(c1.equals(c2)); //false
	System.out.println(c1 == c2);	//false

	String s1 = new String("Hello");
	String s2 = new String("Hello");
	System.out.println(s1 == s2);	//false
	System.out.println(s1.equals(s2));	//ture

	String s3 = "Hello";	//DataSeg 
	String s4 = "Hello";	//DataSeg
	System.out.println(s3 == s4);	//ture 
```
- `instanceof ` 对于C++的 `typeof()`
- rewrite equals 
	- `‘==’`比较的是地址
	- 未重写比较的也是地址
```java
	//rewrite equals
	public boolean equals(Object obj){
		if(obj == null) return false;	//none
		else{							// no-none
			if(obj instanceof Cat){
				Cat c = (Cat) obj;
				if(c.color == this.color && c.height == this.height && c.weight == this.weight)
				return true; 
			}
		}
		return false;
	}	
}

```

### 引用变量做方法的返回值

```java
返回的类名 方法名(参数表) {}
```
- 创建类Cat,返回身高体重都大的那只
```java

```

### 类类型的数组
- new分配内存空间给数组
- new创建新的对象，分配空间并使数组元素指向它
Q:Book类，作者、书名、价格、属性，输出，对价格排序

```java
import java.util.Scanner;
class Book{
	String bookName;
	int price;
	String writer;

	void display(){
		System.out.println("bookName:"+bookName+"\tprice:"+price+"\twriter:"+writer);
	}
}
public class Books{

	static void BSort(Book[] book){
		for(int j = 0; j < book.length; j++){
			for(int i = 0; i < book.length - 1; i++){
				if(book[i].price > book[i+1].price){
					Book tmp = book[i];
					book[i] = book[i + 1];
					book[i + 1] = tmp;
				}
			}
		}
	}
	public static void main(String[] args){
		int number = 3;
		Scanner input1 = new Scanner(System.in);
		Book[] book = new Book[number];

		for(int i = 0; i < number; i++){
			book[i] = new Book();
			System.out.print("Enter No,\t"+(i+1)+"  writer  ");
			book[i].writer = input1.next();
			System.out.print("Enter No,\t"+(i+1)+"  name  ");
			book[i].bookName = input1.next();
			System.out.print("Enter No,\t"+(i+1)+"  price  ");
			book[i].price = input1.nextInt();
			//System.out.print();	
		}
			System.out.println("Before Sort:");
		for(int i = 0; i < book.length; i++){
			book[i].display();
		}
		BSort(book);
		System.out.println("After Sort:");
		for(int i = 0; i < book.length; i++){
			book[i].display();
		}
	}
}
```

### 以对象数组为参数进行方法调用

- 传递数组时实参只需给出气数组名即可
Q:计算学生的平均年龄

作业：
P116：4 5 6 7 9 10
两个例子
book sort两个类实现
l

---