package package0;

import java.util.Scanner;

public class test extends Interface{
	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// 创建一个对象
		Graduate  g = new Graduate("孔德胤","男",22);
		System.out.println("-------个人信息管理-------");
		System.out.println("姓名："+g.getName());
		System.out.println("性别："+g.getSex());
		System.out.println("年龄："+g.getAge());
		System.out.println("-------------------------"+"\n");
		
		// 设置月工资
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入你的月收入：");
		float fee = scanner.nextFloat();
		g.setFee(fee);
		System.out.println("-------------------------"+"\n");		
		// 设置学费
		System.out.println("请输入你的学费：");
		float pay = scanner.nextFloat();
		g.setPay(pay);
		System.out.println("-------------------------"+"\n");		
		// 判断是否需要缴税
	    boolean flag = g.paytaxes();
		if (flag) {
			System.out.println("您好，您不满足缴税条件，无需纳税。");
				}
		else {
			  System.out.println("您好，您满足纳税条件，需要纳税！");
				}
	}
}
