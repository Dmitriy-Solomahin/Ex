package Dz3.Ex1;

public class PasswordVerifier {
    /*
     * Задача 1:
     * Проверка пароля (Основы языка Java, операторы, ветвления)
     * 
     * Создайте класс PasswordVerifier. Этот класс должен содержать метод, который
     * принимает строку пароля и проверяет его на соответствие следующим правилам:
     * Пароль должен быть не менее 8 символов.
     * Пароль должен содержать хотя бы одну цифру.
     * Пароль должен содержать хотя бы одну заглавную букву.
     * Метод должен выбрасывать исключение, если пароль не соответствует какому-либо
     * из этих правил.
     */

    public void gettingPassword(String password) throws PasswodException {
        if (password.length() < 8)
            throw new PasswodException("Пароль недостаточно длинный");

        boolean numInPassword = false;
        boolean BigCharInPassword = false;
        for (int i = 0; i < password.length(); i++) {
            if (Character.isDigit(password.charAt(i))) {
                numInPassword = true;
            }
            if (!Character.isLowerCase(password.charAt(i))) {
                BigCharInPassword = true;
            }
        }
        if (numInPassword == false)
            throw new PasswodException("Пароль должен содержать хотябы одну цыфру");
        if (BigCharInPassword == false)
            throw new PasswodException("Пароль должен содержать хотябы одну заглавную букву");
    }
}
