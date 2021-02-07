package com.danielev86.aopdemoboot.service;

import com.danielev86.aopdemoboot.provider.bean.ReportPdfDTO;

public interface ReportService {

	ReportPdfDTO printReport(String fileName);

}
