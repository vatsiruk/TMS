package homework7.task27;

import homework7.task27.model.ChipCard;
import homework7.task27.model.ContactlessCard;
import homework7.task27.model.MagneticStripeCard;

public class Runner {
    public static void main(String[] args) {
        MagneticStripeCard magneticStripeCard = new MagneticStripeCard();
        magneticStripeCard.topUpAccount(500);
        magneticStripeCard.withdraw(300);
        magneticStripeCard.payWithMagneticStripe(150);
        magneticStripeCard.payWithMagneticStripe(60);
        System.out.println(magneticStripeCard +
                "\n*******************************************************************");

        ChipCard chipCard = new ChipCard(7000);
        chipCard.payWithChip(3000);
        chipCard.payWithMagneticStripe(4000);
        System.out.println(chipCard +
                "\n*******************************************************************");

        ContactlessCard contactlessCard = new ContactlessCard(10000);
        contactlessCard.payWithContactlessCard(9900);
        contactlessCard.payWithChip(10);
        contactlessCard.payWithMagneticStripe(50);
        System.out.println(contactlessCard);

    }
}
