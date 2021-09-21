package org.example.LineComparison;

import java.util.Objects;
public class Line {
    int x1, y1, x2, y2;

    public Line( int x1, int y1, int x2, int y2 ){
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public  double length( ){
        return (Math.sqrt((this.x2 - this.x1)*(this.x2-this.x1) - (this.y2-this.y1)*(this.y2-this.y1)));
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Line)) return false;
        Line line = (Line) o;
        return x1 == line.x1 &&
                y1 == line.y1 &&
                x2 == line.x2 &&
                y2 == line.y2;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x1, y1, x2, y2);
    }

}

