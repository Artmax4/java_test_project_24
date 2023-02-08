package students.student_maksim_turcin.lesson_15_homeworks.level_2;

public class Transaction {
    private Trader trader;
    private int amount;
    public Transaction(Trader trader, int amount){
        this.trader = trader;
        this.amount = amount;
    }

    public Trader getTrader() {
        return this.trader;
    }

    public int getAmount() {
        return this.amount;
    }
}
