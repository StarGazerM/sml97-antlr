package com.sml.lsp;

public class DocumentLinkParams {
    public TextDocumentIdentifier textDocument;

    public DocumentLinkParams() {}

    public DocumentLinkParams(TextDocumentIdentifier textDocument) {
        this.textDocument = textDocument;
    }
}
