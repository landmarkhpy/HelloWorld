/**
*  演示算术运算符的使用
*/
public class ArithmeticOperator {
	
	//编写一个main方法
	public static void main(String[] args) {
		// /使用
		System.out.println(10/4);//都是整数，保留整数去掉小数点后，为2
		System.out.println(10.0/4);//java 是2.5
		// 注释快捷键 ctrl + / ，再次输入 ctrl + / 取消注释
		double d = 10 / 4;//java中 10 / 4 = 2, 2 => 2.0
		System.out.println(d);// 2.0是double类型的，2是int类型
		
		// % 取模，取余
		// 在 % 的本质 看一个公式 a % b = a - a / b * b 
		System.out.println(10 % 3);//1
		System.out.println(-10 % 3);//-1
		System.out.println(10 % -3);//1
		System.out.println(-10 % -3);//-1
		
		//++的使用
		//
		int i = 10;
		i++;//自增 等价于 i = i + 1; => i = 11
		++i;//自增 等价于 i = i + 1;
		//如果是独立使用++，前++和后++完全一样
		System.out.println("i=" + i);//
		
		/*
		前++：++i先自增后赋值
		后++：i++先赋值后自增
		*/
		int j = 8;
	    ///int k = ++j; //等价 j = j + 1; k = j;
		int k = j++;// 等价 k = j;j=j+1;
		System.out.println("k=" + k + "j=" + j);
	}
}