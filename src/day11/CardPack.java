package day11;

public class CardPack {
	/* 52장의 Card 객체를 배열로 저장 pack
	 * ♥A~♥K  /  ◆A◆K  /  ♣A~♣K  /  ♠A~♠K 
	 * */
	/* 멤버변수 : 52장의 Card 객체를 담을 수 있는 배열 + 번지
	 * - 생성자 : pack의 초기값을 52장의 카드로 초기화
	 * - 메서드 
	 * 1. 카드를 섞는 기능
	 * 2. 플레이어에게 한장씩 나눠주는 기능
	 * 3. 카드를 초기화 기능 (나눠준 카드 회수)
	 * */
	private Card[] pack = new Card[52];  // 초기값 null

}
