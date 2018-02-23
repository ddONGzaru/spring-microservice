package io.manasobi;


import org.jasypt.intf.cli.JasyptPBEStringDecryptionCLI;

public class JasyptDecoder {

	public static void main(String[] args) {
		encrypt("jE87X9pNJoBL8faDq9oWUg==");
	}

	private static void encrypt(String input) {

		String[] args = {"input=" + input, "password=raon12#$"};

		JasyptPBEStringDecryptionCLI.main(args);
	}
}
