package com.csuft.wxl.hutool;

import java.io.File;
import java.nio.charset.Charset;
import java.util.List;

import cn.hutool.core.text.csv.CsvData;
import cn.hutool.core.text.csv.CsvReader;
import cn.hutool.core.text.csv.CsvRow;
import cn.hutool.core.text.csv.CsvUtil;

public class TestCSV {
	public static void main(String[] args) {
		CsvReader reader = CsvUtil.getReader();
		String Filestr = "C:\\Users\\Administrator\\Desktop\\练习\\persion.csv";

		CsvData data = reader.read(new File(Filestr), Charset.forName("UTF-8"));
		List<CsvRow> rows = data.getRows();
		int i = 1;
		for (CsvRow csvData : rows) {
			if (i == 1) {
				i++;
				continue;
			}
			System.out.println(csvData.getRawList());

		}
	}

}
