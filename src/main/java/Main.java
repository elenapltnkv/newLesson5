public class Main {
    public static void main (String[] args) {
        Sotrudnik[] sotrudniks = {
                new Sotrudnik(
                        "Иванов",
                        "Иван",
                        "Директор",
                        "Ivan@director.ru",
                        "85557551425",
                        50000,
                        25),

                new Sotrudnik(
                        "Петров",
                        "Денис",
                        "Менеджер",
                        "petrov@ya.ru",
                        "72558775525",
                        40000,
                        30),

                new Sotrudnik(
                        "Агутин",
                        "Леонид",
                        "Водитель",
                        "agutin@ya.ru",
                        "72558775526",
                        35000,
                        40),

                new Sotrudnik(
                        "Сидоров",
                        "Никита", "дворник",
                        "sidorov@ya.ru",
                        "72558775528",
                        30000,
                        55),

                new Sotrudnik(
                        "Романова",
                        "Анастасия",
                        "Секретарь",
                        "romanova@ya.ru",
                        "72558775527",
                        30000,
                        20)
        };

        int minAge = 40;
        for (Sotrudnik sotrudnik : sotrudniks)
        {
            if (sotrudnik.age > minAge)
            {
                sotrudnik.printInfo();
                System.out.println();
            }

            }
        }
    }
