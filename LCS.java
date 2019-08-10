import java.util.*;
class LCS
{
	static void fun(char x[],char y[])
	{
		int i=0,j=0,row=0,col=0;
	    int lcs[][]=new int[x.length+1][y.length+1];
		//if a is null
		for(i=0;i<=y.length;i++)
 		{
            lcs[0][i]=0;
		}
//if b is null
		for(i=0;i<=x.length;i++)
		{
			lcs[i][0]=0;
		}

for(i=1;i<=x.length;i++)

{
	for(j=1;j<=y.length;j++)
	{
   if(x[i-1]==y[j-1])
{
	lcs[i][j]=lcs[i-1][j-1]+1;

					row=i;
					col=j;
}
	else
		lcs[i][j]=0;
	}
}
for(i=0;i<=x.length;i++)

{
	for(j=0;j<=y.length;j++)
	{
		System.out.print("\t"+lcs[i][j]);
	}
	System.out.println();
}
int result = -1;
		for(i=0;i<=x.length;i++)
		{
			for(j=0;j<=y.length;j++)
			{
				if(result<lcs[i][j])
				{
					result = lcs[i][j];
				
				}
            }
        }
System.out.println("substring length:"+result);

        String resultStr = ""; 
  
        // traverse up diagonally form the (row, col) cell 
        // until LCSuff[row][col] != 0 
        while (lcs[row][col] != 0) { 
            resultStr = x[row-1] + resultStr; // or Y[col-1] 
           
  
            // move diagonally up to previous cell 
            row--; 
            col--; 
        } 
  
        // required longest common substring 
        System.out.println(resultStr); 
     

}
	public static void main(String ar[])
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the two string");
		
		String s1="vikkramramhjklm";
		String s2="vikkramkkamjklmno";
		fun(s1.toCharArray(),s2.toCharArray());
	}
}