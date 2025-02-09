import java.util.Random;

public class Filosof extends Thread {
    private static Random r = new Random();

    private final Cobert esquerre, dret;

    String nom;

    public Filosof(String nom, Cobert esquerra, Cobert dreta) {
        this.nom = nom;
        this.esquerre = esquerra;
        this.dret = dreta;
    }

    @Override
    public void run() {
        // TODO Auto-generated method stub
        try {
            while (true) {
                pensar();
                menjar();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void pensar() {
        System.out.println(nom + " pensant");
        esperar(r.nextInt(2000, 3000));
    }

    private synchronized void verificar() throws InterruptedException {
        if (dret.getOcupado()) {
            wait();
        }
    }

    private synchronized void menjar() {
        System.out.println(nom + " te fam i vol agafar el cobert esquerre");
        esperar(r.nextInt(400, 600));

        try {
            synchronized (esquerre) {
                System.out.println(nom + " agafa el cobert esquerre. Ara vol agafar el dret.");
                esperar(r.nextInt(400, 600));
            }

            synchronized (dret) {
                verificar();
                dret.setOcupado(true);
                System.out.println(nom + " agafa el cobert dret");
                System.out.println(nom + " menjant");
                esperar(r.nextInt(2000, 3000));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(nom + " amolla el cobert dret");
        System.out.println(nom + " amolla el cobert esquerre");
        dret.setOcupado(false);
        notifyAll();
    }

    private void esperar(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}