public class CountEvenAndOddDigits {
    public static void main(String[] args) {
        int num = 1234678;

        int even_count=0;
        int odd_count=0;
        while(num>0){    //1234    123
            int rem_num = num%10;  //4 remainder is 4
            if(rem_num%2==0){    //
                even_count++;  // if it is even it increases
            }
            else {
                odd_count++;  //if it is odd it increases
            }
            num=num/10;
        }
        System.out.println("number of even numbers:" + even_count);
        System.out.println("number of even numbers:" + odd_count);
    }

}
