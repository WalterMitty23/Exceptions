public class Validator {
    public static void checkValidator(String login, String password, String confirmPassword) {
        String allowedChars = "qwertyuiopasdfghjklzxcvbnmQWERTYUIOPASDFGHJKLZXCVBNM0123456789_";


        if (login.length() > 20 || !login.matches("[" + allowedChars + "]+")) {
            throw new WrongLoginException("Неверный логин");
        }

        if (password.length() > 20 || !password.matches("[" + allowedChars + "]+")) {
            throw new WrongPasswordException("Неверный пароль");
        }

        if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароль и подтверждение пароля не совпадают");
        }

        System.out.println("Проверка прошла успешно");


    }
}