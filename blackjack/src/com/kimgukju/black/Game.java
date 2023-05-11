package com.kimgukju.black;

public class Game {
	
	public void play() {
		System.out.println("========== 게임을 시작하겠습니다 ==========");
		Dealer dealer = new Dealer();
		Gamer gamer = new Gamer();
		Rule rule = new Rule();
		CardDeck carddeck = new CardDeck();
		
		System.out.println(carddeck.toString());
	}

}
