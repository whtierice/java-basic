package oop1.ex;

public class AccountMain {
    public static void main(String[] args) {
        Account kakao = new Account();

        kakao.deposit(10000);
        kakao.withdraw(9000);
        kakao.withdraw(2000);
    }
}
