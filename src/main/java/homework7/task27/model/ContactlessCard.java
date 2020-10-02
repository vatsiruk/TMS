package homework7.task27.model;

public class ContactlessCard extends ChipCard {
    public ContactlessCard(double amountOfMoney) {
        super(amountOfMoney);
    }

    public ContactlessCard() {
    }

    public void payWithContactlessCard(double price) {
        makePayment(price, "Успешная бесконтактная оплата.");
    }

    @Override
    public String toString() {
        return "ContactlessCard{" +
                "amountOfMoney=" + getAmountOfMoney() +
                "}";
    }
}
