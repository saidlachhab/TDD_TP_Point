package puissance4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Grille {

    private List<List<String>> columnsGrille;
    private static final int maxLignes=6;
    private static final int maxColumns=7;

    public Grille() {
        columnsGrille = Arrays.asList(new ArrayList<>(), new ArrayList<>(),new ArrayList<>(), new ArrayList<>(),
                new ArrayList<>(),new ArrayList<>(),new ArrayList<>());

    }

    public boolean isEmpty(){
        return columnsGrille.stream().allMatch(List::isEmpty);
    }

    public int getColumns() {
        return maxColumns;
    }

    public int getLines() {
        return maxLignes;
    }

    public void insert(int columnNumber, String token) throws GridException {
        if(columnNumber>=maxColumns){
            throw new GridException("nombre de colonnes est hors grille");
        }
        List<String> column = columnsGrille.get(columnNumber);
        if (column.size()>=maxLignes){
            throw new GridException("nombre de lignes ne peux pas depasser "+maxLignes);
        }
        column.add(token);
    }

    public String get(int column, int ligne) {
        return columnsGrille.get(column).get(ligne);
    }

    public boolean isFull() {
        return columnsGrille.stream().flatMap(List :: stream).count() == 42;
    }
}
