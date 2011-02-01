package com.moogle.gofast.command.impl;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import com.moogle.gofast.command.ImportData;
import com.moogle.gofast.command.SynDB;
import com.moogle.gofast.command.domain.GoFastCustomer;

public class CustomerImpl  extends ImportData{

	@Override
	public void importData(String filename) {
		// TODO Auto-generated method stub

		InputStream inp = null;
		try {
			inp = new FileInputStream(filename);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		HSSFWorkbook wb = null;
		try {
			wb = new HSSFWorkbook(new POIFSFileSystem(inp));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Sheet sheet1 = wb.getSheetAt(0); 
		List list = new ArrayList();
		for (Row row : sheet1) { 
			GoFastCustomer cust = new GoFastCustomer();
			if (row.getRowNum() != 0) {
			for (Cell cell : row) { 
					int columnIndex=cell.getColumnIndex();
					if(columnIndex==0){
						cust.setGfcName(cell.getStringCellValue());
						
					}else if(columnIndex==1){
						System.out.println("cell.getStringCellValue()==>"+cell.getStringCellValue());
						cust.setGfcDetail(cell.getStringCellValue() );
					}else if(columnIndex==2){
						String s = cell.getStringCellValue();
						if (s != null)
							if (s.trim().length() > 0) {
								cust.setGfcLat(Double.parseDouble(s));
							}
						
					}else if(columnIndex==3){
						String s = cell.getStringCellValue();
						if (s != null)
							if (s.trim().length() > 0) {
								cust.setGfcLong(Double.parseDouble(s));
							} 
					}else if(columnIndex==4){
						cust.setGfcIconName(cell.getStringCellValue() );
					}else if(columnIndex==5){
						cust.setGfcIconPath(cell.getStringCellValue() );
					}else if(columnIndex==6){
						cust.setGfcPhone(cell.getStringCellValue() );
					}else if(columnIndex==7){
						cust.setGfcEmail(cell.getStringCellValue() );
					}else if(columnIndex==8){
						cust.setGfcStatus(cell.getStringCellValue() );
					} 
				}
			list.add(cust);	
			}
			
		} 
	SynDB synDB  = new SynDB();
	synDB.insertCustomer(list); 
	} 
}
