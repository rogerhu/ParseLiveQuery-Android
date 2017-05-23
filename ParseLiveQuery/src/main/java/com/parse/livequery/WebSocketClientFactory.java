package com.parse.livequery;

import java.net.URI;

/* package */ interface WebSocketClientFactory {

    WebSocketClient createInstance(WebSocketClient.WebSocketClientCallback webSocketClientCallback, URI hostUrl);

}
