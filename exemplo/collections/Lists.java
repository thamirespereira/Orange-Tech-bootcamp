package exemplo.collections;

import java.util.ArrayList;
import java.util.List;

public class Lists {

    List notas = new ArrayList(); //antes do java 5
    
    ArrayList<Double> notas = new ArrayList<>(); 

    List<Double> notas = new ArrayList<>(Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6)); 

    //não adiciona e nem remove elemetos
    List<Double> notas = Arrays.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
    notas.add(10d);
    System.out.println(notas);

    List<Double> notas = List.of(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6);
    notas.add(1d);
    notas.remove(5d);
    System.out.println(notas);
}
