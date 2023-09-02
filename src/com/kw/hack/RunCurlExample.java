package com.kw.hack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class RunCurlExample {

    static String command =  "curl \"https://api.myaster.com/uae/at/search/api/search?text=Rama&lat=25.2598304&lon=55.2915549&includeFacets=true&pageSize=10\" ^\n" +
            "  -H \"authority: api.myaster.com\" ^\n" +
            "  -H \"accept: application/json\" ^\n" +
            "  -H \"accept-language: en-US,en;q=0.9\" ^\n" +
            "  -H \"authorization: guest-token eyJhbGciOiJIUzI1NiJ9.eyJqdGkiOiI2M2M4NmVkMC01ZDM0LTQ4ZmYtYjBlZi02Y2MzMDViOTI1MWYiLCJpYXQiOjE2OTM2NTc4MDksInN1YiI6IlZDUCBHdWVzdCIsImlzcyI6IkpXVCIsImV4cCI6MTY5Mzc0NDIwOX0.Mf970it_etRL4-18MzHfS6KosfFErHz12DvC_0J8oMM\" ^\n" +
            "  -H \"content-security-policy: script-src ^\\^\"self^\\^\"\" ^\n" +
            "  -H \"deviceid: 63c86ed0-5d34-48ff-b0ef-6cc305b9251f\" ^\n" +
            "  -H \"origin: https://www.myaster.com\" ^\n" +
            "  -H \"permissions-policy: payment=()^\\^\"\" ^\n" +
            "  -H \"platform: web\" ^\n" +
            "  -H \"referer: https://www.myaster.com/\" ^\n" +
            "  -H \"referrer-policy: strict-origin\" ^\n" +
            "  -H \"sec-ch-ua: ^\\^\"Chromium^\\^\";v=^\\^\"116^\\^\", ^\\^\"Not)A;Brand^\\^\";v=^\\^\"24^\\^\", ^\\^\"Google Chrome^\\^\";v=^\\^\"116^\\^\"\" ^\n" +
            "  -H \"sec-ch-ua-mobile: ?1\" ^\n" +
            "  -H \"sec-ch-ua-platform: ^\\^\"Android^\\^\"\" ^\n" +
            "  -H \"sec-fetch-dest: empty\" ^\n" +
            "  -H \"sec-fetch-mode: cors\" ^\n" +
            "  -H \"sec-fetch-site: same-site\" ^\n" +
            "  -H \"strict-transport-security: max-age=31536000; includeSubDomains\" ^\n" +
            "  -H \"traceid: 1h9au0r0c083464ecfea708\" ^\n" +
            "  -H \"user-agent: Mozilla/5.0 (Linux; Android 8.0.0; SM-G955U Build/R16NW) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/87.0.4280.141 Mobile Safari/537.36\" ^\n" +
            "  -H \"x-content-type-options: nosniff\" ^\n" +
            "  -H \"x-frame-options: SAMEORIGIN\" ^\n" +
            "  -H \"x-patient-apiversion: 2.2.5\" ^\n" +
            "  -H \"x-user-agent: aster-web/2.1\" ^\n" +
            "  -H \"x-xss-protection: 1; mode=block\" ^\n" +
            "  --compressed";

    public static void main(String[] args) throws IOException, InterruptedException {
        System.out.println("");
        long waitTime = 1000;
        long numOfExec = 1;
        for(int i = 1; i <= numOfExec; i++){
            System.out.println("Executing thread :: " + i);
            //String command = "curl -X POST https://postman-echo.com/post --data foo1=bar1&foo2=bar2";
            Process process = Runtime.getRuntime().exec(command);

            String result = new BufferedReader(
                    new InputStreamReader(process.getInputStream()))
                    .lines()
                    .collect(Collectors.joining("\n"));

            System.out.println(result);
            Thread.sleep(waitTime);
        }

    }
}
