package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class D09_BruteForce2 {
/*
	# ��й�ȣ�� ���̸� �Է¹����� ���� ���ڷ� ���� �� �ִ� ��� �ش� ������ ��й�ȣ�� ����غ�����
	
	 - ���� ��/�ҹ���
	 - ����
	 - Ư������ (Shift������ ������ �͵�)
	 
	ex: 4���� -> 0000 ~ zzzz
*/
	public static void main(String[] args) {
		String charcters = "a,b,c,d,e,f,g,h,i,j,k,l,n,m,o,p,q,r,s,t,u,"
				+ "v,w,x,y,z,A,B,C,D,E,F,G,H,I,J,K,L,N,M,O,"
				+ "P,Q,R,S,T,U,V,W,X,Y,Z,1,2,3,4,5,6,7,8,9,"
				+ "0,!,@,#,$,%,^,&,*,(,),_,<,>,?,:,{,},~,|";
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("��й�ȣ ����? > ");
		int num = sc.nextInt();
		
		ArrayList <String> word = new ArrayList<>();

		String[] splitted = charcters.split(",");
		
		for (int j = 0; j < splitted.length; j++) {
			word.add(splitted[j]);
		}
		
		ArrayList<String> password = new ArrayList<>();
		
	}
}
