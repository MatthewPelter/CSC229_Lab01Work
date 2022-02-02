package com.mycompany.csc229_lab1_work;

public class LabWork {

    static int sumOfAllPrime(int n) {
        int sum = 0;
        boolean isPrime = true;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        
        return sum;
    }

    static boolean isPrime(int x) {
        for (int i = 2; i < x; i++) {
            if (x % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    static int sumOfAllPrimeWithThree(int n) {
        int sum = 0;
        boolean isPrime = true;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && hasThree(i)) {
                sum += i;
            }
        }
        
        return sum;
    }
    
    static boolean hasThree(int x) {
        while(x > 0) {
            if (x % 10 == 3) {
                return true;
            }
            x /= 10;
        }
        
        return false;
    }
    
    static int sumOfAllPrimeWithThreeAndFive(int n) {
        int sum = 0;
        boolean isPrime = true;
        for (int i = 2; i <= n; i++) {
            if (isPrime(i) && hasThreeAndFive(i)) {
                sum += i;
            }
        }
        
        return sum;
    }
    
    static boolean hasThreeAndFive(int x) {
        String str = "" + x;
        return str.contains(""+3) && str.contains(""+5);
    }
    
    public static void main(String[] args) {
        System.out.println("The prime sum to 10 is " + sumOfAllPrime(10));
        System.out.println("The prime sum to 25 with a three is " + sumOfAllPrimeWithThree(25));
        System.out.println("The prime sum to 100 with a three and a five is " + sumOfAllPrimeWithThreeAndFive(100));        
    }
}
