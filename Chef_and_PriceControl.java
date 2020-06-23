import java.util.Scanner;

public class Chef_and_PriceControl {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        while(testCase-- > 0){
            int N = sc.nextInt();
            int K = sc.nextInt();
            int[] arr = new int[N];
            for(int i=0;i<N;i++){
                arr[i] = sc.nextInt();
            }
            int sum = arrSum(arr);
            int[] arr1 = new int[N];
            for(int i=0;i<N;i++){
                if(arr[i] > K){
                    arr1[i] = K;
                }else{
                    arr1[i] = arr[i];
                }
            }
            int sum1 = arrSum(arr1);
            System.out.println(sum-sum1);
        }
        
        sc.close();
    }

    private static int arrSum(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum += arr[i];
        }
        return sum;
    }
}