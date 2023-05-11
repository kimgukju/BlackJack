package com.kimgukju.black;

public class Card {
	
	private String pattern;
	private String cardnum;
	
	public Card(String pattern, String cardnum) {
		this.pattern = pattern;
		this.cardnum = cardnum;
	}
	
	public String getPattern() {
		return pattern;
	}
	public void setPattern(String pattern) {
		this.pattern = pattern;
	}
	public String getCardnum() {
		return cardnum;
	}
	public void setCardnum(String cardnum) {
		this.cardnum = cardnum;
	}

	@Override
	public String toString() {
		return "생성된카드 = " + pattern + cardnum;
		//return "Card [pattern=" + pattern + ", cardnum=" + cardnum + "]";
	}
	
	
	

}
