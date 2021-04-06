package com.learnauto.com.learnauto.utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.commons.collections4.bag.SynchronizedSortedBag;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelDataProvider {

    XSSFWorkbook wb;

    public ExcelDataProvider() {

        File src = new File("C:\\Users\\ndeore\\Desktop\\Cummins\\Automation\\AutoCode\\Framework\\TestData\\Data.xlsx");

        try {
            FileInputStream fis = new FileInputStream(src);
            wb = new XSSFWorkbook(fis);
        } catch (Exception e) {
            System.out.println("Unable to read Excel file" + e.getMessage());
        }
    }

    public String getStringData(String sheetName, int row, int column) {

        final XSSFSheet sheet = wb.getSheet(sheetName);
        if (sheet != null) {
            XSSFRow rows = sheet.getRow(row);
            if (rows != null) {
                XSSFCell sheetColumn = rows.getCell(column);
                if (sheetColumn != null) {
                    return sheetColumn.getStringCellValue();

                }
            }
        }
        return null;

    }

    public String getStringData(int sheetIndex, int row, int column) {
        return wb.getSheetAt(sheetIndex).getRow(row).getCell(column).getStringCellValue();

    }

    public double getNumericData(String sheetName, int row, int column) {
        return wb.getSheet(sheetName).getRow(row).getCell(column).getNumericCellValue();
    }
}
