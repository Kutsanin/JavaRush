package com.javarush.test.level16.lesson10.task02;

/* Отсчет на гонках
1. Разберись, что делает программа.
2. Реализуй логику метода run так, чтобы каждую секунду через пробел
выдавался отсчет начиная с countSeconds до 1, а потом слово [Марш!] (см примеры).
3. Если нить работает 3.5 секунды и более, прерви ее методом interrupt и внутри нити выведи в консоль слово [Прервано!].
Пример для countSeconds=4 : [4 3 2 1 Прервано!]
4. Если нить работает менее 3.5 секунд, она должна завершиться сама.
Пример для countSeconds=3 : [3 2 1 Марш!]
PS: метод sleep выбрасывает InterruptedException.
*/

public class Solution {
    public static volatile int countSeconds = 4;

    public static void main(String[] args) throws InterruptedException {
        RacingClock clock = new RacingClock();
        //add your code here - добавь код тут
        while(!clock.isInterrupted())
        {
            if (clock.insCount >= 3.5)
            {
                clock.interrupt();
                break;
            }
        }
    }

    public static class RacingClock extends Thread {
        float insCount = 0.0f;
        public RacingClock() {
            start();
        }

        public void run() {
            //add your code here - добавь код тут

            try
            {
                while(!isInterrupted())
                {
                    System.out.print(countSeconds+" ");
                    Thread.sleep(500);
                    insCount+=0.5;
                    Thread.sleep(500);
                    insCount+=0.5;
                    countSeconds--;
                    if(countSeconds == 0)
                    {
                        System.out.print("Марш!");
                        insCount=4.0f;
                        break;
                    }

                }
            }
            catch(InterruptedException e)
            {
                System.out.println("Прервано!");
            }
        }
    }
}
