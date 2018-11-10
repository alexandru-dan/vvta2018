package daci0068MV.model.repo;


import daci0068MV.model.Carte;
import daci0068MV.repository.repoMock.CartiRepoMock;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class CartiRepoMockTest {

    private Carte c1, c2, c3;
    CartiRepoMock cartiRepoMock;

    @Before
    public void setUp() throws Exception {

        c1 = new Carte();
        c1.setTitlu("Poezii");
        c1.setAutori(Arrays.asList("Gheorghe"));
        c1.setAnAparitie("2002");
        c1.setEditura("PoliromCluj-N");
        c1.setCuvinteCheie(Arrays.asList("Frumos", "Toamna"));

        c2 = new Carte();
        c2.setTitlu("Povesti");
        c2.setAutori(Arrays.asList("Creanga"));
        c2.setAnAparitie("2002");
        c2.setEditura("PoliromCluj-N");
        c2.setCuvinteCheie(Arrays.asList("Copilarie", "Amintiri"));

        c3 = new Carte();
        c3.setTitlu("Versuri");
        c3.setAutori(Arrays.asList("Rebreanu"));
        c3.setAnAparitie("2002");
        c3.setEditura("PoliromCluj-N");
        c3.setCuvinteCheie(Arrays.asList("Efemer", "Minciuna"));
        cartiRepoMock = new CartiRepoMock();
    }

    @After
    public void tearDown() throws Exception {

        c1 = c2 = c3 = null;
        cartiRepoMock = null;
    }

    @Test
    public void findBookRepoGol() {

        assertEquals("Cautam carte in biblioteca goala", 0, cartiRepoMock.cautaCarte("Gheorghe").size());
        System.out.println("Repo gol -> succes!");

    }

    @Test
    public void findBookAutorInexistent() {
        cartiRepoMock.adaugaCarte(c3);

        assertEquals("Cautam autor inexistent", 0, cartiRepoMock.cautaCarte("Gheorghe").size());
        System.out.println("Autorul nu exista!");

    }


    @Test
    public void findBookAuthorExistent() {
        cartiRepoMock.adaugaCarte(c1);
        cartiRepoMock.adaugaCarte(c2);

        assertEquals("Cautam autor existent", 1,cartiRepoMock.cautaCarte("Gheorghe").size());
        System.out.println("Autor -> gasit!");
    }
}
