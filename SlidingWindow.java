class SlidingWindow{
    public static int SlidingWindow(int[] arr,int k){
        int maxSum=0,windowSum=0;

        for(int i=0;i< k;i++){
            windowSum +=arr[i];
        }
        maxSum=windowSum;

        for(int i=k;i< arr.length;i++){
            windowSum +=arr[i]-arr[i-k];
            maxSum = Math.max(maxSum, windowSum);
        }
        return maxSum;


    }
    public static void main(String[] args){
        int[] arr={4,6,1,-4,3,9,7};
        int k=3;
        System.out.println(SlidingWindow(arr,k));
    }
}