package myobj.Omok;

import java.util.Scanner;

public class Omok {
    public static void main(String[] args) {
        Player user = new Player("�����", "��");
        Player computer = new Player("��ǻ��", "��");
        Board board = new Board(15);
        play(board, user, computer);
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("row >");
        int numx = sc.nextInt();
        
        System.out.print("col >");
        int numy = sc.nextInt();
    }
    private static void play(Board board, Player user, Player computer) {
        board.print();
    }
    
    
}