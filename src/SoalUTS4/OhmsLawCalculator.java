package SoalUTS4;

import java.util.Scanner;

public class OhmsLawCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Ohm's Law Calculator");
        System.out.println("1. Calculate Voltage (V)");
        System.out.println("2. Calculate Current (I)");
        System.out.println("3. Calculate Resistance (R)");
        System.out.println("4. Calculate Power (P)");
        System.out.print("Choose an option (1-4): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // Calculate Voltage (V)
                System.out.println("1. Known: Current (I) and Resistance (R)");
                System.out.println("2. Known: Power (P) and Current (I)");
                System.out.println("3. Known: Power (P) and Resistance (R)");
                System.out.print("Choose an option (1-3): ");
                int optionV = scanner.nextInt();
                switch (optionV) {
                    case 1:
                        System.out.print("Enter Current (I) in Amperes: ");
                        double current = scanner.nextDouble();
                        System.out.print("Enter Resistance (R) in Ohms: ");
                        double resistance = scanner.nextDouble();
                        double voltage = CalculationMethod.VoltageCurrentResistance(current, resistance);
                        System.out.println("Voltage (V) = " + voltage + " Volts");
                        break;
                    case 2:
                        System.out.print("Enter Power (P) in Watts: ");
                        double power = scanner.nextDouble();
                        System.out.print("Enter Current (I) in Amperes: ");
                        current = scanner.nextDouble();
                        voltage = CalculationMethod.VoltagePowerCurrent(power, current);
                        System.out.println("Voltage (V) = " + voltage + " Volts");
                        break;
                    case 3:
                        System.out.print("Enter Power (P) in Watts: ");
                        power = scanner.nextDouble();
                        System.out.print("Enter Resistance (R) in Ohms: ");
                        resistance = scanner.nextDouble();
                        voltage = CalculationMethod.VoltagePowerResistance(power, resistance);
                        System.out.println("Voltage (V) = " + voltage + " Volts");
                        break;
                    default:
                        System.out.println("Invalid");
                }
                break;

            case 2: // Calculate Current (I)
                System.out.println("1. Known: Voltage (V) and Resistance (R)");
                System.out.println("2. Known: Power (P) and Voltage (V)");
                System.out.println("3. Known: Power (P) and Resistance (R)");
                System.out.print("Choose an option (1-3): ");
                int optionI = scanner.nextInt();
                switch (optionI) {
                    case 1:
                        System.out.print("Enter Voltage (V) in Volts: ");
                        double voltage = scanner.nextDouble();
                        System.out.print("Enter Resistance (R) in Ohms: ");
                        double resistance = scanner.nextDouble();
                        double current = CalculationMethod.CurrentVoltageResistance(voltage, resistance);
                        System.out.println("Current (I) = " + current + " Amperes");
                        break;
                    case 2:
                        System.out.print("Enter Power (P) in Watts: ");
                        double power = scanner.nextDouble();
                        System.out.print("Enter Voltage (V) in Volts: ");
                        voltage = scanner.nextDouble();
                        current = CalculationMethod.CurrentPowerVoltage(power, voltage);
                        System.out.println("Current (I) = " + current + " Amperes");
                        break;
                    case 3:
                        System.out.print("Enter Power (P) in Watts: ");
                        power = scanner.nextDouble();
                        System.out.print("Enter Resistance (R) in Ohms: ");
                        resistance = scanner.nextDouble();
                        current = CalculationMethod.CurrentPowerResistance(power, resistance);
                        System.out.println("Current (I) = " + current + " Amperes");
                        break;
                    default:
                        System.out.println("Invalid");
                }
                break;

            case 3: // Calculate Resistance (R)
                System.out.println("1. Known: Voltage (V) and Current (I)");
                System.out.println("2. Known: Power (P) and Current (I)");
                System.out.println("3. Known: Voltage (V) and Power (P)");
                System.out.print("Choose an option (1-3): ");
                int optionR = scanner.nextInt();
                switch (optionR) {
                    case 1:
                        System.out.print("Enter Voltage (V) in Volts: ");
                        double voltage = scanner.nextDouble();
                        System.out.print("Enter Current (I) in Amperes: ");
                        double current = scanner.nextDouble();
                        double resistance = CalculationMethod.ResistanceVoltageCurrent(voltage, current);
                        System.out.println("Resistance (R) = " + resistance + " Ohms");
                        break;
                    case 2:
                        System.out.print("Enter Power (P) in Watts: ");
                        double power = scanner.nextDouble();
                        System.out.print("Enter Current (I) in Amperes: ");
                        current = scanner.nextDouble();
                        resistance = CalculationMethod.ResistancePowerCurrent(power, current);
                        System.out.println("Resistance (R) = " + resistance + " Ohms");
                        break;
                    case 3:
                        System.out.print("Enter Voltage (V) in Volts: ");
                        voltage = scanner.nextDouble();
                        System.out.print("Enter Power (P) in Watts: ");
                        power = scanner.nextDouble();
                        resistance = CalculationMethod.ResistanceVoltagePower(voltage, power);
                        System.out.println("Resistance (R) = " + resistance + " Ohms");
                        break;
                    default:
                        System.out.println("Invalid");
                }
                break;

            case 4: // Calculate Power (P)
                System.out.println("1. Known: Voltage (V) and Current (I)");
                System.out.println("2. Known: Current (I) and Resistance (R)");
                System.out.println("3. Known: Voltage (V) and Resistance (R)");
                System.out.print("Choose an option (1-3): ");
                int optionP = scanner.nextInt();
                switch (optionP) {
                    case 1:
                        System.out.print("Enter Voltage (V) in Volts: ");
                        double voltage = scanner.nextDouble();
                        System.out.print("Enter Current (I) in Amperes: ");
                        double current = scanner.nextDouble();
                        double power = CalculationMethod.PowerVoltageCurrent(voltage, current);
                        System.out.println("Power (P) = " + power + " Watts");
                        break;
                    case 2:
                        System.out.print("Enter Current (I) in Amperes: ");
                        current = scanner.nextDouble();
                        System.out.print("Enter Resistance (R) in Ohms: ");
                        double resistance = scanner.nextDouble();
                        power = CalculationMethod.PowerCurrentResistance(current, resistance);
                        System.out.println("Power (P) = " + power + " Watts");
                        break;
                    case 3:
                        System.out.print("Enter Voltage (V) in Volts: ");
                        voltage = scanner.nextDouble();
                        System.out.print("Enter Resistance (R) in Ohms: ");
                        resistance = scanner.nextDouble();
                        power = CalculationMethod.PowerVoltageResistance(voltage, resistance);
                        System.out.println("Power (P) = " + power + " Watts");
                        break;
                    default:
                        System.out.println("Invalid");
                }
                break;

            default:
                System.out.println("Invalid");
        }
        scanner.close();
    }
}
