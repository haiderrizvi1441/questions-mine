package DesignPattern.BuilderDesignPattern;

public class Computer {
    
    private String cpu;
    private int ram;
    private boolean hasMonitor;
    private boolean hasMouse;
    private boolean hasKeyboard;
    public String getCpu() {
        return cpu;
    }
    public int getRam() {
        return ram;
    }
    public boolean isHasMonitor() {
        return hasMonitor;
    }
    public boolean isHasMouse() {
        return hasMouse;
    }
    public boolean isHasKeyboard() {
        return hasKeyboard;
    }

    public Computer(String cpu, int ram, boolean hasMonitor, boolean hasKeyboard, boolean hasMouse){
        this.cpu = cpu;
        this.ram = ram;
        this.hasMonitor = hasMonitor;
        this.hasKeyboard = hasKeyboard;
        this.hasMouse = hasMouse;
    }


    // Builder Class
    public static class ComputerBuilder{
        private String cpu;
        private int ram;
        private boolean hasMonitor;
        private boolean hasMouse;
        private boolean hasKeyboard;

        public ComputerBuilder setCpu(String cpu){
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder setRam(int ram){
            this.ram = ram;
            return this;
        }

        public ComputerBuilder setHasMonitor(boolean hasMonitor){
            this.hasMonitor = hasMonitor;
            return this;
        }
    }

    
}
