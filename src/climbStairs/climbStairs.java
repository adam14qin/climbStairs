package climbStairs;

public class  climbStairs {

	public static int cS(int n) {
        if (n<=1) {return 1;}
        
        int sum=1;
        
        for (int i=1;i<=n/2;i++){
            System.out.println(n-i);
            System.out.println(i);
            sum+=combination(n-i,i);
            
        }
        return sum;
    }
    
    public static int combination(int n, int k)
    {
        if (n==k){return 1;}
        else {return permutation(n) / (permutation(k) * permutation(n - k));}
        
    }

    public static int permutation(int i)
    {
        if (i == 1)
        {
            return 1;
        }
        return i * permutation(i - 1);
    }
    
    public static void main(String []args){
    	int num=cS(7);
    }
}
    
    
   

