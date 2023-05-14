package com.kimgukju.black;

public class Card {
	
	private String pattern;
	private String cardnum;
	private int point;
	
	public Card(String pattern, int index) {
		this.pattern = pattern;
		this.cardnum = this.numberToNum(index);
		this.point = this.numberToPoint(index);
	}
	
	private String numberToNum(int number) {
    	if(number == 1){
            return "A";
        }else if(number == 11){
            return "J";
        }else if(number == 12){
            return "Q";
        }else if(number == 13){
            return "K";
        }

        return String.valueOf(number);
    }
	
	private int numberToPoint(int number) {
    	if(number >= 11) {
    		return 10;
    	}
    	
    	return number;
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
	
	public int getPoint() {
        return this.point;
    }
	
	
	

}
