import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lab_6Jan {
    
    // finding largest among three numbers
    public static int findMax(int a, int b, int c){
        if(a>b && a>c){
            return a;
        } else if(b>a && b>c){
            return b;
        } else{
            return c;
        }
    }

    //converting decimal to octal
    public static int decToOct(int n){
        if(n==0){
            return 0;
        }
        String s = "";
        while(n != 0){
            int rem = n%8;
            n /= 8;
            s = rem + s;
        }
        return Integer.parseInt(s);
    }

    //reversing a string
    public static String reverse(String s){
        String news = "";
        for(int i=s.length()-1; i>=0; i--){
            news += s.charAt(i);
        }
        return news;
    }
    //converting decimal to hexadecimal
    public static String decToHex(int n, String hex){
        if(n == 0){
            return reverse(hex);
        }
        int rem = n%16;
        if(rem == 10){
            hex += "A";
        } else if(rem == 11){
            hex += "B";
        } else if(rem == 12){
            hex += "C";
        } else if(rem == 13){
            hex += "D";
        }  else if(rem == 14){
            hex += "E";
        } else if(rem == 15){
            hex += "F";
        } else{
            hex += rem;
        }
        return decToHex(n/16, hex);
    }

    // Finding second largest number in a list
    public static int secLargest(int arr[]){
        if(arr.length == 0 || arr.length == 1){
            System.out.println("Insufficient numbers in the list");
            return -1;
        }
        int max = -1;
        int secMax = -1;
        for(int i=0; i<arr.length; i++){
            if(max < arr[i]){
                max = arr[i];
            }
        }
        for(int i=0; i<arr.length; i++){
            if(secMax < arr[i] && arr[i] < max){
                secMax = arr[i];
            }
        }
        return secMax;
    }

    // Printing duplicates from a list of integers
    public static void printDup(int arr[]){
        for(int i=0; i<arr.length; i++){
            int element = arr[i];
            int times = 0;
            for(int j=i; j<arr.length; j++){
                if(element == arr[j]){
                    times++;
                }
                if(times == 2){
                    break;
                }
            }
            if(times > 1){
                System.out.print(element + " ");
            }
        }
        System.out.println();
        return;
    }

    // check if all numbers in a list is prime or not
    public static boolean isPrime(int n){
        for(int i=2; i<n; i++){
            if(n%i == 0){
                return false;
            }
        }
        return true;
    }
    public static boolean checkingPrime(int arr[]){
        for(int i=0; i<arr.length; i++){
            if(!(isPrime(arr[i]))){
                return false;
            }
        }
        return true;
    }

    // Finding word with maximum frequency
    public static String maxFre(String sentence){
        String[] arr = sentence.split(" ");
        int a = 0;
        String temp = "";
        for(int i=0; i<arr.length; i++){
            int b = 0;
            for(int j=i; j<arr.length; j++){
                if(arr[i].equals(arr[j])){
                    b++;
                }
            }
            if(b>a){
                a = b;
                temp = arr[i];
            }
        }
        return temp;
    }

    //program to find List product excluding duplicates
    public static int productExcludingDuplicates(List<Integer> numbers) {
        Set<Integer> uniqueNumbers = new HashSet<>(numbers);
        int product = 1;
        for (int num : uniqueNumbers) {
            product *= num;
        }
        return product;
    }
    public static void main(String args[]){
        int a = 6;
        int b = 8;
        System.out.println(a + " ," + b);
        
        // swapping two numbers while using third variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println(a + " ," + b);
        
        // swapping two numbers without using third variable
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println(a + " ," + b);

        System.out.println(findMax(3,5,8));

        System.out.println(decToOct(10));

        System.out.println(decToHex(16, ""));
        
        int arr[] = {1,4,76,43,56};
        System.out.println(secLargest(arr));

        int arr2[] = {3,6,6,5,3,5,4,2};
        printDup(arr2);

        int arr3[] = {2,3,5};
        System.out.println(checkingPrime(arr3));

        System.out.println(maxFre("Hey my name is Alex and Alex is a good boy Alex plays Football"));

        List<Integer> numbers = Arrays.asList(2, 3, 2, 4, 3);
        System.out.println(productExcludingDuplicates(numbers));
    }
}
