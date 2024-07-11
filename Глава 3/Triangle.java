class Triangle {
    private double a, b, c;
    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public double Area() {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }
    public double Perimeter() {
        return a + b + c;
    }
    public void show_tri(){
        System.out.println("треугольник с длинами "+a+" , "+b+", и "+c);
    }
    public boolean tri60angles(){
        return a == b && b == c;
    }
    public boolean tri2side() {
        return a == b || a == c || b == c;
    }
    public boolean tri90angle() {
        return (a*a==b*b+c*c)||(c*c==b*b+a*a)||(b*b==a*a+c*c);
    }
}
