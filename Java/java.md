

API文档[Overview (Java Platform SE 8 ) (oracle.com)](https://docs.oracle.com/javase/8/docs/api/) 

---
- vscode
	- 打开
		- ctrl+shift+p
			- 创建java项目
			- 输入项目名
			- NO build tools
```json
{
    "java.project.sourcePaths": ["src"],
    "java.project.outputPath": "bin",
    "java.project.referencedLibraries": [
        "lib/**/*.jar"
    ]
}
```

---

# 第一节
## 1.3 Java技术简介 

- Java SE 桌面平台
-  Java ME 
	- 手机和平板编程
- Java EE


## 1.4 Java 虚拟机
虚拟机机制
`javac`->`java`

`*.java`编译——>`JVM`虚拟机—执行——>`.class` (跨平台)

J2SDK(JRE())

## 1.5 Java程序的种类和结构
1. Java应用程序（Application）
2. Java 小程序(Applet)——网页HTML


```java
import java.applet.*;
import java.awt.*;

//继承
public class sum100App extends Applet{
	public void paint(Graphics g)
	{
		int sum += 0;
		for(int i = 0; i<=100; i++){
			sum +=i;
		}
	}
	setBackground(new Color(0,0,255));
	g.setColor(color.yellow);
	g.setFont(new Font("Time "))
	g.drawString("1+2+……100="+sum);
}
```

```html
<html>
	<applet> code="sum100App.class"height=300 width=300>
	</applet>
</html>
```

`appletviewer` 

### 注意事项： 
- 基本组成部分是类，类为独立的单元
- 

### 练习
字节码
解释运行

Java applet  appletviewer 

### 作业
HelloWorld





//第二节
开发工具/环境
应用

appletviewer

# Java语言基础

## 数据类型

**四类八种**
- 基本数据类型：
	- 数值型
		- 整数类型（byte, short, int ,long)
			- byte: 8   (-2^7 ~ 2^7-1)127
			- short:16 (-2^15 ~ 2^15-1)
			- int : 32 (-2^31 ~ 2^31-1)十位
			- long:64 (-2^63 ~ 2^63-1)
		- 浮点
			- 单精度float：32（-10^38~10^(38)）
			- 双精度double: 64 (-10^308~10^308)
	- 逻辑型
		- true  1个字节
		- false
	- 字符型
		- char 存储单个字符
			- 2个字节
			- 用Unicode字符集编码(GB2313 `\u0000~\uFFFF`   <mark style="background: #FFB86CA6;">2^16 = 65535</mark>
			- 用单引号引用表示字符![[Pasted image 20230202195056.png|600]]

- 引用数据类型
	- 类
	- 接口
	- 数组

## 关键字和标识符

<mark style="background: #ABF7F7A6;">标识符</mark>：凡是可以起名字的地方都叫标识符
<mark style="background: #BBFABBA6;">命名规则</mark>：
>**字母、下划线`_`、美元符`$`**、数字

<mark style="background: #FF5582A6;">关键字</mark>：被系统使用的字符串![在这里插入图片描述](https://img-blog.csdnimg.cn/direct/e124a88c59804714a1559f103bfa11b1.png)

<mark style="background: #FF5582A6;">常量</mark>：`final` (c++`const`)
## 3.4 变量
内存中的一块存储单元
Java中每一个变量都是特定的数据类型
每个变量必须申明和赋值

<font color=#FF0212>程序执行过程：</font>


### 内存：
加载到内存中和有四区：
堆：new出来的东西
栈：局部变量
数据区：字符串常量
代码区：代码

- 局部变量——方法体内申明的
- 成员变量
类外不能定义变量

<mark style="background: #ADCCFFA6;">作业：</mark>
P44
1 2 3 4 5
11 12 13 18

 局部变量：方法体内

### 数据类型转换
- boolean不能转换
- 容量小的转为容量大的（<font color=#FF0212>表值范围</font>）
	- byte,short,char->char->int->long->
-  大——>小
	- 要进行强制类型转换
	- byte,short,char不会相互转换，首先转为int参与运算，赋值时要进行强制类型转换
		- 严格，为了跨平台性


>局部变量初始化要进行赋值，否则在使用时会报错
>float->((`float a = (float) 0.1`,`float a = 0.1l`));double->+`d`;

字符串->数值`String Mynumnber = "123.456";float Myfloat = Float.praseFloat(Mynumnber)`
数值->字符串

键盘输入数据：
全部认为是字符串，使用了标准输入输出流，封装
```java
String str;
InputStreamReader inp; //
inp = new InputStreamReader(System.in);
BuffereReader

/////
String str2;
BuffereReader buf;
buf = new BuffereReader (new InputStream(system.in );
str2 = buf.readLine(); 
```
```java
Scanner reader = new Scanner(System.in);
```

## 运算符与表达式
算数：
关系：
- 逻辑：
>`&&` 短路与 `||`  短路与  第一个不符则<font color=#FF0212>只判断前一个</font>

- 位：
> 

赋值：+= =
条件：
其它：

java中%是浮点运算
字符串运算符`+` 

表达式类型和值对应
从左往右

作业：14 15 16 17








# 第四章 流程控制
## 语句和复合语句
简单语句`;`/复合语句`{}`
## 4.2顺序结构

## 4.3 分支结构
- `if() else`
- `switch`多路选择
```java
switch(表达式)
{
	case 表达式1:
		 语句序列1;
		 break;
	case 表达式2:
		 语句序列2;
		 break;
	default:
}
```
>*case* 穿透：只要没有*break*就一直穿透
>case合并；
>只能switch(int 类型[ASCII])


### 循环语句
- **while语句**
先判断再循环

- **do…while语句**
先做一次再循环
```java
do{

}while(); //java有";"C++无";"

```
表达式的值<mark style="background: #FFB8EBA6;">i++=i ;</mark> <mark style="background: #FFB8EBA6;">++i = i+1</mark> 
*右结合性*
- **for循环**
## 4.5 循环中的跳转语句
break:‘
continue:结束当次语句




1 5 6 8 9 10^308 


# 第五章 数组与字符串
## 一维数组和多维数组的定义
**概念**: Java中元素可以是数据类型，也可以是对象；
**内存分配**：
- 栈内存：
基本数据类型和引用
- 堆：数组对象
	- 引用型的变量
		- new内容数据在Heap，数组在栈上
```java
a = new int[10];
```
### 5.1 定义
```java
数据类[] 数组名；  //声明
数组名 = new 数据类型[个数]; //动态内存
数据类型[] 数组名 = new 数据类型[个数]
栈上：引用类型   ——>    堆上分配空间0
```
Java数组定义时不分配内存，在定义的时候不写长度；
new 时默认赋值 为0、0.0  (在堆上)
引用关系
- 与C++不同的是，java对数组元素进行越界检查
>属性length检查

引用类型数据每一个元素都<mark style="background: #FFB86CA6;">必须要实例化</mark>

内存图

### 5.2 一维数组 
#### 初始化
- 静态
>声明时定义
>
- 动态
>声明和定义分开

无论动态还是静态*都不能指定长度*；
//命令行参数
```java
//打印命令行参数
import java.io.*;
public class ch5_1{
	public static void main(String[] args)throws IOException{
		//int[] a = {1,2,3,4,5,6,7,8,9};
		for(int i = 0; i<args.length; i++)
		{
			System.out.print(args[i]+"\t");
		}
	}
}
```

```java
// 将命令行中输入的数据存入数组中，并按从小到大的顺序进行排序
//串-数
import java.io.*;

public class ch5_2{
	public static void main(String[] args){
		int[] a = new int[args.length];

		for(int i=0; i< args.length; i++){
			a[i] = Integer.parseInt(args[i]);
		}		
		print(a);
		SelectSort(a);
		print(a);
	}


	private static void SelectSort(int[]a){
		for(int i = 0; i < a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[j] < a[i]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
	} 

/*
	private static void SelectSort(int[]a){
		for(int i = 0; i < a.length-1;i++){
			for(int j=i+1;j<a.length;j++){
				if(a[j] < a[i]){
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}

			}
		}
	} 
*/
//交换优化
	private static void SelectSort(int[]a){
		int k;
		for(int i = 0; i < a.length-1;i++){
			k = i;
			for(int j=i+1;j<a.length;j++){
				if(a[j] < a[k]){
					k = j;
				}
			}
			if(i != k){
				int tmp = a[i];
				a[i] = a[k];
				a[k] = tmp;
			}
		}
	} 

	private static void print(int[]a){
		for(int i= 0; i<a.length;i++){
			System.out.print(a[i]+"\t");
		}
		System.out.println();
	}
}

```

```java
//在排好序的数组中查找该数所处的位置
//二分
import java.io.*;
public class ch5_3{
	public static void main(String[] args){
		int[] a {1,1,2,6,8,9,10,12,18,20,34,56};
		int i = 20;
		System.out.println(seach(a,i));
		System.out.println(BinarySearch(a,i));

	}
//暴力
/*	public static int seach(int[] a, int num){
		for(int i = 0; i < a.length;i++)
		{
			if(a[i] == num) return i;
			else return -1;
		}
	}*/
//二分->有序
public static int BinarySearch(int[] a,int num){
		int startPos = 0, endPos = a.length - 1, m = (a.length - 1)/2;
		while(startPos <= endPos){
			if(num == a[m] ) return m;
			if(num > a[m]) startPos = m +1;
			if(num < a[m]) endPos = m - 1;
			m = (startPos + endPos)/2;
		}
		return -1;
	}
}
```

### 5.3 foreach 语句与数组
```java
for(type element:arry)
{
	System.out.println (element);
}
```
### 5.4 多维数组
```java
数据类型[][] 数组名；
数组名 = new 数据类型[行数(必须)][列数]
数据类型[][]数组名 = new 数据类型[行数][行数];
```

作业：1 2 3 4 5

区别：
>C语言中是矩阵；
>java中不一定是矩形，二维数组可以看为 指向一个一维数组的数组
`int[][] x;——> int[] x[1]

行数：`x.length`
列数：`x[i].length`(i = 1,2,3,4…)
>声明时不给初值，防止越界
>高位先指定
>数组元素在堆上分配，默认分配为0
>引用在栈上
>数组声明后必须定义，不然空指针错误

赋值：静态+动态
```java
public class MuitArray{
	public  static void main(String[] args){
		//int[][] a = {{1,2,3},{4,5}};
		int[][] a;
		a = new int[3][];
		a[0] = new int[3];
		a[1] = new int[4];
		a[2] = new int[5];

		for(int i = 0; i<a.length;i++){
			for(int j = 0; j<a[i].length;j++){
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	} 
}
```
局部变量要赋值
```java
public class ch5_5{
	public static void main(String[] args){
		int[][] a = {{67,5,89,34,22},{1,90,105,888,7},{89,-6,45,20,7},{88,3,-9,66,-888}};
		print(a);
		int max,min;
		int h_max = 0,l_max = 0, h_min = 0,l_min = 0;
		max = min = a[0][0];
		for(int i = 0; i < a.length;i++){
			for(int j = 0; j < a[i].length;j++){
				if(max < a[i][j]){
					max = a[i][j];
					h_max = i;
					l_max = j;
				}
				if(min > a[i][j]){
					max = a[i][j];
					h_min = i;
					l_min = j;
				}
			}
		}
		System.out.println();
		System.out.println("max = "+max+"\trow:"+h_max+"\tcol:"+l_max);
		System.out.println("max = "+min+"\trow:"+h_min+"\tcol:"+l_min);
	}
	private static void print(int[][] a){
		/*for(int[] row:a){
			for(int col:row){
				System.out.print(col+" \t");
			}
			System.out.println();
		}*/
		for(int i = 0; i < a.length;i++){
			for (int j = 0; j<a[i].length;j++){
				System.out.print(a[i][j]+" \t");
			}
			System.out.println();
		}
	}
}
```

二维数组拷贝

#### 数组元素的访问

```java
String[] s = {"Microal Soft",""}
int[][]int Array = {{1,2},{1,2,3},{3,4}};
```

java.lang
`arraycopy()` ->memcpy (c语言)

```java
public class ch5_6{
	public static void main(String[] args){
		String[] s = {"Mircosoft","IBM","Sun","Oracle","Apple"};

		String[] sBak = new String[s.length];
		System.arraycopy(s,0,sBak,0,s.length);
		for(int i = 0; i<sBak.length;i++){
			System.out.print(sBak[i]+"\t");
		}
		System.out.println();	
		
		int[][] intArray={{1,2},{1,2,3},{3,4}};
		int[][] intArrayBak = new int[3][];
		System.arraycopy(intArray,0,intArrayBak,0,intArray.length);
		int intArrayBak[][]
		for(int[] e:intArrayBak){
			for(int ee:e){
				System.out.print(ee+"\t");
			}
			System.out.println();
		}
 	}
}
```
对于二维数组的拷贝，二维数组是对原数组的引用拷贝，是地址

## 5.5 字符串及应用

```java
String 变量名；
变量 = new String("字符串");
String 变量名 = "字符串";
```
>引用性的(指向一块地址)
>不可变
- 构造：
>String(String);
>String(char[] value);
>
- 连接
>str = "Hello "+" World";
>str = "hello " +变量

`"hello"`存在数据区；`hello == hello` ->true
`s1="hello"` s1不创建新内存
`str.equals()` 序列是否相同；
`String(c,4,4)`第一个4从0开始第四个位置，第二个是从1开始4个length
>数据区的赋值后相等，new出来的不相同;

### 14(7+7+2)个类常用方法：
[Overview (Java Platform SE 8 ) (oracle.com)](https://docs.oracle.com/javase/8/docs/api/) 
#### part1

- `public char cahrAt(int index)`
>返回字符串*第index个字符*
- `public int length()`
>返回*字符串长度*
- `public int indexOf(String str)`
>返回字符串出现*str的第一个位置*
- `public int indexOf(String str, int fromIndex)`
>返回字符串从*fromIndex*开始*出现str的第一个位置*
- `public boolean equalsIgnoreCase(String another)`
>比较字符串与another是否一样(*忽略大小写*)
- `public String replace(char oldChar, char newChar)`
>在字符串中用newChar字符替换oldChar字符
---
#### part 2
- `public boolean startsWith(String prefix)`
>判断字符串是否以prefix字符串开头
- `public boolean endsWith(String suffix)`
>判断字符串是否是以suffix结尾

- `public String toUpperCase()`
>返回一个字符串为该字符串的大写形式

- `public String toLowCase()`
>返回一个字符串为该字符串的小写形式

- `public String substring (int beginIndex, int endIndex)`
>返回该字符串从beginIndex开始到endIndex结尾的子字符串

- `public String trim()`
>返回将该字符串去掉开头和结尾空格后的字符串

---
#### part3 
静态转化
- `public static String valueOf(double d)`
>将数字转化为字符转形式
- `public String[] split(String regex)`
>将一个字符串按照指定的分割为字符串数组

只要是`static`修饰，就可以用成员函数

---




- 统计大写字母、小写字母和其他字母
```java
//
public class ch5_7{
	public static void main(String[] args){
		String s = "nihaoHHfhdsoif29eu390rhfneWWFWEFEFefewFEWHH.dguigyu	uigbjKBJKBHBVKUvvjvFE]F\\R[G]RE[G]ESRr9";
		int Lowcount = 0, Upcount = 0, OtherCount = 0;		
		
		//mean1
		/*for(int i = 0; i<s.length();i++){
			char c = s.charAt(i);
			if( c >= 'a' && c <= 'z'){
				Lowcount++;
			}
			else if(c >= 'A' && c <= 'Z'){
				Upcount++;
			}
			else{
				OtherCount++;
			}
		}*/

		//mean2
		/* for(int i = 0; i<s.length();i++){
			char c = s.charAt(i);
			if(sL.indexOf(c)!=-1)
				Lowcount++;
			else if(uL.indexOf(c)!=-1)
					Upcount++;
			else
					OtherCount++; 
		}*/

		//mean3
		for(int i = 0; i<s.length();i++){
			char c = s.charAt(i);
			if(Character.isLowerCase(c)==true)
				Lowcount++;
			else if(Character.isUpperCase(c)==true)
					Upcount++;
			else
					OtherCount++; 
		}
		System.out.println("Lowcount="+Lowcount+"\t"+"Upcount="+Upcount+"\tOtherCount="+OtherCount);
	}
}
```

- 字符串中字符串出现的次数
```java
public class ch5_8{
	public static void main(String[] args){
		String s = "javaqewqjavabkdjavaddjava892effjavahjava";
		String si = "java";
		int count = 0, index = -1;
		while((index = s.indexOf(si))!=-1){
				count++;
				s = s.substring(index+si.length());
		}
		System.out.println(count);
	}
}
```

- 用符号分割

```java
public class ch5_9{
	public static void main(String[] args){
		String s = "1,2;3;4,5,6;7,8,9;10";
		String[] s1 = s.split(";");
		double[][] d;
		d = new double[s1.length][];

		for(int i = 0; i< s1.length;i++){
			String[] s2 = s1[i].split(",");	
			d[i] = new double[s2.length];
			for(int j = 0; j < s2.length;j++){
				d[i][j] = Double.parseDouble(s2[j]);
			}
		}
		for(int i = 0; i<d.length;i++){
			for(int j = 0; j<d[i].length; j++){
				System.out.print(d[i][j]+"\t");
			}
			System.out.println();
		}
	}
}
```

作业：
- [ ] 计算并输出杨辉三角形
- [ ] 7、8、9、10、11


# 第六章、类和对象 
### 程序设计的发展
- 非结构化阶段

- 结构化阶段(面向过程)——函数

- 面向对象阶段
>解决了软件复用的问题，复用层次变高

>类(class)和对象(objeect)是核心
>class是对某一类事物的描述（汽车设计图）
>object是具体的某一个事物（汽车）
面向对象设计思想：从客观存在的事物来构造软件系统

### 类的基本概念
类由***数据成员***(静态变量)+***函数成员***封装而成
- java中对象是核心`Everything is Object`
- 成员变量变量可以初始化也可以不初始化，系统默认初始化
>boolean = false 
>引用=NULL 

#### 基本特性
- <mark style="background: #D2B3FFA6;">封装性</mark>
- <mark style="background: #D2B3FFA6;">继承性</mark>
- <mark style="background: #D2B3FFA6;">多态性</mark> 重装+覆盖

#### 定义类
```java
[类修饰符] class 类名称
[修饰符] 数据类型 变量名；
[修饰符] 数据类型 方法名；
```

- 构造函数
>方法名相同
>无返回值，不是void
>初始化工作
>new调用来初始化
>可带参数构成重载
>变量在栈上，new出的东西在堆上
>没有定义则系统自动定义

- 点(Point)类
>特点坐标的对象
>设置三个坐标的方法
>距原点距离的方法
```java
class Point{
	double x,y,z;
	Point(double _x,double _y,double _z){
		x = _x;
		y = _y;
		z = _z;
	}
	void setX(double _x){
		x = _x;
	}
	double getx(){
		return x;
	}
	void setY(double _y){
		y = _y;
	}
	double gety(){
		return y;
	}
	void setZ(double _z){
		z = _z;
	}
	double getz(){
		return z;
	}
	double getDistance(Point p){
		//return MAth.sqrt((x-p.x)*(x-p.x) + (y-p.y)*(y-p.y)+(z-p.z)*(z-p.z));
		return (x-p.x)*(x-p.x) + (y-p.y)*(y-p.y)+(z-p.z)*(z-p.z);
	} 
}
public class ch6_1_Point{
	public static void main(String[] args){
		Point p = new Point(1.0,2.0,3.0);
		Point p1 = new Point(0.0,0.0,0.0);
		System.out.println(p.getDistance(p1));
		System.out.println("x="+p.getx()+"y="+p.gety()+"z="+p.getz());	
		p.setX(5.0);	
		p.setY(6.0);	
		p.setZ(7.0);
		System.out.println("x="+p.getx()+"y="+p.gety()+"z="+p.getz());	
		System.out.println(p.getDistance(p1));	
	}
}

```
- 点是否在圆里——`JavaBeans`一个成员变量有一个
```java
class Point{
	private double x;
	private double y;
	Point(double _x, double _y){
		x = _x;
		y = _y;
	}
	public void setX(double _x){
		x = _x;
	}
	public double getX(){
		return x;
	}
	public void setY(double _y){
		y = _y;
	}
	public double getY(){
		return y;
	}
}

class Circle{
	private Point o;
	private double radius;
	Circle(Point p, double r){
		o = p;
		radius = r;
	}
	public void setO(double x, double y){
		o.setX(x);
		o.setY(y);
	}
	public Point getO(){
		return o;
	}

	boolean contains(Point p){
		double x = p.getX() - o.getX();
		double y = p.getY() - o.getY();
		if(x*x + y*y>radius*radius){
			return false;
		}
		else{
			return true;
		}

	}
}

public class ch6_2_isInCircle{
	public static void main(String[] args){
		Point p = new Point(0.0,0.0);
		Circle c1 = new Circle(p,2.0);
		Point p1 = new Point(1.0,1.0);
		System.out.println(c1.contains(p1)); 
		c1.setO(5.0,5.0);
		System.out.println("\nx="+c1.getO().getX()+"y="+c1.getO().getY());
	}
}
```
---
### this 关键字
对当前对象的引用
this显式调用处理同名情况


作业：
**2、6**、7、8、**9**、10、11、12、**13、14、**

---


## 定义类
### 方法的重载
- 构造方法的重载(OverLoad)->(OverRead)
	- 不同参数构造初始化参数
- 通过一个构造方法调用**另一个**构造方法
	- 必须通过关键字`this`调用

### 成员变量
- 只能放在方法中
```java
[修饰符] 变量类型 变量名[=初值];
```

- 权限修饰符
	- <mark style="background: #FFB8EBA6;">private </mark>
		- 只能在同一个`{}`内访问
	- <mark style="background: #FFB8EBA6;">defult</mark>
		- 同一个`包`内访问(一个文件夹内)
	- <mark style="background: #FFB8EBA6;">public</mark>
		- 被`任何方法`访问
- 类的访问权限只有`public`和`default`
	- public 可在任何地方访问
	- defult在包内访问
- <font color=#FF0212>成员变量</font>可以被public、private和static修饰 
- <font color=#FF0212>局部变量</font>只能被final修饰

- C++区别
	- 局部变量不会显式赋值，成员变量默认赋值


### 参数传递
- 以<mark style="background: #FF5582A6;">变量</mark>为参数调用方法
```java
class Student{
	int ID;
	String name;
	String sex;
	boolean isLeader;
	float gradeMath, gradeChinese, gradeEnglish;

	public void setBasic(int ID, String gname, String sex, boolean isLeader){
		this.ID = ID;
		this.name = name;
		this.sex = sex;
		this.isLeader = isLeader;
	}
	public void setGrade(float gradeMath,float gradeChinese,float gradeEnglish){
		this.gradeMath = gradeMath;
		this.gradeChinese = gradeChinese;
		this.gradeEnglish = gradeEnglish;
	}
	public float allGrade(){
		return gradeMath + gradeChinese + gradeEnglish;
	}
	public float average(){
		return allGrade()/3;
	}
}
public class ch6_3Student{
	public static void main(String[] args){
		Student s = new Student();
		s.setBasic(123,"ZS","M",false);
		s.setGrade(100,90,80);
		System.out.println("Total Grade = "+s.allGrade());
		System.out.println("The Average = "+s.average());

	}

}
```
- 以<mark style="background: #FF5582A6;">数组</mark>为参数或返回值调用方法
	-  **基本数据**类型时**传值**
	-  **数组数据**类型时**传址**
- M行n列的二维数组，计算个列二维数组之和
```java
class Matrix_Ca{
	public int[] matrixColSum(int[][] a){
		int[] sum = {0,0,0,0};
		for(int i = 0; i<a[0].length;i++){
			for(int j = 0; j < a.length;j++){
				sum[i] += a[j][i];
			}
		}
		return sum;
	}
	public int[] matrixRowSum(int[][] a){
		int[] sum = {0,0,0,0};
		for(int i = 0; i<a.length;i++){
			for(int j = 0; j < a[i].length;j++){
				sum[i] += a[i][j];
			}
		}
		return sum;
	}
}

public class ch6_4{
	public static void main(String[] args) {
		Matrix_Ca x = new Matrix_Ca();
		int[][] a = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
		System.out.print("Sum of COL: ");
		for(int i : x.matrixColSum(a)){
			System.out.print(i+"\t");
		}
			System.out.println();
		System.out.print("Sum of Row: ");
		for(int i : x.matrixRowSum(a)){
			System.out.print(i+"\t");
		}
	}
}
```

### 匿名对象
在栈上不分配，直接在堆上分配
- 使用场景：
	-  只需用一次
	- 将命名对象做完参数



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
# 第八章 继承
## 类的继承

- 实现代码**复用**，(xx是一种xx_猫是一种动物)
- 父类(超类) _ 子类是一种父类
- java语言<mark style="background: #FFB8EBA6;">不支持多重继承</mark>(接口实现)，一个类只能有一种直接父类
- 父类是所有自类的公共成员的集合，自类是父类的特殊化
- 子类继承父类的成员变量和方法，还可以修改、重写、和添加
- 任何类继承自Object
### 子类的创建
- 通过关键字`extends 父类`继承
	- C++ `Extends: public/protected/private 父类`
	- Java修饰类只有两个——`public`和`default`
	- 先构造父类->this(12)__ 调用另一个构造函数
		- 先调用父类中无参的构造方法
		- 严格讲，构造方法不能被继承，但是子类可以调用
	- `cass SubClass extends SuperClass   Extends.java`
		- 子类继承所有非private成员
		- 子类的每个对象是父类的每个对象，父类的每个对象不是子类的对象(燕子=>动物| | 动物!=>燕子)
- 创建Person类
	- 姓名、年龄
	- Student类

- 权限控制
	- 子类拥有父类私有成员，但不能访问
	- class修饰只有`public`和`private`

- 如何调用父类中特点的构造函数？
- 只有有参，系统不自动创建无参构造函数
	- 没有用super()调用，编译器自动调用父类的无参构造函数
	- super()最先调用
	- this第一句
		- 不能在static中使用，动态
		- 使用this调用本类的其它构造函数
- `public class`——主类

```java
package ch8_1_Person_Student;

class Person{
    private String name;
    private int age;
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
}

class Student extends Person{
    Student(){
        System.out.println("Studnet Construct…");
    }
        private String school;
        public void setSchool(String school){
            this.school = school;  
        }
        public String getSchool(){
            return school;
        }
}

public class ch8_1_Person_Student {
    public static void main(String[] agrs){
        Student stu = new Student();
        stu.setAge(20);
        stu.setName("陈磊");
        stu.setSchool("兰州理工大学");
        System.out.println("Name:"+stu.getName()+"\tAge:"+stu.getAge()+"\t\tSchool:"+stu.getSchool());

    }
}

```
### 子类中访问父类
- `super.父类变量名` `super.父类方法名`
- 子类不可以访问父类的private

### 覆盖
- 与重载相似，是java多态性的体现
- 覆盖是在**子类中**的，<font color=#FF0212>名字</font>、<font color=#FF0212>参数</font>和<font color=#FF0212>类型</font>均完全相同的方法，来<mark style="background: #BBFABBA6;">重写</mark>父类同名的功能
	- 父类和子类有同名方法时，不能继承
	- <mark style="background: #ABF7F7A6;">重载</mark>是同类中的
- 覆盖时，**可扩大**父类权限，**不能缩小**父类权限
Q:重写
作业：1、2、4、5、7、8 
`Override`(C++)/`Overwrite`
不能覆盖父类`final`或`static`所修饰的


### final关键字
- `final`——最终成员
	- 不希望被子类成员所覆盖(覆盖)
		- *曾国藩家训用final修饰*
- 同时被`final`和static修饰，表示常量
- final修饰的值不能被改变

#### Object类
== 比较引用
isequal();
toString();
### 抽象类
类似于模版作用，不能用new创建实例对象，`abstract`

#### 抽象类定义格式
```java
abstract class 类名
	{
		
	}
```

- 包含`abstract`的类必须用abstract修饰

1. 用abstruct修饰的——抽象类、抽象方法
2. 含有抽象方法的类必须被声明为抽象类，抽象类必须被继承，抽象方法必须被重写（不重写自己会变为抽象类）；
3. 抽象类不能被实例化(构造对象)；
4. 抽象方法有声明的必要，没有实现的必要；

- 对应C++ ——virtual--虚基类->纯虚类(不允许在里面定义方法体)
	- `virtual void run()=0`
	- 只定义接口
- 抽象类的子类必须实现父类所有的抽象方法覆盖，或同样声明为抽象方法
```java
public class TestFinal{
    public static void main(String[] args){
        T t = new T();
        t.i = 9;
        System.out.println("Super Class m : TT ");
    }
}
// final class T{   
class T{
    // final int i = 8;
    int i = 8; 

   // final void m(){  
    void m(){
        System.out.println("Super Class m : TT ");
    }
}
class TT extends T{
    void m(){
        System.out.println("Sub Class m :TT ");
    }  
}
```
- 父类引用指向子类对象——**多态**表现
	- 父类统一引用
==课堂代码==
```java

```
### 接口
- 接口(`interface`)，是一种特殊的抽象类，抽象方法和常量值的定义集合；
- 只包含常量和方法定义，没有变量和方法实现
- 定义方法：
```java
public interface Runner{
	int id = 1;
	public static final void Fun(); 
	public void start();
}
```
- 数据成员必须初始化
- 方法必须全部声明为`abstract`
	- 默认`public abstract final`
#### 接口实现——多继承
`implements`
- 语法格式
```java

```

- 接口特性总结：
	- 多个无关类可以实现同一个接口
	- 接口与实现类间可以存在多态性
```
class <>

```
public class interface

- 作业：P53   9~17




# 第九章、异常处理
C/C++没有该机制 
## 异常的定义与分类
**异常**：是在程序<font color=#FF0212>运行期间</font>产生的错误，会中断正在运行的程序，不是`javac`编译阶段。
抛出异常时， 

<mark style="background: #FF5582A6;">异常体系结构图:</mark>
- **Throwable** 
	- **Error** 
		- 虚拟机生成并抛出
	- **Exception** 
		- 需要用户显式声明或捕获
		- **RunTimeException** 
			- *被0除、数组越界...* 
			- ArrayIndexOutOfBoundException
		- **IOException** 
			- *必须要处理的异常*——**构造函数**后加了throws的必须捕获处理异常，不然编译也捕获不了 
		- InterruptedException
			- 中断异常
			- 

```java
try
{
	//可能抛出异常的语句
	... ... ...
}
catch (异常类名SomeException 形参对象名e)
{
	... ... ...
}finally{
	//捕获不到
	... ... ...
}

```
>try接多个catch代码段
>>不会编译
><font color=#FF0212>根据获取异常的类型去执行相应的catch代码段</font>
>`finally`，为程序提供统一的出口--->类比default
>>关闭打开的文件/删除临时文件(资源最后的清楚)/....
>捕获到异常后到finally，不会执行错误后续代码，直接从finally开始执行
>
- Print
- `throws`：**声明**会抛出(多个)该异常，逐级抛出直到该例外被处理；
- `throw`：用throw具体抛出异常


---
```java
try{
	System.out.println(3/0);
}catch(Ath)

```

### 自定义异常
继承Exception


- 编写一个学生登基呈现，要求可以处理异常
在try块抛出人数负值的异常
在catch捕获并打印该异常

注：重写方法需抛出与原方法所抛出异常类型一致异常或不抛出异常

**本章总结**：
一个图、五个关键字、先逮小的、异常和重写的关系

- 作业：第九章：1、2、3、4、8、9、10、11；
- 预习第十章

---
---

# 第十章 
基本输入输出与文件处理

---
- 流的概念
- 处理字节流的基本类
- 处理字符流的基本类
- 标准输入输出
---


- 内存中数据在程序退出时全部清除,如何永久保存下来呢？
使用文件！！！

文件存放在哪里？硬盘、光盘
Java API: java.io.File类
文件/目录

- 操作文件/目录属性
- 物理文件或目录

### 输入输出类库
输入输出是：程序与外部进行的交互
java把这些用流实现，统一接口表示
java.io包实现

- 什么是流？
一串流动的字符，先进先出方式传送信息，是站在**程序**(Program)的角度的；
source=====管道=======>programm (读入)
program=====管道=======>dest     (写)


--- 

- 字节流
    - 8位
    - 两个重要字节流InputStream OutputStream (Stream-->字节流) 

- 字符流
    - 16位Unicode
    - Reader  Writer
    -  两个重要字符流



- 写文件操作
    - FileOutputStream 
        -   OutputStream子类
- 读文件操作
    - FileInputStream

读写一一对应


#### eg1
**读取当前程序所在文件，以字符形式输出到控制台中**
>一个字节一个字节地读
>read、FileInputStream必须捕获异常
```
 程序          文件
|---|       |-------|    
|   |       |       |
|   |=======|       |    
|   |  管道 |       |
|---|       |-------|    
```
```java
package TestFileInputStream;

import java.io.FileInputStream;
import java.io.*;

public class TestFileInputStream {
    public static void main(String[] args) {
        FileInputStream in =null;
        int b = 0;
        try {
            in = new FileInputStream("D:\\01code\\gitee\\JavaJournal\\code\\J-20240423-classcode\\src\\TestFileInputStream\\TestFileInputStream.txt");
        } catch (FileNotFoundException e){
            System.out.println("File Not Exist....");
            System.exit(-1);    //-1 系统退出
        }
        try {
            long num = 0; //统计字节数
            while((b = in.read())!=-1) //文件以-1结束
            {
                System.out.print((char)b);
                num++;
            }
            in.close();
            System.out.println();
            System.out.println("The total number is "+num);
        } catch (IOException e) {
            System.out.println("File Read Error!!!");
            System.exit(-1);
        }
    }
}

```

#### eg2
**用FileOutPutStream实现当前文件地复制**
>按照字符/字节流读入程序，再写入
>两个管道读一个写一个，通过输入输入输出完成;
```java
package TestFileOutputStream;

import java.io.*;
public class TestFileOutputStream{
    public static void main(String[] args) {
        int b = 0;
        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            //建立管道
            in = new FileInputStream("D:/01code/gitee/JavaJournal/code/J-20240423-classcode/src/TestFileOutputStream/HelloWorld.java");
            out = new FileOutputStream("D:/01code/gitee/JavaJournal/code/J-20240423-classcode/src/TestFileOutputStream/HelloWorldCopy.java");
            while((b=in.read())!=-1){
                out.write(b);
            }
            //关闭管道
            in.close();
            out.close();
        } catch (FileNotFoundException e1) {
            System.out.println("FileNotFoundException!!!");
            System.exit(-1);
        }catch(IOException e2){
            System.out.println("File Copy Error!!!");
            System.exit(-1);
        }
        System.out.println("File Copy Successful....");
    }
}
```

#### eg3
- **用FileReader实现对当前文件地读取并输出到控制台窗口。**
>两个字节地读
```java
package TestFileReader;
import java.io.*;
public class TestFileReader {
    public static void main(String[] args) {
        FileReader fr = null;
        int c =0;
        try {
            //接管道
            fr = new FileReader("D:\\01code\\gitee\\JavaJournal\\code\\J-20240423-classcode\\src\\TestFileReader\\TestFileReader.java");
            //int lens = 0;
            while((c=fr.read())!=-1){
                System.out.print((char)c);
            }
            fr.close();
        } catch (FileNotFoundException e1) {
            System.out.println("没找到File Not Found Error!!!");
            System.exit(-1);
        }catch(IOException e2){
            System.out.println("文件读取错误File Read Error !!!");
            System.exit(-1);
        }
        System.out.println("Read Successful...");
    }
}

```

#### eg4
- **将unicode码输出到当前目录的unicode.dat文件中**
    - **将unicode.dat文件利用FileWriter实现复制到unicodeio.dat**


```java
package TestFileWriter;
import java.io.*;
public class TestFileWriter {
    public static void main(String[] args) {
        FileWriter fw = null;
        try {
            fw = new FileWriter("D:\\01code\\gitee\\JavaJournal\\code\\J-20240423-classcode\\src\\TestFileWriter\\Unicode.dat");
            for(int c = 0; c<=65535; c++){
                fw.write(c);   
            }
            fw.close();
        } catch (IOException e) {
           e.printStackTrace(); 
           System.out.println("File Write Error!!!");
            System.exit(-1);
        }
    }
}
```
```java
package TestFileWriter;
import java.io.*;
public class TestFileWriter {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        int b = 0;
        try {

            fw = new FileWriter("D:\\01code\\gitee\\JavaJournal\\code\\J-20240423-classcode\\src\\TestFileWriter\\Unicode10.dat");
            fr = new FileReader("D:\\01code\\gitee\\JavaJournal\\code\\J-20240423-classcode\\src\\TestFileWriter\\Unicode.dat");
           while((b = fr.read())!=-1){
            fw.write(b);
           }
            fr.close();
            fw.close();
        } catch (IOException e) {
           e.printStackTrace(); 
           System.out.println("File Write Error!!!");
            System.exit(-1);
        }
    }
}


```

作业：2、3、7、8、9、10、11



# 第十一章 多线程

- 主要内容
C++无多线程机制
- 程序
- 进程
- 多任务
- 线程
- 创建线程*2
- 多线程同步、线程间通信



## 多线程简介
一条程序路径————线程；
1s执行10^13条指令；
多任务的操作系统；

**执行体**——>
**程序**——>含指令或数据的文件——>磁盘或其他设备——>静态的代码；
**进程**——>程序执行*一次的执行过程*——>系统运行的基本单元——>动态的；(ctrl+alt+delete)
**多任务**——>统一
**线程**——>多个执行单元——>程序的一条执行路径——>“轻量级进程”
[进程[线程][线程][线程][线程]...]

## 线程的创建与启动
java的线程
java.lang.Thread

Tread类 来创建线程，run()完成操作，start()方法启动



eg1.用Runnable接口的类实现输出i在100

eg2:用继承子Thread类的子类实现输出i在1~1000间


---
## 线程的状态和生命周期
java使用Thread类及其子类对象表示线程，新建线程在它的一个完整生命周期内通常经历**5种状态**，通过控制和调度使这几种状态转化；
1. **新建状态**(Newborn)
2. **就绪状态**(Runnable)
- CPU给时间片
3. **运行状态**(Running)
4. **阻塞状态**(Blocked)
- 时间片被抢走
5. **消亡状态**(Dead)
- 运行结束后即消亡
线程状态转换流程图

### 线程调度与优先级
调度
优先级
三个线程优先级的静态成员变量


## Thread线程类与Runnable接口

- ①使用Runnable接口——>线程体对象
可创建线程对象，可创建多个线程，用的较多
 `public static Tread current `
```java
package ch11_1;
class Runner1 implements Runnable{
    public void run(){
        for(int i = 0; i < 100; i++){
            System.out.println("Runner1: "+i);
        }
    }
}
public class ch11_1 {
    public static void main(String[] args) {
        Runner1 r = new Runner1();
        Thread t0 = new Thread(r);   
        Thread t1 = new Thread(r);   
        Thread t2 = new Thread(r);   
        Thread t3 = new Thread(r);   
        t0.start();
        t1.start();
        t2.start();
        t3.start();

        for(int i = 0; i < 100; i++){
            System.out.println("Main Thread: "+i);
        }
    }
}

```

---
- ②直接继承子Thread类
定义一个Thread的子类并重写run()
一次只能定义唯一一个
```java
package ch11_2;
class Runner2 extends Thread{
    public void run(){
        for(int i = 0; i < 1000; i++){
            System.out.println("Runner2: "+i);
        }
    }
}

public class ch11_2 {
    public static void main(String[] args) {
        Runner2 r2 = new Runner2();  //r2本身就是线程类
        r2.start();
        for(int i = 0; i < 1000; i++){
            System.out.println("Main Thread: "+i);
        }        
    }
}

```



## 线程之间的数据共享



## 多线程的同步控制
临界资源，临界区->临界代码
互斥锁 :
    1. synechronized(this){...}
    2. public synechronized void add(String name){...}


## 11.4 线程间通信

线程控制基本方法：


作业：1、2、4、5、6、7


# 第十二章 图形化界面设计
## 概述
图形用户界面 `GUI`
- 借助菜单按钮等标准界面元素
两个处理图形用户界面的类库`java.awt`(抽象窗口工具集)和`javax.swing`(awt的扩展，)包
- AWT
- 组件和容器
- 布局管理器
- 事件处理
- Java图形
- Window事件

## AWT--抽象窗口工具集
包括在`java.awt`
![在这里插入图片描述](https://img-blog.csdnimg.cn/direct/ab05ece48ed7456a9da1de351767e7d4.png)

### Farm
- 最后设置窗口可见：`f.setVisible(ture);`
- 不可改变窗口大小：`f.setResizable(false);`

### Panel
- 可以看作容纳Component的空间
-


### Flow
FlowLayout
BoredLayout--东西南北中-->默认中间
GridLayout--矩形网格


eg: Container的嵌套实现下面布局

作业：P285  1、2、3、4、10、11、12





