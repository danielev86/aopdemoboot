package com.danielev86.aopdemoboot.service.impl;

import java.io.IOException;
import java.io.InputStream;

import org.apache.commons.io.IOUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.danielev86.aopdemoboot.provider.bean.ReportPdfDTO;
import com.danielev86.aopdemoboot.service.ReportService;

@Service
public class ReportServiceImpl implements ReportService {
	

	private static final Logger logger = LoggerFactory.getLogger(ReportServiceImpl.class);

	@Override
	public ReportPdfDTO printReport(String fileName) {
		ReportPdfDTO report = new ReportPdfDTO();
		InputStream is = getClass().getResourceAsStream("/" + fileName + ".pdf");
		if (is != null) {
			byte[] content;
			try {
				content = IOUtils.toByteArray(is);
				report.setCode("OK");
				report.setContent(content);
			} catch (IOException e) {
				logger.error("Errore nel recupero del report", e);
				report.setCode("KO_ERRORE_REPORT");
				report.setMessage("Errore nella generazione del report");
			}

		}else {
			logger.error("Errore nel recupero del report");
			report.setCode("KO_ERRORE_REPORT");
			report.setMessage("Errore pdf non presente o vuoto");
		}
		return report;
	}

}
