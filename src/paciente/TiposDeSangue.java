package paciente;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 * Representa os tipos de sangue
 * @author samuellucas97
 *         candinhojr
 * @since   01.11.2018
 */
public enum TiposDeSangue {
    A_positivo("A+"),
    A_negativo("A-"),
    B_positivo("B+"), 
    B_negativo("B-"),
    O_positivo("O+"), 
    O_negativo("O-"),
    AB_positivo("AB+"), 
    AB_negativo("AB-");
	
	private String descricao;
	
	TiposDeSangue(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
