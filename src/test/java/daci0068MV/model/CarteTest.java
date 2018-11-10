package daci0068MV.model;

import org.junit.*;

import java.util.List;

import static org.junit.Assert.*;

public class CarteTest {

    Carte c;
    @Before
    public void setUp() throws Exception {
        c = new Carte();
        c.setTitlu("AnaAreMere");
        System.out.println("Before test");
        c.setEditura("Ari");
//        c.setAnAparitie("1899");
    }

//    @BeforeClass
//
//    public static void setup(){
//        System.out.println("Before any test");
//    }

//    @AfterClass
//
//    public static void teardown(){
//        System.out.println("After all testes");
//    }

    @After
    public void tearDown() throws Exception {
        c = null;
        System.out.println("After test");
    }

//    @Test
//
//    public void getAnAparitie() throws Exception{
//        try {
//            Thread.sleep(120);
//        }
//        catch (InterruptedException c2){
//            c2.getStackTrace();
//        }
//
//        assertEquals(1999,Integer.parseInt(c.getAnAparitie()));
//    }

//    @Test(timeout = 100)
//    public void getAnAparitie(){
//        assertEquals("1899", c.getAnAparitie());
//    }
//
    @Test (timeout = 100)
    public void getEditura() throws Exception {
        try{
            Thread.sleep(90);

        }

        catch (InterruptedException c1) {
            c1.printStackTrace();
        }

        assertEquals("Ari",c.getEditura());
    }
    @Test
    public void  getTitlu() throws Exception{
        try {
            Thread.sleep(10);
        }

        catch (InterruptedException c3) {
         c3.printStackTrace();
        }
        assertEquals("AnaAreMere", c.getTitlu());
        System.out.println(c.getTitlu());
    }


    @Test
    public void setTitlu() throws Exception {
        c.setTitlu("Maria Maria");
        assertEquals("Maria Maria",c.getTitlu());
    }
}