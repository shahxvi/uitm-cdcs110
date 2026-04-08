public class Computer {
        protected String code;
        protected String brand;
        protected double price;

        public Computer(String code, String brand, double price) {
                this.code = code;
                this.brand = brand;
                this.price = price;
        }

        public void setCode(String code) {
                this.code = code;
        }

        public void setBrand(String brand) {
                this.brand = brand;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public String getCode() {
                return code;
        }

        public String getBrand() {
                return brand;
        }

        public double getPrice() {
                return price;
        }

        public String toString() {
                return "Code: " + code +
                       " Brand: " + brand +
                       " Price: " + price;

        }
}
