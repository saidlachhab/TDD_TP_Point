package puissance4;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.IntStream;

public class GrilleTest {

    @Test
    public void testGrilleEmpty(){
        Grille grille = new Grille();

        Assert.assertTrue(grille.isEmpty());
    }

    @Test
    public void testGrilleShouldHave_6_Lignes(){
        Grille grille = new Grille();
        int nbLigneGrille = grille.getLines();
        Assert.assertEquals(6, nbLigneGrille);

    }

    @Test
    public void testGrilleShouldHave_7_Columns(){
        Grille grille = new Grille();
        int nbCollumnGrille = grille.getColumns();
        Assert.assertEquals(7, nbCollumnGrille);
    }

    @Test
    public void InsertTokenIntoEmptyCollumnShouldBeInTheFirstPosition() throws GridException {
        Grille grille = new Grille();
        grille.insert(0, "x");

        Assert.assertEquals("x", grille.get(0,0));
    }

    @Test
    public void InsertTokenIntoCollumnThatContainsTokensShouldBeInsertedinTheNextLine() throws GridException {
        Grille grille = new Grille();
        grille.insert(0, "x");
        grille.insert(0, "y");
        grille.insert(0, "x");
        grille.insert(0, "y");
        grille.insert(0, "x");
        grille.insert(0, "y");

        Assert.assertEquals("x", grille.get(0,0));
        Assert.assertEquals("y", grille.get(0,1));
        Assert.assertEquals("x", grille.get(0,2));
        Assert.assertEquals("y", grille.get(0,3));
        Assert.assertEquals("x", grille.get(0,4));
        Assert.assertEquals("y", grille.get(0,5));

    }

    @Test(expected = GridException.class)
    public void InsertTokenIntoFullColumnShouldThrowException() throws GridException {
        Grille grille = new Grille();
        grille.insert(0, "x");
        grille.insert(0, "y");
        grille.insert(0, "x");
        grille.insert(0, "y");
        grille.insert(0, "x");
        grille.insert(0, "y");
        grille.insert(0, "x");

    }

    @Test(expected = GridException.class)
    public void InsertTokenIntoOutofRangeColumnShouldThrowException() throws GridException {
        Grille grille = new Grille();
        grille.insert(7, "y");
    }

    @Test
    public void checkIfTheGridIsCompletelyFull(){
        Grille grille = new Grille();
        IntStream.range(0, 7).forEach(column->{
            IntStream.range(0, 6).forEach(line->{
                try {
                    grille.insert(column, "x");
                } catch (GridException e) {
                    e.printStackTrace();
                }
            });
        });

        Assert.assertTrue(grille.isFull());
    }

}