package LinkedLists;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.LinkedList;
//Learning about LinkedList.
public class TreinandoLinkedList {

    public static void main(String[] args) {
        LinkedList<String> minhaLista = new LinkedList<String>();

        minhaLista.push("A");
        minhaLista.push("B");
        minhaLista.push("c");
        minhaLista.push("d");
        minhaLista.push("F");
        System.out.println(minhaLista);
        minhaLista.addFirst("Z");
        System.out.println(minhaLista);
        minhaLista.addLast("Y");
        System.out.println(minhaLista);
        System.out.println(minhaLista.contains("Y"));
        System.out.println(minhaLista.contains("H"));
        minhaLista.remove("d");
        System.out.println(minhaLista);
        System.out.println(minhaLista.indexOf("c"));
        minhaLista.add(2,"E");
        System.out.println(minhaLista);
        minhaLista.add(3, "D");
        System.out.println(minhaLista);
        System.out.println(minhaLista.indexOf("c"));
        minhaLista.remove(4);
        System.out.println(minhaLista);
        minhaLista.add(4, "C");
        System.out.println(minhaLista);
        minhaLista.remove(0);
        System.out.println(minhaLista);

        System.out.println(minhaLista.peek());
        System.out.println(minhaLista.peekFirst());
        minhaLista.remove(minhaLista.peekLast());
        System.out.println(minhaLista);


        LinkedList<String> outraLista = new LinkedList<String>();

        outraLista.offer("A");
        outraLista.offer("B");
        outraLista.offer("C");
        outraLista.offer("D");
        outraLista.offer("E");
        outraLista.offer("F");


        System.out.println(outraLista);
        outraLista.poll();
        System.out.println(outraLista);

    }



}
