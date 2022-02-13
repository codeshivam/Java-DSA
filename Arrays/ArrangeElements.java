package Arrays;

public class ArrangeElements {

	public static void arrange(int[] arr, int n) {
    	//Your code goes here
        if(n==0){
           // System.out.println(0);
			return;
        }
        int i = 0;
        int p = 1;
        if(n == 1) {
        	System.out.println(p);
        	return;
        }
        for(;i<=n/2;i++){
        	
            arr[i] = p;
            p+=2;
            if(p>=n) {
            	if(n%2 == 0)
            		p--;
            }
        }
        if(n%2 ==0)
        	p = n-2;
        
        else
        	p = n-1;
        System.out.println(p+"p hai");
        for(;i<n;i++){
            arr[i] = p;
            p-=2;
        }
        for(i = 0; i<n;i++){
            System.out.println(arr[i]);
        }
    }
	
	public static void main(String[] args) {
		int n = 4;
		int arr[] = new int[n];
		arrange(arr,n);
	}

}
