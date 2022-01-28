package services;


import util.HttpUtil;
import modal.AzulProperties;
import modal.AzulRepository;
import modal.AzulRepositoryImpl;
import util.RequestUtil;

import java.net.http.HttpResponse;

public class AzulService {

    public String getRequiredVersion(AzulProperties azulProperties){

        String azulUrl = getAzulUrl(new HttpUtil().httpGet(new RequestUtil().generateAzulUrl(azulProperties)).body());
        return azulUrl;
    }

    private String getAzulUrl(String response){
        return response.split("\"url\": \"")[1].split("\"")[0];
    }

}
