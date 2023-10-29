public class Main {
    public static void main(String[] args) {
        try {
            Validator.checkValidator("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
            Validator.checkValidator("java_skypro_go", "D_1hWiKjjP_9!", "D_1hWiKjjP_9!");
            //Validator.checkValidator("java_skypro_go", "D_1hWiKjjP_9", "D_1hWiKjjP_9!");
            //Validator.checkValidator("java_skypro_go!", "D_1hWiKjjP_9", "D_1hWiKjjP_9");
        } catch (WrongLoginException error) {
            System.err.println("Ошибка в логине: " + error.getMessage());
        } catch (WrongPasswordException error) {
            System.err.println("Ошибка в пароле: " + error.getMessage());
        }

    }
}