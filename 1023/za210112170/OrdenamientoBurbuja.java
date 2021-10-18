import java.util.Scanner;

public class OrdenamientoBurbuja {

    Scanner in = new Scanner(System.in);
    int[] nums = new int[5];

    public void doGetDataAndSaveData() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Ingrese el número" + (i + 1) + "Número:");
            nums[i] = in.nextInt();
        }
        System.out.println("Antes de ordenar:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

    }


    public void doCompareData() {
        for (int i = 1; i < 5; i++) {
            for (int j = 0; j < 5 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }


        System.out.println("Después de ordenar:");
        for (int num : nums) {
            System.out.print(num + " ");
        }

    }


    public static void main(String[] args) {
        OrdenamientoBurbuja ms = new OrdenamientoBurbuja();
        ms.doGetDataAndSaveData();
        ms.doCompareData();
    }
}