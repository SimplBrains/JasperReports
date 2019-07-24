package com.test;

import java.util.HashMap;
import java.util.Map;

import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JREmptyDataSource;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;

public class HandlerMain {
	public static void main(String[] args) throws Exception {
		JasperReport jasperReport= JasperCompileManager.compileReport("C:\\abhi\\software\\Jasper Report\\report1.jrxml");
		JRDataSource dataSource = new JREmptyDataSource();
		
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("Name", "Kumar Abhishek");
		parameters.put("employeeID", "1580266");
		
		JasperPrint jasperPrint = JasperFillManager.fillReport(jasperReport, parameters, dataSource);
		JasperExportManager.exportReportToPdfFile(jasperPrint, "C:\\abhi\\software\\Jasper Report\\report1.pdf");
		JasperExportManager.exportReportToHtmlFile(jasperPrint, "C:\\abhi\\software\\Jasper Report\\report1.html");
		
		
	}

}
