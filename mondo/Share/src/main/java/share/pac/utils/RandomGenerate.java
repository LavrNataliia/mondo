package share.pac.utils;

import java.nio.charset.Charset;
import java.util.Random;

public class RandomGenerate{

    private Random random = new Random();
    private static final char[] pool = {
            'a','b','c','d','e','f','g',
            'h','i','j','k','l','m','n',
            'o','p','q','r','s','t','u',
            'v','w','x','y','z','0','1',
            '2','3','4','5','6','7','8',
            '9','A','B','C','D','E','F',
            'G','H','I','J','K','L','M',
            'N','O','P','Q','R','S','T',
            'U','V','W','X','Y','Z'};

    public char getChar() {
        return pool[random.nextInt(pool.length)];
    }

    public String getRandomLetterGenerateStrict(int length) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++)
            sb.append(getChar());
        return new String(sb);
    }

    public String getRandomLetterGenerateFree(int length) throws Exception {
        return getRandomLetterGenerateStrict(random.nextInt(length));
    }

    public CharSequence generateRandomNum(int lenght) throws Exception {

        StringBuilder sb = new StringBuilder();

        sb.append(random.nextInt(9)+1);

        for (int i = 1; i < lenght; i++) {
            sb.append(random.nextInt(10));
        }

        return new String(sb);}

    public String getRandomNumberGenerateStrict(int length) throws Exception {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < length; i++)
            sb.append(random.nextInt());
        return new String(sb);
    }

    public String getUnicodeRandomSymbolStrict(int length) throws Exception {
        byte[] array = new byte[length];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("Unicode"));
        return generatedString;
    }

    public String getUnicodeRandomSymbolFree(int length) throws Exception {
        byte[] array = new byte[random.nextInt(length)];
        new Random().nextBytes(array);
        String generatedString = new String(array, Charset.forName("Unicode"));
        return generatedString;
    }

    public String getRandomEmailStrict(int length1, int length2, int length3
            , String host) throws Exception {
        return getRandomLetterGenerateStrict(length1) + "." + getRandomLetterGenerateStrict(length2)
                + "@" + getRandomLetterGenerateStrict(length3) + "." + host;
    }

    public String getRandomEmailInv(int length1, int length2, String host) throws Exception {
        return getRandomLetterGenerateStrict(length1) + "." + getRandomLetterGenerateStrict(length2)
                 + "." + host;
    }

    public String getRandomEmailFree(int length1, String host) throws Exception {
        return getRandomLetterGenerateStrict(random.nextInt(length1))
                + "." + getRandomLetterGenerateStrict(random.nextInt(length1))
                + "@" + getRandomLetterGenerateStrict(random.nextInt(length1)) + "." + host;
    }

    public String getRandomPage(String api) throws Exception {
        String formatPageInfo = api.substring(16, api.length() - 2);
        formatPageInfo = formatPageInfo.replace("\\", "");
        formatPageInfo = formatPageInfo.replace("\"", "");
        String[] pages = formatPageInfo.split(",");
        return pages[random.nextInt(pages.length)];
    }

    public String generateRandomMail() {
        Random rand = new Random();
        int n = rand.nextInt(10000);
        return String.format("nataliia_%d@mail.com", n);

    }
}