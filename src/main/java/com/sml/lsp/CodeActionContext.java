package com.sml.lsp;

import java.util.List;

public class CodeActionContext {
    public List<Diagnostic> diagnostics;
    public List<CodeActionKind> only;
}

