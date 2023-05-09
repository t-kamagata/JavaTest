package jp.co.aforce.test;

public class Main {
	public static void main(String[] args) {
		PracticeTest8 instance = new PracticeTest8();
		
		instance.printHello();
		instance.printRandomMessage();
		instance.printMessage("Hello");
		instance.printMessage("Hola", 5);
		instance.printRectangleArea(5, 10);
		String weather = instance.getWeatherForecast();
		System.out.println(weather);
		boolean isEven = instance.isEvenNumber(4);
		System.out.println(isEven);
		String str = instance.getMessage("まる", true);
		System.out.println(str);
		str = instance.getLongestString(new String[] {"りんご", "そうめん", "かつどん"});
		System.out.println(str);
		Person person = new Person("タツヤ", 22);
		boolean isAdult = instance.isAdult(person);
		System.out.println(isAdult);
	}
}
