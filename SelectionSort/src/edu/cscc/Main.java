package edu.cscc;
import java.util.Arrays;

// Aidan McBride 9/24/23 Selection Sort

public class Main {

    public static void main(String[] args) {

        String[] words = {"Sol", "Mercury", "Venus", "Earth", "Moon", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"};


        // Display the contents of the array
        System.out.println("UNSORTED: " + Arrays.toString(words));

        // Call the selectionSort method
        selectionSort(words, "az");

        // Display the sorted contents of the array
        System.out.println("SORTED: " + Arrays.toString(words));

        // Sorted in reverse
        selectionSort(words, "za");
        System.out.println("SORTED (REVERSE): " + Arrays.toString(words));
    }

    private static void selectionSort(String[] elements, String direction) {
        boolean alphabetically = true;
        if (direction.equalsIgnoreCase("az")) {
            alphabetically = true;
        } else if (direction.equalsIgnoreCase("za")) {
            alphabetically = false;
        }
            for (int i = 0; i < elements.length - 1; i++) {
                // Find index of smallest remaining element
                int indexSmallest = i;
                for (int j = i + 1; j < elements.length; j++) {
                    if (alphabetically && elements[j].compareToIgnoreCase(elements[indexSmallest]) < 0) {
                        indexSmallest = j;
                    } else if (!alphabetically && elements[j].compareToIgnoreCase(elements[indexSmallest]) > 0) {
                        indexSmallest = j;
                    }
                }
// if (elements[j] < elements[indexSmallest])
                // Swap elements[i] and elements[indexSmallest]
                String temp = elements[i];
                elements[i] = elements[indexSmallest];
                elements[indexSmallest] = temp;
            }
        }
    }