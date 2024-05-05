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
