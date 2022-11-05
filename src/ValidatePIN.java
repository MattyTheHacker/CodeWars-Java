public class ValidatePIN {
    public static boolean validatePin(String pin) {
        return pin.matches("\\d{4}") || pin.matches("\\d{6}");
    }
}