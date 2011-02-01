package com.moogle.gofast.command;

import com.moogle.gofast.command.impl.AreaImpl;
import com.moogle.gofast.command.impl.CatalogImpl;
import com.moogle.gofast.command.impl.CustomerImpl;
import com.moogle.gofast.command.impl.ItemImpl;
import com.moogle.gofast.command.impl.LocationImpl;

public class MAIN {
	public static String[] usage ={"-I [Item]","-CA [Catalog]","-CU [Customer]","-L [Location]","-A [Area]"};
	//Usage
	public static void main(String[] args) {
		ImportData x = null;
		// System.out.println(x.say());
		if(args.length!=2){
			System.out.println("Usage :");
			System.out.println("args[0]");
			for (int i = 0; i < usage.length; i++) {
				System.out.println("	"+usage[i]);
			}
			System.out.println("args[1] = FileName");
			System.exit(0);
		}
		String type= args[0];
		String filename= args[1];
		boolean correctOption=false;
		if(type.trim().equals("-CA")){
			x  =new CatalogImpl();
			correctOption=true;
		}else if(type.trim().equals("-CU")){
			x  =new CustomerImpl();
			correctOption=true;
		}else if(type.trim().equals("-L")){
			x  =new LocationImpl();
			correctOption=true;
		}else if(type.trim().equals("-I")){
			x  =new ItemImpl();
			correctOption=true;
		}else if(type.trim().equals("-A")){
			x  =new AreaImpl();
			correctOption=true;
		}else{
			System.out.println("inCorrect Option");
		}
		if(correctOption)
			x.importData(filename);
		/*
		 * ExcelExtractor extractor = new ExcelExtractor(wb);
		 * 
		 * extractor.setFormulasNotResults(true);
		 * extractor.setIncludeSheetNames(false); String text =
		 * extractor.getText();
		 */
		// System.out.println(text);
	}
}
/*switch (cell.getCellType()) {
case Cell.CELL_TYPE_STRING:
	System.out.println(cell.getRichStringCellValue()
			.getString());
	break;
case Cell.CELL_TYPE_NUMERIC:
	if (DateUtil.isCellDateFormatted(cell)) {
		System.out.println(cell.getDateCellValue());
	} else {
		System.out.println(cell.getNumericCellValue());
	}
	break;
case Cell.CELL_TYPE_BOOLEAN:
	System.out.println(cell.getBooleanCellValue());
	break;
case Cell.CELL_TYPE_FORMULA:
	System.out.println(cell.getCellFormula());
	break;
default:
	System.out.println();
}*/
