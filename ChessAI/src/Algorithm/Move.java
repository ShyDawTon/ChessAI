package Algorithm;

import java.util.*;

import Algorithm.Board.MARK;

public class Move {
	
	//Store available coordinate of move
	private int x,y;
	
	//constructor
	public Move() {	

	}
	
	//method to get available coordinate of move 
	public int getMoveX() {
		return this.x;
	}
	public int getMoveY() {
		return this.y;
	}
	public void setMoveX(int x) {
		this.x = x;
	}
	public void setMoveY(int y) {
		this.y = y;
	}
	
	//get available coordinate of move with current board
	public ArrayList<Move> getAvailableMoves(){
		ArrayList<Move> move = new ArrayList<Move>();
		Board board = new Board();
		
		for(int board_x=0; board_x<19; board_x++)
			for(int board_y=0; board_y<19; board_y++){
				if(board.board[board_x][board_y]==MARK.empty) {
					this.x=board_x;
					this.y=board_y;
					move.add(this);
				}
			}
		
		return move;
	}
	
	//get available coordinate of move with specific board
	public static ArrayList<Move> getAvailableMoves(Board b){
		ArrayList<Move> moves = new ArrayList<Move>();
		Move move = new Move();
		
		for(int board_x=0; board_x<19; board_x++)
			for(int board_y=0; board_y<19; board_y++){
				if(b.board[board_x][board_y]==MARK.empty) {
					move.x=board_x;
					move.y=board_y;
					moves.add(move);
				}
			}
		
		return moves;
	}
}