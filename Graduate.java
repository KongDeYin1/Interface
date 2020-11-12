package package0;

public class Graduate {
				
			String name;
			String sex;
			int  age;
			float pay;
			float fee;
			
			Graduate(){
				
			}
			
			
		public Graduate(String name, String sex, int age ) {
			this.name=name;
			this.sex=sex;
			this.age=age;
			
		}
		public String getName() {
			return name;	
		}
		public void setName(String name) {
			this.name=name;
		}
		public String getSex() {
			return sex;
		}
		public void setSex(String sex) {
			this.sex=sex;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age=age;
		}
		
		public void setFee(float fee) {
			this.fee = fee;
			System.out.println("年收入为：" + this.fee);
		}
		
		public void getFee(float fee) {
			this.fee = fee;
			System.out.println("年收入为：" + this.fee);
		}
		public void setPay(float pay) {
			this.pay = pay * 12;       
			System.out.println("学费：" + this.pay);
		}
		
		public void getPay(float pay) {
			this.pay = pay * 12;
			System.out.println("学费：" + this.pay);
		}
		public boolean paytaxes(){     //boolean是java中的布尔型（逻辑型）数据类型
			if ((this.pay - this.fee) < 5000) {
				System.out.println("纳税金额为:"+(this.pay -this.fee)*0.03f+"\n");
				return true;           // true 代表“真”
			}
			else {
				System.out.println("纳税金额为:"+(this.pay -this.fee)*0.03f+"\n");
			    return false;          //false 代表“假”
			} 
		}
}
