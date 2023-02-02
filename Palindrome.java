public class Palindrome {
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }

        if(x<10 && x>=0){
            return true;
        }


        String num = String.valueOf(x);

        int lastIndex = num.length();


        for(int i =1; i<lastIndex; i++){
            if(num.charAt(i-1)!=num.charAt(lastIndex-i)){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args){
        int firstInput = 121;
        int secondInput = -121;
        int thirdInput = 10;

        System.out.println("Is 121 a palindrome? "+isPalindrome(firstInput));
        System.out.println("Is -121 a palindrome? "+isPalindrome(secondInput));
        System.out.println("Is 10 a palindrome? "+isPalindrome(thirdInput));
    }
}
