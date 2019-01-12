package Algorithm;

public class Board {
	public enum MARK{empty, black, white}
	public MARK[][] board = new MARK[19][19];
	private int BLACK_COUNT=0, WHITE_COUNT=0;
	private int BLACK_SCORE=0, WHITE_SCORE=0;
	
	/**
	* Board�غc�l
	*/
	public Board() {
		BLACK_COUNT=0; WHITE_COUNT=0;
		BLACK_SCORE=0; WHITE_SCORE=0;
		for(int i=0; i<19; i++)
			for(int j=0; j<19; j++)
				board[i][j] = MARK.empty;
	}
	
	/**
	* ���o��board����
	*/
	public Board getCurrentBoard() {
		return this;
	}
	
	/**
	* ���o�g�L���ʫ᪺board
	* @param b => ���i��ʧ@��board
	* @param m => ���U�l���y��
	*/
	public static Board getNextBoard(Board b, Move m) {
		b.getAllChessScore(); // �]�w�¤l�դl������
		// �դ�U�l
		if ( b.BLACK_COUNT - b.WHITE_COUNT == 1 ) {
			b.board[m.getMoveX()][m.getMoveY()] = MARK.white;
		}
		// �¤�U�l
		else {
			b.board[m.getMoveX()][m.getMoveY()] = MARK.black;
		}
		return b;
	}
	
	/**
	* ���o�¤l�դl������
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
	* ��Xboard
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
	* ��Xboard
	* @param b => ����X��board
	*/
	public static void printBoard(Board b) {
		for(int i=0; i<19; i++) {
			for(int j=0; j<19; j++)
				System.out.printf("%4d\n", b.board[i][j].values());
			System.out.println();
		}
	}
}
