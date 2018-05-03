package ua.nure.dlubovskyi.Practice6.part6;

import java.util.Scanner;

public class Part6 {

	public static void main(String[] args) {
		String data = new Scanner(System.in).nextLine();
		CmdManager cmdManager = new CmdManager(data);
		cmdManager.getCommand().execute();
	}
}
