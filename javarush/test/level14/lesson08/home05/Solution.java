package com.javarush.test.level14.lesson08.home05;

/* Computer
1. Создай интерфейс CompItem. ok
2. Добавь в него метод String getName(). ok
3. Создай классы Keyboard, Mouse, Monitor, которые реализуют интерфейс CompItem. ok
4. Метод getName() должен возвращать имя класса, например, для класса Keyboard будет "Keyboard". ok
5. Создай класс Computer. ok
6. В класс Computer добавь приватное поле типа Keyboard. ok
7. В класс Computer добавь приватное поле типа Mouse. ok
8. В класс Computer добавь приватное поле типа Monitor. ok
9. Создай конструктор в классе Computer используя комбинацию клавиш Alt+Insert внутри класса (команда Constructor). ok
10 Внутри конструктора инициализируйте все три поля (переменных) класса ok
11. Создай геттеры для полей класса Computer (в классе используй комбинацию клавиш Alt+Insert и выбери команду Getter).
12. Все созданные классы и интерфейс должны быть в отдельных файлах.
13. Класс Solution менять нельзя.
*/

public class Solution
{

    public static void main(String[] args)
    {
        Computer computer = new Computer();
        if (isWork(computer.getKeyboard()) &&
                isWork(computer.getMonitor()) &&
                isWork(computer.getMouse()))
        {
            System.out.println("Work!");
        }
    }

    public static boolean isWork(CompItem item)
    {
        System.out.println(item.getName());
        return item.getName() != null && item.getName().length() > 4;
    }

}
