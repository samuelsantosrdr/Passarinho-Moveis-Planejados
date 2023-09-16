package Móvel;

import java.util.ArrayList;
import java.util.Scanner;


public class VisaoCama {
     public Cama leDoTeclado(){
        Scanner ler = new Scanner (System.in);
        Cama c = new Cama();
        System.out.println("Id ");
        c.setId(ler.nextInt());
        ler.nextLine();
        System.out.println("Tipo de material ");
        c.setTipoMaterial(ler.nextLine());
        System.out.println("Cor ");
        c.setCor(ler.nextLine());
        System.out.println("Altura ");
        c.setAltura(ler.nextInt());
        System.out.println("Largura ");
        c.setLargura(ler.nextInt());
        System.out.println("Profundidade ");
        c.setProfundidade(ler.nextInt());
        System.out.println("Tipo de cama");
        ler.nextLine();
        c.setTipoCama(ler.nextLine());
        System.out.println("tipo de Adorno");
        c.setTipoAdorno(ler.nextLine());
        
        return c;
       
    }
     
      public void MostrarCama(ArrayList<Cama> lista){
        System.out.println("+++ LISTAGEM DE CAMAS +++");
        System.out.println("----------------------------");    
        for (int i = 0; i < lista.size(); i++) {
            Cama c  = lista.get(i);
            System.out.println(c.getId());
            System.out.println(c.getTipoMaterial());
            System.out.println(c.getCor());
            System.out.println(c.getAltura());
            System.out.println(c.getLargura());
            System.out.println(c.getProfundidade());
            System.out.println(c.getTipoCama());
            System.out.println(c.getTipoAdorno());
        System.out.println("----------------------------");   
        }
    }
}
