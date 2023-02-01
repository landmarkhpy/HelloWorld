
public class ForceConvertDetail {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//演示强制类型转换
		//强制符号只针对于最近的操作数有效，往往会使用小括号提升优先级
		//int x = (int)10*3.5+6*1.5;//编译错误：double -> int
		int x = (int)(10*3.5+6*1.5);// (int)44.0-> 44
		System.out.println(x);//44
		
		char c1 = 100;//ok
		int m = 100;//ok
		//char c2 = m;//错误，因为m已经是int类型了，int精度高于char
		char c3 = (char)m;//ok
		System.out.println(c3);//100对应的数字
		
	}
}