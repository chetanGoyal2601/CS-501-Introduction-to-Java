public class C10E13MyRectangle2D {
    public double x;
    public double y;
    public double width;
    public double height;

    public C10E13MyRectangle2D() {
        x = 0;
        y = 0;
        width = 1;
        height = 1;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double w) {
        width = w;
    }

    public void setHeight(double h) {
        height = h;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getArea() {
        return height * width;
    }

    public double getPerimeter() {
        return 2 * (height + width);
    }

    public boolean contains(double x, double y) {
        if ((x <= this.x + this.width/2) && (x >= this.x - this.width/2) && (y <= this.y + this.height/2) && (y >= this.y - this.width/2)) {
            return true;
        }
        return false;
    }

    public boolean specialCase(C10E13MyRectangle2D r) {
        if (this.x == r.x && this.y == r.y && this.height == r.height && this.width == r.width) {
            return true;
        }
        return false;
    }

    public boolean contains(C10E13MyRectangle2D r) {
        if (!this.specialCase(r) && this.contains(r.x + r.width/2, r.y + r.height/2) && this.contains(r.x - r.width/2, r.y + r.height/2) && this.contains(r.x + r.width/2, r.y - r.height/2) && this.contains(r.x - r.width/2, r.y - r.height/2)) {
            return true;
        }
        return false;
    }

    public boolean overlaps(C10E13MyRectangle2D r) {
        if (!this.specialCase(r) && !this.contains(r) && !this.abuts(r) && ((this.contains(r.x + r.width/2, r.y + r.height/2) && !this.contains(r.x - r.width/2, r.y - r.height/2)) || (this.contains(r.x - r.width/2, r.y + r.height/2)
                && !this.contains(r.x + r.width/2, r.y - r.height/2)) || (!this.contains(r.x + r.width/2, r.y + r.height/2) && this.contains(r.x - r.width/2, r.y - r.height/2)) || (!this.contains(r.x - r.width/2, r.y + r.height/2) && this.contains(r.x + r.width/2, r.y - r.height/2)))) {
            return true;
        }
        return false;
    }

    public boolean abuts(C10E13MyRectangle2D r) {
        if (!this.specialCase(r) && !this.contains(r) && (this.x + this.width/2 == r.x - r.width/2 || this.x - this.width/2 == r.x + r.width/2 || this.y + this.height/2 == r.y - r.height/2 || this.y - this.height/2 == r.y + r.height/2)) {
            return true;
        }
        return false;
    }

    public boolean distinct(C10E13MyRectangle2D r) {
        if (!this.specialCase(r) && !this.contains(r) && !this.overlaps(r) && !this.abuts(r)) {
            return true;
        }
        return false;
    }
}