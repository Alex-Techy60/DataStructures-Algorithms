// import java.util.*;
// class Alex{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int positives = 0, negatives = 0, zeros = 0;
//         System.out.println("Press 1 to enter a number and 0 to exit the program");
//         int input = sc.nextInt();
//         while(input==1){
//             System.out.println("Enter your number");
//             int number = sc.nextInt();
//             if(number==0){
//                 zeros++;
//             } else if(number>0){
//                 positives++;
//             } else{
//                 negatives++;
//             }
//             System.out.println("Press 1 to enter a number and 0 to exit the program");
//             input = sc.nextInt();
//         }
//         System.out.println("Positives :  " + positives + "\nNegatives :  " + negatives + "\nZeros :  " + zeros);
//     }
// }

// import java.util.*;
// public class Alex{
//     public static int power(int x, int n){
//         if(n==0){
//             return 1;
//         }
//         return x*power(x, n-1);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("This program will give you x to the power n");
//         System.out.println("Enter the value of x");
//         int x = sc.nextInt();
//         System.out.println("Enter the value of n");
//         int n = sc.nextInt();
//         System.out.println(x + "  raised to the power  " + n + "  is  " + power(x,n));
//     }
// }

// class Alex {
//     public static void main(String[] args){
//         String[] names1 = new String[4];
//         names1[0] = "Alex";
//         names1[1] = "Suggu";
//         names1[2] = "Sugyan";
//         names1[3] = "Finn";
//         for(int i=0; i<4; i++){
//             System.out.println(names1[i]);
//         }
//         String[] names2 = {"Emma", "Jennie", "Lisa", "Elsa", "Anna", "Olivia", "Emily"};
//         for (int i=0; i<names2.length; i++){
//             System.out.println(names2[i]);
//         }
//     }
// }

// import java.util.*;
// class Alex {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of your array");
//         int size = sc.nextInt();
//         int[] numbers = new int[size];
//         for(int i=0; i<size; i++){
//             if(i%10 == 0){
//                 System.out.println("Enter the " + (i+1) + "st element");
//             } else if(i%10 == 1){
//                 System.out.println("Enter the " + (i+1) + "nd element");
//             } else if(i%10 == 2){
//                 System.out.println("Enter the " + (i+1) + "rd element");
//             }else{
//                 System.out.println("Enter the " + (i+1) + "th element");
//             }
//             numbers[i] = sc.nextInt();
//         }
//         System.out.println("Enter the number you wanna search");
//         int num = sc.nextInt();
//         for(int i=0; i<size; i++){
//             if(num == numbers[i]){
//                 if(i%10 == 0){
//                     System.out.println("The numbers " + num + " is at " + (i+1) + "st position");
//                 } else if(i%10 == 1){
//                     System.out.println("The numbers " + num + " is at " + (i+1) + "nd position");
//                 } else if(i%10 == 2){
//                     System.out.println("The numbers " + num + " is at " + (i+1) + "rd position");
//                 }else{
//                     System.out.println("The numbers " + num + " is at " + (i+1) + "th position");
//                 }

//             }
//         }
//     }
// }

// import java.util.*;
// public class Alex {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the total number of numbers that you wanna enter");
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         for(int i=0; i<size; i++){
//             if(i%10==0){
//                 System.out.println("Enter the " + (i+1) + "st element");
//             } else if(i%10==1){
//                 System.out.println("Enter the " + (i+1) + "nd element");
//             } else if(i%10==2){
//                 System.out.println("Enter the " + (i+1) + "rd element");
//             } else{
//                 System.out.println("Enter the " + (i+1) + "th element");
//             }
//             arr[i] = sc.nextInt();
//         }
//         int pos = 0;
//         int neg = 0;
//         int zer = 0;
//         for(int i=0; i<size; i++){
//             if(arr[i]>0){
//                 pos++;
//             } else if(arr[i]<0){
//                 neg++;
//             } else{
//                 zer++;
//             }
//         }
//         System.out.println("The total number of poistive numbers are :  " + pos);
//         System.out.println("The total number of negative numbers are :  " + neg);
//         System.out.println("The total number of zeros are :  " + zer);
//     }
// }

// import java.util.*;
// public class Alex {
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows");
//         int rows = sc.nextInt();
//         System.out.println("Enter the number of columns");
//         int columns = sc.nextInt();
//         int[][] matrix = new int[rows][columns];
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<columns; j++){
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         int x = sc.nextInt();
//         for(int i=0; i<rows; i++){
//             for(int j=0; j<columns; j++){
//                 if(matrix[i][j]==x){
//                     System.out.println(x + " is at " + (i+1) + "," + (j+1) + " position");
//                 }
//             }
//         }
//     }
// }

// import java.util.*;
// public class Alex{
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int[][] matrix = new int[3][3];
//         for(int i=0; i<3; i++){
//             for(int j=0; j<3; j++){
//                 System.out.println("Enter the element at " + i + "," + j +" position");
//                 matrix[i][j] = sc.nextInt();
//             }
//         }
//         System.out.println("Your given matrix is :-  ");
//         for(int i=0; i<3; i++){
//             for(int j=0; j<3; j++){
//                 System.out.print(matrix[i][j] + " ");
//             }
//             System.out.println();
//         }
//         int[][] transpose = new int[3][3];
//         System.out.println("It's transpose is :-  ");
//         for(int i=0; i<3; i++){
//             for(int j=0; j<3; j++){
//                 transpose[i][j] = matrix[j][i];
//             }
//         }
//         for(int i=0; i<3; i++){
//             for(int j=0; j<3; j++){
//                 System.out.print(transpose[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
// }

// import java.util.*;

// public class Alex {
//     public static void matrixMultiplication(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the number of rows in the first matrix");
//         int r1 = sc.nextInt();
//         System.out.println("Enter the number of columns in the first matrix");
//         int c1 = sc.nextInt();
//         System.out.println("Enter the number of rows in the second matrix");
//         int r2 = sc.nextInt();
//         System.out.println("Enter the number of columns in the second matrix");
//         int c2 = sc.nextInt();
//         if(c1 != r2){
//             System.out.println("Matrix multiplication is not possible for the matrices of this order");
//             return;
//         } 
//         int[][] matrix1 = new int[r1][c1];
//         int[][] matrix2 = new int[r2][c2];
//         for(int i=0; i<r1; i++){
//             for(int j=0; j<c1; j++){
//                 System.out.println("Enter the element in the first matrix at position :  " + i + "," + j);
//                 matrix1[i][j]= sc.nextInt();
//             }
//         }
//         for(int i=0; i<r2; i++){
//             for(int j=0; j<c2; j++){
//                 System.out.println("Enter the element in the second matrix at position :  " + i + "," + j);
//                 matrix2[i][j]= sc.nextInt();
//             }
//         }
//         System.out.println("Your first matrix is :  ");
//         for(int i=0; i<r1; i++){
//             for(int j=0; j<c1; j++){
//                 System.out.print(matrix1[i][j] + "  ");
//             }
//             System.out.println();
//         }
//         System.out.println("And their multiplication is :  ");
//         int[][] product = new int[r1][c2];
//         for(int i=0; i<r1; i++){
//             for(int j=0; j<c2; j++){
//                 int sum = 0;
//                 for(int k=0; k<=c2; k++){

//                 }
//                 product[i][j] = sum;
//             }
//         }
//         for (int i = 0; i < r1; i++) {
//             for (int j = 0; j < c2; j++) {
//                 int sum = 0;
//                 for (int k = 0; k < c1; k++) {
//                     sum += matrix1[i][k] * matrix2[k][j];
//                 }
//                 product[i][j] = sum;
//             }
//         }
//         for(int i=0; i<r1; i++){
//             for(int j=0; j<c2; j++){
//                 System.out.print(product[i][j] + "  ");
//             }
//             System.out.println();
//         }                
//     }
//     public static void main(String args[]){
//         matrixMultiplication();
//     }
// }

// import java.util.*;
// public class Alex {
//     public static int sum(String str){
//         int sum = 0;
//         String substr = "";
//         for(int i=0; i<str.length(); i++){
//             if(str.charAt(i)=='+' || i==str.length()-1){
//                 sum += Integer.parseInt(substr);
//                 substr = "";
//             } else{
//                 substr += str.charAt(i);
//             }
//         }
//         return sum;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your operation");
//         String str = sc.next();
//         System.out.println("The result of the given operation is " + sum(str));
//     }
// }

// import java.util.*;

// public class Alex {
//     public static int sum(int n){
//         if(n==1){
//             return 1;
//         }
//         return (n+sum(n-1));
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a number and I'll print the sum of the numbers till it");
//         int n = sc.nextInt();
//         System.out.println("The sum is :  " + sum(n));
//     }
// }

// import java.util.*;

// public class Alex {
//     public static void reverse(String str, int index){
//         if(index==-1){
//             return;
//         }
//         System.out.print(str.charAt(index));
//         reverse(str, index-1);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         reverse(str, str.length()-1);
//     }
// }

// import java.util.*;

// public class Alex{
//     public static int first = -1;
//     public static int last = -1;
//     public static void occurance(String str, char ch, int index){
//         if(index == str.length()){
//             System.out.println("The first occurance is :  " + first);
//             System.out.println("The last occurance is :  " + last);
//             return;
//         }
//         if(ch == str.charAt(index)){
//             if(first == -1){
//                 first = index;
//             }
//             last = index;
//         }
//         occurance(str, ch, index+1);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your String");
//         String str = sc.next();
//         System.out.println("Enter your character");
//         char ch = sc.next().charAt(0);
//         occurance(str, ch, 0);
//     }
// }

// import java.util.*;

// public class Alex{
//     public static boolean increase = true;
//     public static boolean decrease = true;
//     public static boolean checksort(int arr[], int index){
//         if(index == arr.length-1){
//             if(increase == false && decrease == false){
//                 return false;
//             } else {
//                 return true;
//             }
//         }
//         if(arr[index]>arr[index+1]){
//             increase = false;
//         } else if(arr[index]<arr[index+1]){
//             decrease = false;
//         }
//         return checksort(arr, index+1);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int[] arr = new int[size];
//         for(int i=0; i<size; i++){
//             arr[i] = sc.nextInt();
//         }
//         boolean a = checksort(arr, 0);
//         if(a==true){
//             System.out.println("The array is sorted");
//         } else {
//             System.out.println("The array is not sorted");
//         }
//     }
// }

// import java.util.*;

// public class Alex {
//     public static void remdup(String str, String newstr, int index){
//         if(index == str.length()){
//             System.out.println(newstr);
//             return;
//         } 
//         char currChar = str.charAt(index);
//         String temp = "";
//         temp += currChar;
//         for(int i=0; i<newstr.length(); i++){
//             if(currChar==newstr.charAt(i)){
//                 temp = "";
//                 break;
//             }
//         }
//         remdup(str, newstr+temp, index+1);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a string");
//         String str = sc.next();
//         remdup(str, "", 0);
//     }
// }

// import java.util.Scanner;

// public class Alex {
//     public static void subsequences(String str, int index, String newStr){
//         if(index == str.length()){
//             System.out.println(newStr);
//             return;
//         }
//         char currChar = str.charAt(index);
//         subsequences(str, index+1, newStr+currChar);
//         subsequences(str, index+1, newStr);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         subsequences(str, 0, "");
//     }
// }

// import java.util.Scanner;

// public class Alex {
//     public static int first = -1;
//     public static int last = -1;
//     public static void occurance(String str, char check, int index){
//         if(index == str.length()){
//             System.out.println(first);
//             System.out.println(last);
//             return;
//         }
//         if(str.charAt(index)==check){
//             if(first == -1){
//             first = index;
//             }
//             last = index;
//         }
//         occurance(str, check, index+1);
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         char check = sc.next().charAt(0);
//         occurance(str, check, 0);
//     }
// }

// import java.util.Scanner;

// public class Alex {
//     public static boolean result = true;
//     public static boolean checkSort(int arr[], int i){
//         if(i==-1){
//             return true;
//         }
//         if(arr[i]>=arr[i+1]){
//             return false;
//         }
//         else{
//             return checkSort(arr, i-1);
//         }
//     }    
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int size = sc.nextInt();
//         int arr[] = new int[size];
//         for(int i=0; i<size; i++){
//             arr[i] = sc.nextInt();
//         }
//         System.out.println(checkSort(arr, size-2));
//     }
// }

// import java.util.Scanner;

// public class Alex {
//     public static void moveAllchar(String str, String newStr, int count, char ch){
//         if(str.length()==0){
//             if(count==0){
//                 System.out.println(newStr);
//                 return;
//             } else{
//                 moveAllchar(str, newStr+ch, count-1, ch);
//             }
//         } else{
//             if(str.charAt(0)!=ch){
//                 moveAllchar(str.substring(1,str.length()), newStr+str.charAt(0), count, ch);
//             } else{
//                 moveAllchar(str.substring(1,str.length()), newStr, count+1, ch);
//             }
//         }

//     }
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter your String");
//         String str = sc.next();
//         System.out.println("Enter your character");
//         char ch = sc.next().charAt(0);
//         moveAllchar(str, "", 0, ch);
//     }
// }

// import java. util.Scanner;

// public class Alex {
//     public static void remDup(String str, String newStr){
//         if(str.length()==0){
//             System.out.println(newStr);
//             return;
//         }
//         if(newStr.length()==0){
//             remDup(str.substring(1, str.length()), newStr+str.charAt(0));
//         } else{
//             for(int i=0; i<newStr.length(); i++){
//                 if(str.charAt(0)==newStr.charAt(i)){
//                     remDup(str.substring(1, str.length()), newStr);
//                     break;
//                 } else if(i==newStr.length()-1){
//                     remDup(str.substring(1, str.length()), newStr+str.charAt(0));
//                 }
//             }
//         }
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter a word, and I'll remove it's duplicates");
//         String str = sc.next();
//         remDup(str, "");

//     }
// }

// import java.util.Scanner;

// public class Alex {
//     public static int fibo(int n){
//         if(n==0||n==1){
//             return 0;
//         } else if(n==2){
//             return 1;
//         }
//         int term = fibo(n-1)+fibo(n-2);
//         return term;
//     }
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the term you wanna know in the standard fibonacci series starting from 0 and 1");
//         int n = sc.nextInt();
//         int term = fibo(n);
//         System.out.println("The " + n + "th term in the series is :  " + term);
//     }
// }

// import java.util.ArrayList;
// import java.util.Collections;

// public class Alex {
//     public static void main(String args[]){
//         ArrayList<Integer> list = new ArrayList<>();
//         list.add(2);
//         list.add(0, 3);
//         Collections.sort(list);
//         System.out.println(list);

//     }
// }

// import java.util.LinkedList;
// import java.util.Scanner;

// public class Alex {
//     public static void main(String args[]){
//         LinkedList<Integer> list = new LinkedList<Integer>();
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter numbers between 1 to 50, enter 0 for quit");
//         int i = sc.nextInt();
//         while(i != 0){
//             if(1 <= i && i <= 50){
//                 list.add(i);
//             } else {
//                 System.out.println("Wrong input");
//             }
//             i = sc.nextInt();
//         }
//         for(int j=0; j<list.size(); j++){
//             if(list.get(j)>25){
//                 list.remove(j);
//                 j--;
//             }
//         }
//         System.out.println(list);
//     }
// }

// public class Alex {
//     Node head;
//     private int size;

//     class Node {
//         String data;
//         Node next;
//         Node(String data){
//             this.data = data;
//             this.next = null;
//         }
//     }

//     public void addFirst(String data){
//         Node newNode = new Node(data);
//         newNode.next = head;
//         head = newNode;
//         size++;
//     }

//     public void addLast(String data){
//         size++;
//         Node newNode = new Node(data);
//         if(head == null){
//             head = newNode;
//             return;
//         }
//         if(head.next == null){
//             head.next = newNode;
//             return;
//         }
//         Node currNode = head;
//         while(currNode.next != null){
//             currNode = currNode.next;
//         }
//         currNode.next = newNode;
//         return;
//     }
//     public void addAt(int index, String data){
//         if(index>size || index<0){
//             System.out.println("Invalid index");
//             return;
//         }
//         Node newNode = new Node(data);
//         size++;
//         if(head == null || index == 0){
//             newNode.next = head;
//             head = newNode;
//             return;
//         }
//         Node currNode = head;
//         if(head.next == null || index == 1){
//             newNode.next = head.next;
//             head.next = newNode;
//             return;
//         }
//         for(int i=1; i<index; i++){
//             currNode = currNode.next;
//         }
//         newNode.next = currNode.next;
//         currNode.next = newNode;

//     }
//     public void print(){
//         if(head == null){
//             System.out.println("There's nothing to print as list is empty");
//             return;
//         }
//         Node currNode = head;
//         while(currNode != null){
//             System.out.print(currNode.data + " -> ");
//             currNode = currNode.next;
//         }
//         System.out.println("null");

//     }
//     public String get(int index){
//         if(index>=size || index<0){
//             return "Invalid index";
//         }
//         Node currNode = head;
//         for(int i=0; i<index; i++){
//             currNode = currNode.next;
//         }
//         return currNode.data;
//     }
//     public int length(){
//         return size;
//     }
//     public void removeFirst(){
//         if(head == null){
//             System.out.println("The list is empty and there's nothing to remove");
//             return;
//         }
//         size--;
//         head = head.next;
//     }
//     public void removeLast(){
//         if(head == null){
//             System.out.println("The list is empty and there's nothing to remove");
//             return;
//         }
//         size--;
//         Node currNode = head;
//         while(currNode.next.next != null){
//             currNode = currNode.next;
//         }
//         currNode.next = null;
//     }
//     public void removeAt(int index){
//         if(head == null){
//             System.out.println("The list is empty and there's nothing to remove");
//             return;
//         }
//         if(index>=size || index<0){
//             System.out.println("Invalid index");
//             return;
//         }
//         if(index == 0){
//             head = head.next;
//             return;
//         }
//         Node currNode = head;
//         for(int i=1; i<index; i++){
//             currNode = currNode.next;
//         }
//         currNode.next = currNode.next.next;
//         return;
//     }
//     public int index(String data){
//         Node currNode = head;
//         int i = 0;
//         while(currNode != null){
//             if(currNode.data == data){
//                 return i;
//             }
//             currNode = currNode.next;
//             i++;
//         }
//         return -1;

//     }
//     public void reverse(){
//         if(head == null || head.next == null){
//             return;
//         }
//         Node prevNode = head;
//         Node currNode = head.next;
//         while(currNode != null){
//             Node nextNode = currNode.next;
//             currNode.next = prevNode;
//             prevNode = currNode;
//             currNode = nextNode;
//         }
//         head.next = null;
//         head = prevNode;
//     }
//     public Node reverseList(Node head){
//         if(head == null || head.next == null){
//             return head;
//         }
//         Node newHead = reverseList(head.next);
//         head.next.next = head;
//         head.next = null;
//         return newHead;
//     }
//     public void swap(){
//         if(head == null || head.next == null){
//             return;
//         }
//         Node currNode = head;
//         Node nextNode = head.next;
//         while(nextNode.next != null || nextNode != null){
//             currNode.next.next = currNode;
//             currNode.next = nextNode;
//             currNode = nextNode.next;
//             nextNode = currNode.next;
//         }
//         return;
//     }
//     public static void main(String args[]){
//         LinkedList_1_Scratch list = new LinkedList_1_Scratch();
//         list.addLast("Olivia");
//         list.addLast("Jake");
//         list.addLast("Chris");
//         list.addLast("Emma");
//         list.addLast("Anna");
//         list.addLast("Alex");
//         list.swap();
//         list.print();
//     }
// }

// import java.util.Arrays;
// import java.util.Scanner;

// public class Alex {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int num = 0;
//         while(n>0){
//             num = num*10 + n%10;
//             n /= 10;

//         }
//         System.out.println(num);
//     }
// }

// import java.util.Arrays;

// public class Alex {
//     public static int binarySearch(int[] arr, int target){
//         int start = 0;
//         int end = arr.length-1;
//         int mid;
//         while(start<=-+){
//             mid = start + (end-start)/2;
//             if(arr[mid] == target){
//                 return mid;
//             } else if(arr[mid] > target){
//                 end = mid-1;
//             } else{
//                 start = mid+1;
//             }
//         }
//         return -1;
//     }
//     public static int[] search(int[][] arr, int target){
//         if(target < arr[0][0] || target > arr[arr.length-1][arr[arr.length-1].length-1]){
//             return new int[] {-1, -1};
//         }
//         int row = 0, start = 0, end = arr.length-1, mid;
//         int col = 0;
//         while(start<=end){
//             mid = start + (end-start)/2;
//             if(target == arr[mid][col]){
//                 return new int[]{mid, col};
//             } else if(target < arr[mid][col]){
//                 end = mid-1;
//             } else{
//                 start = mid;
//             }
//             if(target > arr[mid][0] && target < arr[mid][arr[mid].length-1]){
//                 row = mid;
//                 break;
//             }
//             if(target > arr[end][0] && target < arr[end][arr[end].length-1]){
//                 row = end;
//                 break;
//             }
//         }
//         col = binarySearch(arr[row], target);
//         if(col != -1){
//             return new int[]{row, col};
//         } else{
//             return new int[] {-1, -1};
//         }
//     }
//     public static int linearSearch(int[] arr, int target){
//         for(int i=0; i<arr.length; i++){
//             if(arr[i] == target){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     public static void main(String[] args){
//         int[] arr1 = {1, 5, 3, 8, 10};
//         int[] arr2 = {2,5,7,9,10,24,34,39,40};
//         System.out.println(binarySearch(arr2, 39));
//         System.out.println(linearSearch(arr1, 15));
//         int[][] arr = {
//             {2,3,5,6,8},
//             {10,12,15,16},
//             {18,19,20,21,22},
//             {24,25,26}
//         };
//         System.out.println(Arrays.toString(search(arr, 20)));
//     }
// }

// import java.util.Arrays;

// public class Alex{
//     public static void main(String args[]){
//         int[][] mat = {
//             {1,2}, {2,3},
//             {3,4}, {4,5},
//         };
//         int[][] tab = {
//             {1,2}, {2,3},
//             {3,4}, {4,5},
//         };
//         System.out.println(Arrays.deepEquals(mat, tab));
//         System.out.println(Math.pow(2,3));
//     }
// }

// import java.util.*;
// public class Alex{
//     public static void main(String[] args){
//         int[] arr = {3, 8, 1, 3, 2, 10, 9, 5};
//         quickSort(arr, 0, arr.length-1);
//         System.out.println(Arrays.toString(arr));
//     }
//     private static int linearSearch(int[] arr, int target){
//         for(int i=0; i<arr.length; i++){
//             if(target == arr[i]){
//                 return i;
//             }
//         }
//         return -1;
//     }
//     private static int binarySearch(int[] arr, int target){
//         int start = 0;
//         int end = arr.length-1;
//         while(start <= end){
//             int mid = start + (end-start)/2;
//             if(arr[mid] == target){
//                 return mid;
//             } else if(arr[mid] > target){
//                 end = mid-1;
//             } else{
//                 start = mid+1;
//             }
//         }
//         return -1;
//     }
//     private static void bubbleSort(int[] arr){
//         int n = arr.length;
//         for(int i=0; i<n; i++){
//             boolean swapped = false;
//             for(int j=0; j<n-i-1; j++){
//                 if(arr[j]>arr[j+1]){
//                     int temp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = temp;
//                     swapped = true;
//                 }
//             }
//             if(!swapped){
//                 break;
//             }
//         }
//     }
//     private static void selectionSort(int[] arr){
//         int n = arr.length;
//         for(int i=0; i<n; i++){
//             int maximum = 0;
//             for(int j=0; j<n-i; j++){
//                 if(arr[maximum] <= arr[j]){
//                     maximum = j;
//                 }
//             }
//             int temp = arr[maximum];
//             arr[maximum] = arr[n-i-1];
//             arr[n-i-1] = temp;
//         }
//     }
//     private static void insertionSort(int[] arr){
//         int n = arr.length;
//         for(int i=0; i<n-1; i++){
//             int j = i+1;
//             while(j>0){
//                 if(arr[j]>arr[j-1]){
//                     break;
//                 }
//                 int temp = arr[j];
//                 arr[j] = arr[j-1];
//                 arr[j-1] = temp;
//                 j--;
//             }
//         }
//     }

//     private static void quickSort(int[] arr, int low, int high) {
//         if (low < high) {
//             int index = partition(low, high, arr);
//             quickSort(arr, low, index);
//             quickSort(arr, index + 1, high);
//         }
//     }

//     private static int partition(int low, int high, int[] arr) {
//         int pivot = arr[low];
//         int i = low - 1;
//         int j = high + 1;

//         while (true) {
//             do {
//                 i++;
//             } while (arr[i] < pivot);

//             do {
//                 j--;
//             } while (arr[j] > pivot);

//             if (i >= j) {
//                 return j;
//             }
//             int temp = arr[i];
//             arr[i] = arr[j];
//             arr[j] = temp;
//         }
//     }
//     public static void conquer(int arr[], int si, int mid, int ei){
//         int merge[] = new int[ei-si+1];
//         int idx1 = si;
//         int idx2 = mid+1;
//         int x = 0;
//         while(idx1<=mid && idx2<=ei){
//             if(arr[idx1]<=arr[idx2]){
//                 merge[x++] = arr[idx1++];
//             } else{
//                 merge[x++] = arr[idx2++];
//             }
//         }
//         while(idx1<=mid){
//             merge[x++] = arr[idx1++];
//         }
//         while(idx2<=ei){
//             merge[x++] = arr[idx2++];
//         }
//         for(int i=0, j=si; i<merge.length; i++, j++){
//             arr[j] = merge[i];
//         }
//     }
//     public static void divide(int arr[], int si, int ei){
//         if(si>=ei){
//             return;
//         }
//         int mid = si + (ei - si)/2;
//         divide(arr, si, mid);
//         divide(arr, mid+1, ei);
//         conquer(arr, si, mid, ei);
//     }
// }
import java.util.*;

public class Alex {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of discs in Tower of Hanoi");
        int n = sc.nextInt();
        towerOfHanoi(n, "Source", "Helper", "Destination");
    }

    private static void towerOfHanoi(int n, String src, String helper, String dest) {
        if (n == 1) {
            System.out.println(n + " From : " + src + " -----> " + dest);
            return;
        }
        towerOfHanoi(n - 1, src, dest, helper);
        System.out.println(n + " From : " + src + " -----> " + dest);
        towerOfHanoi(n - 1, helper, src, dest);
    }
}