import java.util.*;

class st3
{
    
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
        int idx = 0;
        HashSet<Integer> set = new HashSet<>();
        for(int v2 : arr2){
            System.out.println("Processing:"+v2);
            if(set.contains(v2)){
                while(st.size() != 0 && st.peek() != v2){
                    ans += "B";
                    st.pop();
                }
                ans += "B";
                st.pop();
            }else{
                while(st.size() == 0  ||   st.peek() != v2){
                    st.push(arr1[idx]);
                    set.add(arr1[idx]);
                    ans+="A";
                    idx++;
                }
                if(st.peek() == v2){
                    ans += "B";
                    st.pop();
                }
                
            }
           
        }
        System.out.println(ans);
        
	}
}


