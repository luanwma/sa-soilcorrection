/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Acesso;

import Model.UsuariosCadastrados;

/**
 *
 * @author Luan
 */
public class Verificar {
    
  
   // UsuariosCadadastrados user2 = new UsuariosCadadastrados();
    public boolean verificarCredenciais(String nome, String senha){
        UsuariosCadastrados user = new UsuariosCadastrados();
        
        if(nome.equals(user.getNome())  && senha.equals(user.getSenha())){
            return true;
        }else return false;
        
    }

    
    
}
