public class LibraryISBNNormalizerValidator {

    static String normalizeCode(String raw) {
        String trimmed = raw.trim();

        if (trimmed.length() < 3) {
            return trimmed.toUpperCase();
        }

        String pubCode = trimmed.substring(0, 3).toUpperCase();
        String rest = trimmed.substring(3);
        return pubCode + rest;
    }

    static String validateAndFormat(String code) {
        if (code.length() != 13) {
            return "Invalid: code must be exactly 13 characters";
        }

        String pubCode = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7, 13);

        for (int i = 0; i < pubCode.length(); i++) {
            if (!Character.isLetter(pubCode.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        String body = year + catalog;
        for (int i = 0; i < body.length(); i++) {
            if (!Character.isDigit(body.charAt(i))) {
                return "Invalid: year and catalog number must be digits";
            }
        }

        StringBuilder display = new StringBuilder();
        display.append("[").append(pubCode).append("] YEAR: ").append(year)
               .append(" | CATALOG: ").append(catalog);
        return display.toString();
    }

    public static void main(String[] args) {
        String code1 = normalizeCode(" pen2026004251 ");
        System.out.println(validateAndFormat(code1));
        // [PEN] YEAR: 2026 | CATALOG: 004251

        String code2 = normalizeCode("12N2026004251");
        System.out.println(validateAndFormat(code2));
        // Invalid: publisher code must be 3 letters
    }
}
