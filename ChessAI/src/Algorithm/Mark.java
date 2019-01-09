package Algorithm;

public class Mark {
	
	public enum MARK{empty, black, white}
	
	public MARK getMarkTake() {
		if ( BLACKNUMBER + WHITENUMBER == 0 )
			System.out.println("黑方執子");
			return MARK.black;
		if ( BLACKNUMBER - WHITENUMBER == 1 )
			System.out.println("白方執子");
			return MARK.white;
		if ( WHITENUMBER - BLACKNUMBER == 1)
			System.out.println("黑方執子");
			return MARK.black;
	}
	
}



/*
	BLACKNUMBER = 黑子數量
	WHITENUMBER = 白子數量
*/