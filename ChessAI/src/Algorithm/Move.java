package Algorithm;

import java.util.*;

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
	
	//get available coordinate of move with current board
	public ArrayList<Move> getAvailableMoves(){
		ArrayList<Move> move = new ArrayList<Move>();
		Board board = new Board();
		
		for(int board_x=0; board_x<19; board_x++)
			for(int board_y=0; board_y<19; board_y++){
				if(board.getCurrentState().returnboard[board_x][board_y]==(Object)Mark.MARK.empty) {
					this.x=board_x;
					this.y=board_y;
					move.add(this);
				}
			}
		
		return move;
	}
	
	//get available coordinate of move with specific board
	public ArrayList<Move> getAvailableMoves(Board board){
		ArrayList<Move> move = new ArrayList<Move>();
		
		for(int board_x=0; board_x<19; board_x++)
			for(int board_y=0; board_y<19; board_y++){
				if(board.returnboard[board_x][board_y]==(Object)Mark.MARK.empty) {
					this.x=board_x;
					this.y=board_y;
				
				move.add(this);
			}
		}
		
		return move;
	}
}