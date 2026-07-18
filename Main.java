//code 1//
// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         for(int i=1;i<=num;i++){
//             if(i%2==0){
//                 System.out.println(i+" Even");
//             }
//             else{
//                 System.out.println(i+" Odd");
//             }
//         }
//     }
// }

// //code 2 multiplication table//
// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int num=sc.nextInt();
//         for(int i=1;i<=10;i++){
//             System.out.println(num*i);
//             }
//         }
//     }

// //code 3 prime number in given range//
// import java.util.Scanner;
// public class loops{
//     public static boolean Prime(int n){
//         if(n<=1){
//             return false;
//         }
//         for(int i=2;i*i<=n;i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
    
    
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int start=sc.nextInt();
//         int end=sc.nextInt();
//         for(int i=start;i<=end;i++){
//             if(Prime(i)){
//                 System.out.println(i);
//             }
//         }
//     }
// }

//code 4//
// import java.util.Scanner;
// public class Main{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int num=0;
//         for(int i=1;i<=5;i++){
//             num=sc.nextInt();
//             if(num>27){
//             System.out.println("Too high!");
//         }
//         else if(num<10){
//             System.out.println("Too low!");
//         }
//         else if(num==27){
//             System.out.println("Congratulations! You guessed the number");
//             break;
//         }
//         else{
//             System.out.println("Better luck next time!");
//         }
//         }
//     }
// }

//code 5//
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        for(int i=start;i<=end;i++){
            int temp=i;
            int sum=0;
            while(temp>0){
                int digit=temp%10;
                int fact=1;
                for(int j=1;j<=digit;j++){
                    fact=fact*j;
                }
                sum=sum+fact;
                temp=temp/10;
            }
            if(sum==i){
                    System.out.println(i);
                }
        }
        
    }
}