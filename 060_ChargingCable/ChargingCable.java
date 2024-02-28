// gives the method 
        class ChargingCable {
            private String brand;
            private int length;
            private String connectionType;
        
            public ChargingCable(String brand, int length, String connectionType) {
                this.brand = brand;
                this.length = length;
                this.connectionType = connectionType;
            }
        
            // this is making the Gettrs and setters
            public String getBrand() { // just ,make the getter with get___ then return under and set with this.___
                return brand;
            }
            public void setBrand(String brand) {
                this.brand = brand;
            }
            public int getLength() {
                return length;
            }
            public void setLength(int length) {
                this.length = length;
            }
            public String getConnectionType() {
                return connectionType;
            }
            public void setConnectionType(String connectionType) {
                this.connectionType = connectionType;
            }
            public void charging() {
                System.out.println("your device is being connected with the " + connectionType + " type and is charging");
            }
            public static void main(String[] args) {}
        }