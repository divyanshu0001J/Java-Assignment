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
       void area(){
            this.area= side*side;
        }

        @Override
       void perimeter(){
           this.perimeter=4*side;
        }
    }
  
