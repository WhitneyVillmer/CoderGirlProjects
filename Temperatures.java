package com.company;

public class Temperatures {

	public static void main(String[] args) {

		System.out.println("Temperature Calculator");


		int[][] temps = {
				{68, 70, 76, 70, 68, 71, 75},
				{76, 76, 87, 84, 82, 75, 83},
				{73, 72, 81, 78, 76, 73, 77},
				{64, 65, 69, 68, 70, 74, 72}};


		int columnTotal = 0;

		for (int i = 0; i < temps.length; i++) {
			columnTotal += temps[i][0];
		}

		int columnTotal1 = 0;

		for (int i = 0; i < temps.length; i++) {
			columnTotal1 += temps[i][1];
		}

		float average1 = columnTotal1 / temps.length;

		int columnTotal2 = 0;

		for (int i = 0; i < temps.length; i++) {
			columnTotal2 += temps[i][2];
		}

		float average2 = columnTotal2 / temps.length;

		int columnTotal3 = 0;

		for (int i = 0; i < temps.length; i++) {
			columnTotal3 += temps[i][3];
		}

		float average3 = columnTotal3 / temps.length;

		int columnTotal4 = 0;

		for (int i = 0; i < temps.length; i++) {
			columnTotal4 += temps[i][4];
		}

		float average4 = columnTotal4 / temps.length;

		int columnTotal5 = 0;

		for (int i = 0; i < temps.length; i++) {
			columnTotal5 += temps[i][5];
		}

		float average5 = columnTotal5 / temps.length;

		int columnTotal6 = 0;

		for (int i = 0; i < temps.length; i++) {
			columnTotal6 += temps[i][6];
		}

		float average6 = columnTotal6 / temps.length;

		int rowTotal = 0;

		for (int j = 0; j < temps.length; j++) {
			rowTotal += temps[0][j];
		}

		float averageRow = rowTotal / temps.length;

		int rowTotal1 = 0;

		for (int j = 0; j < temps.length; j++) {
			rowTotal1 += temps[1][j];
		}

		float averageRow1 = rowTotal1 / temps.length;

		int rowTotal2 = 0;

		for (int j = 0; j < temps.length; j++) {
			rowTotal2 += temps[2][j];
		}

		float averageRow2 = rowTotal2 / temps.length;

		int rowTotal3 = 0;

		for (int j = 0; j < temps.length; j++) {
			rowTotal3 += temps[3][j];
		}

		float averageRow3 = rowTotal3 / temps.length;

		System.out.println();
		System.out.println("The data provided are:");
		System.out.print("     ");

		System.out.println();
		String[] days = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
		for (int indDay = 0; indDay < 2; indDay++) {
			System.out.println("     " + days[0] + " " + days[1] + " " + days[2] + " " + days[3] +
					" " + days[4] + " " + days[5] + " " + days[6]);

			System.out.println("7 AM: " + temps[0][0] + ", "
					+ temps[0][1] + ", "
					+ temps[0][2] + ", "
					+ temps[0][3] + ", "
					+ temps[0][4] + ", "
					+ temps[0][5] + ", "
					+ temps[0][6]);
			System.out.println("3 PM: " + temps[1][0] + ", "
					+ temps[1][1] + ", "
					+ temps[1][2] + ", "
					+ temps[1][3] + ", "
					+ temps[1][4] + ", "
					+ temps[1][5] + ", "
					+ temps[1][6]);
			System.out.println("7 PM: "
					+ temps[2][0] + ", "
					+ temps[2][1] + ", "
					+ temps[2][2] + ", "
					+ temps[2][3] + ", "
					+ temps[2][4] + ", "
					+ temps[2][5] + ", "
					+ temps[2][6]);
			System.out.println("3 AM: "
					+ temps[3][0] + ", "
					+ temps[3][1] + ", "
					+ temps[3][2] + ", "
					+ temps[3][3] + ", "
					+ temps[3][4] + ", "
					+ temps[3][5] + ", "
					+ temps[3][6]);

			System.out.println();
			float averageSun = ((temps[0][0] + temps[1][0] + temps[2][0] + temps[3][0]) / 4);
			System.out.println("The average temperature for Sunday is " + averageSun);
			float averageMon = ((temps[0][1] + temps[1][1] + temps[2][1] + temps[3][1]) / 4);
			System.out.println("The average temperature for Monday is " + averageMon);
			float averageTue = ((temps[0][2] + temps[1][2] + temps[2][2] + temps[3][2]) / 4);
			System.out.println("The average temperature for Tuesday is: " + averageTue);
			float averageWed = ((temps[0][3] + temps[1][3] + temps[2][3] + temps[3][3]) / 4);
			System.out.println("The average temperature for Wednesday is: " + averageWed);
			float averageThu = ((temps[0][4] + temps[1][4] + temps[2][4] + temps[3][4]) / 4);
			System.out.println("The average temperature for Thursday is: " + averageThu);
			float averageFri = ((temps[0][5] + temps[1][5] + temps[2][5] + temps[3][5]) / 4);
			System.out.println("The average temperature for Friday is: " + averageFri);
			float averageSat = ((temps[0][6] + temps[1][6] + temps[2][6] + temps[3][6]) / 4);
			System.out.println("The average temperature for Saturday is: " + averageSat);
			System.out.println();
			System.out.println("The average temperature for 7 AM: " + averageRow);
			System.out.println("The average temperature for 3 PM: " + averageRow1);
			System.out.println("The average temperature for 7 PM: " + averageRow2);
			System.out.println("The average temperature for 3 AM: " + averageRow3);
			System.out.println();
			int total = 0;
			int cellCount = 0;
			for(int row = 0; row < temps.length; row++) {
				for (int col = 0; col < temps[row].length; col++) {
					total += temps[row][col];
					cellCount += 1;
				}
			}
			float cellAverage = total/cellCount;
			System.out.println("The final average temperature for the week was: " + cellAverage);

		}
	}
}