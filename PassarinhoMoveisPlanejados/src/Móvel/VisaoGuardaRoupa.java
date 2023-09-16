package Móvel;

import java.util.ArrayList;
import java.util.Scanner;

public class VisaoGuardaRoupa {
    
    public GuardaRoupa leDoTeclado(){
        Scanner ler = new Scanner (System.in);
        GuardaRoupa gp = new GuardaRoupa();
        System.out.println("Id ");
        gp.setId(ler.nextInt());
        ler.nextLine();
        System.out.println("Tipo de material ");
        gp.setTipoMaterial(ler.nextLine());
        System.out.println("Cor ");
        gp.setCor(ler.nextLine());
        System.out.println("Altura ");
        gp.setAltura(ler.nextInt());
        System.out.println("Largura ");
        gp.setLargura(ler.nextInt());
        System.out.println("Profundidade ");
        gp.setProfundidade(ler.nextInt());
        System.out.println("Número de portas: ");
        gp.setNumeroPortas(ler.nextInt());
        System.out.println("numero de Compartimentos Principais ");
        gp.setNumeroCompartimentosPrincipais(ler.nextInt());
        System.out.println("numero de Compartimentos Secundarios");
        gp.setNumeroCompartimentosSecundarios(ler.nextInt());
        ler.nextLine();
        System.out.println("tipo de Puchador ");
        gp.setTipoPuchador(ler.nextLine());
        return gp;
       
    }
    
    public void mostrarGuardaRoupa(ArrayList<GuardaRoupa> lista){
        System.out.println("+++ LISTAGEM DE GUARDA ROUPAS +++");
        System.out.println("----------------------------");    
        for (int i = 0; i < lista.size(); i++) {
            GuardaRoupa gp = lista.get(i);
            System.out.println(gp.getId());
            System.out.println(gp.getTipoMaterial());
            System.out.println(gp.getCor());
            System.out.println(gp.getAltura());
            System.out.println(gp.getLargura());
            System.out.println(gp.getProfundidade());
            System.out.println(gp.getNumeroPortas());
            System.out.println(gp.getNumeroCompartimentosPrincipais());
            System.out.println(gp.getNumeroCompartimentosSecundarios());
            System.out.println(gp.getTipoPuchador());
        System.out.println("----------------------------");   
        }
    }
}
