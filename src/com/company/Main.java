package com.company;

import org.apache.commons.codec.digest.DigestUtils;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Main {

    public static void main(String[] args) throws Exception{
        URL url = new URL("https://ebelge.gib.gov.tr/dosyalar/kilavuzlar/e-Arsiv_Fatura_5bin-30binTL_Fatura_Duzenleme_Kilavuzu.pdf");

        URLConnection httpUrlConnection = url.openConnection();

        InputStream inputStream = httpUrlConnection.getInputStream();

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));

        System.out.println("Parolanın Şifrelenmiş Hali:(md5Digest) " +  DigestUtils.md5Hex(inputStream));

        bufferedReader.close();
    }
}
