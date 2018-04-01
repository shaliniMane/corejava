package com.sunbeaminfo.cmdline;

public class CmdLineMain {
	public static void main(String[] args) {
		for (int i = 0; i < args.length; i++) {
			System.out.printf("Arg %d => %s\n", i, args[i]);
		}
	}
}
