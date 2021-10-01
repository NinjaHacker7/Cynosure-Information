import java.util.*;

class st1
{
    static class Pair{
        int i;
        int si;
        Pair(int i,int si){
            this.i = i;
            this.si = si;
        }
    } 
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++){
            arr1[i]  = scn.nextInt();

        }
        int m = scn.nextInt();
        int arr2[] = new int[m];
        for(int i=0;i<m;i++){
            arr2[i] = scn.nextInt();
        }
        Stack<Integer> st = new Stack<>();
        String ans = "";
        int top = -1;
        for(int v2 : arr2){

            for(int i = 0;i<arr1.length; i++){
                if( (arr1[i] != -1) && (st.size() == 0 || st.peek() < arr1[i])){
                    st.push(arr1[i]);
                    arr1[i] = -1;
                    ans += "A";
                }
                if(st.size() != 0  && st.peek() == v2 ){
                    ans += "B";
                    st.pop();
                    
                    break;
                }
                
            }
          
            
        }
        System.out.println(ans);
        
	}
}


