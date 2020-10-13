package br.com.itaumon.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.itaumon.modelo.Usuario;

public interface UsuarioDAO extends CrudRepository<Usuario, Integer>{
	//@Query(nativeQuery = true, value="SELECT * FROM tb_usuario WHERE (funcional= ?1 OR racf= ?2) AND senha_usuario= ?3")
	//Usuario findByUsuario(@Param("racf") String racf, @Param("funcional") String funcional, @Param("senha") String senha);
	//Usuario findByUsuario(String funcional, String racf, String senha);
	
	Usuario findByFuncionalAndSenhaUsuario(String funcional, String senhaUsuario);
	Usuario findByRacfAndSenhaUsuario(String racf, String senhaUsuario);
}
