package com.rktirtho.ocp.conditions;

public class Label {

	public static void main(String[] args) {
//		int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 2, 7 } };
//		OUTER_LOOP: for (int[] mySimpleArray : myComplexArray) {
//			INNER_LOOP: for (int i = 0; i < mySimpleArray.length; i++) {
//				System.out.print(mySimpleArray[i] + "\t");
//			}
//			System.out.println();
//		}

		int[][] myComplexArray = { { 5, 2, 1, 3 }, { 3, 9, 8, 9 }, { 5, 7, 12, 7 } };
		OUTER_LOOP: for (int[] mySimpleArray : myComplexArray) {
			INNER_LOOP: for (int i = 0; i < mySimpleArray.length; i++) {
				System.out.print(mySimpleArray[i] + "\t");
			}
			System.out.println();
		}

		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 5) {
					// this line breaking inner loop
					break;
				}

//				System.out.println(i +" , "+j);

			}
		}

		PARENT_LOOP: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 5) {
					// this line breaking PARENT loop
					break PARENT_LOOP;
				}

				System.out.println(i + " , " + j);

			}
		}

//=====================================================================================
//										CONTINUE
//=====================================================================================
		System.out.println("==========================CONTINUE========================");
		PARENT_LOOP: for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 5) {
					System.out.println();
					// looping continue to PARENT LOOP
					continue PARENT_LOOP;

				}
				System.out.print("(" + i + "," + j + ")\t");
			}

		}

// =====================================================================================
//											CONTINUE
//=====================================================================================
		System.out.println("==========================RETURN========================");
		
		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			if (i==5) {
				return;
			}
		}
	}

}
