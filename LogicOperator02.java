//演示 |  || 使用
//

public class LogicOperator02 {
	
	//编写一个main方法
	public static void main(String[] args) {
		
		//||短路或 和  |逻辑或  案例演示
		int age = 50;
		if(age > 20 || age < 30) {
			System.out.println("ok100");//两个条件中只要有一个成立，结果为true，否则为false
		}
        //&逻辑与使用
		if(age > 20 | age < 30) {
			System.out.println("ok200");//只要有一个条件成立，结果为ture，否则为false
		}

	    //区别
		//1 ||短路或：如果第一个条件为ture，则第二条件不会判断，最终结果为ture，效率高
		//| 逻辑或：不管第一个条件是否为ture，第二个条件都要判断，效率低
		int a = 4;
		int b = 9;
		if( a > 1 | ++b > 4) {
			System.out.println("300");
		}
		System.out.println("a=" + a + "b=" + b);//  4 10
	
	
	}
}