package Bai1;

public class Main {
    public static void main(String[] args) {
        Account acc1 = Account.getInstance(1, "Hoàng", 19);
        acc1.displayInfo();

        Account acc2 = Account.getInstance(2, "Trang", 20);
        acc2.displayInfo();

        System.out.println(acc1 == acc2);
    }
}
