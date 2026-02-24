class Patterns{
    public static void main(String args[]){
        pattern35(6);
    }

    private static void pattern1(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    private static void pattern2(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    private static void pattern3(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    private static void pattern4(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+1 + " ");
            }
            System.out.println();

        }
    }
    private static void pattern5(int n){
        int half = n/2;
        for(int i=0; i<half; i++){
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=half; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    private static void pattern6(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("  ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern7(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print("  ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    private static void pattern8(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("  ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();

        }
    }
    private static void pattern9(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print("  ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            for(int j=0; j<n-i-1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern10(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern11(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<n-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern12(int n){
        int half = n/2;
        for(int i=0; i<half; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<half-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=0; i<half; i++){
            for(int j=0; j<half-i-1; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern13(int n){
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0; j<2*i-1; j++){
                System.out.print(" ");
            }
            if(i>0){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=1; i<2*n; i++){
            System.out.print("*");
        }
        System.out.println();
    }
    private static void pattern14(int n){
        for(int i=1; i<2*n; i++){
            System.out.print("*");
        }
        System.out.println();
        for(int i=1; i<n; i++){
            for(int j=0; j<i; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int j=0; j<2*(n-i-1)-1; j++){
                System.out.print(" ");
            }
            if(i != n-1){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern15(int n){
        int half = n/2 + n%2;
        for(int i=0; i<half; i++){
            for(int j=1; j<half-i; j++){
                System.out.print(" ");
            }
            if(i>0){
                System.out.print("*");
            }
            for(int j=0; j<2*i-1; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=half; i<n; i++){
            for(int j=half; j<i+n%2; j++){
                System.out.print(" ");
            }
            if(i != n-1) {               
                System.out.print("*");
            }
            for(int j=0; j<2*(n-i-1)-1; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
    private static void pattern16(int n){
        for(int i=0; i<n; i++){
            for(int j=1; j<n-i; j++){
                System.out.print("  ");
            }
            for(int j=0; j<2*i+1; j++){
                if(j%2 == 1){
                    System.out.print("  ");
                } else{
                    System.out.print(ncr(i, j/2) + " ");
                }
            }
            System.out.println();
        }
    }
    private static int ncr(int n, int r){
        return (factorial(n) / (factorial(r) * factorial(n-r)));
    }
    private static int factorial(int n){
        if(n == 0){
            return 1;
        }
        return n*factorial(n-1);
    }
    private static void pattern17(int n){
        for(int i=0; i<n; i++){
            for(int j=i; j<n-1; j++){
                System.out.print(" ");
            }
            int k = i+1;
            for(int j=0; j<2*(i+1)-1; j++){
                System.out.print(k);
                if(j<i){
                    k--;
                } else{
                    k++;
                }
            }
            System.out.println();
        }
        for(int i=n-1; i>0; i--){
            for(int j=n; j>i; j--){
                System.out.print(" ");
            }
            int k=i;
            for(int j=0; j<2*i-1; j++){
                System.out.print(k);
                if(j<(2*i-1)/2){
                    k--;
                } else{
                    k++;
                }
            }
            System.out.println();
        }
    }
    private static void pattern18(int n){
        int half = n/2 +n%2;
        for(int i=0; i<half; i++){
            for(int j=0; j<half-i; j++){
                System.out.print("*");
            }
            for(int j=0; j<2*i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<half-i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-half; i>0; i--){
            for(int j=0; j<half-i+1; j++){
                System.out.print("*");
            }
            for(int j=0; j<2*(i-1); j++){
                System.out.print(" ");
            }
            for(int j=0; j<half-i+1; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern19(int n){
        int half = n/2 + n%2;
        for(int i=0; i<half; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int j=0; j<(half-i-1)*2; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=n-half; i>0; i--){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            for(int j=0; j<2*(half-i); j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern20(int l, int b){
        for(int i=0; i<b; i++){
            System.out.print("*");
            if(i==0 || i==b-1){
                for(int j=0; j<l-2; j++){
                    System.out.print("*");
                }
            } else{
                for(int j=0; j<l-2; j++){
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }
    private static void pattern21(int n){
        int k=0;
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(++k + " ");
                if(k/10 == 0){
                    System.out.print(" ");
                }
                
            }
            System.out.println();
        }
    }
    private static void pattern22(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print((i+j+1)%2);
            }
            System.out.println();
        }
    }
    private static void pattern23(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<2*(n-i-1); j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i>0){
                for(int j=0; j<3*i; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            for(int j=0; j<2*(n-2*i); j++){
                System.out.print(" ");
            }
            if(i<n-1){
                System.out.print("*");
            }
            if(i>0){
                for(int j=0; j<3*i; j++){
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern24(int n){
        int half = n/2 + n%2;
        for(int i=0; i<half; i++){
            System.out.print("*");
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            if(i>0){
                System.out.print("*");
            }
            for(int j=0; j<(half-i-1)*2; j++){
                System.out.print(" ");
            }
            if(i>0){
                System.out.print("*");
            }
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
        for(int i=n-half-1; i>=0; i--){
            System.out.print("*");
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            if(i>0){
                System.out.print("*");
            }
            for(int j=0; j<(half-i-1)*2; j++){
                System.out.print(" ");
            }
            if(i>0){
                System.out.print("*");
            }
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            System.out.println("*");
        }
    }
    private static void pattern25(int n){
        for(int i=0; i<n; i++){
            for(int j=i; j<n-1; j++){
                System.out.print(" ");
            }
            System.out.print("*");
            if(i==0 || i==n-1){
                for(int j=0; j<n-2; j++){
                    System.out.print("*");
                }
            } else{
                for(int j=0; j<n-2; j++){
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }
    private static void pattern26(int n){
        for(int i=1; i<=n; i++){
            for(int j=i; j<=n; j++){
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
    private static void pattern27(int n){
        int left = 1;
        int right = n * (n + 1); // 4*5 = 20

        for (int i = 0; i < n; i++) {
            // Print spaces
            for (int s = 0; s < i; s++) {
                System.out.print("  ");
            }

            int count = n - i;

            // Print left side
            for (int j = 0; j < count; j++) {
                System.out.print(left++ + " ");
            }
            if(i<n-1){
                System.out.print(" ");
            }
            // Calculate starting point of right side
            right -= count;

            // Print right side
            for (int j = 0; j < count; j++) {
                System.out.print((right + j + 1) + " ");
            }

            right--; // move pointer back for next row

            System.out.println();
        }
    }
    private static void pattern28(int n){
        int half = n/2 + n%2;
        for(int i=0; i<half; i++){
            for(int j=i+1; j<half; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n-half; i>0; i--){
            for(int j=0; j<half-i; j++){
                System.out.print(" ");
            }
            for(int j=0; j<i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    private static void pattern29(int n){
        int half = n/2 + n%2;
        for(int i=0; i<half; i++){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int j=0; j<(half-i-1)*2; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=n-half-1; i>=0; i--){
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            for(int j=0; j<(half-i-1)*2; j++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    private static void pattern30(int n){
        for(int i=1; i<=n; i++){
            for(int j=0; j<n-i; j++){
                System.out.print("  ");
            }
            int count = i;
            for(int j=0; j<2*i-1; j++){
                System.out.print(count + " ");
                if(i>j+1){
                    count--;
                } else{
                    count++;
                }
            }
            System.out.println();
        }
    }
    private static void pattern31(int n){
        int size = 2 * n - 1;

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                int val = Math.max(Math.abs(n - 1 - i), Math.abs(n - 1 - j)) + 1;
                System.out.print(val + " ");
            }
            System.out.println();
        }
    }
    private static void pattern32(int n){
        for(int i=0; i<n; i++){
            for(int j=i; j>=0; j--){
                System.out.print((char)(64+n-j) + " ");
            }
            System.out.println();
        }
    }
    private static void pattern33(int n){
        int a = 97;
        for(int i=0; i<n; i++){
            for(int j=i; j>=0; j--){
                System.out.print((char)(a) + " ");
                if(a>90){
                    a -= 31;
                } else{
                    a += 33;
                }
            }
            System.out.println();
        }
    }
    private static void pattern34(int n){
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                System.out.print((char)(64+n-j) + " ");
            }
            System.out.println();
        }
    }
    private static void pattern35(int n){
        for(int i=0; i<n; i++){
            for(int j=0; j<=i; j++){
                System.out.print(j+1);
            }
            for(int j=0; j<(n-i-1)*2; j++){
                System.out.print(" ");
            }
            for(int j=i; j>=0; j--){
                System.out.print(j+1);
            }
            System.out.println();
        }
    }
}