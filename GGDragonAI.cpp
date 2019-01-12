#include<iostream>
using namespace std;

int BlackAI();
int WhiteAI();
bool checkInput(int,int);

int main(){
	
	int mode;
	
	cout<<"AI color (Black=0,White=1):";
	cin>>mode;
	
	if(mode==0){
		BlackAI();
	}
	
	else if(mode==1){
		WhiteAI();
	}
	
	else{
		cout<<"Input error!"<<endl;
	}
}

int BlackAI(){
	
	int board[20][20]={0};
	int inputX,inputY;
	bool next;
	
	//None=0,Black=1,White=2
	board[0][0]=1;
	cout<<"(A,1)"<<endl;
	
	for(;;){
		for(;;){
			cout<<"White turn (A1 = 1 1):";
			cin>>inputX>>inputY;
			if(!checkInput(inputX,inputY) || board[inputX-1][inputY-1]!=0){
				cout<<"Input error!"<<endl;
				continue;
			}
			board[inputX-1][inputY-1]=2;
			break;
		}
		
		for(;;){
			cout<<"White turn (A1 = 1 1):";
			cin>>inputX>>inputY;
			if(!checkInput(inputX,inputY) || board[inputX-1][inputY-1]!=0){
				cout<<"Input error!"<<endl;
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
					cout<<"("<<(char)('A'+i)<<","<<j+1<<")"<<endl;
					next=true;
				}
			}
		}
		
		next=false;
		for(int i=0;i<19 && !next;i++){
			for(int j=0;j<19 && !next;j++){
				if(board[i][j]==0){
					board[i][j]=1;
					cout<<"("<<(char)('A'+i)<<","<<j+1<<")"<<endl;
					next=true;
				}
			}
		}
	}
}

int WhiteAI(){
	
	int board[20][20]={0};
	int inputX,inputY;
	bool next;
	
	for(;;){
			cout<<"Black turn (A1 = 1 1):";
			cin>>inputX>>inputY;
			if(!checkInput(inputX,inputY) || board[inputX-1][inputY-1]!=0){
				cout<<"Input error!"<<endl;
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
					cout<<"("<<(char)('A'+i)<<","<<j+1<<")"<<endl;
					next=true;
				}
			}
		}
		
		next=false;
		for(int i=0;i<19 && !next;i++){
			for(int j=0;j<19 && !next;j++){
				if(board[i][j]==0){
					board[i][j]=2;
					cout<<"("<<(char)('A'+i)<<","<<j+1<<")"<<endl;
					next=true;
				}
			}
		}
		
		for(;;){
			cout<<"Black turn (A1 = 1 1):";
			cin>>inputX>>inputY;
			if(!checkInput(inputX,inputY) || board[inputX-1][inputY-1]!=0){
				cout<<"Input error!"<<endl;
				continue;
			}
			board[inputX-1][inputY-1]=1;
			break;
		}
		
		for(;;){
			cout<<"Black turn (A1 = 1 1):";
			cin>>inputX>>inputY;
			if(!checkInput(inputX,inputY) || board[inputX-1][inputY-1]!=0){
				cout<<"Input error!"<<endl;
				continue;
			}
			board[inputX-1][inputY-1]=1;
			break;
		}
	}
}

bool checkInput(int X,int Y){
	if(X>=20)return false;
	if(X<=0)return false;
	if(Y>=20)return false;
	if(Y<=0)return false;
	
	return true;
}