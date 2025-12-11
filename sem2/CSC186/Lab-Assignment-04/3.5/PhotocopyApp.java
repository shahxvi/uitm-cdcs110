import java.io.*;
import java.util.Scanner;

public class PhotocopyApp {
    public static void main(String[] args) {
        try {
            Scanner fileInput = new Scanner(new File("photocopyInfo.txt"));
            Photocopy[] copiesArr = new Photocopy[200];

            // Get the number of records in the file
            int size = 0;
            while (fileInput.hasNext()) {
                fileInput.nextLine();
                size++;
            }
            fileInput.close();

            // Stores the tokens in memory and output it to quizRequest.txt
            fileInput = new Scanner(new File("photocopyInfo.txt")); // Reset the input scanner
            PrintWriter outputFile = new PrintWriter("quizRequest.txt");
            int index = 0;

            int sumOfTotalCopies = 0;

            // Output file header
            outputFile.printf("Details of request for Quiz:\n");
            while (fileInput.hasNext() && index < size) {
                String record = fileInput.nextLine();
                String[] token = record.split(",");

                String name = token[0];
                String staffID = token[1];
                String facultyCode = token[2];
                String assessmentType = token[3];
                int masterCopyNumber = Integer.parseInt(token[4]);
                int requiredCopyNumber = Integer.parseInt(token[5]);

                copiesArr[index] = new Photocopy();
                copiesArr[index].setPhotocopy(name, staffID, facultyCode, assessmentType, masterCopyNumber, requiredCopyNumber);

                outputFile.printf("%-8s    %-31s    %-25s    %-5s\n", "Staff ID", "Number of pages for master copy", "Number of copies required", "Total");
                outputFile.print(copiesArr[index].toString());

                sumOfTotalCopies += masterCopyNumber * requiredCopyNumber;
                index++;
            }

            int oneReam = 500; // papers
            int numberOfReamsNeeded = sumOfTotalCopies / oneReam;
            outputFile.printf("Number of reams needed: %d", numberOfReamsNeeded);

            outputFile.close();

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
