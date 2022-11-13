public class Televizor {
    int jacinaTona = 0;
    boolean ukljucen = false;

    public Televizor(){
        return;
    }
    public Televizor(int jacinaTona) {
            this.jacinaTona = jacinaTona;
    }

    public Televizor(boolean ukljucen) {
        this.ukljucen = ukljucen;
    }

    public Televizor(boolean ukljucen, int jacinaTona) {
        this.ukljucen = ukljucen;
        this.jacinaTona = jacinaTona;
    }

    public int pojacajTon() {
        jacinaTona++;
        if (ukljucen == true) {
            if (jacinaTona > 20) {
                jacinaTona = 20;
                System.out.println("Jacina tona ne moze biti veca od 20!");
            } else if (jacinaTona <= 0) {
                jacinaTona = 1;
            }
        } else {
            System.out.println("Nije moguce smanjiti ton!");
        }
        return jacinaTona;
    }
    public int smanjiTon() {
        jacinaTona--;
        if (ukljucen == true) {
            if (jacinaTona < 0) {
                jacinaTona = 0;
                System.out.println("Jacina tona ne moze biti manja od 0!");
            } else if (jacinaTona >= 20) {
                jacinaTona = 19;
            }
        } else {
            System.out.println("Nije moguce pojacati ton!");
        }
        return jacinaTona;
    }

    public boolean ukljuci() {
        ukljucen = true;
        return ukljucen;
    }

    public boolean iskljuci() {
        ukljucen = false;
        return ukljucen;
    }

    public boolean daLiJeUkljucen() {
        System.out.println(ukljucen);
        return ukljucen;
    }

    public int vratiJacinuTona() {
       if (ukljucen == false) {
            System.out.println("Nije moguce smanjiti ili pojacati ton!");
        } else {
            System.out.println(jacinaTona);

       }
        return jacinaTona;
    }

    public void tvOpis() {
        if (ukljucen == false) {
            System.out.println("Televizor je trenutno iskljucen"  );
        } else {
            System.out.println("Jacina zvuka televizora je: " + jacinaTona + ", i televizor je trenutno: Ukljucen");
        }
    }

}
