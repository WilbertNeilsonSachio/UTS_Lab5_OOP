package SoalUTS4;
public class CalculationMethod {

    //Calculate Voltage
    public static double VoltageCurrentResistance(double current, double resistance) {
        return current * resistance;
    }
    public static double VoltagePowerCurrent(double power, double current) {
        return power / current;
    }
    public static double VoltagePowerResistance(double power, double resistance) {
        return Math.sqrt(power * resistance);
    }

    // Calculate Current
    public static double CurrentVoltageResistance(double voltage, double resistance) {
        return voltage / resistance;
    }
    public static double CurrentPowerVoltage(double power, double voltage) {
        return power / voltage;
    }
    public static double CurrentPowerResistance(double power, double resistance) {
        return Math.sqrt(power / resistance);
    }

    // Calculate Resistance
    public static double ResistanceVoltageCurrent(double voltage, double current) {
        return voltage / current;
    }
    public static double ResistancePowerCurrent(double power, double current) {
        return power / (current * current);
    }
    public static double ResistanceVoltagePower(double voltage, double power) {
        return (voltage * voltage) / power;
    }

    // Calculate Power
    public static double PowerVoltageCurrent(double voltage, double current) {
        return voltage * current;
    }
    public static double PowerCurrentResistance(double current, double resistance) {
        return current * current * resistance;
    }
    public static double PowerVoltageResistance(double voltage, double resistance) {
        return (voltage * voltage) / resistance;
    }
}
