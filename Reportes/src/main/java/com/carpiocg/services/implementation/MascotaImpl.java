package com.carpiocg.services.implementation;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carpiocg.models.entities.Mascotas;
import com.carpiocg.services.MascotaServices;
import com.carpiocg.utils.ReportImpl;

import net.sf.jasperreports.engine.JRException;

@Service
public class MascotaImpl implements MascotaServices {

	//servicios de los reportes
	@Autowired
	private ReportImpl repoGenerator;

	@Override
	public byte[] exportPdf() throws JRException, FileNotFoundException {
		List<Mascotas> nuevaLista = new ArrayList<>();
    	long id = 1;
    	Mascotas animal = new Mascotas(id, "perrito 1 ", new Date(), "prueba");
    	nuevaLista.add(animal);
        return repoGenerator.exportToPdf(nuevaLista);
	}

	@Override
	public byte[] exportXls() throws JRException, FileNotFoundException {
		List<Mascotas> nuevaLista = new ArrayList<>();
    	long id = 1;
    	Mascotas animal = new Mascotas(id, "perrito 1 ", new Date(), "prueba");
    	nuevaLista.add(animal);

        return repoGenerator.exportToXls(nuevaLista);
	}

}
