//位运算
//
public class BitOperator02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		
		System.out.println(1 >> 2);
		System.out.println(1 << 2);
		System.out.println(4 << 3);//32
		

		{
		int a = 1 >>2;// 1向右位移2位
		int b = -1>>2;
		int c =  1<<2;//
		int d = -1<<2;//
		int e = 3>>>2; //算术右移
		int f = -2<<3;
		int g = -67<<5;
		//abcde 结果多少
		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
		System.out.println("e=" + e);
		
		System.out.println("f=" + f);
		System.out.println("g=" + g);
		}
    }
}