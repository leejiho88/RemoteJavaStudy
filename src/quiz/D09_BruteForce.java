package quiz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class D09_BruteForce {
/*
	# ��й�ȣ�� ���̸� �Է¹����� ���� ���ڷ� ���� �� �ִ� ��� �ش� ������ ��й�ȣ�� ����غ�����
	
	 - ���� ��/�ҹ���
	 - ����
	 - Ư������ (Shift������ ������ �͵�)
	 
	ex: 4���� -> 0000 ~ zzzz
*/
	static String charset = "abcdefghijklnmopqrstuvwxyzABCDEFGHIJKLNMO"
			+ "PQRSTUVWXYZ1234567890!@#$%^&*()_<>?:{}~|";
	
	public static void main(String[] args) {
		bruteforce(2); // 1.���Ʈ ������ �θ��� ĳ���ͼ��� ��ȯ�Ǿ� �ȴ�
	}
	/*
		# 10������ ���
		 
		 1234567
		 
		 1234567 % 10 => 7 (���� �ڸ� �и�)
		 1234567 / 10 => 123456 (���� �ڸ� ����)
		 123456  % 10 => 6 (���� �ڸ� �и�)
		 123456  / 10 => 12345 (�����ڸ� ����)
		 
		# 74������ ���
		
		 789!@#$%^
		 
		 789!@#$%^ % 74 => ^
		 789!@#$%^ / 74 => 789!@#$%
	 */
	
	public static void bruteforce(int password_size) {
		char[] arr = charset.toCharArray(); // 2.charset�� �ѱ��ھ� ��ȯ
		int len = charset.length();
		long all_password = (long) Math.pow(len, password_size);
		
		for (long i = 0; i < len; i++) {
			long value = i;
			
			String password = "";
			while (value > 0) {
				password += arr[(int)(value % len)];
				value /= len;
			}
			
			if (password.length() < password_size) {
				int gap =  password_size - password.length();
				for (int j = 0; j < gap; j++) {
					password = "a" + password;
				}
			}
			
			System.out.println(password);
		}
		
		System.out.println("len : " + len);
		
	}
}
