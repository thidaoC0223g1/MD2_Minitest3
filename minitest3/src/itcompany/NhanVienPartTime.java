package itcompany;

public class NhanVienPartTime extends NhanVien{
    private double giolamviec;

    public NhanVienPartTime() {
    }

    public NhanVienPartTime(double giolamviec) {
        this.giolamviec = giolamviec;
    }

    public NhanVienPartTime(String manhanvien, String hoten, String tuoi,
                            String sdt, String email, String diachi, double giolamviec) {
        super(manhanvien, hoten, tuoi, sdt, email, diachi);
        this.giolamviec = giolamviec;
    }

    public double getGiolamviec() {
        return giolamviec;
    }

    public void setGiolamviec(double giolamviec) {
        this.giolamviec = giolamviec;
    }

    public double luongLinh(){
        return giolamviec*100;
    }
    @Override
    public String toString() {
        return super.toString()+
                "giolamviec=" + giolamviec +
                '}';
    }
}
