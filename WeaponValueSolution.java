import java.util.Scanner;

class Solution{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCase = sc.nextInt();
        for(int i=0;i<testCase;i++){
            int count = 0;
            int n = sc.nextInt();
            String s[] = new String[n];
            for(int j = 0; j < n; j++) {
                s[j] = sc.next();
            }
            char temp[] = new char[10];
            char ans[] = new char[10];
            for(int j=0;j<10;j++){
                ans[j] = '0';
            }
            for(int k=0;k<n;k++){
                temp=s[k].toCharArray();
                for(int l=0;l<10;l++){
                    int t1, t2, t3;
                    String temp2;
                    t1 = Character.getNumericValue(ans[l]);
                    t2 = Character.getNumericValue(temp[l]);
                    t3 = t1^t2;
                    temp2 = Integer.toString(t3);
                    ans[l] = temp2.charAt(0);
                }
            }
            for(int m=0;m<10;m++){
                if(ans[m]=='1')
                    count++;
            }
            System.out.println(count);

        }
    }
}