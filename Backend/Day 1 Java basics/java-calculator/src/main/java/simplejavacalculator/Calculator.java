/**
 * @name        Simple Java Calculator
 * @package     ph.main.java.calculator
 * @file        Main.java
 * @author      SORIA Pierre-Henry
 * @email       pierrehs@hotmail.com
 * @link        http://github.com/pH-7
 * @copyright   Copyright Pierre-Henry SORIA, All Rights Reserved.
 * @license     Apache (http://www.apache.org/licenses/LICENSE-2.0)
 */

package simplejavacalculator;

import calculator.CalculatorFunctions;

import static java.lang.Double.NaN;

public class Calculator {

    public enum BiOperatorModes {
        normal, add, minus, multiply, divide , xpowerofy 
    }

    public enum MonoOperatorModes {
        square, squareRoot, oneDividedBy,log , rate, abs
    }

    private Double num1, num2;
    private BiOperatorModes mode = BiOperatorModes.normal;

    private Double calculateBiImpl() {
        if (mode == BiOperatorModes.normal) {
            return num2;
        }
        if (mode == BiOperatorModes.add) {
            if (num2 != 0) {
                return CalculatorFunctions.add(num1, num2);
            }

            return num1;
        }
        if (mode == BiOperatorModes.minus) {
            return CalculatorFunctions.subtract(num1, num2);
        }
        if (mode == BiOperatorModes.multiply) {
            return CalculatorFunctions.multiply(num1, num2);
        }
        if (mode == BiOperatorModes.divide) {
            return CalculatorFunctions.divide(num1, num2);
        }
        if (mode == BiOperatorModes.xpowerofy) {
            return CalculatorFunctions.power(num1, num2);
        }

        // never reach
        throw new Error();
    }


    public Double calculateBi(BiOperatorModes newMode, Double num) {
        if (mode == BiOperatorModes.normal) {
            num2 = 0.0;
            num1 = num;
            mode = newMode;
            return NaN;
        } else {
            num2 = num;
            num1 = calculateBiImpl();
            mode = newMode;
            return num1;
        }
    }

    public Double calculateEqual(Double num) {
        return calculateBi(BiOperatorModes.normal, num);
    }

    public Double reset() {
        num2 = 0.0;
        num1 = 0.0;
        mode = BiOperatorModes.normal;

        return NaN;
    }

    public Double calculateMono(MonoOperatorModes newMode, Double num) {
        if (newMode == MonoOperatorModes.square) {
            return CalculatorFunctions.square(num);
        }
        if (newMode == MonoOperatorModes.squareRoot) {
            return CalculatorFunctions.squareRoot(num);
        }
        if (newMode == MonoOperatorModes.oneDividedBy) {
            return CalculatorFunctions.oneDividedBy(num);
        }
        if (newMode == MonoOperatorModes.log) {
            return CalculatorFunctions.log(num);
        }
        if (newMode == MonoOperatorModes.rate) {
           return CalculatorFunctions.rate(num);
        }
        if (newMode == MonoOperatorModes.abs){
            return CalculatorFunctions.abs(num);
        }

        // never reach
        throw new Error();
    }

}
