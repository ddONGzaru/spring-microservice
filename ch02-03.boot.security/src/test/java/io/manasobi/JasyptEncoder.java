package io.manasobi;


import org.jasypt.intf.cli.JasyptPBEStringEncryptionCLI;

public class JasyptEncoder {

	public static void main(String[] args) {
		encrypt("guest");
	}

	private static void encrypt(String input) {

		String[] args = {"input=" + input, "password=raon12#$"};

		JasyptPBEStringEncryptionCLI.main(args);
	}
}
