// Generated from /home/stargazermiao/workspace/java/mlmaven/src/main/java/ML.g4 by ANTLR 4.7.2

    package com.sml.parser;
    import java.util.HashMap;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MLParser}.
 */
public interface MLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MLParser#longid}.
	 * @param ctx the parse tree
	 */
	void enterLongid(MLParser.LongidContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLParser#longid}.
	 * @param ctx the parse tree
	 */
	void exitLongid(MLParser.LongidContext ctx);
	/**
	 * Enter a parse tree produced by the {@code disjExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterDisjExp(MLParser.DisjExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code disjExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitDisjExp(MLParser.DisjExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code iterExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIterExp(MLParser.IterExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code iterExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIterExp(MLParser.IterExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code localDecExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterLocalDecExp(MLParser.LocalDecExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code localDecExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitLocalDecExp(MLParser.LocalDecExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesesExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesExp(MLParser.ParenthesesExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesesExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesExp(MLParser.ParenthesesExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterListExp(MLParser.ListExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitListExp(MLParser.ListExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterFuncExp(MLParser.FuncExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitFuncExp(MLParser.FuncExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code conjExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterConjExp(MLParser.ConjExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code conjExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitConjExp(MLParser.ConjExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterIdentExp(MLParser.IdentExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitIdentExp(MLParser.IdentExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exnRaisingExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExnRaisingExp(MLParser.ExnRaisingExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exnRaisingExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExnRaisingExp(MLParser.ExnRaisingExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exnHandlingExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExnHandlingExp(MLParser.ExnHandlingExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exnHandlingExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExnHandlingExp(MLParser.ExnHandlingExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupleExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTupleExp(MLParser.TupleExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupleExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTupleExp(MLParser.TupleExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCondExp(MLParser.CondExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCondExp(MLParser.CondExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recordSelecExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRecordSelecExp(MLParser.RecordSelecExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recordSelecExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRecordSelecExp(MLParser.RecordSelecExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code appExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterAppExp(MLParser.AppExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code appExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitAppExp(MLParser.AppExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recordExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterRecordExp(MLParser.RecordExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recordExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitRecordExp(MLParser.RecordExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valueOrConsExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterValueOrConsExp(MLParser.ValueOrConsExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valueOrConsExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitValueOrConsExp(MLParser.ValueOrConsExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixAppExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterInfixAppExp(MLParser.InfixAppExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixAppExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitInfixAppExp(MLParser.InfixAppExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterConstExp(MLParser.ConstExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitConstExp(MLParser.ConstExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code seqExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterSeqExp(MLParser.SeqExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code seqExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitSeqExp(MLParser.SeqExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code caseAnalysisExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterCaseAnalysisExp(MLParser.CaseAnalysisExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code caseAnalysisExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitCaseAnalysisExp(MLParser.CaseAnalysisExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeAnnoExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnoExp(MLParser.TypeAnnoExpContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeAnnoExp}
	 * labeled alternative in {@link MLParser#exp}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnoExp(MLParser.TypeAnnoExpContext ctx);
	/**
	 * Enter a parse tree produced by the {@code expRow}
	 * labeled alternative in {@link MLParser#exprow}.
	 * @param ctx the parse tree
	 */
	void enterExpRow(MLParser.ExpRowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code expRow}
	 * labeled alternative in {@link MLParser#exprow}.
	 * @param ctx the parse tree
	 */
	void exitExpRow(MLParser.ExpRowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code matchBody}
	 * labeled alternative in {@link MLParser#match}.
	 * @param ctx the parse tree
	 */
	void enterMatchBody(MLParser.MatchBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code matchBody}
	 * labeled alternative in {@link MLParser#match}.
	 * @param ctx the parse tree
	 */
	void exitMatchBody(MLParser.MatchBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link MLParser#lab}.
	 * @param ctx the parse tree
	 */
	void enterLab(MLParser.LabContext ctx);
	/**
	 * Exit a parse tree produced by {@link MLParser#lab}.
	 * @param ctx the parse tree
	 */
	void exitLab(MLParser.LabContext ctx);
	/**
	 * Enter a parse tree produced by the {@code layeredPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterLayeredPat(MLParser.LayeredPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code layeredPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitLayeredPat(MLParser.LayeredPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixConsPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterInfixConsPat(MLParser.InfixConsPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixConsPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitInfixConsPat(MLParser.InfixConsPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeAnnoPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterTypeAnnoPat(MLParser.TypeAnnoPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeAnnoPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitTypeAnnoPat(MLParser.TypeAnnoPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code consPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterConsPat(MLParser.ConsPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code consPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitConsPat(MLParser.ConsPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code constPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterConstPat(MLParser.ConstPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code constPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitConstPat(MLParser.ConstPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tuplePat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterTuplePat(MLParser.TuplePatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tuplePat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitTuplePat(MLParser.TuplePatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recordPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterRecordPat(MLParser.RecordPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recordPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitRecordPat(MLParser.RecordPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterVarPat(MLParser.VarPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitVarPat(MLParser.VarPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empListPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterEmpListPat(MLParser.EmpListPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empListPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitEmpListPat(MLParser.EmpListPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code listPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterListPat(MLParser.ListPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code listPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitListPat(MLParser.ListPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wildcardPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterWildcardPat(MLParser.WildcardPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wildcardPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitWildcardPat(MLParser.WildcardPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesesPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesPat(MLParser.ParenthesesPatContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesesPat}
	 * labeled alternative in {@link MLParser#pat}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesPat(MLParser.ParenthesesPatContext ctx);
	/**
	 * Enter a parse tree produced by the {@code wildcardPatRow}
	 * labeled alternative in {@link MLParser#patrow}.
	 * @param ctx the parse tree
	 */
	void enterWildcardPatRow(MLParser.WildcardPatRowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code wildcardPatRow}
	 * labeled alternative in {@link MLParser#patrow}.
	 * @param ctx the parse tree
	 */
	void exitWildcardPatRow(MLParser.WildcardPatRowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code patRow}
	 * labeled alternative in {@link MLParser#patrow}.
	 * @param ctx the parse tree
	 */
	void enterPatRow(MLParser.PatRowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code patRow}
	 * labeled alternative in {@link MLParser#patrow}.
	 * @param ctx the parse tree
	 */
	void exitPatRow(MLParser.PatRowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varPatRow}
	 * labeled alternative in {@link MLParser#patrow}.
	 * @param ctx the parse tree
	 */
	void enterVarPatRow(MLParser.VarPatRowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varPatRow}
	 * labeled alternative in {@link MLParser#patrow}.
	 * @param ctx the parse tree
	 */
	void exitVarPatRow(MLParser.VarPatRowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code longIdTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 */
	void enterLongIdTyp(MLParser.LongIdTypContext ctx);
	/**
	 * Exit a parse tree produced by the {@code longIdTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 */
	void exitLongIdTyp(MLParser.LongIdTypContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recordTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 */
	void enterRecordTyp(MLParser.RecordTypContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recordTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 */
	void exitRecordTyp(MLParser.RecordTypContext ctx);
	/**
	 * Enter a parse tree produced by the {@code tupleTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 */
	void enterTupleTyp(MLParser.TupleTypContext ctx);
	/**
	 * Exit a parse tree produced by the {@code tupleTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 */
	void exitTupleTyp(MLParser.TupleTypContext ctx);
	/**
	 * Enter a parse tree produced by the {@code varTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 */
	void enterVarTyp(MLParser.VarTypContext ctx);
	/**
	 * Exit a parse tree produced by the {@code varTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 */
	void exitVarTyp(MLParser.VarTypContext ctx);
	/**
	 * Enter a parse tree produced by the {@code parenthesesTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 */
	void enterParenthesesTyp(MLParser.ParenthesesTypContext ctx);
	/**
	 * Exit a parse tree produced by the {@code parenthesesTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 */
	void exitParenthesesTyp(MLParser.ParenthesesTypContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 */
	void enterFuncTyp(MLParser.FuncTypContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 */
	void exitFuncTyp(MLParser.FuncTypContext ctx);
	/**
	 * Enter a parse tree produced by the {@code consOneTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 */
	void enterConsOneTyp(MLParser.ConsOneTypContext ctx);
	/**
	 * Exit a parse tree produced by the {@code consOneTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 */
	void exitConsOneTyp(MLParser.ConsOneTypContext ctx);
	/**
	 * Enter a parse tree produced by the {@code consManyTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 */
	void enterConsManyTyp(MLParser.ConsManyTypContext ctx);
	/**
	 * Exit a parse tree produced by the {@code consManyTyp}
	 * labeled alternative in {@link MLParser#typ}.
	 * @param ctx the parse tree
	 */
	void exitConsManyTyp(MLParser.ConsManyTypContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeRow}
	 * labeled alternative in {@link MLParser#typrow}.
	 * @param ctx the parse tree
	 */
	void enterTypeRow(MLParser.TypeRowContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeRow}
	 * labeled alternative in {@link MLParser#typrow}.
	 * @param ctx the parse tree
	 */
	void exitTypeRow(MLParser.TypeRowContext ctx);
	/**
	 * Enter a parse tree produced by the {@code funcDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterFuncDec(MLParser.FuncDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code funcDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitFuncDec(MLParser.FuncDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exnDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterExnDec(MLParser.ExnDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exnDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitExnDec(MLParser.ExnDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structureDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterStructureDec(MLParser.StructureDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structureDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitStructureDec(MLParser.StructureDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code seqDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterSeqDec(MLParser.SeqDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code seqDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitSeqDec(MLParser.SeqDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterValDec(MLParser.ValDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitValDec(MLParser.ValDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code rightAssocInfixDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterRightAssocInfixDec(MLParser.RightAssocInfixDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code rightAssocInfixDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitRightAssocInfixDec(MLParser.RightAssocInfixDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code abstractTypeDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterAbstractTypeDec(MLParser.AbstractTypeDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abstractTypeDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitAbstractTypeDec(MLParser.AbstractTypeDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code includeDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterIncludeDec(MLParser.IncludeDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code includeDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitIncludeDec(MLParser.IncludeDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterTypeDec(MLParser.TypeDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitTypeDec(MLParser.TypeDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code datatypeReplDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDatatypeReplDec(MLParser.DatatypeReplDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code datatypeReplDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDatatypeReplDec(MLParser.DatatypeReplDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code leftAssocInfixDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterLeftAssocInfixDec(MLParser.LeftAssocInfixDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code leftAssocInfixDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitLeftAssocInfixDec(MLParser.LeftAssocInfixDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterEmpDec(MLParser.EmpDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitEmpDec(MLParser.EmpDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code datatypeDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterDatatypeDec(MLParser.DatatypeDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code datatypeDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitDatatypeDec(MLParser.DatatypeDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empHeadSeqDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterEmpHeadSeqDec(MLParser.EmpHeadSeqDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empHeadSeqDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitEmpHeadSeqDec(MLParser.EmpHeadSeqDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code localDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterLocalDec(MLParser.LocalDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code localDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitLocalDec(MLParser.LocalDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonfixDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void enterNonfixDec(MLParser.NonfixDecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonfixDec}
	 * labeled alternative in {@link MLParser#dec}.
	 * @param ctx the parse tree
	 */
	void exitNonfixDec(MLParser.NonfixDecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code destValBind}
	 * labeled alternative in {@link MLParser#valbind}.
	 * @param ctx the parse tree
	 */
	void enterDestValBind(MLParser.DestValBindContext ctx);
	/**
	 * Exit a parse tree produced by the {@code destValBind}
	 * labeled alternative in {@link MLParser#valbind}.
	 * @param ctx the parse tree
	 */
	void exitDestValBind(MLParser.DestValBindContext ctx);
	/**
	 * Enter a parse tree produced by the {@code recurValBind}
	 * labeled alternative in {@link MLParser#valbind}.
	 * @param ctx the parse tree
	 */
	void enterRecurValBind(MLParser.RecurValBindContext ctx);
	/**
	 * Exit a parse tree produced by the {@code recurValBind}
	 * labeled alternative in {@link MLParser#valbind}.
	 * @param ctx the parse tree
	 */
	void exitRecurValBind(MLParser.RecurValBindContext ctx);
	/**
	 * Enter a parse tree produced by the {@code clausalFuncBind}
	 * labeled alternative in {@link MLParser#funbind}.
	 * @param ctx the parse tree
	 */
	void enterClausalFuncBind(MLParser.ClausalFuncBindContext ctx);
	/**
	 * Exit a parse tree produced by the {@code clausalFuncBind}
	 * labeled alternative in {@link MLParser#funbind}.
	 * @param ctx the parse tree
	 */
	void exitClausalFuncBind(MLParser.ClausalFuncBindContext ctx);
	/**
	 * Enter a parse tree produced by the {@code nonfixFunMatch}
	 * labeled alternative in {@link MLParser#funmatch}.
	 * @param ctx the parse tree
	 */
	void enterNonfixFunMatch(MLParser.NonfixFunMatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code nonfixFunMatch}
	 * labeled alternative in {@link MLParser#funmatch}.
	 * @param ctx the parse tree
	 */
	void exitNonfixFunMatch(MLParser.NonfixFunMatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixFunmatch}
	 * labeled alternative in {@link MLParser#funmatch}.
	 * @param ctx the parse tree
	 */
	void enterInfixFunmatch(MLParser.InfixFunmatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixFunmatch}
	 * labeled alternative in {@link MLParser#funmatch}.
	 * @param ctx the parse tree
	 */
	void exitInfixFunmatch(MLParser.InfixFunmatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code infixManyFunmatch}
	 * labeled alternative in {@link MLParser#funmatch}.
	 * @param ctx the parse tree
	 */
	void enterInfixManyFunmatch(MLParser.InfixManyFunmatchContext ctx);
	/**
	 * Exit a parse tree produced by the {@code infixManyFunmatch}
	 * labeled alternative in {@link MLParser#funmatch}.
	 * @param ctx the parse tree
	 */
	void exitInfixManyFunmatch(MLParser.InfixManyFunmatchContext ctx);
	/**
	 * Enter a parse tree produced by the {@code abbrevTypBind}
	 * labeled alternative in {@link MLParser#typbind}.
	 * @param ctx the parse tree
	 */
	void enterAbbrevTypBind(MLParser.AbbrevTypBindContext ctx);
	/**
	 * Exit a parse tree produced by the {@code abbrevTypBind}
	 * labeled alternative in {@link MLParser#typbind}.
	 * @param ctx the parse tree
	 */
	void exitAbbrevTypBind(MLParser.AbbrevTypBindContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataTypeDataBind}
	 * labeled alternative in {@link MLParser#databind}.
	 * @param ctx the parse tree
	 */
	void enterDataTypeDataBind(MLParser.DataTypeDataBindContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataTypeDataBind}
	 * labeled alternative in {@link MLParser#databind}.
	 * @param ctx the parse tree
	 */
	void exitDataTypeDataBind(MLParser.DataTypeDataBindContext ctx);
	/**
	 * Enter a parse tree produced by the {@code dataConsConBind}
	 * labeled alternative in {@link MLParser#conbind}.
	 * @param ctx the parse tree
	 */
	void enterDataConsConBind(MLParser.DataConsConBindContext ctx);
	/**
	 * Exit a parse tree produced by the {@code dataConsConBind}
	 * labeled alternative in {@link MLParser#conbind}.
	 * @param ctx the parse tree
	 */
	void exitDataConsConBind(MLParser.DataConsConBindContext ctx);
	/**
	 * Enter a parse tree produced by the {@code genExnBind}
	 * labeled alternative in {@link MLParser#exnbind}.
	 * @param ctx the parse tree
	 */
	void enterGenExnBind(MLParser.GenExnBindContext ctx);
	/**
	 * Exit a parse tree produced by the {@code genExnBind}
	 * labeled alternative in {@link MLParser#exnbind}.
	 * @param ctx the parse tree
	 */
	void exitGenExnBind(MLParser.GenExnBindContext ctx);
	/**
	 * Enter a parse tree produced by the {@code renameExnBind}
	 * labeled alternative in {@link MLParser#exnbind}.
	 * @param ctx the parse tree
	 */
	void enterRenameExnBind(MLParser.RenameExnBindContext ctx);
	/**
	 * Exit a parse tree produced by the {@code renameExnBind}
	 * labeled alternative in {@link MLParser#exnbind}.
	 * @param ctx the parse tree
	 */
	void exitRenameExnBind(MLParser.RenameExnBindContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 */
	void enterStructStr(MLParser.StructStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 */
	void exitStructStr(MLParser.StructStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code transpAnnoStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 */
	void enterTranspAnnoStr(MLParser.TranspAnnoStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code transpAnnoStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 */
	void exitTranspAnnoStr(MLParser.TranspAnnoStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code opaqueAnnoStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 */
	void enterOpaqueAnnoStr(MLParser.OpaqueAnnoStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code opaqueAnnoStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 */
	void exitOpaqueAnnoStr(MLParser.OpaqueAnnoStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 */
	void enterIdentStr(MLParser.IdentStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 */
	void exitIdentStr(MLParser.IdentStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functorStrAppStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 */
	void enterFunctorStrAppStr(MLParser.FunctorStrAppStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functorStrAppStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 */
	void exitFunctorStrAppStr(MLParser.FunctorStrAppStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functorDecAppStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 */
	void enterFunctorDecAppStr(MLParser.FunctorDecAppStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functorDecAppStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 */
	void exitFunctorDecAppStr(MLParser.FunctorDecAppStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code localDecStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 */
	void enterLocalDecStr(MLParser.LocalDecStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code localDecStr}
	 * labeled alternative in {@link MLParser#str}.
	 * @param ctx the parse tree
	 */
	void exitLocalDecStr(MLParser.LocalDecStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structStrBindComp}
	 * labeled alternative in {@link MLParser#strbind}.
	 * @param ctx the parse tree
	 */
	void enterStructStrBindComp(MLParser.StructStrBindCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structStrBindComp}
	 * labeled alternative in {@link MLParser#strbind}.
	 * @param ctx the parse tree
	 */
	void exitStructStrBindComp(MLParser.StructStrBindCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structStrBindSmpl}
	 * labeled alternative in {@link MLParser#strbind}.
	 * @param ctx the parse tree
	 */
	void enterStructStrBindSmpl(MLParser.StructStrBindSmplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structStrBindSmpl}
	 * labeled alternative in {@link MLParser#strbind}.
	 * @param ctx the parse tree
	 */
	void exitStructStrBindSmpl(MLParser.StructStrBindSmplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code refineSig}
	 * labeled alternative in {@link MLParser#sig}.
	 * @param ctx the parse tree
	 */
	void enterRefineSig(MLParser.RefineSigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code refineSig}
	 * labeled alternative in {@link MLParser#sig}.
	 * @param ctx the parse tree
	 */
	void exitRefineSig(MLParser.RefineSigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signatureBody}
	 * labeled alternative in {@link MLParser#sig}.
	 * @param ctx the parse tree
	 */
	void enterSignatureBody(MLParser.SignatureBodyContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signatureBody}
	 * labeled alternative in {@link MLParser#sig}.
	 * @param ctx the parse tree
	 */
	void exitSignatureBody(MLParser.SignatureBodyContext ctx);
	/**
	 * Enter a parse tree produced by the {@code identSig}
	 * labeled alternative in {@link MLParser#sig}.
	 * @param ctx the parse tree
	 */
	void enterIdentSig(MLParser.IdentSigContext ctx);
	/**
	 * Exit a parse tree produced by the {@code identSig}
	 * labeled alternative in {@link MLParser#sig}.
	 * @param ctx the parse tree
	 */
	void exitIdentSig(MLParser.IdentSigContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeRefine}
	 * labeled alternative in {@link MLParser#typrefin}.
	 * @param ctx the parse tree
	 */
	void enterTypeRefine(MLParser.TypeRefineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeRefine}
	 * labeled alternative in {@link MLParser#typrefin}.
	 * @param ctx the parse tree
	 */
	void exitTypeRefine(MLParser.TypeRefineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterValSpec(MLParser.ValSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitValSpec(MLParser.ValSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empHeadSeqSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterEmpHeadSeqSpec(MLParser.EmpHeadSeqSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empHeadSeqSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitEmpHeadSeqSpec(MLParser.EmpHeadSeqSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterEmpSpec(MLParser.EmpSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitEmpSpec(MLParser.EmpSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeAbbrevSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterTypeAbbrevSpec(MLParser.TypeAbbrevSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeAbbrevSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitTypeAbbrevSpec(MLParser.TypeAbbrevSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exnSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterExnSpec(MLParser.ExnSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exnSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitExnSpec(MLParser.ExnSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code datatypeReplSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterDatatypeReplSpec(MLParser.DatatypeReplSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code datatypeReplSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitDatatypeReplSpec(MLParser.DatatypeReplSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structureSharingSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterStructureSharingSpec(MLParser.StructureSharingSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structureSharingSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitStructureSharingSpec(MLParser.StructureSharingSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code datatypeSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterDatatypeSpec(MLParser.DatatypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code datatypeSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitDatatypeSpec(MLParser.DatatypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeSharingSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSharingSpec(MLParser.TypeSharingSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeSharingSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSharingSpec(MLParser.TypeSharingSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code structureSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterStructureSpec(MLParser.StructureSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code structureSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitStructureSpec(MLParser.StructureSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code includeOneSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterIncludeOneSpec(MLParser.IncludeOneSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code includeOneSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitIncludeOneSpec(MLParser.IncludeOneSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code includeManySpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterIncludeManySpec(MLParser.IncludeManySpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code includeManySpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitIncludeManySpec(MLParser.IncludeManySpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code typeSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterTypeSpec(MLParser.TypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code typeSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitTypeSpec(MLParser.TypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code equaTypeSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterEquaTypeSpec(MLParser.EquaTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code equaTypeSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitEquaTypeSpec(MLParser.EquaTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code seqSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void enterSeqSpec(MLParser.SeqSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code seqSpec}
	 * labeled alternative in {@link MLParser#spec}.
	 * @param ctx the parse tree
	 */
	void exitSeqSpec(MLParser.SeqSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code valDesc}
	 * labeled alternative in {@link MLParser#valdesc}.
	 * @param ctx the parse tree
	 */
	void enterValDesc(MLParser.ValDescContext ctx);
	/**
	 * Exit a parse tree produced by the {@code valDesc}
	 * labeled alternative in {@link MLParser#valdesc}.
	 * @param ctx the parse tree
	 */
	void exitValDesc(MLParser.ValDescContext ctx);
	/**
	 * Enter a parse tree produced by the {@code absTypeSpec}
	 * labeled alternative in {@link MLParser#typdesc}.
	 * @param ctx the parse tree
	 */
	void enterAbsTypeSpec(MLParser.AbsTypeSpecContext ctx);
	/**
	 * Exit a parse tree produced by the {@code absTypeSpec}
	 * labeled alternative in {@link MLParser#typdesc}.
	 * @param ctx the parse tree
	 */
	void exitAbsTypeSpec(MLParser.AbsTypeSpecContext ctx);
	/**
	 * Enter a parse tree produced by the {@code datDesc}
	 * labeled alternative in {@link MLParser#datdesc}.
	 * @param ctx the parse tree
	 */
	void enterDatDesc(MLParser.DatDescContext ctx);
	/**
	 * Exit a parse tree produced by the {@code datDesc}
	 * labeled alternative in {@link MLParser#datdesc}.
	 * @param ctx the parse tree
	 */
	void exitDatDesc(MLParser.DatDescContext ctx);
	/**
	 * Enter a parse tree produced by the {@code condDesc}
	 * labeled alternative in {@link MLParser#condesc}.
	 * @param ctx the parse tree
	 */
	void enterCondDesc(MLParser.CondDescContext ctx);
	/**
	 * Exit a parse tree produced by the {@code condDesc}
	 * labeled alternative in {@link MLParser#condesc}.
	 * @param ctx the parse tree
	 */
	void exitCondDesc(MLParser.CondDescContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exnDesc}
	 * labeled alternative in {@link MLParser#exndesc}.
	 * @param ctx the parse tree
	 */
	void enterExnDesc(MLParser.ExnDescContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exnDesc}
	 * labeled alternative in {@link MLParser#exndesc}.
	 * @param ctx the parse tree
	 */
	void exitExnDesc(MLParser.ExnDescContext ctx);
	/**
	 * Enter a parse tree produced by the {@code strDesc}
	 * labeled alternative in {@link MLParser#strdesc}.
	 * @param ctx the parse tree
	 */
	void enterStrDesc(MLParser.StrDescContext ctx);
	/**
	 * Exit a parse tree produced by the {@code strDesc}
	 * labeled alternative in {@link MLParser#strdesc}.
	 * @param ctx the parse tree
	 */
	void exitStrDesc(MLParser.StrDescContext ctx);
	/**
	 * Enter a parse tree produced by the {@code functorDecProg}
	 * labeled alternative in {@link MLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterFunctorDecProg(MLParser.FunctorDecProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code functorDecProg}
	 * labeled alternative in {@link MLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitFunctorDecProg(MLParser.FunctorDecProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empProg}
	 * labeled alternative in {@link MLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterEmpProg(MLParser.EmpProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empProg}
	 * labeled alternative in {@link MLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitEmpProg(MLParser.EmpProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code seqProg}
	 * labeled alternative in {@link MLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterSeqProg(MLParser.SeqProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code seqProg}
	 * labeled alternative in {@link MLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitSeqProg(MLParser.SeqProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code coreDecProg}
	 * labeled alternative in {@link MLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterCoreDecProg(MLParser.CoreDecProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code coreDecProg}
	 * labeled alternative in {@link MLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitCoreDecProg(MLParser.CoreDecProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code signatureDecProg}
	 * labeled alternative in {@link MLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterSignatureDecProg(MLParser.SignatureDecProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code signatureDecProg}
	 * labeled alternative in {@link MLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitSignatureDecProg(MLParser.SignatureDecProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code empHeadSeqProg}
	 * labeled alternative in {@link MLParser#prog}.
	 * @param ctx the parse tree
	 */
	void enterEmpHeadSeqProg(MLParser.EmpHeadSeqProgContext ctx);
	/**
	 * Exit a parse tree produced by the {@code empHeadSeqProg}
	 * labeled alternative in {@link MLParser#prog}.
	 * @param ctx the parse tree
	 */
	void exitEmpHeadSeqProg(MLParser.EmpHeadSeqProgContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plainFctBindComp}
	 * labeled alternative in {@link MLParser#fctbind}.
	 * @param ctx the parse tree
	 */
	void enterPlainFctBindComp(MLParser.PlainFctBindCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plainFctBindComp}
	 * labeled alternative in {@link MLParser#fctbind}.
	 * @param ctx the parse tree
	 */
	void exitPlainFctBindComp(MLParser.PlainFctBindCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code plainFctBindSmpl}
	 * labeled alternative in {@link MLParser#fctbind}.
	 * @param ctx the parse tree
	 */
	void enterPlainFctBindSmpl(MLParser.PlainFctBindSmplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code plainFctBindSmpl}
	 * labeled alternative in {@link MLParser#fctbind}.
	 * @param ctx the parse tree
	 */
	void exitPlainFctBindSmpl(MLParser.PlainFctBindSmplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code openedFctBindComp}
	 * labeled alternative in {@link MLParser#fctbind}.
	 * @param ctx the parse tree
	 */
	void enterOpenedFctBindComp(MLParser.OpenedFctBindCompContext ctx);
	/**
	 * Exit a parse tree produced by the {@code openedFctBindComp}
	 * labeled alternative in {@link MLParser#fctbind}.
	 * @param ctx the parse tree
	 */
	void exitOpenedFctBindComp(MLParser.OpenedFctBindCompContext ctx);
	/**
	 * Enter a parse tree produced by the {@code openedFctBindSmpl}
	 * labeled alternative in {@link MLParser#fctbind}.
	 * @param ctx the parse tree
	 */
	void enterOpenedFctBindSmpl(MLParser.OpenedFctBindSmplContext ctx);
	/**
	 * Exit a parse tree produced by the {@code openedFctBindSmpl}
	 * labeled alternative in {@link MLParser#fctbind}.
	 * @param ctx the parse tree
	 */
	void exitOpenedFctBindSmpl(MLParser.OpenedFctBindSmplContext ctx);
	/**
	 * Enter a parse tree produced by the {@code sigBind}
	 * labeled alternative in {@link MLParser#sigbind}.
	 * @param ctx the parse tree
	 */
	void enterSigBind(MLParser.SigBindContext ctx);
	/**
	 * Exit a parse tree produced by the {@code sigBind}
	 * labeled alternative in {@link MLParser#sigbind}.
	 * @param ctx the parse tree
	 */
	void exitSigBind(MLParser.SigBindContext ctx);
}