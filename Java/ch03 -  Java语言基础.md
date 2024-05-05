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







