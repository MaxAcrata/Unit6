// Создаем пакет где : 1) <groupId>ru.netology.javaqa` 2) <artifactId>Freelancer 3) название "Может быть любое"
package ru.netologi.javaqa.Freelancer.services;

public class FreelancerRestCalculator {

    public int calculateRestMonths(int income, int expenses, int threshold) {
        int money = 0; // Начальное количество денег
        int restMonths = 0; // Количество месяцев отдыха

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                // Если денег достаточно для отдыха
                money -= expenses; // Сначала тратим на обязательные расходы
                money /= 3; // Затем остаток уменьшается в три раза (траты на отдых)
                restMonths++; // Увеличиваем счетчик месяцев отдыха
            } else {
                // Иначе работаем
                money += income; // Зарабатываем деньги
                money -= expenses; // Тратим на обязательные расходы
            }
        }

        return restMonths; // Возвращаем количество месяцев отдыха
    }
}