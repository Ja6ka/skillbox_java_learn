public class Printer {
    private String queue = "";
    private int pagesCount = 0;
    private int documentsCount = 0;
    private int documentsPrinted = 0;
    private int pagesPrinted = 0;


    public void append(String text) {
        queue = queue + System.lineSeparator() + System.lineSeparator() + text;
        documentsCount++;
        pagesCount++;
    }

    public void append(String text, String name) {
        queue = queue + System.lineSeparator() + System.lineSeparator() +
                name + System.lineSeparator() + text;
        documentsCount++;
        pagesCount++;
    }

    public void append(String text, String name, int pages) {
        append(text, name);
        pagesCount = pagesCount + pages - 1;
    }

    public void print() {
        System.out.println(queue);
        documentsPrinted += documentsCount;
        pagesPrinted += pagesCount;
        clear();
    }

    public void printCount() {
        System.out.println("Распечатано документов: " + documentsPrinted + System.lineSeparator() +
                "Распечатано страниц: " + pagesPrinted);
    }

    public void clear() {
        queue = "";
        pagesCount = 0;
        documentsCount = 0;
    }
}
