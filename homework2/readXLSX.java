import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class readXLSX {
    public  void readXlsx(String []sid,String []url) throws IOException {
        File file=new File("/Users/tashou/Desktop/Selenium+Lab2020.xlsx");
        InputStream is=new FileInputStream(file);
        XSSFWorkbook xssfWorkook=new XSSFWorkbook(is);
        for(int numSheet = 0; numSheet < xssfWorkook.getNumberOfSheets(); numSheet++){
            XSSFSheet xssfSheet = xssfWorkook.getSheetAt(numSheet);
            if (xssfSheet == null) {
                continue;
            }
            // 获取当前工作薄的每一行
            for (int rowNum = 0; rowNum < 20; rowNum++) {
                XSSFRow xssfRow = xssfSheet.getRow(rowNum);
                if (xssfRow != null) {
                    XSSFCell one = xssfRow.getCell(1);
                    //读取第一列数据
                    XSSFCell two = xssfRow.getCell(2);
                    //读取第二列数据
                    sid[rowNum]=getValue(one);
                    url[rowNum]=getValue(two);
                    //System.out.println(rowNum);
                }
            }
        }
    }
    private  String getValue(XSSFCell xssfRow) {

        if (xssfRow.getCellType() == xssfRow.CELL_TYPE_BOOLEAN) {
            return String.valueOf(xssfRow.getBooleanCellValue());
        } else if (xssfRow.getCellType() == xssfRow.CELL_TYPE_NUMERIC) {
            return String.valueOf(xssfRow.getNumericCellValue());
        } else {
            return String.valueOf(xssfRow.getStringCellValue());
        }
    }
}
