package itcompany;

public class NhanVien {
    private String manhanvien;
    private String hoten;
    private String tuoi;
    private String sdt;
    private String email;
    private String diachi;

    public NhanVien() {
    }

    public NhanVien(String manhanvien, String hoten, String tuoi, String sdt, String email, String diachi) {
        this.manhanvien = manhanvien;
        this.hoten = hoten;
        this.tuoi = tuoi;
        this.sdt = sdt;
        this.email = email;
        this.diachi = diachi;
    }

    public String getManhanvien() {
        return manhanvien;
    }

    public void setManhanvien(String manhanvien) {
        this.manhanvien = manhanvien;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public String getTuoi() {
        return tuoi;
    }

    public void setTuoi(String tuoi) {
        this.tuoi = tuoi;
    }

    public String getSdt() {
        return sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    @Override
    public String toString() {
        return "NhanVien{" +
                "manhanvien='" + manhanvien + '\'' +
                ", hoten='" + hoten + '\'' +
                ", tuoi='" + tuoi + '\'' +
                ", sdt='" + sdt + '\'' +
                ", email='" + email + '\'' +
                ", diachi='" + diachi + '\'' +", ";
    }
}
