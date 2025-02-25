import ru.netologi.javaqa.Freelancer.services.FreelancerRestCalculator;


public class Main {
    public static void main(String[] args) {


        // Пример использования
        int income = 100000; // Доход от работы
        int expenses = 60000; // Обязательные расходы
        int threshold = 150000; // Порог для отдыха

        FreelancerRestCalculator service = new FreelancerRestCalculator();

        int restMonths = service.calculateRestMonths(income, expenses, threshold);
        System.out.println("Количество месяцев отдыха: " + restMonths);
    }



}

