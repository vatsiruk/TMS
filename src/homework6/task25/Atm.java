package homework6.task25;

public class Atm {
    private int hundredRublesBills;
    private int fiftyRublesBills;
    private int twentyRublesBills;
    private int moneyQuantity;

    public Atm(int hundredRublesBills, int fiftyRublesBills, int twentyRublesBills) {
        this.hundredRublesBills = hundredRublesBills;
        this.fiftyRublesBills = fiftyRublesBills;
        this.twentyRublesBills = twentyRublesBills;
        calculateMoneyQuantity();
    }

    public void addMoney(int hundredRublesBills, int fiftyRublesBills, int twentyRublesBills) {
        this.hundredRublesBills += hundredRublesBills;
        this.fiftyRublesBills += fiftyRublesBills;
        this.twentyRublesBills += twentyRublesBills;
        calculateMoneyQuantity();
    }

    public boolean isWithdrawMoney(int money) {
        int hundredRublesBills = 0;
        int fiftyRublesBills = 0;
        int twentyRublesBills = 0;

        if (moneyQuantity < money || money % 10 != 0) {
            return false;
        } else {
            for (int i = this.hundredRublesBills; i >= 0; i--) {
                if (money == i * 100) {
                    calculateMoneyQuantity(hundredRublesBills, fiftyRublesBills, twentyRublesBills);
                    printOperationStatus(hundredRublesBills, fiftyRublesBills, twentyRublesBills);

                    return true;
                }

                hundredRublesBills = i;

                if (money > i * 100) {
                    break;
                }
            }
            for (int i = this.fiftyRublesBills; i >= 0; i--) {
                if (money == hundredRublesBills * 100 + i * 50) {
                    calculateMoneyQuantity(hundredRublesBills, fiftyRublesBills, twentyRublesBills);
                    printOperationStatus(hundredRublesBills, fiftyRublesBills, twentyRublesBills);

                    return true;
                }

                fiftyRublesBills = i;

                if (money > hundredRublesBills * 100 + i * 50) {
                    break;
                }
            }
            for (int i = this.twentyRublesBills; i > 0; i--) {
                if (money == hundredRublesBills * 100 + fiftyRublesBills * 50 + i * 20) {
                    twentyRublesBills = i;

                    calculateMoneyQuantity(hundredRublesBills, fiftyRublesBills, twentyRublesBills);
                    printOperationStatus(hundredRublesBills, fiftyRublesBills, twentyRublesBills);

                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Atm{" +
                "hundredRublesBills=" + hundredRublesBills +
                ", fiftyRublesBills=" + fiftyRublesBills +
                ", twentyRublesBills=" + twentyRublesBills +
                ", moneyQuantity=" + moneyQuantity +
                '}';
    }

    private void printOperationStatus(int hundredRublesBills, int fiftyRublesBills, int twentyRublesBills) {
        System.out.println("Выдано 100р купюр: " + hundredRublesBills
                + ", 50р купюр: " + fiftyRublesBills
                + ", 20р купюр: " + twentyRublesBills);
    }

    private void calculateMoneyQuantity(int hundredRublesBills, int fiftyRublesBills, int twentyRublesBills) {
        this.hundredRublesBills -= hundredRublesBills;
        this.fiftyRublesBills -= fiftyRublesBills;
        this.twentyRublesBills -= twentyRublesBills;
        calculateMoneyQuantity();
    }

    private void calculateMoneyQuantity() {
        moneyQuantity = hundredRublesBills * 100 + fiftyRublesBills * 50 + twentyRublesBills * 20;
    }
}