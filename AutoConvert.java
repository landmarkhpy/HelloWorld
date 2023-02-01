
public class AutoConvert {
	
	//编写一个main方法
	public static void main(String[] args) {
		//演示自动转换
		int num = 'a';//ok char -> int 
		double d1 = 80; //ok int -> double
		System.out.println(num);//
		System.out.println(d1);//因为是个整数，整数先转换成double然后在赋给d1 
	}
}
