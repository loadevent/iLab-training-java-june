package Chapter7;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.*;

public class ReadAndWriteToExcel {
    public static void main(String[] args) {

        //readFromExcel();
        writeToExcel();
    }
    static void addRow(XSSFSheet sheet, int rowNum, String city, double population){
        XSSFRow row = sheet.createRow(rowNum);
        row.createCell(0).setCellValue(city);
        row.createCell(1).setCellValue(population);
    }

    static void writeToExcel(){

        try {
            String filePath = "C:\\Users\\Kabelo Tlhape\\Videos\\Cities.xlsx";
            //Create an instance of OutputStream
            OutputStream outStream = new FileOutputStream(filePath);
            //Create a workbook
            XSSFWorkbook wb = new XSSFWorkbook();
            XSSFSheet sheet = wb.createSheet("GP Cities");
            //Create header row
            XSSFRow header = sheet.createRow(0);
            header.createCell(0).setCellValue("City");
            header.createCell(1).setCellValue("Population");
            //create row 2
            addRow(sheet,1,"Pretoria",90000);
            //create row 3
            addRow(sheet,2,"Midrand",150000);
            //create row 4
            addRow(sheet,3,"Centurion",168000);
            addRow(sheet,4,"Kemptonpark",125000);
            //Now write to the workbook
            wb.write(outStream);
            outStream.close();
            wb.close();

        } catch (IOException e) {
            System.out.println("Could not write to file.");;
        }
    }

    static void readFromExcel(){

        try {
            String filePath = "C:\\Users\\Kabelo Tlhape\\Videos\\Provinces.xlsx";
            File myFile = new File(filePath);
            FileInputStream inputStream = new FileInputStream(myFile);
            //create a workbook instance
            XSSFWorkbook wb = new XSSFWorkbook(inputStream);
            //Create a spreadsheet object
            XSSFSheet sheet = wb.getSheetAt(0);

            for (Row myRow : sheet){
                for (Cell myCell : myRow){
                    if (myCell.getCellTypeEnum() == CellType.STRING){
                        System.out.print(myCell.getStringCellValue() + "\t\t");
                    }else if(myCell.getCellTypeEnum() == CellType.NUMERIC){
                        System.out.print(myCell.getNumericCellValue() + "\t\t");
                    }else{
                        throw new IllegalStateException("Unexpected Type: " + myCell.getCellTypeEnum());
                    }
                }
                System.out.println();
            }
            inputStream.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Could not read from file");
        }

    }
}
