package day31CustomClassConstuctor;

import java.util.ArrayList;
import java.util.Arrays;

public class MyOffers {

    public static void main(String[] args) {

        Offer offer1 = new Offer();
        offer1.setInfo("VA", "Amazon Inc", "SDET", 110000, true, true, true, true);

        Offer offer2 = new Offer();
        offer2.setInfo("CA", "Sony Inc", "QA", 120000, true, false, false, true);

        Offer offer3 = new Offer();
        offer3.setInfo("FL", "Apple Inc", "QE", 125000, true, true, true, false);

        Offer offer4 = new Offer();
        offer4.setInfo("TX", "CapitalOne", "SM", 115000, false, false, true, true);

        Offer offer5 = new Offer();
        offer5.setInfo("WA", "Bank Of America", "BA", 130000, true, true, false, true);

        Offer offer6 = new Offer();
        offer6.setInfo("TX", "NASA", "SM", 120000, false, false, true, true);

        Offer offer7 = new Offer();
        offer7.setInfo("CA", "Bank Of United", "QA", 130000, true, true, false, true);

        Offer[] myOffers = {offer1, offer2, offer3, offer4, offer5, offer6, offer7};

        ArrayList<Offer> fullTimeOffers = new ArrayList<>(Arrays.asList(myOffers));

        fullTimeOffers.removeIf(p -> !p.isFullTime); // remove all except Full Time offers

        System.out.println(fullTimeOffers.size());

        ArrayList<Offer> localOffers = new ArrayList<>(Arrays.asList(myOffers));

        localOffers.removeIf(p -> !p.location.equals("CA")); // remove all except CA

        System.out.println(localOffers.size());

         ArrayList<Offer> offersWithBenefits = new ArrayList<>(Arrays.asList(myOffers));

        offersWithBenefits.removeIf(p -> !(p.hasPTO && p.hasBenefit));

        ArrayList<Offer> sdetOffers = new ArrayList<>(Arrays.asList(myOffers));

        sdetOffers.removeIf(p -> !p.jobTitle.equals("SDET")); //remove all the offers that are not for SDET

        ArrayList<Offer> offersWith100K = new ArrayList<>(Arrays.asList(myOffers));

        offersWith100K.removeIf(p -> p.salary < 100_000);


    }
}
