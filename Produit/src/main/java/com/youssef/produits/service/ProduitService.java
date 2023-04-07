package com.youssef.produits.service;

import java.util.List;

import com.youssef.produits.entities.Produit;
import org.springframework.data.domain.Page;

public interface ProduitService {
	Produit saveProduit(Produit p);
	Produit updateProduit(Produit p);
	void deleteProduit(Produit p);
	 void deleteProduitById(Long id);
	Produit getProduit(Long id);
	List<Produit> getAllProduits();
	Page<Produit> getAllProduitsParPage(int page, int size);



}
