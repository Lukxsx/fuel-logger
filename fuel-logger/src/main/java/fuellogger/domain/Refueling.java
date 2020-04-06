package fuellogger.domain;

import java.util.Objects;

public class Refueling {
    public Car car;
    public int odometer;
    public double volume;
    public int day;
    public int month;
    public int year;

    public Refueling(Car car, int odometer, double volume, int day, int month, int year) {
        this.car = car;
        this.odometer = odometer;
        this.volume = volume;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return car + " " + odometer + " " + volume + " " + day + " " + month +
                " " + year;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.car);
        hash = 37 * hash + this.odometer;
        hash = 37 * hash + (int) (Double.doubleToLongBits(this.volume) ^ (Double.doubleToLongBits(this.volume) >>> 32));
        hash = 37 * hash + this.day;
        hash = 37 * hash + this.month;
        hash = 37 * hash + this.year;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Refueling other = (Refueling) obj;
        if (this.odometer != other.odometer) {
            return false;
        }
        if (Double.doubleToLongBits(this.volume) != Double.doubleToLongBits(other.volume)) {
            return false;
        }
        if (this.day != other.day) {
            return false;
        }
        if (this.month != other.month) {
            return false;
        }
        if (this.year != other.year) {
            return false;
        }
        if (!Objects.equals(this.car, other.car)) {
            return false;
        }
        return true;
    }
    
    
}