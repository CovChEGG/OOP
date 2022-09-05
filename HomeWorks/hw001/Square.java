public class Square extends Shapes {
        private int side;

        protected Square(Color color, Point mainPoint, int side){
            super(color, mainPoint);
            setSide(side);
        }
        @Override
        protected double area() {
            return Math.pow(side, 2);
        }
        public void setSide(int side) {
            this.side = side;
            super.setArea(area());
        }
    }
