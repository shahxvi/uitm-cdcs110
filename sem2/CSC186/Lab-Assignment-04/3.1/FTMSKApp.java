/* MIT License
 * Copyright (c) <2025> <Shah> <2025171523@student.uitm.edu.my>
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in shall
 * copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
 * SOFTWARE. */

import java.util.Scanner;
import java.io.*;

public class FTMSKApp {
    public static void main(String[] args) {
        final int CS110 = 0;
        int numberOfMaleCS110 = 0;
        final int CS111 = 1;
        int numberOfMaleCS111 = 0;

        try {
            File inputFile = new File("FTMSK.txt");
            Scanner inputReader = new Scanner(inputFile);

            // Create File
            PrintWriter[] outputFile = new PrintWriter[2];
            for (int i = 0; i < outputFile.length; i++)
                outputFile[i] = new PrintWriter((i == 0 ? "CS110" : "CS111") + "Male.txt");

            // File header
            for (int i = 0; i < outputFile.length; i++) {
                outputFile[i].println("            Male Students from " + (i == 0 ? "CS110" : "CS111"));
                outputFile[i].printf("%-13s  %-21s  %-1s\n", "Matric Number", "Name", "Part");
            }

            while (inputReader.hasNext()) {
                String record = inputReader.nextLine();
                String[] token = record.split(";");

                String matrixNumber = token[0];
                String name = token[1];
                String programCode = token[2];
                String part = token[3];
                String gender = token[4];

                boolean isCS110 = programCode.equalsIgnoreCase("CS110");
                boolean isCS111 = programCode.equalsIgnoreCase("CS111");
                boolean isMale = gender.equalsIgnoreCase("M");

                if (isCS110 && isMale) {
                    outputFile[CS110].printf("%-13s  %-21s  %-1s\n", matrixNumber, name, part);
                    numberOfMaleCS110++;
                }
                if (isCS111 && isMale) {
                    outputFile[CS111].printf("%-13s  %-21s  %-1s\n", matrixNumber, name, part);
                    numberOfMaleCS111++;
                }
            }
            inputReader.close();

            for (int i = 0; i < outputFile.length; i++) {
                String programCode = (i == 0) ? "CS110" : "CS111";
                outputFile[i].println(
                        "Number of male students for " + ((i == 0) ? "CS110" : "CS111") + ": " + numberOfMaleCS110);
            }

            for (int i = 0; i < outputFile.length; i++)
                outputFile[i].close();
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
