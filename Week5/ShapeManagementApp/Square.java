 public class Square extends Shape{
        private double side;

        public Square(double side,String color){
            super(color);
            if(side<=0){
                return;
            }
            this.side=side;
        }

        @Override
        double area(){
            return side*side;
        }

        @Override
        double perimeter(){
            return 4*side;
        }
    }
  