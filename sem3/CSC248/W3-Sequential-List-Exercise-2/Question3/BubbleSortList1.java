import java.util.ArrayList;

public class BubbleSortList1 {
        public static void main(String[] args) {
                PreSchool ps = new PreSchool();
                ArrayList PSList = new ArrayList();
                
                ps = new PreSchool("suffian", "malay", 5);
                PSList.add(ps);
                ps = new PreSchool("alma", "malay", 6);
                PSList.add(ps);
                ps = new PreSchool("jenny", "chinese", 3);
                PSList.add(ps);
                ps = new PreSchool("gopal", "indian", 4);
                PSList.add(ps);
                ps = new PreSchool("mei mei", "chinese", 3);
                PSList.add(ps);

                System.out.println("Original contents of the array");
                System.out.print(PSList + " ");
                System.out.println();

                bubbleSort(PSList);

                System.out.println("\n\nContents of the array after sorting");
                System.out.print(PSList + " ");
                System.out.println();
        }

        static void bubbleSort(ArrayList arr) {
                for (int i = 0; i < arr.size() - 1; i++) {
                        for (int j = 1; j < arr.size() - i; j++) {
                                int ps0 = ((PreSchool) arr.get(j-1)).getAge();
                                int ps1 = ((PreSchool) arr.get(j)).getAge();

                                if (ps0 > ps1) {
                                        PreSchool temp = (PreSchool) arr.get(j-1);
                                        arr.set(j-1, arr.get(j));
                                        arr.set(j, temp);
                                }
                        }
                }
        }
}
