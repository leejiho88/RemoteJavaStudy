
public class B08_While {
/*
		# while
		
		  - for문과 사용법이 약간 다른 반복문
		  - 초기값과 증가값의 위치가 정해져 있지 않다
		  - ()안의 조건이 참인 동안 {}안의 내용을 반복한다
		  - 증가값의 위치에 따라 프로그램 실행이 달라질 수 있으므로 주의해야 한다
*/
	public static void main(String[] args) {
/*	//	# 1.
	//	 - while문은 증가값의 위치에 따라 결과가 달라질 수 있다
		int i = 0;
		
		while (i < 10) { // for문에서(for (; ;)) ;가 2개 빠지면 while문이랑 같음
	//		++i; // 출력되기 전에 1증가 (출력하면 10까지 출력된다)
			System.out.println(i++); //출력하고 1증가 시킨다
	//		++i; // 출력한 후 1증가 (9까지 출력된다)
		}
	}
}
*/
/*	//	# 2.
		int i = 0;
		
		while (i++ < 10) { // 실행 후 비교연산을 하고 1증가 시킨다
			
			System.out.println(a);
		}
	}
}
*/
/*	//	# 3.
		int i = 0;
		
		while (++i < 10) { // 실행 전 비교연산을 하고 1증가 시킨다
			
			System.out.println(i);
			
		}
	}
}
*/
/*	//	# 4.
		int i = 0;
		
		while (i < 10) { // 조건이 만족하는 동안 {}안의 내용이 반복실행하므로 무한반복하게 된다
			
			System.out.println(i);
		}
	}
}
*/	//	# 5.
	//	while문에서도 break와 continue를 사용할 수 있다
		int i = 0;
		
		while (true) {
			
			System.out.println(++i);
			
			if (i == 140) { // 140에까지 출력한 후 조건을 만족하고 반복문을 나간다
				break;
			}
		}
	}
}









