package itcompany;

import java.util.ArrayList;
public class QuanLyNhanVien {
    ArrayList<NhanVien> danhsach;

    public QuanLyNhanVien() {
        danhsach = new ArrayList<>();
    }

    public void themNVFT(String manhanvien, String hoten, String tuoi, String sdt,
                         String mail, String diachi, double luongcung,
                         double tienthuong, double tienphat) {
        NhanVienFullTime nvft = new NhanVienFullTime();
        nvft.setManhanvien(manhanvien);
        nvft.setHoten(hoten);
        nvft.setTuoi(tuoi);
        nvft.setSdt(sdt);
        nvft.setEmail(mail);
        nvft.setDiachi(diachi);
        nvft.setLuongcung(luongcung);
        nvft.setTienthuong(tienthuong);
        nvft.setTienphat(tienphat);
        danhsach.add(nvft);
    }

    public void suaNVFT(String manhanvien, String hoten, String tuoi, String sdt,
                        String mail, String diachi, double luongcung,
                        double tienthuong, double tienphat) {
        for (NhanVien i : danhsach) {
            if (i instanceof NhanVienFullTime) {
                if (i.getManhanvien().equals(manhanvien)) {
                    i.setHoten(hoten);
                    i.setTuoi(tuoi);
                    i.setSdt(sdt);
                    i.setEmail(mail);
                    i.setDiachi(diachi);
                    ((NhanVienFullTime) i).setLuongcung(luongcung);
                    ((NhanVienFullTime) i).setTienthuong(tienthuong);
                    ((NhanVienFullTime) i).setTienphat(tienphat);
                }
            }
        }
    }


    public void themNVPT(String manhanvien, String hoten, String tuoi, String sdt,
                         String mail, String diachi, double giolamviec) {
        NhanVienPartTime nvpt = new NhanVienPartTime();
        nvpt.setManhanvien(manhanvien);
        nvpt.setHoten(hoten);
        nvpt.setTuoi(tuoi);
        nvpt.setSdt(sdt);
        nvpt.setEmail(mail);
        nvpt.setDiachi(diachi);
        nvpt.setGiolamviec(giolamviec);

        danhsach.add(nvpt);
    }

    public void suaNVPT(String manhanvien, String hoten, String tuoi, String sdt,
                        String mail, String diachi, double giolamviec) {
        for (NhanVien i : danhsach) {
            if (i instanceof NhanVienPartTime) {
                if (i.getManhanvien().equals(manhanvien)) {
                    i.setHoten(hoten);
                    i.setTuoi(tuoi);
                    i.setSdt(sdt);
                    i.setEmail(mail);
                    i.setDiachi(diachi);
                    ((NhanVienPartTime) i).setGiolamviec(giolamviec);

                }
            }
        }
    }

    public void xoaNhanVien(String manhanvien) {
        danhsach.removeIf(i -> i.getManhanvien().equals(manhanvien));
    }

    public void hienthi() {
        for (NhanVien i : danhsach) {
            System.out.println(i.toString());
        }
    }

    public double luongTrungBinh() {
        double sumnvft = 0;
        double sumnvpt = 0;

        for (NhanVien i : danhsach) {
            if (i instanceof NhanVienFullTime) {
                sumnvft += ((NhanVienFullTime) i).luongThucLinh();
            }
        }
        for (NhanVien i : danhsach) {
            if (i instanceof NhanVienPartTime) {
                sumnvpt += ((NhanVienPartTime) i).luongLinh();
            }
        }
        return (sumnvft + sumnvpt) / danhsach.size();
    }

    public void nvUnderLuongTB() {
        for (NhanVien i : danhsach) {
            if (i instanceof NhanVienFullTime) {
                if (((NhanVienFullTime) i).luongThucLinh() < luongTrungBinh()) {
                    System.out.println(i.getHoten());
                }
            }
        }
    }

    public double tongLuongNvpt() {
        double sumnvpt = 0;
        for (NhanVien i : danhsach) {
            if (i instanceof NhanVienPartTime) {
                sumnvpt += ((NhanVienPartTime) i).luongLinh();
            }
        }
        return sumnvpt;
    }

    public void sapXepnvft() {
        ArrayList<NhanVien> sublist = new ArrayList<>();
        for (NhanVien i : danhsach) {
            if (i instanceof NhanVienFullTime) {
                sublist.add(i);
            }
        }
        sublist.sort(new NhanVienFullTime());
        System.out.println(sublist);
    }
}
