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

public class Main {
    public static void main(String[] args) {
        final int CS110 = 0;
        final int CS111 = 1;
        PrintWriter[] outputFile = new PrintWriter[2];

        try {
            File inputFile = new File("FTMSK.txt");
            Scanner inputReader = new Scanner(inputFile);
            outputFile[CS110] = new PrintWriter("CS110Male.txt");
            outputFile[CS111] = new PrintWriter("CS111Male.txt");

            for (int i = 0; i < outputFile.length; i++) {
                outputFile[i].println("\t\t\tMale Students from " + (i == 0 ? "CS110" : "CS111"));
                outputFile[i].printf("%s\t%-20s\t%-1s\n", "Matric Number", "Name", "Part");
            }

            while (inputReader.hasNext()) {
                String record = inputReader.nextLine();
                String[] tokens = record.split(";");
                if (tokens[2].equalsIgnoreCase("CS110") && tokens[4].equalsIgnoreCase("M")) {
                    outputFile[CS110].printf("%-10s\t\t%-20s\t%-1s\n", tokens[0], tokens[1], tokens[3]);
                }
                if (tokens[2].equalsIgnoreCase("CS111") && tokens[4].equalsIgnoreCase("M")) {
                    outputFile[CS111].printf("%-10s\t\t%-20s\t%-1s\n", tokens[0], tokens[1], tokens[3]);
                }
            }
            inputReader.close();
        } catch (IOException e) {
            System.out.println("An error occurred");
        } finally {
            for (int i = 0; i < outputFile.length; i++)
                outputFile[i].close();
        }
    }
}
