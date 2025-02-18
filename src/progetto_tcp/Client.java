/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package progetto_tcp;
import java.net.ServerSocket;
import java.net.Socket;
/**
 *
 * @author Riccardo
 */
public class Client {
    private String nome;
    private String colore;
    private Socket socket;

    public Client(String nome) {
        this.nome = nome;
    }

    public Client(String nome, String colore) {
        this.nome = nome;
        this.colore = colore;
    }

    public int connetti(String nomeServer, int portaServer) {

    }

    public void scrivi(String messaggio) {

    }

    public void leggi() {

    }

    public void chiudi() {

    }
}
