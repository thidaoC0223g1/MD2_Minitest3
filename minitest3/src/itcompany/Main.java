package itcompany;

public class Main {
    public static void main(String[] args) {
        QuanLyNhanVien danhsach = new QuanLyNhanVien();
        danhsach.themNVFT("1", "thi", "33", "123456", "asdf@", "bacninh",
                1200, 12, 45);

        danhsach.themNVFT("2", "van", "31", "123456", "asdf@", "bacninh",
                1400, 12, 7);

        danhsach.themNVFT("3", "tien", "30", "123456", "asdf@", "bacninh",
                2000, 11, 43);

        danhsach.themNVFT("4", "giang", "23", "123456", "asdf@", "bacninh",
                1000, 14, 45);

        danhsach.themNVFT("5", "hung", "25", "123456", "asdf@", "bacninh",
                900, 21, 94);

        danhsach.themNVPT("6", "son", "45", "123456", "asdf@", "bacninh",
                12);
        danhsach.themNVPT("7", "the", "33", "123456", "asdf@", "bacninh",
                10);
        danhsach.themNVPT("8", "hieu", "44", "123456", "asdf@", "bacninh",
                9);
        danhsach.themNVPT("9", "nam", "55", "123456", "asdf@", "bacninh",
                6);
        danhsach.themNVPT("9", "nam", "55", "123456", "asdf@", "bacninh",
                6);

        danhsach.hienthi();

        System.out.println(danhsach.luongTrungBinh());
        danhsach.nvUnderLuongTB();
        System.out.println(danhsach.tongLuongNvpt());
        danhsach.suaNVFT("2","chi","29","567875","gggg@",
                "dangxa",1500,40,12);
        danhsach.hienthi();
        System.out.println(danhsach.luongTrungBinh());
        danhsach.xoaNhanVien("4");
        danhsach.hienthi();
        danhsach.nvUnderLuongTB();
        danhsach.sapXepnvft();

    }
}
