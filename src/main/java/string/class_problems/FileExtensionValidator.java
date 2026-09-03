package string.class_problems;

/**
 * Week 2 - Class Problem 3 : File Extension Validator.
 * Accepts an upload only when its extension is pdf, docx or zip (case-insensitive).
 */
public class FileExtensionValidator {

    private static final String[] ACCEPTED = {"pdf", "docx", "zip"};

    /** Returns the acceptance message for the given filename. */
    public static String validateFileExtension(String filename) {
        int dotIndex = filename.lastIndexOf('.');

        if (dotIndex == -1 || dotIndex == filename.length() - 1) {
            return "Rejected - invalid file type";
        }

        String extension = filename.substring(dotIndex + 1);

        for (String allowed : ACCEPTED) {
            if (extension.equalsIgnoreCase(allowed)) {
                return "Accepted";
            }
        }
        return "Rejected - invalid file type";
    }

    public static void main(String[] args) {
        String[] uploads = {"Assignment1.PDF", "notes.txt", "report.docx", "archive.ZIP", "readme"};

        for (String filename : uploads) {
            System.out.println(filename + " -> " + validateFileExtension(filename));
        }
    }
}
