package Algorithm;

public class otherMethod {
	/*
	public int getWhiteScore() {
		int rowtemp = 1;
		int coltemp = 1;
		int botrighttemp = 1;
		int botlefttemp = 1;
		int count = 0;
		
		for (int i = COLUMN - 1; i >= 0; i--) {
			//檢查行
			if( BOARDSTATE[ROW][COLNUM] == BOARDSTATE[ROW][i] == WHITE)
				rowtemp++;
			else {
				count = rowtemp * rowtemp;
				break;
			}
		}
		
		for (int i = ROW - 1; i >= 0; i--) {
			//檢查列
			if( BOARDSTATE[ROW][COLNUM] == BOARDSTATE[i][COLNUM] == WHITE)
				coltemp++;
			else {
				count = coltemp * coltemp;
				break;
			}
		}
		
		for (int i = COLUMN - 1, j = ROW - 1; i >= 0 && j >=0 ; i++, j++) {
			//斜向右下
			if( BOARDSTATE[ROW][COLNUM] == BOARDSTATE[j][i] == WHITE)
				botrighttemp++;
			else {
				count = botrighttemp * botrighttemp;
				break;
			}
		}
		
		for (int i = COLUMN - 1, j = ROW + 1; i >= 0 && j < 19 ; i++, j--) {
			//斜向左下
			if( BOARDSTATE[ROW][COLNUM] == BOARDSTATE[j][i] == WHITE)
				botlefttemp++;
			else {
				count = botlefttemp * botlefttemp;
				break;
			}
		}
	}
	
	public int getBlackScore() {
		
	}

	public int getWhiteScore(Board b) {
		
	}
	
	public int getBlackScore(Board b) {
		
	}*/
	
}

/*
	COLUMN = 列
	ROW = 行
	BOARDSTATE = 是否有子
	WHITE = 白子
	BLACK = 黑子
*/