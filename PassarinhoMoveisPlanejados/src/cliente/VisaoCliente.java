package cliente;

import java.util.ArrayList;
import java.util.Scanner;

public class VisaoCliente {
    
    public Cliente leDoTeclado(){
        Scanner scanner = new Scanner(System.in);
        Cliente cliente = new Cliente();
        System.out.println("Nome:");
        cliente.setNome(scanner.nextLine());
        System.out.println("Endereço");
        cliente.setEndereco(scanner.nextLine());
        System.out.println("Nascimento");
        cliente.setNascimento(scanner.nextLine());
        return cliente;
             
    }    
    
    public void mostrarClientes(ArrayList<Cliente> lista){
        System.out.println("+++ LISTAGEM DE CLIENTES +++");
        System.out.println("----------------------------");       
        for (int i = 0; i < lista.size(); i++) {
            Cliente cli = lista.get(i);
            System.out.println(cli.getNome());
            System.out.println(cli.getEndereco());
            System.out.println(cli.getNascimento());
        System.out.println("----------------------------");   
        }
    }
}
