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
import com.moogle.gofast.command.domain.GoFastItem;

public class ItemImpl  extends ImportData{

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
			GoFastItem item = new GoFastItem();
			if (row.getRowNum() != 0) {
			for (Cell cell : row) { 
					int columnIndex=cell.getColumnIndex();
					if(columnIndex==0){
						item.setGfiName(cell.getStringCellValue());
						
					}else if(columnIndex==1){
						item.setGfiDetail(cell.getStringCellValue() );
					}else if(columnIndex==2){
						item.setGfiDiscount(cell.getStringCellValue() );
					}else if(columnIndex==3){
						item.setGfiStatus(cell.getStringCellValue() );
					}else if(columnIndex==4){
						 String s =cell.getStringCellValue() ;
						 if(s!=null)
						 if(s.trim().length()>0){
							 item.setGfcId(Integer.parseInt(s));
						 } 
					}else if(columnIndex==5){
						 String s =cell.getStringCellValue() ;
						 if(s!=null)
						 if(s.trim().length()>0){
							 item.setGfcaId(Integer.parseInt(s));
						 }
					}else if(columnIndex==6){
						 String s =cell.getStringCellValue() ;
						 if(s!=null)
						 if(s.trim().length()>0){
							 item.setGfaId(Integer.parseInt(s));
						 } 
					} 
				}
			list.add(item);	
			} 
		} 
	SynDB synDB  = new SynDB();
	synDB.insertItem(list);
	
	}

}
