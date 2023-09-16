package cliente;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class AcessaArquivoCliente {
    public void gravaCliente(Cliente cliente) throws Exception{
        //FileWriter fw = new FileWriter("cliente.txt");
        //BufferedWriter bw = new BufferedWriter(out);
        BufferedWriter bw = new BufferedWriter(new FileWriter("cliente.txt", true));
        bw.write(cliente.getNome());
        bw.newLine();
        bw.write(cliente.getEndereco());
        bw.newLine();
        bw.write(cliente.getNascimento());
        bw.close();
    }    
    
    public ArrayList<Cliente> listaDeClientes() throws Exception{
        BufferedReader br = new BufferedReader(new FileReader("cliente.txt"));
        ArrayList<Cliente> lista = new ArrayList();
        while(br.ready()){
            Cliente cli = new Cliente();
            cli.setNome(br.readLine());
            cli.setEndereco(br.readLine());
            cli.setNascimento(br.readLine());
            lista.add(cli);
        };
        return lista;
    }
}
