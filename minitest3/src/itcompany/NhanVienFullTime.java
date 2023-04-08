package itcompany;

import java.util.Comparator;

public class NhanVienFullTime extends NhanVien implements Comparator<NhanVien> {
    private double tienthuong;
    private double tienphat;
    private double luongcung;

    public NhanVienFullTime() {
    }

    public NhanVienFullTime(double tienthuong, double tienphat, double luongcung) {
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
        this.luongcung = luongcung;
    }


    public NhanVienFullTime(String manhanvien, String hoten, String tuoi, String sdt, String email, String diachi,
                            double tienthuong, double tienphat, double luongcung) {
        super(manhanvien, hoten, tuoi, sdt, email, diachi);
        this.tienthuong = tienthuong;
        this.tienphat = tienphat;
        this.luongcung = luongcung;
    }


    public double getTienthuong() {
        return tienthuong;
    }

    public void setTienthuong(double tienthuong) {
        this.tienthuong = tienthuong;
    }

    public double getTienphat() {
        return tienphat;
    }

    public void setTienphat(double tienphat) {
        this.tienphat = tienphat;
    }

    public double getLuongcung() {
        return luongcung;
    }

    public void setLuongcung(double luongcung) {
        this.luongcung = luongcung;
    }

    public double luongThucLinh() {
        return luongcung + (tienthuong - tienphat);
    }

    @Override
    public String toString() {
        return super.toString() +
                "tienthuong='" + tienthuong + '\'' +
                ", tienphat='" + tienphat + '\'' +
                ", luongcung='" + luongcung + '\'' +
                '}';
    }

    @Override
    public int compare(NhanVien o1, NhanVien o2) {
        if(((NhanVienFullTime)o1).luongThucLinh()>((NhanVienFullTime)o2).luongThucLinh()){
            return 1;
        }else if(((NhanVienFullTime)o1).luongThucLinh()==((NhanVienFullTime)o2).luongThucLinh()){
            return 0;
        }return -1;
    }
}
