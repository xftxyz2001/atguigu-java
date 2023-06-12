/*
案例2：小明要到美国旅游，可是那里的温度是以华氏度为单位记录的。
它需要一个程序将华氏温度（80度）转换为摄氏度，并以华氏度和摄氏度为单位分别显示该温度。

℃ = (℉ - 32) / 1.8
*/
class FloatDoubleExer1 {
	public static void main(String[] args) {
		
		double hua = 80.0;

		double she = (hua - 32) / 1.8;

		System.out.println("华氏度" + hua + "℉ 对应的摄氏度为" + she + "℃");

	}
}
