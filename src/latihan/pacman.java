
package Praktikumsmt2;


public class pacman {
    private String karakter, camilan, posisi, pagar;
    private int moveUp,moveDown,moveRight,moveLeft;    
    
    public void setPagar(String p){
        pagar = p;
    }
    public String getPagar(){
        return pagar;
    }
    public void setCamilan(String c){
        camilan = c;
    }
    public String getCamilan(){
        return camilan;
    }
    public void setKarakter(String k){
        karakter = k;
    }
    public String getKarakter(){
        return karakter;
    }
    
}
