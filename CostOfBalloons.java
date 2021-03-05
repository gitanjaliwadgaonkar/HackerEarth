import java.util.*;
public class CostOfBalloons {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int t=sc.nextInt();
		int n,first=0,second=0,green,purple;
		for(int i=0;i<t;i++) {
			green=sc.nextInt();
			purple=sc.nextInt();
			n = sc.nextInt();
			for(int j=0;j<n;j++) {
				  if(sc.nextInt()==1){
				first++;
				}
				  else {
					  
				  }
				  if(sc.nextInt()==1){

					    second++;

					   }

					   else{
						   
					   }
			}
			  int x=green*first+purple*second;

			  int y=purple*first+green*second;
			  if(x<y){

				   System.out.println(x);

				  }

				  else{

				   System.out.println(y);

				  }
			  first=0;second=0;
		}
		
	}

}



/*
 OUTPUT
 Sample Input
2
9 6
10
1 1
1 1
0 1
0 0
0 1
0 0
0 1
0 1
1 1
0 0
1 9
10
0 1
0 0
0 0
0 1
1 0
0 1
0 1
0 0
0 1
0 0
Sample Output
69
14
 */