package com.github;

public interface GardenPlot {
    String getLocation();
    void setLocation(String location);
    String getMeteorologicalData();
    void setMeteorologicalData(String meteorologicalData);
    String getSection();
    void addSection(String section);
    void deleteSection(String section);
    String getSubsection();
    void addSubsection(String section);
    void deleteSubsection(String section);
}
