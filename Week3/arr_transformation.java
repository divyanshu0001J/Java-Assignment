public class arr_transformation {
static void reverseInPlace(int[] arr)
{int i=0,j=arr.length-1;
while(i<arr.length/2){
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    i++;
    j--;
}
}
static int[] reversedCopy(int[] arr) {
    int[] a1 = new int[arr.length];
    int i=0,j=arr.length-1;
    while (i < arr.length){
        a1[i]=arr[j];
        i++;
        j--;
    }
    return a1;
}
static int removeValue(int[] arr, int t){
    int i=0;
    for(int j=0;j<arr.length;j++){
        if(arr[j]!=t){
            arr[i]=arr[j];
            i++;
        }
    }
    return i;
}
static int[] runningSum(int[] arr){
    int temp=0;
    for(int i=0;i<arr.length;i++){
        temp+=arr[i];
        arr[i]=temp;
    }
    return arr;
}
}
