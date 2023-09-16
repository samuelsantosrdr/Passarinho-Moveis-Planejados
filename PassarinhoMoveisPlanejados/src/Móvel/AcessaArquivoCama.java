package Móvel;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;


public class AcessaArquivoCama {
    
     public void gravaCama(Cama c) throws Exception{
        BufferedWriter bw = new BufferedWriter(new FileWriter("cama.txt", true));
        
        bw.write(String.valueOf(c.getId()));
        bw.newLine();
        bw.write(c.getTipoMaterial());
        bw.newLine();
        bw.write(c.getCor());
        bw.newLine();
        bw.write(String.valueOf(c.getAltura()));
        bw.newLine();
        bw.write(String.valueOf(c.getLargura()));
        bw.newLine();
        bw.write(String.valueOf(c.getProfundidade()));
        bw.newLine();
        bw.write(c.getTipoCama());
        bw.newLine();
        bw.write(c.getTipoAdorno());
        bw.close();
    } 
     
      public ArrayList<Cama> ListaDeCamas() throws Exception{
          BufferedReader br = new BufferedReader(new FileReader("Cama.txt"));
          ArrayList<Cama> lista = new ArrayList();
          
          while(br.ready()){
              Cama c = new Cama();
              c.setId(Integer.parseInt(br.readLine()));
              c.setTipoMaterial(br.readLine());
              c.setCor(br.readLine());
              c.setAltura(Integer.parseInt(br.readLine()));
              c.setLargura(Integer.parseInt(br.readLine()));
              c.setProfundidade(Integer.parseInt(br.readLine()));
              c.setTipoCama(br.readLine());
              c.setTipoAdorno(br.readLine());
              lista.add(c);
          };
          return lista;
     }
    
}
