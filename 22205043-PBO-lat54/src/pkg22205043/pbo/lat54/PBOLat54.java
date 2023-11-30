
package pkg22205043.pbo.lat54;

/* Nama : Danish Fadlan Azam Nim : 22205043 
 * Prodi : Teknik Informatika
 * Semseter : 3/pagi
 */

class Koordinat {

    protected int x;
    protected int y;

    public Koordinat(int x, int y) {

    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}

class WarnaKoordinat extends Koordinat {

    public String namaWarna;

    public WarnaKoordinat(int x, int y, String namaWarna) {
        super(x, y);
    }

    public String getNamaWarna() {
        return namaWarna;
    }

    public void setNamaWarna(String namaWarna) {
        this.namaWarna = namaWarna;
    }

}

public class PBOLat54 {

    public static void main(String[] args) {
        WarnaKoordinat WrnKor = new WarnaKoordinat(0, 0, "");
        WrnKor.setNamaWarna("Jingga");
        WrnKor.setX(10);
        WrnKor.setY(4);
        System.out.println("Warna Koordinat : " + WrnKor.getNamaWarna());
        System.out.println("Koordinat Sumbu x : " + WrnKor.getX() + ", y : "
                + WrnKor.getY());
    }
}
