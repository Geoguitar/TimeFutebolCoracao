/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classeJava;

/**
 *
 * @author geoguitar
 */
public class Cls_Mensagem {
    
    private String mensagem;
    
    public String analisarMensagem(String time){
    
        switch(time){
        
            case "América":
                mensagem = "O time da família!";
                break;
                
            case "Atlético":
                mensagem = "Eu acreditoooo!";
                break;
                
            case "Cruzeiro":
                mensagem = "Somos loucos!Somos Cruzeiro!";
                break;
        }
        return mensagem;
    }
    
}
