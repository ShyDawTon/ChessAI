package Algorithm;

public class Mark {
	
	public enum MARK{empty, black, white}
	
	public MARK getMarkTake() {
		if ( BLACKNUMBER + WHITENUMBER == 0 )
			System.out.println("�¤���l");
			return MARK.black;
		if ( BLACKNUMBER - WHITENUMBER == 1 )
			System.out.println("�դ���l");
			return MARK.white;
		if ( WHITENUMBER - BLACKNUMBER == 1)
			System.out.println("�¤���l");
			return MARK.black;
	}
	
}



/*
	BLACKNUMBER = �¤l�ƶq
	WHITENUMBER = �դl�ƶq
*/