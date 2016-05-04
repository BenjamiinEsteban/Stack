
package ejerciciospila;

import java.util.Stack;

public class Respuestas {
    public void e_1(){
        Stack p=new Stack();
        p.push("calsh of clans");
        p.push("god of war");
        p.push("devil may cry");
        p.push("gta");
        
        System.out.println("pila: "+ p);
        System.out.println("tamaño pila: "+ p.size());
        System.out.println("cima pila: "+ p.peek());
        System.out.println("buscar pila: "+ p.search("jaja"));
        System.out.println("sacar pila: "+ p.pop());
        System.out.println("¿la pila esta vacia? "+ p.empty());
        System.out.println("-----------------------------------");            
    }
    public void e_2(){
        Stack n=new Stack();
        n.push(6.0);
        n.push(5.0);
        n.push(4.0);
        n.push(3.0);
        n.push(2.0);
        for (int i = 0; i < n.size(); i++) {
            System.out.println(n.get(i));
        }
        System.out.println("----------------------------------------");
    }
      public void e_3(){
        Stack n=new Stack();
        n.push(6.0);
        n.push(5.0);
        n.push(4.0);
        n.push(3.0);
        n.push(2.0);
          for (Object juju:n) {
              System.out.println(juju);
          }
          System.out.println("-------------------------------------");   
    }
      public void e_4(){
          Stack l=new Stack();
          l.push("el infierno de dante");
          l.push("maze runner");
          l.push("juego de tronos");
          l.push("el principito");
          while(!l.empty()){
              System.out.println(l.pop());
              
          }
          System.out.println("¿La pila esta vacia?"+ l.empty());
      }
    
}
