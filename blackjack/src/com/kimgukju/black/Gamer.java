package com.kimgukju.black;

import java.util.ArrayList;
import java.util.List;

public class Gamer implements Player{
	
	private List<Card> cards;
	private boolean turn;
	private String name;
	
	private static final int CAN_END_POINT = 21;
	
	public Gamer(String name) {
		cards = new ArrayList<>();
		this.cards = new ArrayList<>();
		this.name = name;
	}
	
	public void receiveCard(Card card) {
		if(this.isReceiveCard()) {
			this.cards.add(card);
			this.showCards();
		} else if(getPointSum() > 21) {
			System.err.println("합이 21을 초과해서 졌어용!");
		}
	}
	
	private boolean isReceiveCard(){
        return getPointSum() <= CAN_END_POINT;
    }
	
	private int getPointSum(){
        int sum = 0;
        for(Card card : cards) {
            sum += card.getPoint();
        }

        return sum;
    }
	
	public void showCards(){
        StringBuilder sb = new StringBuilder();
        sb.append("현재 보유 카드 목록 \n");

        for(Card card : cards){
            sb.append(card.toString());
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
	
	public List<Card> openCards() {
		return this.cards;
	}
	
	@Override
    public void turnOff() {
        this.setTurn(false);
    }

    @Override
    public void turnOn() {
        this.setTurn(true);
    }

    @Override
    public boolean isTurn() {
        return this.turn;
    }

    private void setTurn(boolean turn) {
        this.turn = turn;
    }

	@Override
	public String getName() {
		return this.name;
	}
	
	public int getScore() {
		return this.getPointSum();
	}

	
}




