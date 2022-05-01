package cuestionario.parser.antlr.internal;

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import cuestionario.services.CuestionarioGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCuestionarioParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cuestionario'", "'{'", "'preguntas'", "','", "'}'", "'categorias'", "'preguntaInicial'", "'preguntasFinales'", "'('", "')'", "'Categoria'", "'dificultad'", "'subcategorias'", "'-'", "'.'", "'E'", "'e'", "'PreguntaUnica'", "'enunciado'", "'puntuacion'", "'penalizacion'", "'categoria'", "'isInicial'", "'siguientePreguntaAcierto'", "'siguientePreguntaError'", "'respuestas'", "'correcta'", "'PreguntaMultiple'", "'correctas'", "'Respuesta'", "'opcion'"
    };
    public static final int RULE_STRING=4;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__37=37;
    public static final int T__16=16;
    public static final int T__38=38;
    public static final int T__17=17;
    public static final int T__39=39;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=5;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalCuestionarioParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCuestionarioParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCuestionarioParser.tokenNames; }
    public String getGrammarFileName() { return "InternalCuestionario.g"; }



     	private CuestionarioGrammarAccess grammarAccess;

        public InternalCuestionarioParser(TokenStream input, CuestionarioGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }

        @Override
        protected String getFirstRuleName() {
        	return "Cuestionario";
       	}

       	@Override
       	protected CuestionarioGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}




    // $ANTLR start "entryRuleCuestionario"
    // InternalCuestionario.g:64:1: entryRuleCuestionario returns [EObject current=null] : iv_ruleCuestionario= ruleCuestionario EOF ;
    public final EObject entryRuleCuestionario() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCuestionario = null;


        try {
            // InternalCuestionario.g:64:53: (iv_ruleCuestionario= ruleCuestionario EOF )
            // InternalCuestionario.g:65:2: iv_ruleCuestionario= ruleCuestionario EOF
            {
             newCompositeNode(grammarAccess.getCuestionarioRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCuestionario=ruleCuestionario();

            state._fsp--;

             current =iv_ruleCuestionario; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCuestionario"


    // $ANTLR start "ruleCuestionario"
    // InternalCuestionario.g:71:1: ruleCuestionario returns [EObject current=null] : (otherlv_0= 'Cuestionario' otherlv_1= '{' otherlv_2= 'preguntas' otherlv_3= '{' ( (lv_preguntas_4_0= rulePregunta ) ) (otherlv_5= ',' ( (lv_preguntas_6_0= rulePregunta ) ) )* otherlv_7= '}' otherlv_8= 'categorias' otherlv_9= '{' ( (lv_categorias_10_0= ruleCategoria ) ) (otherlv_11= ',' ( (lv_categorias_12_0= ruleCategoria ) ) )* otherlv_13= '}' otherlv_14= 'preguntaInicial' ( ( ruleEString ) ) otherlv_16= 'preguntasFinales' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' otherlv_22= '}' ) ;
    public final EObject ruleCuestionario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_preguntas_4_0 = null;

        EObject lv_preguntas_6_0 = null;

        EObject lv_categorias_10_0 = null;

        EObject lv_categorias_12_0 = null;



        	enterRule();

        try {
            // InternalCuestionario.g:77:2: ( (otherlv_0= 'Cuestionario' otherlv_1= '{' otherlv_2= 'preguntas' otherlv_3= '{' ( (lv_preguntas_4_0= rulePregunta ) ) (otherlv_5= ',' ( (lv_preguntas_6_0= rulePregunta ) ) )* otherlv_7= '}' otherlv_8= 'categorias' otherlv_9= '{' ( (lv_categorias_10_0= ruleCategoria ) ) (otherlv_11= ',' ( (lv_categorias_12_0= ruleCategoria ) ) )* otherlv_13= '}' otherlv_14= 'preguntaInicial' ( ( ruleEString ) ) otherlv_16= 'preguntasFinales' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' otherlv_22= '}' ) )
            // InternalCuestionario.g:78:2: (otherlv_0= 'Cuestionario' otherlv_1= '{' otherlv_2= 'preguntas' otherlv_3= '{' ( (lv_preguntas_4_0= rulePregunta ) ) (otherlv_5= ',' ( (lv_preguntas_6_0= rulePregunta ) ) )* otherlv_7= '}' otherlv_8= 'categorias' otherlv_9= '{' ( (lv_categorias_10_0= ruleCategoria ) ) (otherlv_11= ',' ( (lv_categorias_12_0= ruleCategoria ) ) )* otherlv_13= '}' otherlv_14= 'preguntaInicial' ( ( ruleEString ) ) otherlv_16= 'preguntasFinales' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' otherlv_22= '}' )
            {
            // InternalCuestionario.g:78:2: (otherlv_0= 'Cuestionario' otherlv_1= '{' otherlv_2= 'preguntas' otherlv_3= '{' ( (lv_preguntas_4_0= rulePregunta ) ) (otherlv_5= ',' ( (lv_preguntas_6_0= rulePregunta ) ) )* otherlv_7= '}' otherlv_8= 'categorias' otherlv_9= '{' ( (lv_categorias_10_0= ruleCategoria ) ) (otherlv_11= ',' ( (lv_categorias_12_0= ruleCategoria ) ) )* otherlv_13= '}' otherlv_14= 'preguntaInicial' ( ( ruleEString ) ) otherlv_16= 'preguntasFinales' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' otherlv_22= '}' )
            // InternalCuestionario.g:79:3: otherlv_0= 'Cuestionario' otherlv_1= '{' otherlv_2= 'preguntas' otherlv_3= '{' ( (lv_preguntas_4_0= rulePregunta ) ) (otherlv_5= ',' ( (lv_preguntas_6_0= rulePregunta ) ) )* otherlv_7= '}' otherlv_8= 'categorias' otherlv_9= '{' ( (lv_categorias_10_0= ruleCategoria ) ) (otherlv_11= ',' ( (lv_categorias_12_0= ruleCategoria ) ) )* otherlv_13= '}' otherlv_14= 'preguntaInicial' ( ( ruleEString ) ) otherlv_16= 'preguntasFinales' otherlv_17= '(' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* otherlv_21= ')' otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCuestionarioAccess().getCuestionarioKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCuestionarioAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_3); 

            			newLeafNode(otherlv_2, grammarAccess.getCuestionarioAccess().getPreguntasKeyword_2());
            		
            otherlv_3=(Token)match(input,12,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getCuestionarioAccess().getLeftCurlyBracketKeyword_3());
            		
            // InternalCuestionario.g:95:3: ( (lv_preguntas_4_0= rulePregunta ) )
            // InternalCuestionario.g:96:4: (lv_preguntas_4_0= rulePregunta )
            {
            // InternalCuestionario.g:96:4: (lv_preguntas_4_0= rulePregunta )
            // InternalCuestionario.g:97:5: lv_preguntas_4_0= rulePregunta
            {

            					newCompositeNode(grammarAccess.getCuestionarioAccess().getPreguntasPreguntaParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_6);
            lv_preguntas_4_0=rulePregunta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCuestionarioRule());
            					}
            					add(
            						current,
            						"preguntas",
            						lv_preguntas_4_0,
            						"cuestionario.Cuestionario.Pregunta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:114:3: (otherlv_5= ',' ( (lv_preguntas_6_0= rulePregunta ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==14) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCuestionario.g:115:4: otherlv_5= ',' ( (lv_preguntas_6_0= rulePregunta ) )
            	    {
            	    otherlv_5=(Token)match(input,14,FOLLOW_5); 

            	    				newLeafNode(otherlv_5, grammarAccess.getCuestionarioAccess().getCommaKeyword_5_0());
            	    			
            	    // InternalCuestionario.g:119:4: ( (lv_preguntas_6_0= rulePregunta ) )
            	    // InternalCuestionario.g:120:5: (lv_preguntas_6_0= rulePregunta )
            	    {
            	    // InternalCuestionario.g:120:5: (lv_preguntas_6_0= rulePregunta )
            	    // InternalCuestionario.g:121:6: lv_preguntas_6_0= rulePregunta
            	    {

            	    						newCompositeNode(grammarAccess.getCuestionarioAccess().getPreguntasPreguntaParserRuleCall_5_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_preguntas_6_0=rulePregunta();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCuestionarioRule());
            	    						}
            	    						add(
            	    							current,
            	    							"preguntas",
            	    							lv_preguntas_6_0,
            	    							"cuestionario.Cuestionario.Pregunta");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_7=(Token)match(input,15,FOLLOW_7); 

            			newLeafNode(otherlv_7, grammarAccess.getCuestionarioAccess().getRightCurlyBracketKeyword_6());
            		
            otherlv_8=(Token)match(input,16,FOLLOW_3); 

            			newLeafNode(otherlv_8, grammarAccess.getCuestionarioAccess().getCategoriasKeyword_7());
            		
            otherlv_9=(Token)match(input,12,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getCuestionarioAccess().getLeftCurlyBracketKeyword_8());
            		
            // InternalCuestionario.g:151:3: ( (lv_categorias_10_0= ruleCategoria ) )
            // InternalCuestionario.g:152:4: (lv_categorias_10_0= ruleCategoria )
            {
            // InternalCuestionario.g:152:4: (lv_categorias_10_0= ruleCategoria )
            // InternalCuestionario.g:153:5: lv_categorias_10_0= ruleCategoria
            {

            					newCompositeNode(grammarAccess.getCuestionarioAccess().getCategoriasCategoriaParserRuleCall_9_0());
            				
            pushFollow(FOLLOW_6);
            lv_categorias_10_0=ruleCategoria();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCuestionarioRule());
            					}
            					add(
            						current,
            						"categorias",
            						lv_categorias_10_0,
            						"cuestionario.Cuestionario.Categoria");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:170:3: (otherlv_11= ',' ( (lv_categorias_12_0= ruleCategoria ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==14) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCuestionario.g:171:4: otherlv_11= ',' ( (lv_categorias_12_0= ruleCategoria ) )
            	    {
            	    otherlv_11=(Token)match(input,14,FOLLOW_8); 

            	    				newLeafNode(otherlv_11, grammarAccess.getCuestionarioAccess().getCommaKeyword_10_0());
            	    			
            	    // InternalCuestionario.g:175:4: ( (lv_categorias_12_0= ruleCategoria ) )
            	    // InternalCuestionario.g:176:5: (lv_categorias_12_0= ruleCategoria )
            	    {
            	    // InternalCuestionario.g:176:5: (lv_categorias_12_0= ruleCategoria )
            	    // InternalCuestionario.g:177:6: lv_categorias_12_0= ruleCategoria
            	    {

            	    						newCompositeNode(grammarAccess.getCuestionarioAccess().getCategoriasCategoriaParserRuleCall_10_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_categorias_12_0=ruleCategoria();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCuestionarioRule());
            	    						}
            	    						add(
            	    							current,
            	    							"categorias",
            	    							lv_categorias_12_0,
            	    							"cuestionario.Cuestionario.Categoria");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_13=(Token)match(input,15,FOLLOW_9); 

            			newLeafNode(otherlv_13, grammarAccess.getCuestionarioAccess().getRightCurlyBracketKeyword_11());
            		
            otherlv_14=(Token)match(input,17,FOLLOW_10); 

            			newLeafNode(otherlv_14, grammarAccess.getCuestionarioAccess().getPreguntaInicialKeyword_12());
            		
            // InternalCuestionario.g:203:3: ( ( ruleEString ) )
            // InternalCuestionario.g:204:4: ( ruleEString )
            {
            // InternalCuestionario.g:204:4: ( ruleEString )
            // InternalCuestionario.g:205:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCuestionarioRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCuestionarioAccess().getPreguntaInicialPreguntaCrossReference_13_0());
            				
            pushFollow(FOLLOW_11);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_16=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_16, grammarAccess.getCuestionarioAccess().getPreguntasFinalesKeyword_14());
            		
            otherlv_17=(Token)match(input,19,FOLLOW_10); 

            			newLeafNode(otherlv_17, grammarAccess.getCuestionarioAccess().getLeftParenthesisKeyword_15());
            		
            // InternalCuestionario.g:227:3: ( ( ruleEString ) )
            // InternalCuestionario.g:228:4: ( ruleEString )
            {
            // InternalCuestionario.g:228:4: ( ruleEString )
            // InternalCuestionario.g:229:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCuestionarioRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCuestionarioAccess().getPreguntasFinalesPreguntaCrossReference_16_0());
            				
            pushFollow(FOLLOW_13);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:243:3: (otherlv_19= ',' ( ( ruleEString ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==14) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCuestionario.g:244:4: otherlv_19= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_19=(Token)match(input,14,FOLLOW_10); 

            	    				newLeafNode(otherlv_19, grammarAccess.getCuestionarioAccess().getCommaKeyword_17_0());
            	    			
            	    // InternalCuestionario.g:248:4: ( ( ruleEString ) )
            	    // InternalCuestionario.g:249:5: ( ruleEString )
            	    {
            	    // InternalCuestionario.g:249:5: ( ruleEString )
            	    // InternalCuestionario.g:250:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCuestionarioRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getCuestionarioAccess().getPreguntasFinalesPreguntaCrossReference_17_1_0());
            	    					
            	    pushFollow(FOLLOW_13);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_21=(Token)match(input,20,FOLLOW_14); 

            			newLeafNode(otherlv_21, grammarAccess.getCuestionarioAccess().getRightParenthesisKeyword_18());
            		
            otherlv_22=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_22, grammarAccess.getCuestionarioAccess().getRightCurlyBracketKeyword_19());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCuestionario"


    // $ANTLR start "entryRulePregunta"
    // InternalCuestionario.g:277:1: entryRulePregunta returns [EObject current=null] : iv_rulePregunta= rulePregunta EOF ;
    public final EObject entryRulePregunta() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePregunta = null;


        try {
            // InternalCuestionario.g:277:49: (iv_rulePregunta= rulePregunta EOF )
            // InternalCuestionario.g:278:2: iv_rulePregunta= rulePregunta EOF
            {
             newCompositeNode(grammarAccess.getPreguntaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePregunta=rulePregunta();

            state._fsp--;

             current =iv_rulePregunta; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePregunta"


    // $ANTLR start "rulePregunta"
    // InternalCuestionario.g:284:1: rulePregunta returns [EObject current=null] : (this_PreguntaUnica_0= rulePreguntaUnica | this_PreguntaMultiple_1= rulePreguntaMultiple ) ;
    public final EObject rulePregunta() throws RecognitionException {
        EObject current = null;

        EObject this_PreguntaUnica_0 = null;

        EObject this_PreguntaMultiple_1 = null;



        	enterRule();

        try {
            // InternalCuestionario.g:290:2: ( (this_PreguntaUnica_0= rulePreguntaUnica | this_PreguntaMultiple_1= rulePreguntaMultiple ) )
            // InternalCuestionario.g:291:2: (this_PreguntaUnica_0= rulePreguntaUnica | this_PreguntaMultiple_1= rulePreguntaMultiple )
            {
            // InternalCuestionario.g:291:2: (this_PreguntaUnica_0= rulePreguntaUnica | this_PreguntaMultiple_1= rulePreguntaMultiple )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==28) ) {
                alt4=1;
            }
            else if ( (LA4_0==38) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalCuestionario.g:292:3: this_PreguntaUnica_0= rulePreguntaUnica
                    {

                    			newCompositeNode(grammarAccess.getPreguntaAccess().getPreguntaUnicaParserRuleCall_0());
                    		
                    pushFollow(FOLLOW_2);
                    this_PreguntaUnica_0=rulePreguntaUnica();

                    state._fsp--;


                    			current = this_PreguntaUnica_0;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;
                case 2 :
                    // InternalCuestionario.g:301:3: this_PreguntaMultiple_1= rulePreguntaMultiple
                    {

                    			newCompositeNode(grammarAccess.getPreguntaAccess().getPreguntaMultipleParserRuleCall_1());
                    		
                    pushFollow(FOLLOW_2);
                    this_PreguntaMultiple_1=rulePreguntaMultiple();

                    state._fsp--;


                    			current = this_PreguntaMultiple_1;
                    			afterParserOrEnumRuleCall();
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePregunta"


    // $ANTLR start "entryRuleCategoria"
    // InternalCuestionario.g:313:1: entryRuleCategoria returns [EObject current=null] : iv_ruleCategoria= ruleCategoria EOF ;
    public final EObject entryRuleCategoria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategoria = null;


        try {
            // InternalCuestionario.g:313:50: (iv_ruleCategoria= ruleCategoria EOF )
            // InternalCuestionario.g:314:2: iv_ruleCategoria= ruleCategoria EOF
            {
             newCompositeNode(grammarAccess.getCategoriaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleCategoria=ruleCategoria();

            state._fsp--;

             current =iv_ruleCategoria; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCategoria"


    // $ANTLR start "ruleCategoria"
    // InternalCuestionario.g:320:1: ruleCategoria returns [EObject current=null] : (otherlv_0= 'Categoria' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dificultad' ( (lv_dificultad_4_0= ruleEDouble ) ) (otherlv_5= 'subcategorias' otherlv_6= '{' ( (lv_subcategorias_7_0= ruleCategoria ) ) (otherlv_8= ',' ( (lv_subcategorias_9_0= ruleCategoria ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) ;
    public final EObject ruleCategoria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_dificultad_4_0 = null;

        EObject lv_subcategorias_7_0 = null;

        EObject lv_subcategorias_9_0 = null;



        	enterRule();

        try {
            // InternalCuestionario.g:326:2: ( (otherlv_0= 'Categoria' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dificultad' ( (lv_dificultad_4_0= ruleEDouble ) ) (otherlv_5= 'subcategorias' otherlv_6= '{' ( (lv_subcategorias_7_0= ruleCategoria ) ) (otherlv_8= ',' ( (lv_subcategorias_9_0= ruleCategoria ) ) )* otherlv_10= '}' )? otherlv_11= '}' ) )
            // InternalCuestionario.g:327:2: (otherlv_0= 'Categoria' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dificultad' ( (lv_dificultad_4_0= ruleEDouble ) ) (otherlv_5= 'subcategorias' otherlv_6= '{' ( (lv_subcategorias_7_0= ruleCategoria ) ) (otherlv_8= ',' ( (lv_subcategorias_9_0= ruleCategoria ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            {
            // InternalCuestionario.g:327:2: (otherlv_0= 'Categoria' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dificultad' ( (lv_dificultad_4_0= ruleEDouble ) ) (otherlv_5= 'subcategorias' otherlv_6= '{' ( (lv_subcategorias_7_0= ruleCategoria ) ) (otherlv_8= ',' ( (lv_subcategorias_9_0= ruleCategoria ) ) )* otherlv_10= '}' )? otherlv_11= '}' )
            // InternalCuestionario.g:328:3: otherlv_0= 'Categoria' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dificultad' ( (lv_dificultad_4_0= ruleEDouble ) ) (otherlv_5= 'subcategorias' otherlv_6= '{' ( (lv_subcategorias_7_0= ruleCategoria ) ) (otherlv_8= ',' ( (lv_subcategorias_9_0= ruleCategoria ) ) )* otherlv_10= '}' )? otherlv_11= '}'
            {
            otherlv_0=(Token)match(input,21,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getCategoriaAccess().getCategoriaKeyword_0());
            		
            // InternalCuestionario.g:332:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCuestionario.g:333:4: (lv_name_1_0= ruleEString )
            {
            // InternalCuestionario.g:333:4: (lv_name_1_0= ruleEString )
            // InternalCuestionario.g:334:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCategoriaAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCategoriaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"cuestionario.Cuestionario.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_15); 

            			newLeafNode(otherlv_2, grammarAccess.getCategoriaAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,22,FOLLOW_16); 

            			newLeafNode(otherlv_3, grammarAccess.getCategoriaAccess().getDificultadKeyword_3());
            		
            // InternalCuestionario.g:359:3: ( (lv_dificultad_4_0= ruleEDouble ) )
            // InternalCuestionario.g:360:4: (lv_dificultad_4_0= ruleEDouble )
            {
            // InternalCuestionario.g:360:4: (lv_dificultad_4_0= ruleEDouble )
            // InternalCuestionario.g:361:5: lv_dificultad_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getCategoriaAccess().getDificultadEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_17);
            lv_dificultad_4_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCategoriaRule());
            					}
            					set(
            						current,
            						"dificultad",
            						lv_dificultad_4_0,
            						"cuestionario.Cuestionario.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:378:3: (otherlv_5= 'subcategorias' otherlv_6= '{' ( (lv_subcategorias_7_0= ruleCategoria ) ) (otherlv_8= ',' ( (lv_subcategorias_9_0= ruleCategoria ) ) )* otherlv_10= '}' )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==23) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCuestionario.g:379:4: otherlv_5= 'subcategorias' otherlv_6= '{' ( (lv_subcategorias_7_0= ruleCategoria ) ) (otherlv_8= ',' ( (lv_subcategorias_9_0= ruleCategoria ) ) )* otherlv_10= '}'
                    {
                    otherlv_5=(Token)match(input,23,FOLLOW_3); 

                    				newLeafNode(otherlv_5, grammarAccess.getCategoriaAccess().getSubcategoriasKeyword_5_0());
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_8); 

                    				newLeafNode(otherlv_6, grammarAccess.getCategoriaAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCuestionario.g:387:4: ( (lv_subcategorias_7_0= ruleCategoria ) )
                    // InternalCuestionario.g:388:5: (lv_subcategorias_7_0= ruleCategoria )
                    {
                    // InternalCuestionario.g:388:5: (lv_subcategorias_7_0= ruleCategoria )
                    // InternalCuestionario.g:389:6: lv_subcategorias_7_0= ruleCategoria
                    {

                    						newCompositeNode(grammarAccess.getCategoriaAccess().getSubcategoriasCategoriaParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_6);
                    lv_subcategorias_7_0=ruleCategoria();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCategoriaRule());
                    						}
                    						add(
                    							current,
                    							"subcategorias",
                    							lv_subcategorias_7_0,
                    							"cuestionario.Cuestionario.Categoria");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCuestionario.g:406:4: (otherlv_8= ',' ( (lv_subcategorias_9_0= ruleCategoria ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==14) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCuestionario.g:407:5: otherlv_8= ',' ( (lv_subcategorias_9_0= ruleCategoria ) )
                    	    {
                    	    otherlv_8=(Token)match(input,14,FOLLOW_8); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getCategoriaAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCuestionario.g:411:5: ( (lv_subcategorias_9_0= ruleCategoria ) )
                    	    // InternalCuestionario.g:412:6: (lv_subcategorias_9_0= ruleCategoria )
                    	    {
                    	    // InternalCuestionario.g:412:6: (lv_subcategorias_9_0= ruleCategoria )
                    	    // InternalCuestionario.g:413:7: lv_subcategorias_9_0= ruleCategoria
                    	    {

                    	    							newCompositeNode(grammarAccess.getCategoriaAccess().getSubcategoriasCategoriaParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_6);
                    	    lv_subcategorias_9_0=ruleCategoria();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCategoriaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subcategorias",
                    	    								lv_subcategorias_9_0,
                    	    								"cuestionario.Cuestionario.Categoria");
                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    otherlv_10=(Token)match(input,15,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getCategoriaAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_11, grammarAccess.getCategoriaAccess().getRightCurlyBracketKeyword_6());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleCategoria"


    // $ANTLR start "entryRuleEString"
    // InternalCuestionario.g:444:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCuestionario.g:444:47: (iv_ruleEString= ruleEString EOF )
            // InternalCuestionario.g:445:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCuestionario.g:451:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCuestionario.g:457:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCuestionario.g:458:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCuestionario.g:458:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==RULE_STRING) ) {
                alt7=1;
            }
            else if ( (LA7_0==RULE_ID) ) {
                alt7=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }
            switch (alt7) {
                case 1 :
                    // InternalCuestionario.g:459:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCuestionario.g:467:3: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FOLLOW_2); 

                    			current.merge(this_ID_1);
                    		

                    			newLeafNode(this_ID_1, grammarAccess.getEStringAccess().getIDTerminalRuleCall_1());
                    		

                    }
                    break;

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // InternalCuestionario.g:478:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalCuestionario.g:478:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalCuestionario.g:479:2: iv_ruleEDouble= ruleEDouble EOF
            {
             newCompositeNode(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleEDouble=ruleEDouble();

            state._fsp--;

             current =iv_ruleEDouble.getText(); 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalCuestionario.g:485:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalCuestionario.g:491:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalCuestionario.g:492:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalCuestionario.g:492:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalCuestionario.g:493:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalCuestionario.g:493:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==24) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCuestionario.g:494:4: kw= '-'
                    {
                    kw=(Token)match(input,24,FOLLOW_18); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalCuestionario.g:500:3: (this_INT_1= RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCuestionario.g:501:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_19); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,25,FOLLOW_20); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_21); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalCuestionario.g:521:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=26 && LA12_0<=27)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCuestionario.g:522:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalCuestionario.g:522:4: (kw= 'E' | kw= 'e' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==26) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==27) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalCuestionario.g:523:5: kw= 'E'
                            {
                            kw=(Token)match(input,26,FOLLOW_22); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalCuestionario.g:529:5: kw= 'e'
                            {
                            kw=(Token)match(input,27,FOLLOW_22); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalCuestionario.g:535:4: (kw= '-' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==24) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalCuestionario.g:536:5: kw= '-'
                            {
                            kw=(Token)match(input,24,FOLLOW_20); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1());
                            				

                            }
                            break;

                    }

                    this_INT_7=(Token)match(input,RULE_INT,FOLLOW_2); 

                    				current.merge(this_INT_7);
                    			

                    				newLeafNode(this_INT_7, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2());
                    			

                    }
                    break;

            }


            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRulePreguntaUnica"
    // InternalCuestionario.g:554:1: entryRulePreguntaUnica returns [EObject current=null] : iv_rulePreguntaUnica= rulePreguntaUnica EOF ;
    public final EObject entryRulePreguntaUnica() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreguntaUnica = null;


        try {
            // InternalCuestionario.g:554:54: (iv_rulePreguntaUnica= rulePreguntaUnica EOF )
            // InternalCuestionario.g:555:2: iv_rulePreguntaUnica= rulePreguntaUnica EOF
            {
             newCompositeNode(grammarAccess.getPreguntaUnicaRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreguntaUnica=rulePreguntaUnica();

            state._fsp--;

             current =iv_rulePreguntaUnica; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreguntaUnica"


    // $ANTLR start "rulePreguntaUnica"
    // InternalCuestionario.g:561:1: rulePreguntaUnica returns [EObject current=null] : (otherlv_0= 'PreguntaUnica' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) ( ( (lv_isInicial_11_0= 'isInicial' ) ) otherlv_12= '(' (otherlv_13= 'siguientePreguntaAcierto' ( ( ruleEString ) ) ) otherlv_15= ',' (otherlv_16= 'siguientePreguntaError' ( ( ruleEString ) ) ) otherlv_18= ')' )? otherlv_19= 'respuestas' otherlv_20= '{' ( (lv_respuestas_21_0= ruleRespuesta ) ) (otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) ) )* otherlv_24= '}' otherlv_25= 'correcta' ( ( ruleEString ) ) otherlv_27= '}' ) ;
    public final EObject rulePreguntaUnica() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_isInicial_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_enunciado_4_0 = null;

        AntlrDatatypeRuleToken lv_puntuacion_6_0 = null;

        AntlrDatatypeRuleToken lv_penalizacion_8_0 = null;

        EObject lv_respuestas_21_0 = null;

        EObject lv_respuestas_23_0 = null;



        	enterRule();

        try {
            // InternalCuestionario.g:567:2: ( (otherlv_0= 'PreguntaUnica' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) ( ( (lv_isInicial_11_0= 'isInicial' ) ) otherlv_12= '(' (otherlv_13= 'siguientePreguntaAcierto' ( ( ruleEString ) ) ) otherlv_15= ',' (otherlv_16= 'siguientePreguntaError' ( ( ruleEString ) ) ) otherlv_18= ')' )? otherlv_19= 'respuestas' otherlv_20= '{' ( (lv_respuestas_21_0= ruleRespuesta ) ) (otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) ) )* otherlv_24= '}' otherlv_25= 'correcta' ( ( ruleEString ) ) otherlv_27= '}' ) )
            // InternalCuestionario.g:568:2: (otherlv_0= 'PreguntaUnica' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) ( ( (lv_isInicial_11_0= 'isInicial' ) ) otherlv_12= '(' (otherlv_13= 'siguientePreguntaAcierto' ( ( ruleEString ) ) ) otherlv_15= ',' (otherlv_16= 'siguientePreguntaError' ( ( ruleEString ) ) ) otherlv_18= ')' )? otherlv_19= 'respuestas' otherlv_20= '{' ( (lv_respuestas_21_0= ruleRespuesta ) ) (otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) ) )* otherlv_24= '}' otherlv_25= 'correcta' ( ( ruleEString ) ) otherlv_27= '}' )
            {
            // InternalCuestionario.g:568:2: (otherlv_0= 'PreguntaUnica' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) ( ( (lv_isInicial_11_0= 'isInicial' ) ) otherlv_12= '(' (otherlv_13= 'siguientePreguntaAcierto' ( ( ruleEString ) ) ) otherlv_15= ',' (otherlv_16= 'siguientePreguntaError' ( ( ruleEString ) ) ) otherlv_18= ')' )? otherlv_19= 'respuestas' otherlv_20= '{' ( (lv_respuestas_21_0= ruleRespuesta ) ) (otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) ) )* otherlv_24= '}' otherlv_25= 'correcta' ( ( ruleEString ) ) otherlv_27= '}' )
            // InternalCuestionario.g:569:3: otherlv_0= 'PreguntaUnica' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) ( ( (lv_isInicial_11_0= 'isInicial' ) ) otherlv_12= '(' (otherlv_13= 'siguientePreguntaAcierto' ( ( ruleEString ) ) ) otherlv_15= ',' (otherlv_16= 'siguientePreguntaError' ( ( ruleEString ) ) ) otherlv_18= ')' )? otherlv_19= 'respuestas' otherlv_20= '{' ( (lv_respuestas_21_0= ruleRespuesta ) ) (otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) ) )* otherlv_24= '}' otherlv_25= 'correcta' ( ( ruleEString ) ) otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPreguntaUnicaAccess().getPreguntaUnicaKeyword_0());
            		
            // InternalCuestionario.g:573:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCuestionario.g:574:4: (lv_name_1_0= ruleEString )
            {
            // InternalCuestionario.g:574:4: (lv_name_1_0= ruleEString )
            // InternalCuestionario.g:575:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreguntaUnicaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"cuestionario.Cuestionario.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getPreguntaUnicaAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getPreguntaUnicaAccess().getEnunciadoKeyword_3());
            		
            // InternalCuestionario.g:600:3: ( (lv_enunciado_4_0= ruleEString ) )
            // InternalCuestionario.g:601:4: (lv_enunciado_4_0= ruleEString )
            {
            // InternalCuestionario.g:601:4: (lv_enunciado_4_0= ruleEString )
            // InternalCuestionario.g:602:5: lv_enunciado_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getEnunciadoEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_enunciado_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreguntaUnicaRule());
            					}
            					set(
            						current,
            						"enunciado",
            						lv_enunciado_4_0,
            						"cuestionario.Cuestionario.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getPreguntaUnicaAccess().getPuntuacionKeyword_5());
            		
            // InternalCuestionario.g:623:3: ( (lv_puntuacion_6_0= ruleEDouble ) )
            // InternalCuestionario.g:624:4: (lv_puntuacion_6_0= ruleEDouble )
            {
            // InternalCuestionario.g:624:4: (lv_puntuacion_6_0= ruleEDouble )
            // InternalCuestionario.g:625:5: lv_puntuacion_6_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getPuntuacionEDoubleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_25);
            lv_puntuacion_6_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreguntaUnicaRule());
            					}
            					set(
            						current,
            						"puntuacion",
            						lv_puntuacion_6_0,
            						"cuestionario.Cuestionario.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getPreguntaUnicaAccess().getPenalizacionKeyword_7());
            		
            // InternalCuestionario.g:646:3: ( (lv_penalizacion_8_0= ruleEDouble ) )
            // InternalCuestionario.g:647:4: (lv_penalizacion_8_0= ruleEDouble )
            {
            // InternalCuestionario.g:647:4: (lv_penalizacion_8_0= ruleEDouble )
            // InternalCuestionario.g:648:5: lv_penalizacion_8_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getPenalizacionEDoubleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_26);
            lv_penalizacion_8_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreguntaUnicaRule());
            					}
            					set(
            						current,
            						"penalizacion",
            						lv_penalizacion_8_0,
            						"cuestionario.Cuestionario.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getPreguntaUnicaAccess().getCategoriaKeyword_9());
            		
            // InternalCuestionario.g:669:3: ( ( ruleEString ) )
            // InternalCuestionario.g:670:4: ( ruleEString )
            {
            // InternalCuestionario.g:670:4: ( ruleEString )
            // InternalCuestionario.g:671:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreguntaUnicaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getCategoriaCategoriaCrossReference_10_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:685:3: ( ( (lv_isInicial_11_0= 'isInicial' ) ) otherlv_12= '(' (otherlv_13= 'siguientePreguntaAcierto' ( ( ruleEString ) ) ) otherlv_15= ',' (otherlv_16= 'siguientePreguntaError' ( ( ruleEString ) ) ) otherlv_18= ')' )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==33) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCuestionario.g:686:4: ( (lv_isInicial_11_0= 'isInicial' ) ) otherlv_12= '(' (otherlv_13= 'siguientePreguntaAcierto' ( ( ruleEString ) ) ) otherlv_15= ',' (otherlv_16= 'siguientePreguntaError' ( ( ruleEString ) ) ) otherlv_18= ')'
                    {
                    // InternalCuestionario.g:686:4: ( (lv_isInicial_11_0= 'isInicial' ) )
                    // InternalCuestionario.g:687:5: (lv_isInicial_11_0= 'isInicial' )
                    {
                    // InternalCuestionario.g:687:5: (lv_isInicial_11_0= 'isInicial' )
                    // InternalCuestionario.g:688:6: lv_isInicial_11_0= 'isInicial'
                    {
                    lv_isInicial_11_0=(Token)match(input,33,FOLLOW_12); 

                    						newLeafNode(lv_isInicial_11_0, grammarAccess.getPreguntaUnicaAccess().getIsInicialIsInicialKeyword_11_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPreguntaUnicaRule());
                    						}
                    						setWithLastConsumed(current, "isInicial", lv_isInicial_11_0 != null, "isInicial");
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,19,FOLLOW_28); 

                    				newLeafNode(otherlv_12, grammarAccess.getPreguntaUnicaAccess().getLeftParenthesisKeyword_11_1());
                    			
                    // InternalCuestionario.g:704:4: (otherlv_13= 'siguientePreguntaAcierto' ( ( ruleEString ) ) )
                    // InternalCuestionario.g:705:5: otherlv_13= 'siguientePreguntaAcierto' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,34,FOLLOW_10); 

                    					newLeafNode(otherlv_13, grammarAccess.getPreguntaUnicaAccess().getSiguientePreguntaAciertoKeyword_11_2_0());
                    				
                    // InternalCuestionario.g:709:5: ( ( ruleEString ) )
                    // InternalCuestionario.g:710:6: ( ruleEString )
                    {
                    // InternalCuestionario.g:710:6: ( ruleEString )
                    // InternalCuestionario.g:711:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPreguntaUnicaRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getSiguientePreguntaAciertoPreguntaCrossReference_11_2_1_0());
                    						
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_15=(Token)match(input,14,FOLLOW_30); 

                    				newLeafNode(otherlv_15, grammarAccess.getPreguntaUnicaAccess().getCommaKeyword_11_3());
                    			
                    // InternalCuestionario.g:730:4: (otherlv_16= 'siguientePreguntaError' ( ( ruleEString ) ) )
                    // InternalCuestionario.g:731:5: otherlv_16= 'siguientePreguntaError' ( ( ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,35,FOLLOW_10); 

                    					newLeafNode(otherlv_16, grammarAccess.getPreguntaUnicaAccess().getSiguientePreguntaErrorKeyword_11_4_0());
                    				
                    // InternalCuestionario.g:735:5: ( ( ruleEString ) )
                    // InternalCuestionario.g:736:6: ( ruleEString )
                    {
                    // InternalCuestionario.g:736:6: ( ruleEString )
                    // InternalCuestionario.g:737:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPreguntaUnicaRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getSiguientePreguntaErrorPreguntaCrossReference_11_4_1_0());
                    						
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_18=(Token)match(input,20,FOLLOW_32); 

                    				newLeafNode(otherlv_18, grammarAccess.getPreguntaUnicaAccess().getRightParenthesisKeyword_11_5());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getPreguntaUnicaAccess().getRespuestasKeyword_12());
            		
            otherlv_20=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_20, grammarAccess.getPreguntaUnicaAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalCuestionario.g:765:3: ( (lv_respuestas_21_0= ruleRespuesta ) )
            // InternalCuestionario.g:766:4: (lv_respuestas_21_0= ruleRespuesta )
            {
            // InternalCuestionario.g:766:4: (lv_respuestas_21_0= ruleRespuesta )
            // InternalCuestionario.g:767:5: lv_respuestas_21_0= ruleRespuesta
            {

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getRespuestasRespuestaParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_6);
            lv_respuestas_21_0=ruleRespuesta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreguntaUnicaRule());
            					}
            					add(
            						current,
            						"respuestas",
            						lv_respuestas_21_0,
            						"cuestionario.Cuestionario.Respuesta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:784:3: (otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==14) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCuestionario.g:785:4: otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) )
            	    {
            	    otherlv_22=(Token)match(input,14,FOLLOW_33); 

            	    				newLeafNode(otherlv_22, grammarAccess.getPreguntaUnicaAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalCuestionario.g:789:4: ( (lv_respuestas_23_0= ruleRespuesta ) )
            	    // InternalCuestionario.g:790:5: (lv_respuestas_23_0= ruleRespuesta )
            	    {
            	    // InternalCuestionario.g:790:5: (lv_respuestas_23_0= ruleRespuesta )
            	    // InternalCuestionario.g:791:6: lv_respuestas_23_0= ruleRespuesta
            	    {

            	    						newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getRespuestasRespuestaParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_respuestas_23_0=ruleRespuesta();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPreguntaUnicaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"respuestas",
            	    							lv_respuestas_23_0,
            	    							"cuestionario.Cuestionario.Respuesta");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

            otherlv_24=(Token)match(input,15,FOLLOW_34); 

            			newLeafNode(otherlv_24, grammarAccess.getPreguntaUnicaAccess().getRightCurlyBracketKeyword_16());
            		
            otherlv_25=(Token)match(input,37,FOLLOW_10); 

            			newLeafNode(otherlv_25, grammarAccess.getPreguntaUnicaAccess().getCorrectaKeyword_17());
            		
            // InternalCuestionario.g:817:3: ( ( ruleEString ) )
            // InternalCuestionario.g:818:4: ( ruleEString )
            {
            // InternalCuestionario.g:818:4: ( ruleEString )
            // InternalCuestionario.g:819:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreguntaUnicaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getCorrectaRespuestaCrossReference_18_0());
            				
            pushFollow(FOLLOW_14);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_27=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_27, grammarAccess.getPreguntaUnicaAccess().getRightCurlyBracketKeyword_19());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreguntaUnica"


    // $ANTLR start "entryRulePreguntaMultiple"
    // InternalCuestionario.g:841:1: entryRulePreguntaMultiple returns [EObject current=null] : iv_rulePreguntaMultiple= rulePreguntaMultiple EOF ;
    public final EObject entryRulePreguntaMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreguntaMultiple = null;


        try {
            // InternalCuestionario.g:841:57: (iv_rulePreguntaMultiple= rulePreguntaMultiple EOF )
            // InternalCuestionario.g:842:2: iv_rulePreguntaMultiple= rulePreguntaMultiple EOF
            {
             newCompositeNode(grammarAccess.getPreguntaMultipleRule()); 
            pushFollow(FOLLOW_1);
            iv_rulePreguntaMultiple=rulePreguntaMultiple();

            state._fsp--;

             current =iv_rulePreguntaMultiple; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePreguntaMultiple"


    // $ANTLR start "rulePreguntaMultiple"
    // InternalCuestionario.g:848:1: rulePreguntaMultiple returns [EObject current=null] : (otherlv_0= 'PreguntaMultiple' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) ( ( (lv_isInicial_11_0= 'isInicial' ) ) otherlv_12= '(' (otherlv_13= 'siguientePreguntaAcierto' ( ( ruleEString ) ) ) otherlv_15= ',' (otherlv_16= 'siguientePreguntaError' ( ( ruleEString ) ) ) otherlv_18= ')' )? otherlv_19= 'respuestas' otherlv_20= '{' ( (lv_respuestas_21_0= ruleRespuesta ) ) (otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) ) )* otherlv_24= '}' (otherlv_25= 'correctas' otherlv_26= '(' ( ( ruleEString ) ) (otherlv_28= ',' ( ( ruleEString ) ) )* otherlv_30= ')' )? otherlv_31= '}' ) ;
    public final EObject rulePreguntaMultiple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token lv_isInicial_11_0=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_enunciado_4_0 = null;

        AntlrDatatypeRuleToken lv_puntuacion_6_0 = null;

        AntlrDatatypeRuleToken lv_penalizacion_8_0 = null;

        EObject lv_respuestas_21_0 = null;

        EObject lv_respuestas_23_0 = null;



        	enterRule();

        try {
            // InternalCuestionario.g:854:2: ( (otherlv_0= 'PreguntaMultiple' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) ( ( (lv_isInicial_11_0= 'isInicial' ) ) otherlv_12= '(' (otherlv_13= 'siguientePreguntaAcierto' ( ( ruleEString ) ) ) otherlv_15= ',' (otherlv_16= 'siguientePreguntaError' ( ( ruleEString ) ) ) otherlv_18= ')' )? otherlv_19= 'respuestas' otherlv_20= '{' ( (lv_respuestas_21_0= ruleRespuesta ) ) (otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) ) )* otherlv_24= '}' (otherlv_25= 'correctas' otherlv_26= '(' ( ( ruleEString ) ) (otherlv_28= ',' ( ( ruleEString ) ) )* otherlv_30= ')' )? otherlv_31= '}' ) )
            // InternalCuestionario.g:855:2: (otherlv_0= 'PreguntaMultiple' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) ( ( (lv_isInicial_11_0= 'isInicial' ) ) otherlv_12= '(' (otherlv_13= 'siguientePreguntaAcierto' ( ( ruleEString ) ) ) otherlv_15= ',' (otherlv_16= 'siguientePreguntaError' ( ( ruleEString ) ) ) otherlv_18= ')' )? otherlv_19= 'respuestas' otherlv_20= '{' ( (lv_respuestas_21_0= ruleRespuesta ) ) (otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) ) )* otherlv_24= '}' (otherlv_25= 'correctas' otherlv_26= '(' ( ( ruleEString ) ) (otherlv_28= ',' ( ( ruleEString ) ) )* otherlv_30= ')' )? otherlv_31= '}' )
            {
            // InternalCuestionario.g:855:2: (otherlv_0= 'PreguntaMultiple' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) ( ( (lv_isInicial_11_0= 'isInicial' ) ) otherlv_12= '(' (otherlv_13= 'siguientePreguntaAcierto' ( ( ruleEString ) ) ) otherlv_15= ',' (otherlv_16= 'siguientePreguntaError' ( ( ruleEString ) ) ) otherlv_18= ')' )? otherlv_19= 'respuestas' otherlv_20= '{' ( (lv_respuestas_21_0= ruleRespuesta ) ) (otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) ) )* otherlv_24= '}' (otherlv_25= 'correctas' otherlv_26= '(' ( ( ruleEString ) ) (otherlv_28= ',' ( ( ruleEString ) ) )* otherlv_30= ')' )? otherlv_31= '}' )
            // InternalCuestionario.g:856:3: otherlv_0= 'PreguntaMultiple' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) ( ( (lv_isInicial_11_0= 'isInicial' ) ) otherlv_12= '(' (otherlv_13= 'siguientePreguntaAcierto' ( ( ruleEString ) ) ) otherlv_15= ',' (otherlv_16= 'siguientePreguntaError' ( ( ruleEString ) ) ) otherlv_18= ')' )? otherlv_19= 'respuestas' otherlv_20= '{' ( (lv_respuestas_21_0= ruleRespuesta ) ) (otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) ) )* otherlv_24= '}' (otherlv_25= 'correctas' otherlv_26= '(' ( ( ruleEString ) ) (otherlv_28= ',' ( ( ruleEString ) ) )* otherlv_30= ')' )? otherlv_31= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getPreguntaMultipleAccess().getPreguntaMultipleKeyword_0());
            		
            // InternalCuestionario.g:860:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCuestionario.g:861:4: (lv_name_1_0= ruleEString )
            {
            // InternalCuestionario.g:861:4: (lv_name_1_0= ruleEString )
            // InternalCuestionario.g:862:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreguntaMultipleRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"cuestionario.Cuestionario.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getPreguntaMultipleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getPreguntaMultipleAccess().getEnunciadoKeyword_3());
            		
            // InternalCuestionario.g:887:3: ( (lv_enunciado_4_0= ruleEString ) )
            // InternalCuestionario.g:888:4: (lv_enunciado_4_0= ruleEString )
            {
            // InternalCuestionario.g:888:4: (lv_enunciado_4_0= ruleEString )
            // InternalCuestionario.g:889:5: lv_enunciado_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getEnunciadoEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_24);
            lv_enunciado_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreguntaMultipleRule());
            					}
            					set(
            						current,
            						"enunciado",
            						lv_enunciado_4_0,
            						"cuestionario.Cuestionario.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,30,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getPreguntaMultipleAccess().getPuntuacionKeyword_5());
            		
            // InternalCuestionario.g:910:3: ( (lv_puntuacion_6_0= ruleEDouble ) )
            // InternalCuestionario.g:911:4: (lv_puntuacion_6_0= ruleEDouble )
            {
            // InternalCuestionario.g:911:4: (lv_puntuacion_6_0= ruleEDouble )
            // InternalCuestionario.g:912:5: lv_puntuacion_6_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getPuntuacionEDoubleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_25);
            lv_puntuacion_6_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreguntaMultipleRule());
            					}
            					set(
            						current,
            						"puntuacion",
            						lv_puntuacion_6_0,
            						"cuestionario.Cuestionario.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_7=(Token)match(input,31,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getPreguntaMultipleAccess().getPenalizacionKeyword_7());
            		
            // InternalCuestionario.g:933:3: ( (lv_penalizacion_8_0= ruleEDouble ) )
            // InternalCuestionario.g:934:4: (lv_penalizacion_8_0= ruleEDouble )
            {
            // InternalCuestionario.g:934:4: (lv_penalizacion_8_0= ruleEDouble )
            // InternalCuestionario.g:935:5: lv_penalizacion_8_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getPenalizacionEDoubleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_26);
            lv_penalizacion_8_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreguntaMultipleRule());
            					}
            					set(
            						current,
            						"penalizacion",
            						lv_penalizacion_8_0,
            						"cuestionario.Cuestionario.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_9=(Token)match(input,32,FOLLOW_10); 

            			newLeafNode(otherlv_9, grammarAccess.getPreguntaMultipleAccess().getCategoriaKeyword_9());
            		
            // InternalCuestionario.g:956:3: ( ( ruleEString ) )
            // InternalCuestionario.g:957:4: ( ruleEString )
            {
            // InternalCuestionario.g:957:4: ( ruleEString )
            // InternalCuestionario.g:958:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreguntaMultipleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getCategoriaCategoriaCrossReference_10_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:972:3: ( ( (lv_isInicial_11_0= 'isInicial' ) ) otherlv_12= '(' (otherlv_13= 'siguientePreguntaAcierto' ( ( ruleEString ) ) ) otherlv_15= ',' (otherlv_16= 'siguientePreguntaError' ( ( ruleEString ) ) ) otherlv_18= ')' )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==33) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCuestionario.g:973:4: ( (lv_isInicial_11_0= 'isInicial' ) ) otherlv_12= '(' (otherlv_13= 'siguientePreguntaAcierto' ( ( ruleEString ) ) ) otherlv_15= ',' (otherlv_16= 'siguientePreguntaError' ( ( ruleEString ) ) ) otherlv_18= ')'
                    {
                    // InternalCuestionario.g:973:4: ( (lv_isInicial_11_0= 'isInicial' ) )
                    // InternalCuestionario.g:974:5: (lv_isInicial_11_0= 'isInicial' )
                    {
                    // InternalCuestionario.g:974:5: (lv_isInicial_11_0= 'isInicial' )
                    // InternalCuestionario.g:975:6: lv_isInicial_11_0= 'isInicial'
                    {
                    lv_isInicial_11_0=(Token)match(input,33,FOLLOW_12); 

                    						newLeafNode(lv_isInicial_11_0, grammarAccess.getPreguntaMultipleAccess().getIsInicialIsInicialKeyword_11_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPreguntaMultipleRule());
                    						}
                    						setWithLastConsumed(current, "isInicial", lv_isInicial_11_0 != null, "isInicial");
                    					

                    }


                    }

                    otherlv_12=(Token)match(input,19,FOLLOW_28); 

                    				newLeafNode(otherlv_12, grammarAccess.getPreguntaMultipleAccess().getLeftParenthesisKeyword_11_1());
                    			
                    // InternalCuestionario.g:991:4: (otherlv_13= 'siguientePreguntaAcierto' ( ( ruleEString ) ) )
                    // InternalCuestionario.g:992:5: otherlv_13= 'siguientePreguntaAcierto' ( ( ruleEString ) )
                    {
                    otherlv_13=(Token)match(input,34,FOLLOW_10); 

                    					newLeafNode(otherlv_13, grammarAccess.getPreguntaMultipleAccess().getSiguientePreguntaAciertoKeyword_11_2_0());
                    				
                    // InternalCuestionario.g:996:5: ( ( ruleEString ) )
                    // InternalCuestionario.g:997:6: ( ruleEString )
                    {
                    // InternalCuestionario.g:997:6: ( ruleEString )
                    // InternalCuestionario.g:998:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPreguntaMultipleRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getSiguientePreguntaAciertoPreguntaCrossReference_11_2_1_0());
                    						
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_15=(Token)match(input,14,FOLLOW_30); 

                    				newLeafNode(otherlv_15, grammarAccess.getPreguntaMultipleAccess().getCommaKeyword_11_3());
                    			
                    // InternalCuestionario.g:1017:4: (otherlv_16= 'siguientePreguntaError' ( ( ruleEString ) ) )
                    // InternalCuestionario.g:1018:5: otherlv_16= 'siguientePreguntaError' ( ( ruleEString ) )
                    {
                    otherlv_16=(Token)match(input,35,FOLLOW_10); 

                    					newLeafNode(otherlv_16, grammarAccess.getPreguntaMultipleAccess().getSiguientePreguntaErrorKeyword_11_4_0());
                    				
                    // InternalCuestionario.g:1022:5: ( ( ruleEString ) )
                    // InternalCuestionario.g:1023:6: ( ruleEString )
                    {
                    // InternalCuestionario.g:1023:6: ( ruleEString )
                    // InternalCuestionario.g:1024:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPreguntaMultipleRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getSiguientePreguntaErrorPreguntaCrossReference_11_4_1_0());
                    						
                    pushFollow(FOLLOW_31);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_18=(Token)match(input,20,FOLLOW_32); 

                    				newLeafNode(otherlv_18, grammarAccess.getPreguntaMultipleAccess().getRightParenthesisKeyword_11_5());
                    			

                    }
                    break;

            }

            otherlv_19=(Token)match(input,36,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getPreguntaMultipleAccess().getRespuestasKeyword_12());
            		
            otherlv_20=(Token)match(input,12,FOLLOW_33); 

            			newLeafNode(otherlv_20, grammarAccess.getPreguntaMultipleAccess().getLeftCurlyBracketKeyword_13());
            		
            // InternalCuestionario.g:1052:3: ( (lv_respuestas_21_0= ruleRespuesta ) )
            // InternalCuestionario.g:1053:4: (lv_respuestas_21_0= ruleRespuesta )
            {
            // InternalCuestionario.g:1053:4: (lv_respuestas_21_0= ruleRespuesta )
            // InternalCuestionario.g:1054:5: lv_respuestas_21_0= ruleRespuesta
            {

            					newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getRespuestasRespuestaParserRuleCall_14_0());
            				
            pushFollow(FOLLOW_6);
            lv_respuestas_21_0=ruleRespuesta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreguntaMultipleRule());
            					}
            					add(
            						current,
            						"respuestas",
            						lv_respuestas_21_0,
            						"cuestionario.Cuestionario.Respuesta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:1071:3: (otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==14) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCuestionario.g:1072:4: otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) )
            	    {
            	    otherlv_22=(Token)match(input,14,FOLLOW_33); 

            	    				newLeafNode(otherlv_22, grammarAccess.getPreguntaMultipleAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalCuestionario.g:1076:4: ( (lv_respuestas_23_0= ruleRespuesta ) )
            	    // InternalCuestionario.g:1077:5: (lv_respuestas_23_0= ruleRespuesta )
            	    {
            	    // InternalCuestionario.g:1077:5: (lv_respuestas_23_0= ruleRespuesta )
            	    // InternalCuestionario.g:1078:6: lv_respuestas_23_0= ruleRespuesta
            	    {

            	    						newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getRespuestasRespuestaParserRuleCall_15_1_0());
            	    					
            	    pushFollow(FOLLOW_6);
            	    lv_respuestas_23_0=ruleRespuesta();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPreguntaMultipleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"respuestas",
            	    							lv_respuestas_23_0,
            	    							"cuestionario.Cuestionario.Respuesta");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_24=(Token)match(input,15,FOLLOW_35); 

            			newLeafNode(otherlv_24, grammarAccess.getPreguntaMultipleAccess().getRightCurlyBracketKeyword_16());
            		
            // InternalCuestionario.g:1100:3: (otherlv_25= 'correctas' otherlv_26= '(' ( ( ruleEString ) ) (otherlv_28= ',' ( ( ruleEString ) ) )* otherlv_30= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==39) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCuestionario.g:1101:4: otherlv_25= 'correctas' otherlv_26= '(' ( ( ruleEString ) ) (otherlv_28= ',' ( ( ruleEString ) ) )* otherlv_30= ')'
                    {
                    otherlv_25=(Token)match(input,39,FOLLOW_12); 

                    				newLeafNode(otherlv_25, grammarAccess.getPreguntaMultipleAccess().getCorrectasKeyword_17_0());
                    			
                    otherlv_26=(Token)match(input,19,FOLLOW_10); 

                    				newLeafNode(otherlv_26, grammarAccess.getPreguntaMultipleAccess().getLeftParenthesisKeyword_17_1());
                    			
                    // InternalCuestionario.g:1109:4: ( ( ruleEString ) )
                    // InternalCuestionario.g:1110:5: ( ruleEString )
                    {
                    // InternalCuestionario.g:1110:5: ( ruleEString )
                    // InternalCuestionario.g:1111:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPreguntaMultipleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getCorrectasRespuestaCrossReference_17_2_0());
                    					
                    pushFollow(FOLLOW_13);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCuestionario.g:1125:4: (otherlv_28= ',' ( ( ruleEString ) ) )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0==14) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // InternalCuestionario.g:1126:5: otherlv_28= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_28=(Token)match(input,14,FOLLOW_10); 

                    	    					newLeafNode(otherlv_28, grammarAccess.getPreguntaMultipleAccess().getCommaKeyword_17_3_0());
                    	    				
                    	    // InternalCuestionario.g:1130:5: ( ( ruleEString ) )
                    	    // InternalCuestionario.g:1131:6: ( ruleEString )
                    	    {
                    	    // InternalCuestionario.g:1131:6: ( ruleEString )
                    	    // InternalCuestionario.g:1132:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPreguntaMultipleRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getCorrectasRespuestaCrossReference_17_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_13);
                    	    ruleEString();

                    	    state._fsp--;


                    	    							afterParserOrEnumRuleCall();
                    	    						

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);

                    otherlv_30=(Token)match(input,20,FOLLOW_14); 

                    				newLeafNode(otherlv_30, grammarAccess.getPreguntaMultipleAccess().getRightParenthesisKeyword_17_4());
                    			

                    }
                    break;

            }

            otherlv_31=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_31, grammarAccess.getPreguntaMultipleAccess().getRightCurlyBracketKeyword_18());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePreguntaMultiple"


    // $ANTLR start "entryRuleRespuesta"
    // InternalCuestionario.g:1160:1: entryRuleRespuesta returns [EObject current=null] : iv_ruleRespuesta= ruleRespuesta EOF ;
    public final EObject entryRuleRespuesta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRespuesta = null;


        try {
            // InternalCuestionario.g:1160:50: (iv_ruleRespuesta= ruleRespuesta EOF )
            // InternalCuestionario.g:1161:2: iv_ruleRespuesta= ruleRespuesta EOF
            {
             newCompositeNode(grammarAccess.getRespuestaRule()); 
            pushFollow(FOLLOW_1);
            iv_ruleRespuesta=ruleRespuesta();

            state._fsp--;

             current =iv_ruleRespuesta; 
            match(input,EOF,FOLLOW_2); 

            }

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRespuesta"


    // $ANTLR start "ruleRespuesta"
    // InternalCuestionario.g:1167:1: ruleRespuesta returns [EObject current=null] : (otherlv_0= 'Respuesta' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'opcion' ( (lv_opcion_4_0= ruleEString ) ) otherlv_5= '}' ) ;
    public final EObject ruleRespuesta() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_opcion_4_0 = null;



        	enterRule();

        try {
            // InternalCuestionario.g:1173:2: ( (otherlv_0= 'Respuesta' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'opcion' ( (lv_opcion_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // InternalCuestionario.g:1174:2: (otherlv_0= 'Respuesta' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'opcion' ( (lv_opcion_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCuestionario.g:1174:2: (otherlv_0= 'Respuesta' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'opcion' ( (lv_opcion_4_0= ruleEString ) ) otherlv_5= '}' )
            // InternalCuestionario.g:1175:3: otherlv_0= 'Respuesta' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'opcion' ( (lv_opcion_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,40,FOLLOW_10); 

            			newLeafNode(otherlv_0, grammarAccess.getRespuestaAccess().getRespuestaKeyword_0());
            		
            // InternalCuestionario.g:1179:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCuestionario.g:1180:4: (lv_name_1_0= ruleEString )
            {
            // InternalCuestionario.g:1180:4: (lv_name_1_0= ruleEString )
            // InternalCuestionario.g:1181:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRespuestaAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_3);
            lv_name_1_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRespuestaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_1_0,
            						"cuestionario.Cuestionario.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_2=(Token)match(input,12,FOLLOW_36); 

            			newLeafNode(otherlv_2, grammarAccess.getRespuestaAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,41,FOLLOW_10); 

            			newLeafNode(otherlv_3, grammarAccess.getRespuestaAccess().getOpcionKeyword_3());
            		
            // InternalCuestionario.g:1206:3: ( (lv_opcion_4_0= ruleEString ) )
            // InternalCuestionario.g:1207:4: (lv_opcion_4_0= ruleEString )
            {
            // InternalCuestionario.g:1207:4: (lv_opcion_4_0= ruleEString )
            // InternalCuestionario.g:1208:5: lv_opcion_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRespuestaAccess().getOpcionEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
            lv_opcion_4_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRespuestaRule());
            					}
            					set(
            						current,
            						"opcion",
            						lv_opcion_4_0,
            						"cuestionario.Cuestionario.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_5=(Token)match(input,15,FOLLOW_2); 

            			newLeafNode(otherlv_5, grammarAccess.getRespuestaAccess().getRightCurlyBracketKeyword_5());
            		

            }


            }


            	leaveRule();

        }

            catch (RecognitionException re) {
                recover(input,re);
                appendSkippedTokens();
            }
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleRespuesta"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000004010000000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000000C000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000104000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000808000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000001200000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000008000008000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000020000000000L});

}