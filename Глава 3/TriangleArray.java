import java.util.ArrayList;
class TriangleArray {
    private ArrayList<Triangle> triangles;

    public TriangleArray() {
        triangles = new ArrayList<>();
    }
    public void add(Triangle t) {
        triangles.add(t);
    }
    public void show(){
        for (Triangle t: triangles)
            t.show_tri();
    };
    public void tritype() {
        int ravnost = 0, ravnob = 0, pryam = 0, proizvol = 0;
        for (Triangle t : triangles) {
            if (t.tri60angles()) ravnost++;
            else if (t.tri2side()) ravnob++;
            else if (t.tri90angle()) pryam++;
            else proizvol++;
        }
        System.out.println("равносторонних треугольников: " + ravnost);
        System.out.println("равнобедренных треугольников:: " + ravnob);
        System.out.println("прямоугольных треугольников:: " + pryam);
        System.out.println("произвольных: " + proizvol);
    }
    public Triangle Maxarea60() {
        Triangle max = null;
        for (Triangle t : triangles) {
            if (t.tri60angles() && (max == null || t.Area() > max.Area())) {
                max = t;
            }
        }
        return max;
    }
    public Triangle Minarea60() {
        Triangle min = null;
        for (Triangle t : triangles) {
            if (t.tri60angles() && (min == null || t.Area() < min.Area())) {
                min = t;
            }
        }
        return min;
    }
    public Triangle Maxarea2sides() {
        Triangle max = null;
        for (Triangle t : triangles) {
            if (t.tri2side() && (max == null || t.Area() > max.Area())) {
                max = t;
            }
        }
        return max;
    }public Triangle Minarea2sides() {
        Triangle min = null;
        for (Triangle t : triangles) {
            if (t.tri2side() && (min == null || t.Area() < min.Area())) {
                min = t;
            }
        }
        return min;
    }
    public Triangle Maxarea90() {
        Triangle max = null;
        for (Triangle t : triangles) {
            if (t.tri90angle() && (max == null || t.Area() > max.Area())) {
                max = t;
            }
        }
        return max;
    }
    public Triangle Minarea90() {
        Triangle min = null;
        for (Triangle t : triangles) {
            if (t.tri90angle() && (min == null || t.Area() < min.Area())) {
                min = t;
            }
        }
        return min;
    }
    public Triangle Maxareapr() {
        Triangle max = null;
        for (Triangle t : triangles) {
            if ((!t.tri90angle()&&!t.tri2side()) && (max == null || t.Area() > max.Area())) {
                max = t;
            }
        }
        return max;
    }
    public Triangle Minareapr() {
        Triangle min = null;
        for (Triangle t : triangles) {
            if ((!t.tri90angle()&&!t.tri2side()) && (min == null || t.Area() < min.Area())) {
                min = t;
            }
        }
        return min;
    }
}
