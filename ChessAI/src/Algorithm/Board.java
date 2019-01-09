package Algorithm;

public class Board {
private int[][] board; 
	public Mark[][] returnboard;
	

	public Board() {
	 
	   board  = new int[19][19];
       returnboard = new Mark[19][19];
       
        for(int x=0;x<19;x++) {
           for(int y=0;y<19;y++) {
        	 board[x][y] = returnboard[x][y];  
        	   
           }
        
        }
	}
	
	public Board  getCurrentState() {
		
		
	  return  this;
		
	}
	
     public  Board getNextState() {
	
	
		
     }
     
     public int  getWiningMark( int[][] b) {
        
       
       int  Px = 0;
       int  Py = 0;
       
       for(int x=0;x<19;x++) {
    	  for(int y=0;y<19;y++) {
    	    	
    	  if(b[x][y] == 1) {   //找到有棋的一點 ,把它當作分割點向左向右查看
    	     
    		  for(Px=x-1;Px>0;Px--)
    			 int count=1;
    			if(b[Px][y]==1)
    			  count++;
    		   if(count >= 6) {
    			   
    		   	 return 1 ;
    		   	 
    		   }
    		   else  {
    			   
    			   break;
    		   }
    		  
    		   
    		  for(Px=x+1;Px<=19;Px++){  //向右
    			  int count = 1;
    			  if(b[Px][y]==1)
    				  count++;
    			  if(count >=6 ) {
    				 
    				  return 1;
    				 
    			  }
    			  else  {
    				break;    
    			  }
    	
    		  }
    		  
    		for(Py=y-1;Py>=0;Py--) {  //向下
    			int count = 1;
    			if(b[x][Py]==1)
    				count++;
    			if(count >=6) {
    				return 1;
    			}
    			else {
    				break;
    			}
    				
    		}  
    		 
    		for(Py=y+1;Py<=19;Py++) { //向
    			int count = 1;
    			if(b[x][Py]==1)
    				count++;
    			if(count>=6) {
    				return 1;
    			}
    			else {
    			
    				 break;
    			}
    			
    		}
    		  
    		for(Px=x-1,Py=y-1;Px>=0 && Py>=0 ; Px--,Py--) { //斜左上
    			int count = 1;
    			 if(b[Px][Py]==1)
    				count++;
    			 if(count>=6) {
    				return 1; 
    			 }
    			 else {
    				 break;
    			 }
    		}
    		for(Px=x+1,Py=y+1;Px<=19 && Py<=19; Px++,Py++) {  //斜右上
    			 int count = 1;
    			 if(b[Px][Py]==1)
    				 count++;
    			 if(count>=6) {
    				 return 1;
    			 }
    			 else {
    				 break;
    			 }
    		}
    		
           for(Px=x+1,Py=y-1;Px>=0 && Py<=19 ; Px--,Py++) { //斜右下
        	    int count=1;
        	    if(b[Px][Py]==1)
        	    	count++;
        	    if(count>=6) {
        	    	return 1;
        	    }
        	    else {
        	    	break;
        	    }
           }
           for(Px=x-1,Py=y+1;Px<=19 && Py>=0; Px++,Py--) { //斜左下
       	    int count=1;
       	    if(b[Px][Py]==1)
       	    	count++;
       	    if(count>=6) {
       	    	return 1;
       	    }
       	    else {
       	    	break;
       	    }
          }
           else if(b[x][y]==2)	{
        	   
           
        	   for(Px=x-1;Px>0;Px--)
      			 int count=1;
      			if(b[Px][y]==2)
      			  count++;
      		   if(count >= 6) {
      			   
      		   	 return 2 ;
      		   	 
      		   }
      		   else  {
      			   
      			   break;
      		   }
      		  
      		   
      		  for(Px=x+1;Px<=19;Px++){  //向右
      			  int count = 1;
      			  if(b[Px][y]==2)
      				  count++;
      			  if(count >=6 ) {
      				 
      				  return 2;
      				 
      			  }
      			  else  {
      				break;    
      			  }
      	
      		  }
      		  
      		for(Py=y-1;Py>=0;Py--) {  //向下
      			int count = 1;
      			if(b[x][Py]==2)
      				count++;
      			if(count >=6) {
      				return 2;
      			}
      			else {
      				break;
      			}
      				
      		}  
      		 
      		for(Py=y+1;Py<=19;Py++) { //向下
      			int count = 1;
      			if(b[x][Py]==2)
      				count++;
      			if(count>=6) {
      				return 2;
      			}
      			else {
      			
      				 break;
      			}
      			
      		}
      		  
      		for(Px=x-1,Py=y-1;Px>=0 && Py>=0 ; Px--,Py--) { //斜左上
      			int count = 1;
      			 if(b[Px][Py]==2)
      				count++;
      			 if(count>=6) {
      				return 2; 
      			 }
      			 else {
      				 break;
      			 }
      		}
      		for(Px=x+1,Py=y+1;Px<=19 && Py<=19; Px++,Py++) {  //斜右上
      			 int count = 1;
      			 if(b[Px][Py]==2)
      				 count++;
      			 if(count>=6) {
      				 return 2;
      			 }
      			 else {
      				 break;
      			 }
      		}
      		
             for(Px=x+1,Py=y-1;Px>=0 && Py<=19 ; Px--,Py++) { //斜右下
          	    int count=1;
          	    if(b[Px][Py]==2)
          	    	count++;
          	    if(count>=6) {
          	    	return 2;
          	    }
          	    else {
          	    	break;
          	    }
             }
             for(Px=x-1,Py=y+1;Px<=19 && Py>=0; Px++,Py--) { //斜左下
         	    int count=1;
         	    if(b[Px][Py]==2)
         	    	count++;
         	    if(count>=6) {
         	    	return 2;
         	    }
         	    else {
         	    	break;
         	    }
           }
           
           
    		  
    	  }
    		  
    		  
    		  
    	  }
}
