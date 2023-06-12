class StringExer1 {
	public static void main(String[] args) {
		
		//练习1：
		//String str1 = 4;                       //判断对错：no
		String str2 = 3.5f + "";               //判断str2对错：yes
		System.out.println(str2);              //输出：3.5
		System.out .println(3+4+"Hello!");     //输出：7Hello!
		System.out.println("Hello!"+3+4);      //输出：Hello!34
		System.out.println('a'+1+"Hello!");    //输出：98Hello!
		System.out.println("Hello"+'a'+1);     //输出：Helloa1

		//练习2：
		System.out.println("*    *");				//输出：*    *
		System.out.println("*\t*");					//输出：*	*
		System.out.println("*" + "\t" + "*");		//输出：*	*
		System.out.println('*' + "\t" + "*");		//输出：*	*
		System.out.println('*' + '\t' + "*");		//输出：51*
		System.out.println('*' + "\t" + '*');		//输出：*	*
		System.out.println("*" + '\t' + '*');		//输出：*	*
		System.out.println('*' + '\t' + '*');		//输出：93

	}
}
