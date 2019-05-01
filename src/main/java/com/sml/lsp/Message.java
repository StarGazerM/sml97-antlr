package com.sml.lsp;

import com.google.gson.JsonElement;

public class Message {
    public String jsonrpc;
    public Integer id;
    public String method;
    public JsonElement params;
}
