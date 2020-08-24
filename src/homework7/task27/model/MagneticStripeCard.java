package homework7.task27.model;

public class MagneticStripeCard {
    private double amountOfMoney;

    public MagneticStripeCard(double amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public MagneticStripeCard() {
        amountOfMoney = 0;
    }

    public void topUpAccount(double amountOfMoney) {
        System.out.println("Зачислено: " + amountOfMoney);
        this.amountOfMoney += amountOfMoney;
    }

    public void withdraw(double amountOfMoney) {
        makePayment(amountOfMoney, "Успешная транзакция.");
    }

    public void payWithMagneticStripe(double price) {
        makePayment(price, "Успешная оплата c помощью магнитной полосы.");
    }

    public double getAmountOfMoney() {
        return amountOfMoney;
    }

    protected void makePayment(double amountOfMoney, String successfulPaymentMessage) {
        if (this.amountOfMoney - amountOfMoney >= 0) {
            System.out.println(successfulPaymentMessage + " Снято с карты: " + amountOfMoney);
            this.amountOfMoney -= amountOfMoney;
        } else {
            System.out.println("Не хватает денег");
        }
    }

    @Override
    public String toString() {
        return "MagneticStripeCard{" +
                "amountOfMoney=" + amountOfMoney +
                '}';
    }
}
