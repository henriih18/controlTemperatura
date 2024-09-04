package model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
public class TemperatureReading {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private double temperature;
    private LocalDateTime readingTime;

    @ManyToOne
    @JoinColumn(name = "device_id")
    private Device device;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public LocalDateTime getReadingTime() {
        return readingTime;
    }

    public void setReadingTime(LocalDateTime readingTime) {
        this.readingTime = readingTime;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    /* // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public double getTemperature() { return temperature; }
    public void setTemperature(double temperature) { this.temperature = temperature; }

    public LocalDateTime getReadingTime() { return readingTime; }
    public void setReadingTime(LocalDateTime readingTime) { this.readingTime = readingTime; }

    public Device getDevice() { return device; }
    public void setDevice(Device device) { this.device = device; }*/
}