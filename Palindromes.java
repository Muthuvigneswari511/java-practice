class Palindromes{
    public static void main(String[] args){
        int num = 121;
        int org = num;
        int reverse = 0, remainder;

        while(num > 0){
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }

        if(org == reverse){
            System.out.println("palindrome number");
        }
        else{
            System.out.println("not palindrome number");
        }
    }
}