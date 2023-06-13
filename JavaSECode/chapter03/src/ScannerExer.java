import java.util.Scanner;
class ScannerExer {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("请输入你的身高：(cm)");
		int height = scan.nextInt();

		System.out.println("请输入你的财富：(以千万为单位)");
		double wealth = scan.nextDouble();

		//关于是否帅问题，我们使用String类型接收
		System.out.println("帅否？(是/否)");
		String isHandsome = scan.next();
		
		//判断
		if(height >= 180 && wealth >= 1.0 && isHandsome.equals("是")){  //知识点：判断两个字符串是否相等，使用String的equals()
			System.out.println("我一定要嫁给他!!!");
		}else if(height >= 180 || wealth >= 1.0 || isHandsome.equals("是")){
			System.out.println("嫁吧，比上不足，比下有余。");
		}else{
			System.out.println("不嫁");
		}

		//关闭资源
		scan.close();
	}
}
