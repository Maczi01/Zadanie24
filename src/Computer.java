//import java.util.Objects;

public class Computer implements Comparable<Computer>{

    private String name;
    private int processorSpeed;
    private int ramMemory;

    public Computer(String name, int processorSpeed, int ramMemory) {
        this.name = name;
        this.processorSpeed = processorSpeed;
        this.ramMemory = ramMemory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getProcessorSpeed() {
        return processorSpeed;
    }

    public void setProcessorSpeed(int processorSpeed) {
        this.processorSpeed = processorSpeed;
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }



    @Override
    public String toString() {
        return  name + ": procesor: " + processorSpeed +
                ", RAM: " + ramMemory;
    }

    @Override
    public int compareTo(Computer other) {
        if (this.processorSpeed > other.processorSpeed) {
            return 1;
        } else if (this.processorSpeed == other.processorSpeed) {
            if (this.ramMemory > other.ramMemory) {
                return 1;
            } else if (this.ramMemory == other.ramMemory) {
                if (this.name.compareTo(other.name) == 1) {
                    return 1;
                } else if (this.name.compareTo(other.name) == 0) {
                    return 0;
                }
                return -1;
            }
            return -1;
        }
        return -1;
    }
    }


