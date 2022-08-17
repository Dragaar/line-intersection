package com.epam.rd.autotasks.intersection;

public class Line {
    public int k, b;
    public Line(int k, int b) {
    this.k = k;
    this.b = b;
    }

    public Point intersection(Line line2) {
        if(this.k == line2.k) return null;
        double x = (line2.b - this.b) / (this.k - line2.k);
        double y = this.k * x + this.b;
        Point res = new Point((int) x, (int) y);
        System.out.println(res.toString());
        return res;
       // throw new UnsupportedOperationException();
    }

}
