package Algorithm;

public class Mark {
	
	private enum MarkType{}
	
	public Mark getMarkTake() {
		
	}
	
	public int getWhiteScore() {
		
	}

	public int getBlackScore() {
		
	}
	
	public int getWhiteScore(Board b) {
		
	}
	
	public int getBlackScore(Board b) {
		
	}
	
	
}



/*
	Mark擁有下棋的標記，有一個enum，包含三個東西，Mark.white, Mark.black, Mark.empty
��	private enum MarkType{stop = 1, sit, stand, walk, run} type;
��	public Mark getMarkTake() 取得現在下棋的玩家，只會回傳Mark.white, Mark.black
��	public int getWhiteScore() 取得當前白子的分數
��	public int getBlackScore() 取得當前黑子的分數
��	public int getWhiteScore(Board b) 當盤面為b，白子的分數
��	public int getWhiteScore(Board b) 當盤面為b，黑子的分數 
*/