/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package teste;

/**
 *
 * @author robsh
 */
public class Teste {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int total = 0;
        int c[] = new int[10];
        for (int i =0; i<c.length; i++) {
            c[i] = i + i; 
        }
        for (int i = 0; i<c.length; i++) {
            total += c[i];
        }
        System.out.println(total);
        
        Object[] str = {"a", "ab", "abc"};
        System.out.println(str[1]);
        
        String nome = "João";
        Nome.imprimeNome("Empty");
        
        System.out.println(Math.pow(8,2));
        
        int v0 = 3;
        int v1 = v0++;
        int v2 = ++v1;
        v1 += v0;
        v2 += --v1;
        System.out.println(v0);
        System.out.println(v1);
        System.out.println(v2);
        
        int x, y;
        double z;
        x = 5;
        y = 2;
        z = x / y;
        System.out.println(z);
    }
    
}
