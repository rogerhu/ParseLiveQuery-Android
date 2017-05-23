package com.parse.livequery;

import org.json.JSONException;
import org.json.JSONObject;

/* package */ abstract class ClientOperation {

     abstract JSONObject getJSONObjectRepresentation() throws JSONException;

}
