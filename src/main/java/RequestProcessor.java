import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.tomakehurst.wiremock.common.Errors;
import com.github.tomakehurst.wiremock.extension.requestfilter.RequestFilterAction;
import com.github.tomakehurst.wiremock.extension.requestfilter.StubRequestFilterV2;
import com.github.tomakehurst.wiremock.http.Request;
import com.github.tomakehurst.wiremock.http.ResponseDefinition;
import com.github.tomakehurst.wiremock.stubbing.ServeEvent;

import java.io.IOException;
import java.util.Arrays;

public class RequestProcessor implements StubRequestFilterV2 {
    @Override
    public RequestFilterAction filter(Request request, ServeEvent serveEvent) {
        String[] validStubs = new String[]{
                "/reserva/crear",
                "/reserva/listar",
                "/huesped/crear",
                "/reserva/listar"};
        if(!Arrays.asList(validStubs).contains(request.getUrl())){
            return RequestFilterAction.stopWith(ResponseDefinition.notFound());
        }
        try{
            new ObjectMapper().readTree(request.getBody());
        }
        catch(IOException ioe){
            // not a valid JSON
            return RequestFilterAction.stopWith(ResponseDefinition.badRequest(Errors.validation("JSON ERROR", "INVALID JSON")));
        }
        //valid json
        return RequestFilterAction.continueWith(request);
    }

    @Override
    public String getName() {
        return "stub&jsonVerifier";
    }
}
