/**
 * Kelas ini merepresentasikan mesin ATM yang memungkinkan pengguna untuk melakukan
 * transaksi perbankan seperti penarikan dan pengecekan saldo.
 */
 class ATM {
    private Account account;

    /**
     * Konstruktor untuk membuat objek ATM dengan akun yang ditentukan.
     *
     * @param account Akun yang akan digunakan untuk transaksi.
     */
    public ATM(Account account) {
        this.account = account;
        //ara
    }

    /**
     * Metode untuk menarik uang dari akun.
     *
     * @param amount Jumlah uang yang ingin ditarik.
     * @return true jika penarikan berhasil, false jika gagal.
     */
    public boolean withdraw(double amount) {
        return account.withdraw(amount);
    }

    /**
     * Metode untuk mengecek saldo akun.
     *
     * @return Saldo saat ini dari akun.
     */
    public double checkBalance() {
        return account.getBalance();
    }
}
/**
 * Kelas ini merepresentasikan akun bank yang memiliki saldo dan memungkinkan
 * transaksi penarikan.
 */
 class Account {
    private double balance;

    /**
     * Konstruktor untuk membuat akun dengan saldo awal.
     *
     * @param initialBalance Saldo awal akun.
     */
    public Account(double initialBalance) {
        this.balance = initialBalance;
    }

    /**
     * Metode untuk menarik uang dari akun.
     *
     * @param amount Jumlah uang yang ingin ditarik.
     * @return true jika penarikan berhasil, false jika saldo tidak mencukupi.
     */
    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    /**
     * Metode untuk mendapatkan saldo saat ini dari akun.
     *
     * @return Saldo saat ini.
     */
    public double getBalance() {
        return balance;
    }
}
/**
 * Kelas ini merepresentasikan transaksi yang dilakukan pada mesin ATM.
 */
 class Transaction {
    private double amount;
    private String type; // "withdrawal" atau "deposit"

    /**
     * Konstruktor untuk membuat objek transaksi.
     *
     * @param amount Jumlah uang yang terlibat dalam transaksi.
     * @param type Tipe transaksi (withdrawal atau deposit).
     */
    public Transaction(double amount, String type) {
        this.amount = amount;
        this.type = type;
    }

    /**
     * Metode untuk mendapatkan jumlah uang yang terlibat dalam transaksi.
     *
     * @return Jumlah uang.
     */
    public double getAmount() {
        return amount;
    }

    /**
     * Metode untuk mendapatkan tipe transaksi.
     *
     * @return Tipe transaksi.
     */
    public String getType() {
        return type;
    }
}