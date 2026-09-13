public abstract class Shape {
        private String color;
        protected double area;
        protected double perimeter;

        Shape(String color) {
            this.color = color;
        }

        abstract void area();

        abstract void perimeter();
        public void setColor(String color) {
            this.color = color;
        }
        public String getColor() {
            return color;
        }
        public double getArea() {
            return area;
        }
        public double getPerimeter() {
            return perimeter;
        }

        
    }
    