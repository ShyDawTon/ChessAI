import java.util.*;

//int BlackAI();
//int WhiteAI();
//boolean checkInput(int,int);

public class GGDragonAI{
public static void main(String args[]){
	
	Scanner sc=new Scanner(System.in);
	int mode;
	
	System.out.print("AI color (Black=0,White=1):");
	mode=sc.nextInt();
	
	if(mode==0){
		BlackAI();
	}
	
	else if(mode==1){
		WhiteAI();
	}
	
	else{
		System.out.println("Input error!");
	}
}

static int BlackAI(){
	
	Scanner sc=new Scanner(System.in);
	int[][] board=new int[20][20];
	int inputX,inputY;
	boolean next;
	
	for(int i=0;i<=19;i++){
		for(int j=0;j<=19;j++){
			board[i][j]=0;
		}
	}
	
	//None=0,Black=1,White=2
	board[0][0]=1;
	System.out.println("(A,1)");
	
	for(;;){
		for(;;){
			System.out.print("White turn (A1 = 1 1):");
			inputX=sc.nextInt();
			inputY=sc.nextInt();
			if(!checkInput(inputX,inputY) || board[inputX-1][inputY-1]!=0){
				System.out.println("Input error!");
				continue;
			}
			board[inputX-1][inputY-1]=2;
			break;
		}
		
		for(;;){
			System.out.print("White turn (A1 = 1 1):");
			inputX=sc.nextInt();
			inputY=sc.nextInt();
			if(!checkInput(inputX,inputY) || board[inputX-1][inputY-1]!=0){
				System.out.println("Input error!");
				continue;
			}
			board[inputX-1][inputY-1]=2;
			break;
		}
		
		next=false;
		for(int i=0;i<19 && !next;i++){
			for(int j=0;j<19 && !next;j++){
				if(board[i][j]==0){
					board[i][j]=1;
					System.out.println("("+(char)('A'+i)+","+(j+1)+")");
					next=true;
				}
			}
		}
		
		next=false;
		for(int i=0;i<19 && !next;i++){
			for(int j=0;j<19 && !next;j++){
				if(board[i][j]==0){
					board[i][j]=1;
					System.out.println("("+(char)('A'+i)+","+(j+1)+")");
					next=true;
				}
			}
		}
	}
}

static int WhiteAI(){
	
	Scanner sc=new Scanner(System.in);
	int[][] board=new int[20][20];
	int inputX,inputY;
	boolean next;
	
	for(int i=0;i<=19;i++){
		for(int j=0;j<=19;j++){
			board[i][j]=0;
		}
	}
	
	for(;;){
		System.out.print("Black turn (A1 = 1 1):");
		inputX=sc.nextInt();
		inputY=sc.nextInt();
		if(!checkInput(inputX,inputY) || board[inputX-1][inputY-1]!=0){
			System.out.println("Input error!");
			continue;
		}
		board[inputX-1][inputY-1]=1;
		break;
	}
	
	for(;;){
		
		next=false;
		for(int i=0;i<19 && !next;i++){
			for(int j=0;j<19 && !next;j++){
				if(board[i][j]==0){
					board[i][j]=2;
					System.out.println("("+(char)('A'+i)+","+(j+1)+")");
					next=true;
				}
			}
		}
		
		next=false;
		for(int i=0;i<19 && !next;i++){
			for(int j=0;j<19 && !next;j++){
				if(board[i][j]==0){
					board[i][j]=2;
					System.out.println("("+(char)('A'+i)+","+(j+1)+")");
					next=true;
				}
			}
		}
		
		for(;;){
			System.out.print("Black turn (A1 = 1 1):");
			inputX=sc.nextInt();
			inputY=sc.nextInt();
			if(!checkInput(inputX,inputY) || board[inputX-1][inputY-1]!=0){
				System.out.println("Input error!");
				continue;
			}
			board[inputX-1][inputY-1]=1;
			break;
		}
		
		for(;;){
			System.out.print("Black turn (A1 = 1 1):");
			inputX=sc.nextInt();
			inputY=sc.nextInt();
			if(!checkInput(inputX,inputY) || board[inputX-1][inputY-1]!=0){
				System.out.println("Input error!");
				continue;
			}
			board[inputX-1][inputY-1]=1;
			break;
		}
	}
}

static boolean checkInput(int X,int Y){
	if(X>=20)return false;
	if(X<=0)return false;
	if(Y>=20)return false;
	if(Y<=0)return false;
	
	return true;
}
}