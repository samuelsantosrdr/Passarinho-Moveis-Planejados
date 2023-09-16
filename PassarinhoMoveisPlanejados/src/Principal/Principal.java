package Principal;

import Móvel.AcessaArquivoCama;
import Móvel.AcessaArquivoGuardaRoupa;
import Móvel.Cama;
import Móvel.GuardaRoupa;
import Móvel.VisaoCama;
import Móvel.VisaoGuardaRoupa;
import cliente.VisaoCliente;
import java.util.Scanner;
import cliente.AcessaArquivoCliente;
import cliente.Cliente;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;

public class Principal {

    public static void main(String[] args) throws Exception{
       int opcao;
        VisaoCliente visaoCliente = new VisaoCliente();
        AcessaArquivoCliente arquivoCliente = new AcessaArquivoCliente();
        VisaoGuardaRoupa vgp = new VisaoGuardaRoupa();
        AcessaArquivoGuardaRoupa aavgp = new AcessaArquivoGuardaRoupa();
        VisaoCama vc = new VisaoCama();
        AcessaArquivoCama aac = new AcessaArquivoCama();
        
        do {
          opcao = Principal.menu();  
          if(opcao == 1){
              Cliente cli = visaoCliente.leDoTeclado();
              arquivoCliente.gravaCliente(cli);
              System.out.println("Gravado");
          } else if(opcao == 2){
              ArrayList<Cliente> lista = arquivoCliente.listaDeClientes();
              visaoCliente.mostrarClientes(lista);
          } else if(opcao == 0){
              System.out.println("Vazando...");
          } else if(opcao == 3){
              GuardaRoupa gp = vgp.leDoTeclado();
              aavgp.gravaGuardaRoupa(gp);
              
          } else if(opcao == 4){
              ArrayList<GuardaRoupa> lista = aavgp.ListaDeGuardaRoupas();
              vgp.mostrarGuardaRoupa(lista);
          } else if(opcao == 5){
              Cama c = vc.leDoTeclado();
              aac.gravaCama(c);
          } else if(opcao == 6){
              ArrayList<Cama> lista = aac.ListaDeCamas();
              vc.MostrarCama(lista);
          }
          
          else{
              System.out.println("Opção inválida");
          }
        } while (opcao != 0);
    }
    
    public static int menu(){
        Scanner ler = new Scanner (System.in);
        System.out.println("Opções");
        System.out.println("1. Cadastrar cliente");
        System.out.println("2. Listar clientes");
        System.out.println("3. Cadastrar guarda roupa");
        System.out.println("4. Listar guarda roupas");
        System.out.println("5. Cadastrar cama");
        System.out.println("6. Listar camas");
        System.out.println("0. Vazar");
        System.out.println("Digite");
        int opcao = ler.nextInt();
        return opcao;
    }
}
