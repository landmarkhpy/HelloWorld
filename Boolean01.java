
public class Boolean01 {
	
	//编写一个main方法
	public static void main(String[] args) {
		//演示判断成绩是否通过的案例
		//定义一个布尔变量
		boolean isPass = true;//赋给变量为真，把true赋给了isPass
		if(isPass == true) {//进行判断，如果isPass等于true，就执行下面的语句，如果为假就执行else语句。
			System.out.println("考试通过，恭喜");
		} else {
			System.out.println("考试没通过，下次努力");
		}
	}
}