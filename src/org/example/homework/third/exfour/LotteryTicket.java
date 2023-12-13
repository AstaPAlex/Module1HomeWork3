package org.example.homework.third.exfour;

public class LotteryTicket {
    private static int count;

    public LotteryTicket() {
        count++;
    }

    public int checkLuck() {
        if (count % 100 == 0) {
            return 5_000;
        } else if (count % 10 == 0) {
            return 100;
        } else {
            return 0;
        }
    }
}
