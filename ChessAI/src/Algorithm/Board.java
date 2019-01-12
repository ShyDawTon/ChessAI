package Algorithm;

public class Board {
	public enum MARK{empty, black, white}
	public MARK[][] board = new MARK[19][19];
	private int BLACK_COUNT=0, WHITE_COUNT=0;
	private int BLACK_SCORE=0, WHITE_SCORE=0;
	
	/**
	* Board建構子
	*/
	public Board() {
		BLACK_COUNT=0; WHITE_COUNT=0;
		BLACK_SCORE=0; WHITE_SCORE=0;
		for(int i=0; i<19; i++)
			for(int j=0; j<19; j++)
				board[i][j] = MARK.empty;
	}
	
	/**
	* 取得該board物件
	*/
	public Board getCurrentBoard() {
		return this;
	}
	
	/**
	* 取得經過移動後的board
	* @param b => 欲進行動作的board
	* @param m => 欲下子的座標
	*/
	public static Board getNextBoard(Board b, Move m) {
		b.getAllChessScore(); // 設定黑子白子的分數
		// 白方下子
		if ( b.BLACK_COUNT - b.WHITE_COUNT == 1 ) {
			b.board[m.getMoveX()][m.getMoveY()] = MARK.white;
		}
		// 黑方下子
		else {
			b.board[m.getMoveX()][m.getMoveY()] = MARK.black;
		}
		return b;
	}
	
	/**
	* 取得黑子白子的分數
	*/
	public void getAllChessScore() {
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				if(board[i][j]==MARK.black)
					BLACK_COUNT+=1;
				else WHITE_COUNT+=1;
			}
		}
	}
	
	/**
	* 輸出board
	*/
	public void printBoard() {
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++) {
				int number;
				if(this.board[i][j] == MARK.empty) 
					number=0;
				else if(this.board[i][j] == MARK.black)
					number=1;
				else number=2;
				System.out.printf("%4d",number);
			}				
			System.out.println();
		}
	}
	
	/**
	* 輸出board
	* @param b => 欲輸出的board
	*/
	public static void printBoard(Board b) {
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++)
				System.out.printf("%4d\n", b.board[i][j].values());
			System.out.println();
		}
	}
}
