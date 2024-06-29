class Spreadsheet {
    // Method to add a row to the spreadsheet
    void addRow(int a) {
        System.out.println(a + " row has been added.");
    }

    // Method to add a column to the spreadsheet
    void addColumn(int b) {
        System.out.println(b + " column has been added.");
    }
}

class MsExcel extends Spreadsheet {
    // Additional attribute specific to MsExcel class
    String fileType;

    @Override
    // Overridden method to add a row in MsExcel
    void addRow(int a) {
        System.out.println(a + " row has been added.");
    }

    @Override
    // Overridden method to add a column in MsExcel
    void addColumn(int b) {
        System.out.println(b + " column has been added.");
    }
}

public class OOPPolymorphism {
    public static void main(String[] args) {
        // Creating an instance of Spreadsheet class
        Spreadsheet s1 = new Spreadsheet();
        // Calling method to add row and column
        s1.addRow(10);
        s1.addColumn(20);

        // Creating an instance of MsExcel class using superclass reference
        Spreadsheet s2 = new MsExcel();
        // Calling overridden method to add row  and column in MsExcel
        s2.addRow(100);
        s2.addColumn(200);
    }
}