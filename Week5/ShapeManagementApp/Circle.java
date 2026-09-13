public class Circle extends Shape{
        private double radius;

        public Circle(double radius,String color){
            super(color);
            if(radius<=0){
                return;
            }
            this.radius=radius;
        }

        @Override
        void area(){
            this.area = 3.14*radius*radius;
        }

        @Override
        void perimeter(){
            this.perimeter = 2*3.14*radius;
        }
        public void setRadius(double radius){
            if(radius<=0){
                return;
            }
            this.radius=radius;
        }
    }