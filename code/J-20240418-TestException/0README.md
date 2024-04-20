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
- `throws`：**声明**会抛出(多个)该异常，逐级抛出直到该例外被处理；
- `throw`：用throw具体抛出异常

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