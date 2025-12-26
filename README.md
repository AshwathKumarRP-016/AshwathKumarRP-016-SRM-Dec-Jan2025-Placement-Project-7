# Temperature Converter Web Application

CLICK Temperature Converter --> CLICK src --> CLICK main --> CLICK java --> temperatureconverter --> SERVLET Temperatureconvert.java FILE  | CLICK webapp ---> Temp.html


## 📋 Project Overview
A Java-based web application that converts temperature from Celsius to Fahrenheit using Servlet technology. The application implements the standard conversion formula **F = (C × 9/5) + 32** and provides a clean, user-friendly interface for temperature conversion.

## 🎯 Features
- **Accurate Conversion**: Implements the precise Celsius to Fahrenheit formula
- **User-friendly Interface**: Simple and intuitive design
- **Error Handling**: Validates input and displays appropriate messages
- **Real-time Results**: Instant conversion calculation
- **Back Navigation**: Easy option to convert another temperature
- **No Database**: Works without JDBC as per requirements


## 📊 How to Use

### Step 1: Enter Temperature
1. Open the application in browser
2. Enter temperature value in Celsius
   - Example: `100` for boiling water
   - Example: `0` for freezing point
   - Example: `37` for body temperature

### Step 2: Convert
1. Click **"Convert to Fahrenheit"** button
2. Wait for calculation (instant)

### Step 3: View Results
The result page displays:
- Original Celsius temperature
- Converted Fahrenheit temperature
- Calculation steps
- Quick temperature reference
- Option to convert another temperature

### Step 4: Convert Again
1. Click **"Convert Another Temperature"** button
2. Returns to input form
3. Enter new value and repeat

## 🧮 Conversion Formula

### Mathematical Formula
```
Fahrenheit = (Celsius × 9/5) + 32
```

### Example Calculations

| Celsius | Calculation | Fahrenheit |
|---------|------------|------------|
| 0°C | (0 × 9/5) + 32 | 32°F |
| 100°C | (100 × 9/5) + 32 | 212°F |
| 25°C | (25 × 9/5) + 32 | 77°F |
| -40°C | (-40 × 9/5) + 32 | -40°F |
| 37°C | (37 × 9/5) + 32 | 98.6°F |
