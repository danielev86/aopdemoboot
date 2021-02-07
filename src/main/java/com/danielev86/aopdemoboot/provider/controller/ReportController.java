package com.danielev86.aopdemoboot.provider.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.danielev86.aopdemoboot.provider.bean.ReportPdfDTO;
import com.danielev86.aopdemoboot.service.ReportService;

@Controller
@RequestMapping(value = "/report")
public class ReportController {
	
	@Autowired
	private ReportService reportService;
	
	@RequestMapping(value = "/{fileName}/printReport", method = RequestMethod.GET)
	public ResponseEntity<?> printReport(@PathVariable("fileName") String fileName) {
		ReportPdfDTO report = reportService.printReport(fileName);
		if("OK".equals(report.getCode())) {
		    HttpHeaders headers = new HttpHeaders();
		    // Here you have to set the actual filename of your pdf
		    //String filename = "output.pdf";
		    //headers.setContentDispositionFormData(filename, filename);
		    headers.setContentLength(report.getContent().length);
		    headers.setContentType(MediaType.APPLICATION_PDF);
		    ResponseEntity<byte[]> response = new ResponseEntity<>(report.getContent(), headers, HttpStatus.OK);
		    return response;
		}else {
			HttpHeaders headers = new HttpHeaders();
			headers.setContentType(MediaType.APPLICATION_JSON);
			ResponseEntity<ReportPdfDTO> responseEntityKO = new ResponseEntity<ReportPdfDTO>(report, headers, HttpStatus.INTERNAL_SERVER_ERROR);
			return responseEntityKO;
		}
	}

}
