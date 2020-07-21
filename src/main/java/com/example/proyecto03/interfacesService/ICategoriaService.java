package com.example.proyecto03.interfacesService;

import java.util.List;
import java.util.Optional;

import com.example.proyecto03.modelo.Categoria;
public interface ICategoriaService {


	public List<Categoria>listar();
	public Optional<Categoria>listarId(int id);
	public int save(Categoria c);
	public void delete(int idcategoria);

}



