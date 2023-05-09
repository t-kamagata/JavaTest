package jp.co.aforce.test;

public class PracticeTest7 {
	public static void main(String[] args) {
		Airplane airplane = new Airplane(); // 飛行機クラス
		Fighter fighter = new Fighter(); // 戦闘機クラス
		
		// 飛行機が飛行する
		airplane.fly();
		// 戦闘機が飛行する
		fighter.fly();
		//  戦闘機が戦闘する
		fighter.fight();
	}
}
