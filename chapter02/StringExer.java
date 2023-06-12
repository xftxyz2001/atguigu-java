/*
要求填写自己的姓名、年龄、性别、体重、婚姻状况（已婚用true表示，单身用false表示）、联系方式等等。
*/
class StringExer {
	public static void main(String[] args) {
		
		String name = "李进";
		int age = 24;
		char gender = '男';
		double weight = 130.5;
		boolean isMarried = false;
		String phoneNumber = "13012341234";

		String info = "name = " + name + ",age = " + age + ",gender = " + gender + ",weight = " + 
			weight + ",isMarried = " + isMarried + ",phoneNumber = " + phoneNumber;

		System.out.println(info);
	}
}
