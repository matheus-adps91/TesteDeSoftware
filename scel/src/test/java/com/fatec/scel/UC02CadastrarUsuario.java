package com.fatec.scel;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

import com.fatec.scel.model.Usuario;

public class UC02CadastrarUsuario {
	
	@Test
	public void CT01CadastrarUsuarioComDadosValidos() {
		try {
			//cenario
			Usuario umUsuario = new Usuario();
			//acao
			umUsuario.setRa("123456");
			umUsuario.setNome("Ana");
		} catch (RuntimeException e) {
			//verificacao
			fail("nao deve falhar");
		}
	}
	
	@Test
	public void CT02CadastrarUsuarioComDadosInvalidos() {
		try {
			//cenario
			Usuario umUsuario = new Usuario();
			//acao
			umUsuario.setRa("");
			umUsuario.setNome("Ana");
		} catch (RuntimeException e) {
			//verificacao
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT03CadastrarUsuarioComDadosInvalidos() {
		try {
			//cenario
			Usuario umUsuario = new Usuario();
			//acao
			umUsuario.setRa(null);
			umUsuario.setNome("Ana");
		} catch (RuntimeException e) {
			//verificacao
			assertEquals("RA invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT04CadastrarUsuarioComDadosInvalidos() {
		try {
			//cenario
			Usuario umUsuario = new Usuario();
			//acao
			umUsuario.setRa("123456");
			umUsuario.setNome("");
		} catch (RuntimeException e) {
			//verificacao
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT05CadastrarUsuarioComDadosInvalidos() {
		try {
			//cenario
			Usuario umUsuario = new Usuario();
			//acao
			umUsuario.setRa("123456");
			umUsuario.setNome(null);
		} catch (RuntimeException e) {
			//verificacao
			assertEquals("Nome invalido", e.getMessage());
		}
	}
	
	@Test
	public void CT08Verifica_obtem_ra() {
		
		//cenario
		Usuario umUsuario = new Usuario();
		try {
			//acao
			umUsuario.setRa("123456");
			umUsuario.setNome("Ana");
		} catch (RuntimeException e) {
			//verificacao
			fail("nao deve falhar");			
		}
		assertEquals("123456", umUsuario.getRa());
	}
	
	@Test
	public void CT09Verifica_obtem_nome() {
		
		//cenario
		Usuario umUsuario = new Usuario();
		try {
			//acao
			umUsuario.setRa("123456");
			umUsuario.setNome("Ana");
		} catch (RuntimeException e) {
			//verificacao
			fail("nao deve falhar");			
		}
		assertEquals("Ana", umUsuario.getNome());
	}
	

}
