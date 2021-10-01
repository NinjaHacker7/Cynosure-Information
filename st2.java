import java.util.*;

class st2
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
        Arrays.sort(arr1);
        Stack<Integer> st = new Stack<>();
        String ans = "";
        int idx = 0;
        for(int v2 : arr2){
             if( (arr1[idx] != -1 ) && (st.size() == 0 || (idx < arr1.length && st.peek() < arr1[idx]))){
                    st.push(arr1[idx]);
                    arr1[idx] = -1;
                    ans += "A";
                    idx++;
                }
                if(st.size() != 0  && st.peek() == v2 ){
                    ans += "B";
                    st.pop();
                    idx++;
                    break;
                }
                
            
          
            
        }
        System.out.println(ans);
        
	}
}


