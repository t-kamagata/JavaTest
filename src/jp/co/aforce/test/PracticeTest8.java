package jp.co.aforce.test;

public class PracticeTest8 {
	public void printHello() {
		System.out.println("Hello");
	}
	
	public void printRandomMessage() {
		int idx = (int)(3 * Math.random());
		String[] messages = {"こんばんは", "こんにちは", "おはよう"};
		System.out.println(messages[idx]);
		
	}
	
	public void printMessage(String message) {
		System.out.println(message);
	}
	
	public void printMessage(String message, int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(message);
		}
	}
	
	public void printRectangleArea(double height, double width) {
		double area = height * width;
		System.out.println(area);
	}
	
	public String getWeatherForecast() {
		int dayIdx = (int)(3 * Math.random());
		int weatherIdx = (int)(4 * Math.random());
		String[] days = {"今日", "明日", "明後日"};
		String[] weather = {"晴れ", "曇り", "雨", "雪"};
		
		return String.format("%sの天気は%sでしょう。", days[dayIdx], weather[weatherIdx]);
	}
	
	public boolean isEvenNumber(int value) {
		if(value % 2 == 0)
			return true;
		else
			return false;
	}
	
	public String getMessage(String name, boolean isKid) {
		if(isKid)
			return String.format("こんにちは。%sちゃん。", name);
		else
			return String.format("こんにちは。%sさん。", name);
	}
	
	public String getLongestString(String[] array) {
		int ansIdx = 0;
		for(int i = 0; i < array.length; i++) {
			if(array[i].length() >= array[ansIdx].length()) {
				ansIdx = i;
			}
		}
		return array[ansIdx];
	}
	
	public boolean isAdult(Person person) {
		if(person.getAge() >= 20)
			return true;
		else
			return false;
	}
}
