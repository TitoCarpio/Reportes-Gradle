package com.carpiocg.services;

import java.io.FileNotFoundException;

import net.sf.jasperreports.engine.JRException;

public interface MascotaServices {
	byte[] exportPdf() throws JRException, FileNotFoundException;
    byte[] exportXls() throws JRException, FileNotFoundException;
}
