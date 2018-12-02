package com.tdeado.crawler.utils;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import javax.crypto.spec.DESedeKeySpec;
import javax.crypto.spec.IvParameterSpec;
import java.io.UnsupportedEncodingException;
import java.security.Key;
import java.security.SecureRandom;
import java.security.spec.KeySpec;

public class DESUtils {
    public static final String b ="spring20140530airlines!)";
    public static final String v ="12345678";

    public static void main(String[] args) {
        try {
            String str =" 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\n";
//            String str = URLDecoder.decode("HEb9baqQzhCVcEqSNA1gYCUO2J7%2BDTwfn36XD2uHDcE%2FoRhbaN1RMbG8rcaYLdknNFsnSEkYSUMRyCEJPfp5Cu4vLiun1jKo1EDZiRPS1thhR7hcsdS1mO4PZUIfHeNghP12sgWnF9foY9NggLAtKaRWKU36F2gZau3taJJ%2BFonedY2FkOdyfHqYns0AJEqeO6rQ1WfJCrJ3pb4f%2F60U03mrryUVZrfZ6Qv0KsK8WPXNbbaLAjHdLNNhmrlGHPT3cOHHkGLopoQP6aFxnAJGSM9WWlTP%2BlC6yUA5umwXTqhsRycz%2FkABB%2FobDVI%2BpzKBXCyxagVgnCiayaF%2BopDAWMknvCmUr6avXViImlgf7bvBJsddAIsGbTgmAk0cg2KXL%2F5vReMZv7HBzlZKJX%2BeJ1YlI%2B1nZmpn8ZrQzwivbqDsUMvGquaa23X%2B29aJyYaXFPTnMzjqtcfeNRpARZTIZGY3q%2FLELWm4V1IxeswsExXURpWAFDkWI5sbjcy%2Bcqt4c6M8NLiyDX0Ncjgh6JyB5wIHPd7zym62%2Fr9wzg0pdiohSGT42rhbu9I823RCMtwMWLeqsEDueUNiMiHzTV2s9iNHqSbP8lxCXzsOeMl6DXOTIfqubDiP6BqkwWlYFnM0cBw7HkOHUMMNkkYLSwu58P27U%2BJOCeiPPYXwq4LNqg86FELccIzPJUQrpZLPRFaUz6Kq9fHmsokVLH%2FeJdzwXcmoDUdrgMsPW7IHKGfCHWHl1g80hSVkdJIhIjxdxGoL6pXJTkiKlHtYioJ7ttUGl9dK2eik2GRul86DE2Z72eTYQG33CfuxGz7UvcuC%2F6I5EsQxvwucrJq9DrJt76kQgiuo%2FhJut%2BTtMLNy53SCMJExiW7MyPIavIYoybBjiNSzDcvitdBvOHSEl2W6oPD4a%2FRKgC5gBhyBqZyhc7jWRS01HYIf3GOmBBmFMPDmI9fTJ%2FE1W2JnlI4Y3IRk8piUp1iB4SfDs9KrWzcdo9jSEWrg6DTMN7D9rvNQ0%2BKnHh0BwgCbLifhtibzk%2BNmKyiJnXEy%2BtXJrmyTnw%2FhPtUjHmvdeOynevxD6KcMW6sfXigCROj77oXiaWRFvmZXaht6Iit16aIWvY0Ogk2lNPUdD2PxCf78vo2gFHmr7ykGYhT%2BalpIPDSfy3GQ%2Brm3f4%2BftPXBS71vxBdGKSjcvX9wVqvj60UFCCThDyYXpge%2BDNeHg7KjZFcm8RYRS5FrzWTXBUToBqDL8Kd%2BrYtARYIc5mnGRkgyuX9jjalwYuMqIn1AXLL6sAcTnuPXqvQ4nQ5hZWAbO1Pt%2Foz8fMCVyxlT7C46o0miEAyPt4w7o5EIJlrQtEyq9tYhdPO36SHcDopRXNj9yJtNEgj5FhKBZI9oNu0KydVNpSympLW3NPwE%2FfiwYkl3CbCIFBCNtOpBWElOEijRYwR68cWAG%2BGtdqyuHCiTDkWrkArfsCWob2FSzD7%2BE9UmqBrGI7p1PYVsIPPotBzUkKqqk7L8JhIz1Omag1CWHm7dQdnBT3G%2FIYiyPGEHEqvE%2FS6rEEKkC1qz7x%2BS6ASCn5b8Teerb6uqKusq16PNRA9qQMvPSfa7vAhqnuQOV6otUvXFT%2BvulsNrgDMxWAziBGfsDoo7pDoxlRS25EN2nA6YQ%2B%2BkSS9VnLjEtma%2FbhWXOzkjUPsKcJK7WtITxqj4OpMznshjFsr2uB%2BSDvYyYruYdAehTnOXvcEOjXplQNfExS35sbzJXAGNWT7uubEK0DRc1%2FZ79Ul1V3VJaJxamzyxo8hVv9k3mQ5TRTjSGsYnpDdp7%2B4XClVNePXl8BaUMglhVFPiqr6dmDM61nF2YhJ%2BgrOIswx1PtGDAUW%2Bx08K3GgwaQbIpXA8sFRVxQEyW%2BVT3Vlita64UVXkR6UGu9XzsAMpJClJtIJ%2BawHzflKvhh4mHzj2ryOjz2n9TpXnNYmtrVy1ZRNjWnMWu1On4yUtcxt9INW1Q9O9NmPsOowbfjGhPqAXPWzuEWfMVDMimiGwmT7AumDJIUfS1Gq31jmgQEmfec4H6JZvpn4wBF97XxVegYATzKgmPSEXWE%2BNCkT6kyPIBV6%2Bfki0O7SPEiNft87e%2Fba5FzBblY7YM%2FA3anQ%2BkOVGLCH4DE3%2ByOMHCEQa0jr8ueasRFlRNxPlImvEtNvQQTSnTFNoufaW7ij7WwcBCBOfgnqWyYv6qYsZ7jBvONUdH1QwvGo%2Fqdn4eDwbCivvum4DPYnJUiSZ%2FoRCu4gMqbWIoPyGnCIji8hmZr8LGCUFShE5WlFeIz5CnLvamwgljW2x5IhQePQ0%2F%2FefGErXMjDo2mH%2BqDh%2F4ySIooL7AQhTKCbD8ICafAPrFnqgs26RcVWrP6iFV%2FHpbMaC%2BnXR3%2FoUDmwNCOyFpp4V0xMXnTJc2TyVlS2eOcPyPV4AnYBoCsbs5XnHeHedYAnJ1Xz8g9SAJmfszncPgWsWd8yfaoNFiVgHdCKkGo8fA%2B2P6%2F4YHp4mz8gjXWx8FUL52JboQAzPlT4Bfy8Vvbxumbk%2FyD6meZF9M6At5JSDlmwqo6l2AlcO9InBZprLbzrK8TXT8IjWIdDuOu0jva3PIIz%2FAqDZafaXiURrEnfgKrQAg35ru1X%2BjBh24Td2eQhttL6YYvWjiwcxbAL7Buuo8mHML56pKyvaHVMgeWCMSQyy6OmijrOlbPUJgHhSnRM7194fytLKWKlrKWZHeePzbnAfyDGtL8%2BwA2mioKzM4O%2FSCsu%2F7Kh56h%2BZ0Zs4H7IYnOw84x23revLjfgHvoeflfHbh%2BBVfVNw07jMGC5wRcu77a2kM56ExHRvyW%2B8I3iU7qObYG7%2B6XF07q9e6K3H8Xt6NkiZd8ZoYk1IgMTFsONP4yJ1XlPc3bEc6JJHkyam65QkcXKfCQhUgJOhSzra9Pwl621Ceagiwy8K0MMSyDuVxEB1oH4tLhP9Vitt1p9IUPOLGeuYVFtuP%2FdJk1SKPdHbnUfvvI3%2B6NfKXrU24RbrkXXxLBrsXwor67ZPRnlBkREJqiRXu9U8a5k7dJX%2BN8wnkRGUINHf70j1%2B2UK6uDW0RgHTDxSbf3kZ7aiPMFrv5cuF8cMtksn7VfXjXahjgV%2FUFzWLY4XIJbEB7Lmh5NW6vQhjtc45jn%2FXAuhSArYJUysZl8Kh4MF53OXGe9jU5WxWDXwmBVhuTb%2BJ1gfUVm6wC3sWV%2BUCOu%2FMY4f%2B8S0DW5fRivYeLQ3b0WKjpLLjOCkz5QUcH1UVf3Shfb7O4igV9UEEHEPBlo5OkS88GM5oURE253Bb7nszamBI7riUhonfHLb29mQfLbLjw4T9rTTPFWDIzYJw%2BUzCNeOV%2BXWOJgp9uDjkWXmDAP7uc0h2LfnxePhvZpVT0iSmZhJ64TI8fQwKryMacOunYCdOOte0wko8xdMcp9vehkEJVMqY4m82ac7vXDwKCV3IOmGjD3%2Bs5LTriJ2VjLfPZuiL897lPYbD5YgFGVrr11KgNKMrDdIxf13fmK5lQU%2BZtTcHnLl%2BnnKsZuluF0ooxwd8MH1oso%2FpXtTtO5AuxA8ViAFwdLAj2dNXcba6HfboRgp9h%2BtHDf9RsRcXBU8xIU%2BbnqfELMB1BFIvFWi6H0JMJzV4Z64RXzGEp5%2FVt3%2BRn2Z2gIZCnm1hM9y%2FT5slTir7NckrYhwzkBAjn7oSMGQMPgFauO1hkkz%2BtndYyqphzDf97NckcHAJV39mMzvV2XqS0PJgvtqKN0prWsNbMaOepAIygdJ5cd%2BusWygr%2F0yGy9TY8sKZhnNuTOuNUrnA88dXahmIoz1GcBUNqEDlZcV04jdS4zk2uhq3yQmpRg9rqptr0AScCPVQF4a%2BShs6uLw8ejwj%2FPbZhcTdNsNwjvqCce42sD9uFbwe8fm7OCOmhLq8cG%2FjSZr7pMwk6CqHbkI%2F4gWr7Fed81D0Q76AvxUOXgyw0IZ%2Bo5%2B%2F%2FCvgJ9yQqZ7pYIi21m2oZ8HvzuxvvS574G%2BWuRf7TEiuJ%2BwR%2BNyh6WspviWmQnxMNmE%2FomUUGrQfIQ5dMCZktbsnUN3vP9KKDO9VP9R3a1R7Gk4ILuDmS1NhxXJII6wY7dlnoKRG9nQLgHG1EYHbU1mKG%2Ba1XbuR9YwJzaPzHK9Re0H%2BvU4gCmxMxzgK8aDyL0DDaOR60mzFfeoOIAT5NhBiYMkeINPLtWyVKZtZTxXFS8E%2FiUW2tiwzxWWjt3PyADkLUEn5BfWD8FPxaZm%2FOaKGGusopcfXYp9oywDbM3L996SF7zHISiA%2FDw9uZFMP5DzpHBm26wBXlSQ4tbccsorpW4JUWFIUlFp8S5Rd0%2FtC%2FqiSSOlc3bfrceUm1prsxUK3ZrE23lSsHo2AO386NbT71H46DttB8tu99CEIVJ6b5HKkCmgdbAmIF7xNCkez%2Fv2r3CGqloyEIeBlKkhGgRG%2FXe4sCD4rUo6ii1SWg1s6i%2F%2B8U6KwYdKmkx6M2QwAw%2Bze4OD3DIYw0B%2F0as%2FOskRe7bRrU6GFxRyU4fodHDL%2FEp8mCHj%2FclMoO45zyXA45xLoJc%2Bje6o7702%2FBHXFlyVIG5HVtYxDqucUhiErrWdvt4C8ibmMnLITEk3uwhvMS7X3lXUYeAib1nlz0qvzCWdiKgY02bRF2fFhNCdAur6CRUcDigw%2B0jxBkOlFq8oaryWzHilUuAuB%2Bif9kC62mtSAmIwFaN8gSdviplMco7wBIum4v9BKQh52qc5XosPyijnUtU0jiWXhCxb5nTU7LWCqesVC63vSexAtBjcE4%3D", "UTF-8");
            String ss = decode(str);
            System.err.println(ss);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String encode(String paramString1) throws Exception
    {
        Object localObject = new DESedeKeySpec(b.getBytes());
        localObject = SecretKeyFactory.getInstance("desede").generateSecret((KeySpec)localObject);
        Cipher localCipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
        localCipher.init(1, (Key)localObject, new IvParameterSpec(v.getBytes()));
        return Base64Utils.encode(localCipher.doFinal(paramString1.getBytes("utf-8")));
    }

    public static String decode(String paramString1) throws Exception {
        Object localObject = new DESedeKeySpec(b.getBytes());
        localObject = SecretKeyFactory.getInstance("desede").generateSecret((KeySpec)localObject);
        Cipher localCipher = Cipher.getInstance("desede/CBC/PKCS5Padding");
        localCipher.init(2, (Key)localObject, new IvParameterSpec(v.getBytes()));
        return new String(localCipher.doFinal(Base64Utils.decode(paramString1)), "utf-8");
    }

    public static String decode(String paramString1, String paramString2) throws Exception
    {
        try
        {
            SecureRandom localSecureRandom = new SecureRandom();
            DESKeySpec param = new DESKeySpec(paramString2.getBytes("UTF-8"));
            SecretKey paramStr = SecretKeyFactory.getInstance("DES").generateSecret(param);
            Cipher localCipher = Cipher.getInstance("DES");
            localCipher.init(2, paramStr, localSecureRandom);
            return new String(localCipher.doFinal(paramString1.getBytes()));
        }
        catch (Exception paramStr) {
            System.err.println(paramStr.getMessage());
        }
        return "";
    }
    private static byte[] bs(String paramString) throws Exception
    {
        Object localObject2 = null;
        Object localObject1 = localObject2;
        try
        {
            byte[] arrayOfByte = paramString.getBytes("UTF-8");
            localObject1 = localObject2;
            if (arrayOfByte.length % 2 != 0)
            {
                localObject1 = localObject2;
                throw new IllegalArgumentException("Invalid hex string");
            }
            localObject1 = localObject2;
            byte[] param = new byte[arrayOfByte.length / 2];
            int i = 0;
            for (;;)
            {
                localObject1 = param;
                localObject2 = param;
                if (i >= arrayOfByte.length) {
                    break;
                }
                localObject1 = param;
                localObject2 = new String(arrayOfByte, i, 2);
                localObject1 = paramString;
                param[(i / 2)] = ((byte)Integer.parseInt((String)localObject2, 16));
                i += 2;
            }

            System.err.println(new String((byte[])localObject2));
            return (byte[])localObject2;
        }
        catch (UnsupportedEncodingException param)
        {
            System.err.println("Aa");
            localObject2 = localObject1;
        }
        System.err.println("Aa");
        return null;
    }
}
