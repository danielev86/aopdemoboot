package com.danielev86.aopdemoboot.provider.bean;

import java.io.Serializable;

public class ReportPdfDTO implements Serializable {

	private String code;

	private String message;

	private byte[] content;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public byte[] getContent() {
		return content;
	}

	public void setContent(byte[] content) {
		this.content = content;
	}

}
