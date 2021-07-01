package myobj.Pirate;

public class Player {
/*
	1. 플레이어는 원하는 곳에 돌아가면서 칼을 찌른다

	2. 해적 아저씨가 날아가는 구멍이 랜덤으로 설정된다

	3. 플레이어는 여러명이 될 수 있다 (최소 2인, 최대는 구멍 숫자만큼)

	4. 새 게임 생성시 구멍 개수를 설정할 수 있다.

	5. 해적 아저씨를 날린 플레이어가 패배한다
		
*/
	String name;
	int win;
	int lose;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void win() {
		this.win++;
	}
	
	public void lose() {
		this.lose++;
	}
	
	public String getName() {
		return name;
	}
}
