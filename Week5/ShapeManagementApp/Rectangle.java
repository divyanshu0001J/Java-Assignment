public class Rectangle extends Shape{
        private double length,width;

        public Rectangle(double length,double width,String color){
            super(color);
            if(length<=0 || width<=0){
                return;
            }
            this.length=length;
            this.width=width;
        }

        @Override
        void area(){
            this.area=length*width;
        }

        @Override
      void  perimeter(){
           this.perimeter=2*(length+bredth);
        }
    }
