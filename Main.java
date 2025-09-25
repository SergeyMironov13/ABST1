public class Main {
    public static void main(String[] args) {
        Logger simpleLogger = new SimpleLogger();
        simpleLogger.log("Программа запущена");

        Logger smartLogger = new SmartLogger();
        smartLogger.log("Всё работает нормально");
        smartLogger.log("Обнаружена ошибка в модуле X");
        smartLogger.log("ERROR: файл не найден");
    }
}
