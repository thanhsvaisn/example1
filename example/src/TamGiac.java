public class TamGiac {
    private double a, b, c;

    public TamGiac(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void check() {
        if ((a + b > c) && (a + c > b) && (b + c > a)) {
            System.out.println("Ba giá trị đó là độ dài cạnh của một tam giác.");
        } else if (a <= 0 || b <= 0 || c <= 0) {
            System.out.println("Ba giá trị đó không phải là độ dài cạnh của một tam giác.");
        } else {
            System.out.println("Ba giá trị đó không phải là độ dài cạnh của một tam giác.");
        }
    }

    public void chuvi() {
        double p = this.a + this.b + this.c;
        System.out.println("Chu vi là: " + p);
    }

    public void dienTich() {
        double p = this.a + this.b + this.c; // Lưu kết quả chu vi vào biến p
        p /= 2; // Bán kính p cho diện tích
        double dienTich = Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
        System.out.println("Diện tích là: " + dienTich);
    }
}