package Móvel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;

public class AcessaArquivoGuardaRoupa {
     public void gravaGuardaRoupa(GuardaRoupa gp) throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter("guardaRoupa.txt", true));
        
        bw.write(String.valueOf(gp.getId()));
        bw.newLine();
        bw.write(gp.getTipoMaterial());
        bw.newLine();
        bw.write(gp.getCor());
        bw.newLine();
        bw.write(String.valueOf(gp.getAltura()));
        bw.newLine();
        bw.write(String.valueOf(gp.getLargura()));
        bw.newLine();
        bw.write(String.valueOf(gp.getProfundidade()));
        bw.newLine();
        bw.write(String.valueOf(gp.getNumeroPortas()));
        bw.newLine();
        bw.write(String.valueOf(gp.getNumeroCompartimentosPrincipais()));
        bw.newLine();
        bw.write(String.valueOf(gp.getNumeroCompartimentosSecundarios()));
        bw.newLine();
        bw.write(String.valueOf(gp.getTipoPuchador()));
       
        bw.close();
    } 
     public ArrayList<GuardaRoupa> ListaDeGuardaRoupas() throws Exception{
          BufferedReader br = new BufferedReader(new FileReader("GuardaRoupa.txt"));
          ArrayList<GuardaRoupa> lista = new ArrayList();
          
          while(br.ready()){
              GuardaRoupa gp = new GuardaRoupa();
              gp.setId(Integer.parseInt(br.readLine()));
              gp.setTipoMaterial(br.readLine());
              gp.setCor(br.readLine());
              gp.setAltura(Integer.parseInt(br.readLine()));
              gp.setLargura(Integer.parseInt(br.readLine()));
              gp.setProfundidade(Integer.parseInt(br.readLine()));
              gp.setNumeroPortas(Integer.parseInt(br.readLine()));
              gp.setNumeroCompartimentosPrincipais(Integer.parseInt(br.readLine()));
              gp.setNumeroCompartimentosSecundarios(Integer.parseInt(br.readLine()));
              gp.setTipoPuchador(br.readLine());
              lista.add(gp);
              
          };
          return lista;
     }
    
    
}
