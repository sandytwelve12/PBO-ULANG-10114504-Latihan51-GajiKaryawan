/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo.ulang.pkg10114504.latihan51.gajikaryawan;

/**
 *
 * @author 
 * NAMA      : Sandy Akbar
 * KELAS     : PBO-ULANG
 * NIM       : 10114504
 * Deskripsi : Program untuk menampilkan data kelinci
 */
class Manager {
    private int kehadiran;
    private float tunjanganGolongan;
    private float tunjanganJabatan;
    private float tunjanganKehadiran;

    public int getKehadiran() {
        return kehadiran;
    }

    public void setKehadiran(int kehadiran) {
        this.kehadiran = kehadiran;
    }
    
    public float tunjanganKehadiran(int hadir) {
        tunjanganKehadiran = hadir * 10000;
        return tunjanganKehadiran;
    }
    
    public float tunjanganJabatan(String jabatan) {
        if(jabatan.equalsIgnoreCase("Manager")) {
            tunjanganJabatan = 2000000;
            return tunjanganJabatan;
        } else if(jabatan.equalsIgnoreCase("Kabag")) {
            tunjanganJabatan = 1000000;
            return tunjanganJabatan;
        }
        return 0;
    }
    
    public float tunjanganGolongan(int golongan) {
        switch (golongan) {
            case 1:
                tunjanganGolongan = 500000;
                return tunjanganGolongan;
            case 2:
                tunjanganGolongan = 1000000;
                return tunjanganGolongan;
            case 3:
                tunjanganGolongan = 1500000;
                return tunjanganGolongan;
            default:
                tunjanganGolongan = 0;
                return tunjanganGolongan;
        }
    }
    
    public float gajiTotal() {
        return this.tunjanganGolongan + this.tunjanganJabatan + this.tunjanganKehadiran;
    }

    void setNik(String nik) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNama(String nama) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setJabatan(String jabatan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setGolongan(int golongan) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNik() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getNama() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getJabatan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    String getGolongan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
