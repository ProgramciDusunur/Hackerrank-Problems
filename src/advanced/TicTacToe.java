package advanced;

import java.util.ArrayList;

public class TicTacToe {
	public String[] board = {" "," "," "
							," "," "," ",
							" "," "," "};
	public boolean whoIsNext = false;
	private ArrayList<Integer> moves = new ArrayList<Integer>();
	public int maximumDepth = 2, sumMoves = 0;
	public TicTacToe() {		
		perftRoot(0,whoIsNext);
		System.out.println("Counted Moves "+sumMoves);
	}
	public static void main(String [] args) {
		new TicTacToe();
	}
	public int[] getMoves(boolean whoIsNext, ArrayList<Integer> moves) {
		int[] boardMoves;
		moves.clear();
		for (int i = 0;i < board.length;i++) {
			switch (board[(i/3)*3+i%3]) {
			case " ":
				// taşın türü, oynanmış kare
				// 1 = O, 2 = X
				if (whoIsNext) {
					moves.add(10+((i/3)*3+i%3));					
				} else {
					moves.add(20+((i/3)*3+i%3));
				}
			break;
			}			
		}		
		boardMoves = moves.stream().mapToInt(i->i).toArray();
		return boardMoves;
	}	
	public void moveNotation() {
		
	}
	public void perftRoot(int depth, boolean whoIsNext) {
		if (depth < maximumDepth) {
			int[] moves = getMoves(whoIsNext,getMoves());
			for (int i : moves) {
				boardChange(whoIsNext,i%10,false);
				seeBoard();
				if (depth+1==maximumDepth) {sumMoves++;}
				perft(depth+1,!whoIsNext);
				boardChange(whoIsNext,i%10,true);
				seeBoard();				
			}
		}
				
	}
	public void perft(int depth, boolean whoIsNext) {
		if (depth < maximumDepth) {
			int[] moves = getMoves(whoIsNext,getMoves());
			for (int i : moves) {
				boardChange(whoIsNext,i%10,false);
				seeBoard();
				if (depth+1==maximumDepth) {sumMoves++;}
				perft(depth+1,!whoIsNext);
				boardChange(whoIsNext,i%10,true);
				seeBoard();				
			}
		}
	}
	public void boardChange(boolean whoIsNext, int targetSquare, boolean turnBack) {
		if (!turnBack) {
			if (whoIsNext) {
				board[targetSquare] = "O";
			} else {
				board[targetSquare] = "X";	
			}
			 
		} else {
			board[targetSquare] = " ";
		}
			
	}
	public void seeBoard() {
		for (int i = 0;i < board.length;i++) {			
			if (board[i].equals(" ")) {
				System.out.print("-");
			} else {
				System.out.print(board[i]);
			}
			if (i == 2 || i == 5) {
    			System.out.println();
    		}
		}
		System.out.println();
	}
	public ArrayList<Integer> getMoves() {
		return moves;
	}
	public void setMoves(ArrayList<Integer> moves) {
		this.moves = moves;
	}
}
