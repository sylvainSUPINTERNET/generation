package com.example.cddd;

import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.cddd.services.ExcelService;

@SpringBootApplication
public class CdddApplication implements CommandLineRunner {

	@Autowired
	ExcelService excelService;
	
	public static void main(String[] args) {
		SpringApplication.run(CdddApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		FileOutputStream excelFile = this.excelService.writeExcelClean();
	}


}
