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
import com.moogle.gofast.command.domain.GoFastArea;

public class AreaImpl extends ImportData {

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
			GoFastArea area = new GoFastArea();
			if (row.getRowNum() != 0) {
				for (Cell cell : row) { 
					int columnIndex = cell.getColumnIndex();
					if (columnIndex == 0) {
						area.setGfaName(cell.getRichStringCellValue()
								.getString());

					} else if (columnIndex == 1) {
						area.setGfaDetail(cell.getRichStringCellValue()
								.getString());
					} else if (columnIndex == 2) {
						String s = cell.getStringCellValue();
						if (s != null)
							if (s.trim().length() > 0) {
								area.setGflId(Integer.parseInt(s));
							}

					}
				}
				list.add(area);
			}
		}
		SynDB synDB = new SynDB();
		synDB.insertArea(list);
	}

}
