//pow(x,n
//tc log n
//sc 1
class Solution {
    public double myPow(double x, int n) {
        
        if(n==0) return 1.000;
        
        double temp = myPow(x, n/2);
        
        if((n % 2) == 0){
            
            return temp * temp;
        }
        else{
            
            if(n>0){
                return temp * temp * x;
            }
            return temp * temp * (1/x);
        }
    }
}

// k closest elements

//tc log(n-k)
//sc k
class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        
        List<Integer> result = new ArrayList<>();
        int low = 0;
//         int high = arr.length - 1;
        
//         while(high - low + 1 > k){   //logn + k algo
            
//             int distL = Math.abs(arr[low] - x);
//             int distR = Math.abs(arr[high] - x);
            
//             if(distL > distR) low++;
            
//             else
//                 high--;
//         }
        
        int high = arr.length - k;
        
        while(low < high) {
            
            int mid = low + (high-low)/2;
            
            int distS = x - arr[mid]; 
            int distL = arr[mid + k] - x;
            
            if(distS > distL) low = mid + 1;
            
            else high = mid;
        }
        
        for(int i = low; i < low + k; i++){
            
            result.add(arr[i]);
        }
        return result;
    }
}
