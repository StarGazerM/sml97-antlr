package com.sml.lsp;

public class DocumentSymbolParams {
    public TextDocumentIdentifier textDocument;

    public DocumentSymbolParams() {}

    public DocumentSymbolParams(TextDocumentIdentifier textDocument) {
        this.textDocument = textDocument;
    }
}

