package ru.netology.sqr;

public class SQRService {
    public int calculateSQR(int lowLimit, int upLimit) {//А это чтобы я понял и запомнил!!!
        int count = 0; //счёт если входит в лимиты
        for (int i = 10; i <= 99; i++) {
            int sqr = i * i;
            if (lowLimit <= sqr && sqr <= upLimit) { //справа=слева=true (&&) как в циклах на лекции
                count = count + 1; //равнозначно i++
            }
        }
        return count;
    }
}