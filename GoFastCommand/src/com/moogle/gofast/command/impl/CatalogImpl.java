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
import com.moogle.gofast.command.domain.GoFastCat;

public class CatalogImpl extends ImportData{
	public void importData(String filename){
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
			GoFastCat cat = new GoFastCat();
			if (row.getRowNum() != 0) {
			for (Cell cell : row) { 
					int columnIndex=cell.getColumnIndex();
					if(columnIndex==0){
						cat.setGfcaName(cell.getRichStringCellValue()
								.getString());
						
					}else if(columnIndex==1){
						cat.setGfcaDetail(cell.getStringCellValue() );
					} else if(columnIndex==2){
						cat.setGfcaIconName(cell.getStringCellValue() );
					} else if(columnIndex==3){
						cat.setGfcaIconPath(cell.getStringCellValue() );
					} else if(columnIndex==4){
						String s = cell.getStringCellValue();
						if (s != null)
							if (s.trim().length() > 0) {
								cat.setGfcaLevel(Integer.parseInt(s));
							}					
					} else if(columnIndex==5){
						String s = cell.getStringCellValue();
						if (s != null)
							if (s.trim().length() > 0) {
								cat.setGfcaParent(Integer.parseInt(s));
							}
						//cat.(cell.getStringCellValue() );
					} 
				}
			list.add(cat);	
			} 
		} 
	SynDB synDB  = new SynDB();
	synDB.insertCatalog(list);
	}
}
