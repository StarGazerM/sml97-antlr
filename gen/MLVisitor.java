// Generated from /home/stargazermiao/workspace/java/mlmaven/src/main/java/ML.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MLParser#longid}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongid(MLParser.LongidContext ctx);
	/**
	 * Visit a parse tree produced by the {@code disjExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisjExp(MLParser.DisjExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code iterExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIterExp(MLParser.IterExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code localDecExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDecExp(MLParser.LocalDecExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesesExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesExp(MLParser.ParenthesesExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListExp(MLParser.ListExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExp(MLParser.FuncExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code conjExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjExp(MLParser.ConjExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentExp(MLParser.IdentExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exnRaisingExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExnRaisingExp(MLParser.ExnRaisingExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exnHandlingExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExnHandlingExp(MLParser.ExnHandlingExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tupleExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleExp(MLParser.TupleExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondExp(MLParser.CondExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recordSelecExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordSelecExp(MLParser.RecordSelecExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code appExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAppExp(MLParser.AppExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recordExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordExp(MLParser.RecordExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valueOrConsExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueOrConsExp(MLParser.ValueOrConsExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixAppExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixAppExp(MLParser.InfixAppExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstExp(MLParser.ConstExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seqExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqExp(MLParser.SeqExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code caseAnalysisExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseAnalysisExp(MLParser.CaseAnalysisExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeAnnoExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAnnoExp(MLParser.TypeAnnoExpContext ctx);
	/**
	 * Visit a parse tree produced by the {@code expRow}
	 * labeled alternative in {@link MLParser#exprow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpRow(MLParser.ExpRowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code matchBody}
	 * labeled alternative in {@link MLParser#match}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchBody(MLParser.MatchBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link MLParser#lab}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLab(MLParser.LabContext ctx);
	/**
	 * Visit a parse tree produced by the {@code layeredPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLayeredPat(MLParser.LayeredPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixConsPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixConsPat(MLParser.InfixConsPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeAnnoPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAnnoPat(MLParser.TypeAnnoPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code consPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsPat(MLParser.ConsPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code constPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstPat(MLParser.ConstPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tuplePat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTuplePat(MLParser.TuplePatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recordPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordPat(MLParser.RecordPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarPat(MLParser.VarPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code empListPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpListPat(MLParser.EmpListPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code listPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitListPat(MLParser.ListPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wildcardPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardPat(MLParser.WildcardPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesesPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesPat(MLParser.ParenthesesPatContext ctx);
	/**
	 * Visit a parse tree produced by the {@code wildcardPatRow}
	 * labeled alternative in {@link MLParser#patrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWildcardPatRow(MLParser.WildcardPatRowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code patRow}
	 * labeled alternative in {@link MLParser#patrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPatRow(MLParser.PatRowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varPatRow}
	 * labeled alternative in {@link MLParser#patrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarPatRow(MLParser.VarPatRowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code longIdTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLongIdTyp(MLParser.LongIdTypContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recordTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecordTyp(MLParser.RecordTypContext ctx);
	/**
	 * Visit a parse tree produced by the {@code tupleTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTupleTyp(MLParser.TupleTypContext ctx);
	/**
	 * Visit a parse tree produced by the {@code varTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVarTyp(MLParser.VarTypContext ctx);
	/**
	 * Visit a parse tree produced by the {@code parenthesesTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParenthesesTyp(MLParser.ParenthesesTypContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncTyp(MLParser.FuncTypContext ctx);
	/**
	 * Visit a parse tree produced by the {@code consOneTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsOneTyp(MLParser.ConsOneTypContext ctx);
	/**
	 * Visit a parse tree produced by the {@code consManyTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConsManyTyp(MLParser.ConsManyTypContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeRow}
	 * labeled alternative in {@link MLParser#typrow}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeRow(MLParser.TypeRowContext ctx);
	/**
	 * Visit a parse tree produced by the {@code funcDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncDec(MLParser.FuncDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exnDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExnDec(MLParser.ExnDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structureDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureDec(MLParser.StructureDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seqDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqDec(MLParser.SeqDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValDec(MLParser.ValDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code rightAssocInfixDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRightAssocInfixDec(MLParser.RightAssocInfixDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code abstractTypeDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbstractTypeDec(MLParser.AbstractTypeDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code includeDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeDec(MLParser.IncludeDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDec(MLParser.TypeDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code datatypeReplDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypeReplDec(MLParser.DatatypeReplDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code leftAssocInfixDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeftAssocInfixDec(MLParser.LeftAssocInfixDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code empDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpDec(MLParser.EmpDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code datatypeDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypeDec(MLParser.DatatypeDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code empHeadSeqDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpHeadSeqDec(MLParser.EmpHeadSeqDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code localDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDec(MLParser.LocalDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonfixDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonfixDec(MLParser.NonfixDecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code destValBind}
	 * labeled alternative in {@link MLParser#valbind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDestValBind(MLParser.DestValBindContext ctx);
	/**
	 * Visit a parse tree produced by the {@code recurValBind}
	 * labeled alternative in {@link MLParser#valbind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRecurValBind(MLParser.RecurValBindContext ctx);
	/**
	 * Visit a parse tree produced by the {@code clausalFuncBind}
	 * labeled alternative in {@link MLParser#funbind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClausalFuncBind(MLParser.ClausalFuncBindContext ctx);
	/**
	 * Visit a parse tree produced by the {@code nonfixFunMatch}
	 * labeled alternative in {@link MLParser#funmatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNonfixFunMatch(MLParser.NonfixFunMatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixFunmatch}
	 * labeled alternative in {@link MLParser#funmatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixFunmatch(MLParser.InfixFunmatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code infixManyFunmatch}
	 * labeled alternative in {@link MLParser#funmatch}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInfixManyFunmatch(MLParser.InfixManyFunmatchContext ctx);
	/**
	 * Visit a parse tree produced by the {@code abbrevTypBind}
	 * labeled alternative in {@link MLParser#typbind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbbrevTypBind(MLParser.AbbrevTypBindContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataTypeDataBind}
	 * labeled alternative in {@link MLParser#databind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataTypeDataBind(MLParser.DataTypeDataBindContext ctx);
	/**
	 * Visit a parse tree produced by the {@code dataConsConBind}
	 * labeled alternative in {@link MLParser#conbind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataConsConBind(MLParser.DataConsConBindContext ctx);
	/**
	 * Visit a parse tree produced by the {@code genExnBind}
	 * labeled alternative in {@link MLParser#exnbind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGenExnBind(MLParser.GenExnBindContext ctx);
	/**
	 * Visit a parse tree produced by the {@code renameExnBind}
	 * labeled alternative in {@link MLParser#exnbind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRenameExnBind(MLParser.RenameExnBindContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructStr(MLParser.StructStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code transpAnnoStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTranspAnnoStr(MLParser.TranspAnnoStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code opaqueAnnoStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpaqueAnnoStr(MLParser.OpaqueAnnoStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentStr(MLParser.IdentStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functorStrAppStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctorStrAppStr(MLParser.FunctorStrAppStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functorDecAppStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctorDecAppStr(MLParser.FunctorDecAppStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code localDecStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLocalDecStr(MLParser.LocalDecStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structStrBindComp}
	 * labeled alternative in {@link MLParser#strbind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructStrBindComp(MLParser.StructStrBindCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structStrBindSmpl}
	 * labeled alternative in {@link MLParser#strbind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructStrBindSmpl(MLParser.StructStrBindSmplContext ctx);
	/**
	 * Visit a parse tree produced by the {@code refineSig}
	 * labeled alternative in {@link MLParser#sig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefineSig(MLParser.RefineSigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code signatureBody}
	 * labeled alternative in {@link MLParser#sig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignatureBody(MLParser.SignatureBodyContext ctx);
	/**
	 * Visit a parse tree produced by the {@code identSig}
	 * labeled alternative in {@link MLParser#sig}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentSig(MLParser.IdentSigContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeRefine}
	 * labeled alternative in {@link MLParser#typrefin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeRefine(MLParser.TypeRefineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValSpec(MLParser.ValSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code empHeadSeqSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpHeadSeqSpec(MLParser.EmpHeadSeqSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code empSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpSpec(MLParser.EmpSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeAbbrevSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeAbbrevSpec(MLParser.TypeAbbrevSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exnSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExnSpec(MLParser.ExnSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code datatypeReplSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypeReplSpec(MLParser.DatatypeReplSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structureSharingSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureSharingSpec(MLParser.StructureSharingSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code datatypeSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatatypeSpec(MLParser.DatatypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeSharingSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSharingSpec(MLParser.TypeSharingSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code structureSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStructureSpec(MLParser.StructureSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code includeOneSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeOneSpec(MLParser.IncludeOneSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code includeManySpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIncludeManySpec(MLParser.IncludeManySpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code typeSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeSpec(MLParser.TypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equaTypeSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquaTypeSpec(MLParser.EquaTypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seqSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqSpec(MLParser.SeqSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code valDesc}
	 * labeled alternative in {@link MLParser#valdesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValDesc(MLParser.ValDescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code absTypeSpec}
	 * labeled alternative in {@link MLParser#typdesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsTypeSpec(MLParser.AbsTypeSpecContext ctx);
	/**
	 * Visit a parse tree produced by the {@code datDesc}
	 * labeled alternative in {@link MLParser#datdesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatDesc(MLParser.DatDescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code condDesc}
	 * labeled alternative in {@link MLParser#condesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondDesc(MLParser.CondDescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exnDesc}
	 * labeled alternative in {@link MLParser#exndesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExnDesc(MLParser.ExnDescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code strDesc}
	 * labeled alternative in {@link MLParser#strdesc}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStrDesc(MLParser.StrDescContext ctx);
	/**
	 * Visit a parse tree produced by the {@code functorDecProg}
	 * labeled alternative in {@link MLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctorDecProg(MLParser.FunctorDecProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code empProg}
	 * labeled alternative in {@link MLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpProg(MLParser.EmpProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code seqProg}
	 * labeled alternative in {@link MLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSeqProg(MLParser.SeqProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code coreDecProg}
	 * labeled alternative in {@link MLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCoreDecProg(MLParser.CoreDecProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code signatureDecProg}
	 * labeled alternative in {@link MLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSignatureDecProg(MLParser.SignatureDecProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code empHeadSeqProg}
	 * labeled alternative in {@link MLParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEmpHeadSeqProg(MLParser.EmpHeadSeqProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plainFctBindComp}
	 * labeled alternative in {@link MLParser#fctbind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainFctBindComp(MLParser.PlainFctBindCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code plainFctBindSmpl}
	 * labeled alternative in {@link MLParser#fctbind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPlainFctBindSmpl(MLParser.PlainFctBindSmplContext ctx);
	/**
	 * Visit a parse tree produced by the {@code openedFctBindComp}
	 * labeled alternative in {@link MLParser#fctbind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenedFctBindComp(MLParser.OpenedFctBindCompContext ctx);
	/**
	 * Visit a parse tree produced by the {@code openedFctBindSmpl}
	 * labeled alternative in {@link MLParser#fctbind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpenedFctBindSmpl(MLParser.OpenedFctBindSmplContext ctx);
	/**
	 * Visit a parse tree produced by the {@code sigBind}
	 * labeled alternative in {@link MLParser#sigbind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigBind(MLParser.SigBindContext ctx);
}