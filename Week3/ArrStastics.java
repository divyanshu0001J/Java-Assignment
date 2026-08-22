public class ArrStastics {
static int Sum(int[] arr){
    int s = 0;
    for(int i = 0; i < arr.length; i++){
        s += arr[i];
    }
    return s;
}
static double Average(int[] arr){
    return (double)Sum(arr)/arr.length;}
static int minimum(int[] arr){
    int min=arr[0];
    for(int i=0;i<arr.length;i++){
        if (arr[i]<min){
            min=arr[i];
        }

    }
    return min;

}
static int maximum(int[] arr){
    int max=arr[0];
    for(int i=0;i<arr.length;i++){
        if (arr[i]>max){
            max=arr[i];
        }

    }
    return max;

}
static int counteven(int[] arr){
    int c=0;
    for(int i=0;i<arr.length;i++){
        if (arr[i]%2==0){
            c++;
        }

    }
    return c;

}
static void sign(int[] arr){
    int p=0,n=0,z=0;
    for(int i=0;i<arr.length;i++){
        if (arr[i]>0){
            p++;
        }
         if (arr[i]<0){
            n++;
        }
         if (arr[i]==0){
            z++;
        }

    }
   System.out.println("Positive="+p+"\nNegative="+n+"\nZero="+z);

}



}
