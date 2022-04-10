package com.example.demo.services;

import java.util.List;

import com.example.demo.model.Pais;



public interface IPaisService {
	List<Pais> listar();
	Pais registrar(Pais pais);
	Pais actualizar(Pais pais);
	void eliminar(Integer codigo);
	Pais ListarPorId(Integer codigo);
}
