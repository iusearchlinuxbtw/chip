package iuse.arch.btw.chip;

import java.util.Random;

public class Chip {

    public static boolean hasCertificate;

    public static void eatChip() {

        Random r = new Random();

        int chance = r.nextInt(100);

        if (chance == 50) {

            BrokenTooth.brokenTooth();

        } else {

            if (!hasCertificate) {
                Crunchy.crunchy();
                acquireCertificate();
                hasCertificate = true;
            } else {
                Crunchy.crunchy();
            }

        }



    }

    public static void acquireCertificate() {

        System.out.println("You have officially acquired the chip badge. You now can commit war crimes without punishment! Go crazy bro");

    }

    public static void main(String[] args) {

        eatChip();

    }

}
