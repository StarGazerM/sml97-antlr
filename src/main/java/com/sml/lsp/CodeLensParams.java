package com.sml.lsp;

public class CodeLensParams {
    public TextDocumentIdentifier textDocument;

    public CodeLensParams() {}

    public CodeLensParams(TextDocumentIdentifier textDocument) {
        this.textDocument = textDocument;
    }
}
