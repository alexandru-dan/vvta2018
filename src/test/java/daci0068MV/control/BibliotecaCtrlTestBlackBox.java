package daci0068MV.control;

import daci0068MV.model.Carte;
import daci0068MV.repository.repoInterfaces.CartiRepoInterface;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class BibliotecaCtrlTestBlackBox {
    Carte c;
    BibliotecaCtrl b;
    CartiRepoInterface ci;
    List<String> x = new ArrayList<>();
    List<String> y = new ArrayList<>();

    @Before
    public void setUp() throws Exception {
        ci = new CartiRepoInterface() {
            @Override
            public void adaugaCarte(Carte c) {

            }

            @Override
            public void modificaCarte(Carte nou, Carte vechi) {

            }

            @Override
            public void stergeCarte(Carte c) {

            }

            @Override
            public List<Carte> cautaCarte(String autor) {
                return null;
            }

            @Override
            public List<Carte> getCarti() {
                return null;
            }

            @Override
            public List<Carte> getCartiOrdonateDinAnul(String an) {
                return null;
            }
        };
        c = new Carte();
        b = new BibliotecaCtrl(ci);
        System.out.println("Before test!");
    }

    @After
    public void tearDown() throws Exception {
        c = null;
        b = null;
        System.out.println("After test");
    }

    @Test
    public void addCarte1() throws Exception {
        try {
            c = new Carte();
            String x1 = "Ana cu merele";
            String y1 = "mere";
            x.add(x1);
            y.add(y1);
            c.setTitlu("X");
            c.setAutori(x);
            c.setAnAparitie("1899");
            c.setEditura("abcdefghijklmnopqrs");
            c.setCuvinteCheie(y);
            b.adaugaCarte(c);
        } catch (InterruptedException c1) {
            c1.printStackTrace();
        }
        assertEquals(null, b.getCarti());

    }


    @Test(expected = Exception.class)
    public void addCarte2() throws Exception {
            c = new Carte();
            String x1 = "Ion";
            String y1 = "nici";
            x.add(x1);
            y.add(y1);
            c.setTitlu("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXa");
            c.setAutori(x);
            c.setAnAparitie("1855");
            c.setEditura("abcdefghijklmnopqrst");
            c.setCuvinteCheie(y);
            c.adaugaCuvantCheie("aici");
            b.adaugaCarte(c);
}

    @Test(expected = Exception.class)
    public void addCarte3() throws Exception {
            c = new Carte();
            String x1 = "Marian";
            String y1 = "gresit";
            x.add(x1);
            y.add(y1);
            c.setTitlu("ABCDEFGHIJKLMNOPQRSTUV");
            c.setAutori(x);
            c.setAnAparitie("2000");
            c.setEditura("");
            c.setCuvinteCheie(y);
            b.adaugaCarte(c);
    }

    @Test(expected = Exception.class)
    public void addCarte4() throws Exception {

        c = new Carte();
        String x1 = "HHDHA";
        String y1 = "bine";
        x.add(x1);
        y.add(y1);
        c.setTitlu("ABCDEFGHIJKLMNOPQRSTUVABCDEFGH");
        c.setAutori(x);
        c.setAnAparitie("1799");
        c.setEditura("abcdefghijkl");
        c.setCuvinteCheie(y);
        b.adaugaCarte(c);
    }

    @Test(expected = Exception.class)
    public void addCarte5() throws Exception {
            c = new Carte();
            String x1 = "Ana Are Mere";
            String y1 = "ana";
            x.add(x1);
            y.add(y1);
            c.setTitlu("");
            c.setAutori(x);
            c.setAnAparitie("2016");
            c.setEditura("A");
            c.setCuvinteCheie(y);
            b.adaugaCarte(c);
    }


    @Test(expected = Exception.class)
    public void addCarte6() throws Exception {
        c = new Carte();
        String x1 = "ghewugwe";
        String y1 = "jgas";
        x.add(x1);
        y.add(y1);
        c.setTitlu("AA");
        c.setAutori(x);
        c.setAnAparitie("2017");
        c.setEditura("ABCDEFGHIJKLMNOPQRSTU");
        c.setCuvinteCheie(y);
        b.adaugaCarte(c);
    }

    @Test(expected = Exception.class)
    public void addCarte7() throws Exception {
            c = new Carte();
            String x1 = "gfnjkqkbgnq";
            String y1 = "gjnewg";
            x.add(x1);
            y.add(y1);
            c.setTitlu("ABCDEFGHIJKLMNOPQRSTUABCDEFGHIJKLMNOPQRSTUijklmno");
            c.setAutori(x);
            c.setAnAparitie("2018");
            c.setEditura("AA");
            c.setCuvinteCheie(y);
            b.adaugaCarte(c);
    }

    @Test
    public void addCarte8() throws Exception {
        try{
            c = new Carte();
            String x1 = "ghewbghwe";
            String y1 = "jej";
            x.add(x1);
            y.add(y1);
            c.setTitlu("ABCDEFGHIJKLMNOPQRSTUABCDEFGHIJKLMNOPQRSTUijklmnoA");
            c.setAutori(x);
            c.setAnAparitie("1800");
            c.setEditura("ABCDEFGHIJKLMNOPQRS");
            c.setCuvinteCheie(y);
            b.adaugaCarte(c);
    } catch (InterruptedException c1) {
        c1.printStackTrace();
    }
    assertEquals(null, b.getCarti());

}
}