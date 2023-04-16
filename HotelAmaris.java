public class HotelAmaris {
    public static void main(String[] args) {
        // program ini dibuat oleh Yuda Ananda
        // deklarasi dan inisialisasi array
        char[][] kamar = {
                {'*', '*', '*', 'x', '*'},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', '*'},
                {'*', '*', '*', '*', 'x'}
        };
        
        // loop untuk mencari kamar yang terisi tamu
        for (int i = 0; i < kamar.length; i++) {
            for (int j = 0; j < kamar[i].length; j++) {
                if (kamar[i][j] == 'x') {
                    // menampilkan kamar yang terisi tamu
                    System.out.println("Tamu berada di Lantai " + (kamar.length-i) + " Kamar " + (j+1));
                }
            }
        }
                int jumlahKamarKosong = 0;
        
        // loop untuk mencari kamar kosong
        for (char[] kamar1 : kamar) {
            for (int j = 0; j < kamar1.length; j++) {
                if (kamar1[j] == '*') {
                    jumlahKamarKosong++;
                }
            }
        }
        
        // menampilkan jumlah kamar kosong
        System.out.println("Jumlah kamar yang tersedia adalah " + jumlahKamarKosong + " kamar");
    
    }
}