public class bubble {
    public static void main(String[] args) {
        int arr[]={2,1,3,5,7,1,9};
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j]<arr[i]){
                    int t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;
                }
            }
        }
        for(int i:arr){
            System.out.println(i);
        }
    }
}
