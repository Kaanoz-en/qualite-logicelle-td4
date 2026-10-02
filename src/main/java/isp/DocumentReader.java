package isp;

public class DocumentReader {

    private final Scanner scanner;

    public DocumentReader(Scanner scanner) {
        this.scanner = scanner;
    }

    public void scanDocument() {
        scanner.scanner();
    }
}
