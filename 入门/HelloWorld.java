/**
	文档注释（一般用来注释类）
	public：关键字，公共的，公有的
	class：   关键字， 类别 分类
	HelloWorld：自定义的名字，表示一个类名
	{ }表示范围（作用域）
	static：关键字，表示静态的
	void：关键字，返回值类型（空，没有返回值）
	main：表示主函数名称
	main后的()表示函数的参数列表
	String[]：表示字符串数组
	args 表示字符串数组的名称
*/
public class HelloWorld{
	/*
		多行注释
	*/
	public static void main(String[] args){
	//单行注释
	//向控制台输出一句话
	System.out.println("Hello World!!!");
         }
}


//命令
//javac xxxxx.java    对文件进行编译，生成字节码文件（.class文件，可跨平台） （如果用记事本编写代码，如果报错乱码，修改编码格式为ANSI）
//java   xxxxx           运行生成的.class文件
//javadoc *.java       在当前目录下，为所有.java文件生成文档注释（看index.html）
