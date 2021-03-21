class Account {
    int acc_No;
    int acc_Bal;
    String acc_Name;

    void insert(int num, int bal, String name) {
        acc_No = num;
        acc_Bal = bal;
        acc_Name = name;
    }

    void deposit(int extra) {
        acc_Bal = acc_Bal + extra;
        System.out.println(extra + " deposited");
    }

    void withdrawl(int witAmt) {
        if (acc_Bal < witAmt)
            System.out.println("Insufficient Balance");
        else {
            acc_Bal = acc_Bal - witAmt;
            System.out.println("Balance remaining : " + acc_Bal);
        }
    }

    void checkBal(int acc_No) {
        System.out.println("Your Balance : " + acc_Bal);
    }

    void accDetails() {
        System.out.println("Account Number : " + acc_No);
        System.out.println("Account Balance : " + acc_Bal);
        System.out.println("Account holder's name : " + acc_Name);
    }

}

class TestAccount {
    public static void main(String[] args) {
        Account a = new Account();
        a.insert(01, 50000, "Harsh");
        a.deposit(5000);
        a.withdrawl(1);
        a.checkBal(01);
        a.accDetails();

    }

}