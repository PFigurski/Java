package Document;

public class DocumentChecker {
    public static void main(String[] args) {
        document excelDocument = new ExcelDocument();
        document pdfDocument = new PdfDocument();

        excelDocument.getDescription();
        pdfDocument.getDescription();
        }
    }
