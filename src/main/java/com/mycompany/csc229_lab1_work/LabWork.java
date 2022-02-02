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
    
    public static void main(String[] args) {
        System.out.println("The prime sum to 10 is " + sumOfAllPrime(10));
    }
}
