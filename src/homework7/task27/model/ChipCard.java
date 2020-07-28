package homework7.task27.model;

public class ChipCard extends MagneticStripeCard{
    public ChipCard(double amountOfMoney) {
        super(amountOfMoney);
    }

    public ChipCard() {
    }

    public void payWithChip(double price){
        makePayment(price, "Успешная оплата с помощью чипа.");
    }

    @Override
    public String toString() {
        return "ChipCard{" +
                "amountOfMoney=" + getAmountOfMoney() +
                "}";
    }
}
