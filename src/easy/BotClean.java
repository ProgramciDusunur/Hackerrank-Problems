package easy;

public class BotClean {
	
	public static void main(String[] args) {
		//https://www.hackerrank.com/challenges/tic-tac-toe/problem
		String[] board = {"b---d","-d--d","--dd-","--d--","----d"};
		String[] trickBoard = {"----d","d----","d----","d----","d---d"};
		int botX = -1, botY = -1, targetX = -1, targetY = -1;
		boolean lastTarget = false;
		/*for (int i = 0;i < board.length;i++) {			
			for (int j = 0;j < board[i].length();j++) {				
				if (!lastTarget && board[i].charAt(j) == 'd') {
					targetX = j;
					targetY = i;
					lastTarget = !lastTarget; 
				} else if (board[i].charAt(j) == 'b') {
					botX = j;
					botY = i;
				}
			}
		}*/		
		for (int i = 0;i < board.length;i++) {			
			for (int j = 0;j < board[i].length();j++) {				
				if (!lastTarget && board[i].charAt(j) == 'd') {
					targetX = j;
					targetY = i;
					lastTarget = !lastTarget; 
				}
			}
		}
		if (botX < targetX) {
			System.out.println("RIGHT");
		} else if (botX > targetX) {
			System.out.println("LEFT");
		} else if (botY < targetY) {
			System.out.println("DOWN");
		} else if (botY > targetY) {
			System.out.println("UP");
		}
		/*
		 Hackerrank version
		 ////////////////// 
 		 static void next_move(int posr, int posc, String[] board){
        int botX = -1, botY = -1, targetX = -1, targetY = -1;
        boolean lastTarget = false;
        for (int i = 0;i < board.length;i++) {
            //System.out.println(board[i]);
            for (int j = 0;j < board[i].length();j++) {                
                if (!lastTarget && board[i].charAt(j) == 'd') {
                    targetX = j;
                    targetY = i;
                    lastTarget = !lastTarget; 
                } else if (board[i].charAt(j) == 'b') {
                    botX = j;
                    botY = i;
                }
            }
        }
        if (botX == -1 && botY == -1) {
            System.out.println("CLEAN");
        }
        else if (botX < targetX) {
            System.out.println("RIGHT");
        } else if (botX > targetX) {
            System.out.println("LEFT");
        } else if (botY < targetY) {
            System.out.println("DOWN");
        } else if (botY > targetY) {
            System.out.println("UP");
        }        
    }
		 */
	}	
}
