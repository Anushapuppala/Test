package com.mercury.tours;

public class ReadExcel {
	public static String[][] getData(String fileName,String sheetName)throws Exception
   {
		File file=new File("D:\\selenium_java\\Book2.xlsx");
		FileInputStream ips=new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(ips);
		Sheet sh = wb.getSheet(sheetName);
		int rowNum = sh.getLastRowNum()+1;
		int colNum = sh.getRow(0).getLastCellNum();
		String[][] data = new String[rowNum][colNum];
		
		for(int i=0;i<rowNum;i++)
		{
			org.apache.poi.ss.usermodel.Row row = sh.getRow(i);
			for(int j=0;j<colNum; j++)
			{
				//org.apache.poi.ss.usermodel.Cell test = org.apache.poi.ss.usermodel.Cell;
				org.apache.poi.ss.usermodel.Cell cell=row.getCell(j);
				String value=cellToString(cell);
				value=new DataFormatter().formatCellValue(cell);
				data[i][j]=value;
			}
		}
		return data;
   }
	public static String cellToString(org.apache.poi.ss.usermodel.Cell cell) throws Exception{
		int type;
		Object result;
		type=cell.getCellType();
		{
			switch(type){
			case 0:
				result=cell.getNumericCellValue();
				break;
			case 1:
				result=cell.getStringCellValue();
				break;
				default:
					throw new Exception("cell type not supported");
			}
			return result.toString();
		}
		}
		
	}


