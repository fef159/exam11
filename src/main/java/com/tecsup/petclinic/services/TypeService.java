package com.tecsup.petclinic.services;

import java.util.List;

import com.tecsup.petclinic.dtos.TypeDTO;
import com.tecsup.petclinic.entities.Type;
import com.tecsup.petclinic.exceptions.TypeNotFoundException;


public interface TypeService {

	/**
	 * 
	 * @param typeDTO
	 * @return
	 */
	public TypeDTO create(TypeDTO typeDTO);

	/**
	 * 
	 * @param type
	 * @return
	 */
	TypeDTO update(TypeDTO type);

	/**
	 * 
	 * @param id
	 * @throws TypeNotFoundException
	 */
	void delete(Integer id) throws TypeNotFoundException;

	/**
	 * 
	 * @param id
	 * @return
	 */
	TypeDTO findById(Integer id) throws TypeNotFoundException;

	/**
	 * 
	 * @param name
	 * @return
	 */
	List<TypeDTO> findByName(String name);

	/**
	 * 
	 * @param active
	 * @return
	 */
	List<Type> findByActive(Boolean active);

	/**
	 * 
	 * @param sizeCategory
	 * @return
	 */
	List<Type> findBySizeCategory(String sizeCategory);

	/**
	 *
	 * @return
	 */
	List<Type> findAll();
}
