class PrefixSum{

  public static int PrefixSum(int[] arr,int l,int r){
    int[] Prefix=new int[arr.length];
    Prefix[0]=arr[0];
    for(int i=1;i<arr.length;i++){
        Prefix[i]=Prefix[i-1]+arr[i];
    }
    return l==0 ? Prefix[r] :Prefix[r]-Prefix[l-1];
  }



    public static void main(String[] args){
        int[] arr={1,5,9,3,-5,2,8};
        System.out.println(PrefixSum(arr,1,4));
    }
}