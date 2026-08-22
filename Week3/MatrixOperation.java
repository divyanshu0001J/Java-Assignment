public class MatrixOperation {
    static void rowsum(int[][]arr){

    for(int i=0;i<arr.length;i++){
    int sum=0;
    for(int j=0;j<arr[i].length;j++){
        sum+=arr[i][j];
    }
    System.out.println(sum);
    }
    }
    static void colsum(int[][]arr){
        
        for(int i=0;i<arr[0].length;i++){
            int sum=0;
            for(int j=0;j<arr.length;j++){
                sum+=arr[j][i];
            }
            System.out.println(sum);
        }
    }
    static int[][] add(int[][]arr1,int[][]arr2){
        int[][]arr3=new int[arr1.length][arr1[0].length];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr3[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        return arr3;
    }
    static int[][] transpose(int[][]arr){
        int[][]arr2=new int[arr[0].length][arr.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr2[j][i]=arr[i][j];
            }
        }
        return arr2;
        }
    static int[][]multiply(int[][]arr1,int[][]arr2){
       int[][]arr3=new int[arr1.length][arr2[0].length];
       for(int i=0;i<arr1.length;i++){
        for(int j=0;j<arr2[0].length;j++){
            for(int k=0;k<arr1[0].length;k++){
                arr3[i][j]+=arr1[i][k]*arr2[k][j];
            }
        }

       }
        return arr3;
    }
    static void print(int[][]arr){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

   
    }
}



