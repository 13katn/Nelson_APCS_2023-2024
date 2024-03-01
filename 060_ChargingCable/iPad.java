class iPad {
    private String connectionType;
    private int currentCharge;
    public iPad(String connectionType, int currentCharge) {
        this.connectionType = connectionType;
        this.currentCharge = currentCharge;
    }
    // Getters and setters again
    public String getConnectionType() {
        return connectionType;
    }
    public void setConnectionType(String connectionType) {
        this.connectionType = connectionType;
    }
    public int getCurrentCharge() {
        return currentCharge;
    }
    public void setCurrentCharge(int currentCharge) {
        this.currentCharge = currentCharge;
    }

    public static void main(String[] args) {}
}
