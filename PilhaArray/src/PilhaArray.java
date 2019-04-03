
import java.util.logging.Level;
import java.util.logging.Logger;

public class PilhaArray implements Pilha{
    private Object Pizzas[ ];
    private int top = -1;
    
    public PilhaArray(){
        Pizzas = new Object[5]; 
    }
    
    public int size() {
        //retorna num de elementos inseridos
        return top + 1;
    }

 
    public boolean isEmpty() {
        //indica se a pilha está vazia 
        if (top == -1) {
            return true;
        }
        return false;
    }

    public Object top() throws EPilhaVazia {
        //retorna o último elemento inserido sem removê-lo
        if (isEmpty()) {
            throw new EPilhaVazia("Pilha Vazia");
        }
        else{
           return Pizzas[top]; 
        }  
    }

    
    public void push(Object o){
        //inserir elemento
        if (top == (Pizzas.length-1)) {
          System.out.println("Estouro de Pilha!");
         
        }
        else{
            top = top + 1;
            Pizzas [top] = o;
           
        }

    }

   
   public Object pop() throws EPilhaVazia {
        //remove e retorna ultimo elemento inserido
        if (isEmpty()) {
           throw new EPilhaVazia("Pilha Vazia");
        } 
        else{
            Object p = Pizzas[top --];
            
            return p; 
            
        }
           
    }
    //Testando métodos:
    public static void main(String args[]) throws EPilhaVazia {
        PilhaArray p = new PilhaArray();
        p.push("Portuguesa ");
        p.push("Frango com catupiry ");
        p.push("Calabresa ");
        p.push("Quatro queijos ");
        p.push("Chocolate");
        p.push("Sertaneja");
        System.out.println(p.size());
        System.out.println(p.isEmpty());
        System.out.println(p.top());
        System.out.println("Item " + p.pop() + " retirado da pilha");
    }
    
}
