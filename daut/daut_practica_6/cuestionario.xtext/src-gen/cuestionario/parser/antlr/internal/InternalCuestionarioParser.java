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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cuestionario'", "'{'", "'preguntaInicial'", "'preguntasFinales'", "'('", "','", "')'", "'preguntas'", "'}'", "'categorias'", "'Categoria'", "'dificultad'", "'subcategorias'", "'-'", "'.'", "'E'", "'e'", "'Respuesta'", "'opcion'", "'PreguntaUnica'", "'enunciado'", "'puntuacion'", "'penalizacion'", "'categoria'", "'siguientePregunta'", "'correcta'", "'respuestas'", "'PreguntaMultiple'", "'correctas'"
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
    // InternalCuestionario.g:71:1: ruleCuestionario returns [EObject current=null] : (otherlv_0= 'Cuestionario' otherlv_1= '{' otherlv_2= 'preguntaInicial' ( ( ruleEString ) ) otherlv_4= 'preguntasFinales' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'preguntas' otherlv_11= '{' ( (lv_preguntas_12_0= rulePregunta ) ) (otherlv_13= ',' ( (lv_preguntas_14_0= rulePregunta ) ) )* otherlv_15= '}' otherlv_16= 'categorias' otherlv_17= '{' ( (lv_categorias_18_0= ruleCategoria ) ) (otherlv_19= ',' ( (lv_categorias_20_0= ruleCategoria ) ) )* otherlv_21= '}' otherlv_22= '}' ) ;
    public final EObject ruleCuestionario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token otherlv_21=null;
        Token otherlv_22=null;
        EObject lv_preguntas_12_0 = null;

        EObject lv_preguntas_14_0 = null;

        EObject lv_categorias_18_0 = null;

        EObject lv_categorias_20_0 = null;



        	enterRule();

        try {
            // InternalCuestionario.g:77:2: ( (otherlv_0= 'Cuestionario' otherlv_1= '{' otherlv_2= 'preguntaInicial' ( ( ruleEString ) ) otherlv_4= 'preguntasFinales' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'preguntas' otherlv_11= '{' ( (lv_preguntas_12_0= rulePregunta ) ) (otherlv_13= ',' ( (lv_preguntas_14_0= rulePregunta ) ) )* otherlv_15= '}' otherlv_16= 'categorias' otherlv_17= '{' ( (lv_categorias_18_0= ruleCategoria ) ) (otherlv_19= ',' ( (lv_categorias_20_0= ruleCategoria ) ) )* otherlv_21= '}' otherlv_22= '}' ) )
            // InternalCuestionario.g:78:2: (otherlv_0= 'Cuestionario' otherlv_1= '{' otherlv_2= 'preguntaInicial' ( ( ruleEString ) ) otherlv_4= 'preguntasFinales' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'preguntas' otherlv_11= '{' ( (lv_preguntas_12_0= rulePregunta ) ) (otherlv_13= ',' ( (lv_preguntas_14_0= rulePregunta ) ) )* otherlv_15= '}' otherlv_16= 'categorias' otherlv_17= '{' ( (lv_categorias_18_0= ruleCategoria ) ) (otherlv_19= ',' ( (lv_categorias_20_0= ruleCategoria ) ) )* otherlv_21= '}' otherlv_22= '}' )
            {
            // InternalCuestionario.g:78:2: (otherlv_0= 'Cuestionario' otherlv_1= '{' otherlv_2= 'preguntaInicial' ( ( ruleEString ) ) otherlv_4= 'preguntasFinales' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'preguntas' otherlv_11= '{' ( (lv_preguntas_12_0= rulePregunta ) ) (otherlv_13= ',' ( (lv_preguntas_14_0= rulePregunta ) ) )* otherlv_15= '}' otherlv_16= 'categorias' otherlv_17= '{' ( (lv_categorias_18_0= ruleCategoria ) ) (otherlv_19= ',' ( (lv_categorias_20_0= ruleCategoria ) ) )* otherlv_21= '}' otherlv_22= '}' )
            // InternalCuestionario.g:79:3: otherlv_0= 'Cuestionario' otherlv_1= '{' otherlv_2= 'preguntaInicial' ( ( ruleEString ) ) otherlv_4= 'preguntasFinales' otherlv_5= '(' ( ( ruleEString ) ) (otherlv_7= ',' ( ( ruleEString ) ) )* otherlv_9= ')' otherlv_10= 'preguntas' otherlv_11= '{' ( (lv_preguntas_12_0= rulePregunta ) ) (otherlv_13= ',' ( (lv_preguntas_14_0= rulePregunta ) ) )* otherlv_15= '}' otherlv_16= 'categorias' otherlv_17= '{' ( (lv_categorias_18_0= ruleCategoria ) ) (otherlv_19= ',' ( (lv_categorias_20_0= ruleCategoria ) ) )* otherlv_21= '}' otherlv_22= '}'
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCuestionarioAccess().getCuestionarioKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCuestionarioAccess().getLeftCurlyBracketKeyword_1());
            		
            otherlv_2=(Token)match(input,13,FOLLOW_5); 

            			newLeafNode(otherlv_2, grammarAccess.getCuestionarioAccess().getPreguntaInicialKeyword_2());
            		
            // InternalCuestionario.g:91:3: ( ( ruleEString ) )
            // InternalCuestionario.g:92:4: ( ruleEString )
            {
            // InternalCuestionario.g:92:4: ( ruleEString )
            // InternalCuestionario.g:93:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCuestionarioRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCuestionarioAccess().getPreguntaInicialPreguntaCrossReference_3_0());
            				
            pushFollow(FOLLOW_6);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_4=(Token)match(input,14,FOLLOW_7); 

            			newLeafNode(otherlv_4, grammarAccess.getCuestionarioAccess().getPreguntasFinalesKeyword_4());
            		
            otherlv_5=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_5, grammarAccess.getCuestionarioAccess().getLeftParenthesisKeyword_5());
            		
            // InternalCuestionario.g:115:3: ( ( ruleEString ) )
            // InternalCuestionario.g:116:4: ( ruleEString )
            {
            // InternalCuestionario.g:116:4: ( ruleEString )
            // InternalCuestionario.g:117:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCuestionarioRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCuestionarioAccess().getPreguntasFinalesPreguntaCrossReference_6_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:131:3: (otherlv_7= ',' ( ( ruleEString ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==16) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCuestionario.g:132:4: otherlv_7= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_7=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_7, grammarAccess.getCuestionarioAccess().getCommaKeyword_7_0());
            	    			
            	    // InternalCuestionario.g:136:4: ( ( ruleEString ) )
            	    // InternalCuestionario.g:137:5: ( ruleEString )
            	    {
            	    // InternalCuestionario.g:137:5: ( ruleEString )
            	    // InternalCuestionario.g:138:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCuestionarioRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getCuestionarioAccess().getPreguntasFinalesPreguntaCrossReference_7_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_9=(Token)match(input,17,FOLLOW_9); 

            			newLeafNode(otherlv_9, grammarAccess.getCuestionarioAccess().getRightParenthesisKeyword_8());
            		
            otherlv_10=(Token)match(input,18,FOLLOW_3); 

            			newLeafNode(otherlv_10, grammarAccess.getCuestionarioAccess().getPreguntasKeyword_9());
            		
            otherlv_11=(Token)match(input,12,FOLLOW_10); 

            			newLeafNode(otherlv_11, grammarAccess.getCuestionarioAccess().getLeftCurlyBracketKeyword_10());
            		
            // InternalCuestionario.g:165:3: ( (lv_preguntas_12_0= rulePregunta ) )
            // InternalCuestionario.g:166:4: (lv_preguntas_12_0= rulePregunta )
            {
            // InternalCuestionario.g:166:4: (lv_preguntas_12_0= rulePregunta )
            // InternalCuestionario.g:167:5: lv_preguntas_12_0= rulePregunta
            {

            					newCompositeNode(grammarAccess.getCuestionarioAccess().getPreguntasPreguntaParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_11);
            lv_preguntas_12_0=rulePregunta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCuestionarioRule());
            					}
            					add(
            						current,
            						"preguntas",
            						lv_preguntas_12_0,
            						"cuestionario.Cuestionario.Pregunta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:184:3: (otherlv_13= ',' ( (lv_preguntas_14_0= rulePregunta ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==16) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCuestionario.g:185:4: otherlv_13= ',' ( (lv_preguntas_14_0= rulePregunta ) )
            	    {
            	    otherlv_13=(Token)match(input,16,FOLLOW_10); 

            	    				newLeafNode(otherlv_13, grammarAccess.getCuestionarioAccess().getCommaKeyword_12_0());
            	    			
            	    // InternalCuestionario.g:189:4: ( (lv_preguntas_14_0= rulePregunta ) )
            	    // InternalCuestionario.g:190:5: (lv_preguntas_14_0= rulePregunta )
            	    {
            	    // InternalCuestionario.g:190:5: (lv_preguntas_14_0= rulePregunta )
            	    // InternalCuestionario.g:191:6: lv_preguntas_14_0= rulePregunta
            	    {

            	    						newCompositeNode(grammarAccess.getCuestionarioAccess().getPreguntasPreguntaParserRuleCall_12_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_preguntas_14_0=rulePregunta();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCuestionarioRule());
            	    						}
            	    						add(
            	    							current,
            	    							"preguntas",
            	    							lv_preguntas_14_0,
            	    							"cuestionario.Cuestionario.Pregunta");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);

            otherlv_15=(Token)match(input,19,FOLLOW_12); 

            			newLeafNode(otherlv_15, grammarAccess.getCuestionarioAccess().getRightCurlyBracketKeyword_13());
            		
            otherlv_16=(Token)match(input,20,FOLLOW_3); 

            			newLeafNode(otherlv_16, grammarAccess.getCuestionarioAccess().getCategoriasKeyword_14());
            		
            otherlv_17=(Token)match(input,12,FOLLOW_13); 

            			newLeafNode(otherlv_17, grammarAccess.getCuestionarioAccess().getLeftCurlyBracketKeyword_15());
            		
            // InternalCuestionario.g:221:3: ( (lv_categorias_18_0= ruleCategoria ) )
            // InternalCuestionario.g:222:4: (lv_categorias_18_0= ruleCategoria )
            {
            // InternalCuestionario.g:222:4: (lv_categorias_18_0= ruleCategoria )
            // InternalCuestionario.g:223:5: lv_categorias_18_0= ruleCategoria
            {

            					newCompositeNode(grammarAccess.getCuestionarioAccess().getCategoriasCategoriaParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_11);
            lv_categorias_18_0=ruleCategoria();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCuestionarioRule());
            					}
            					add(
            						current,
            						"categorias",
            						lv_categorias_18_0,
            						"cuestionario.Cuestionario.Categoria");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:240:3: (otherlv_19= ',' ( (lv_categorias_20_0= ruleCategoria ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==16) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCuestionario.g:241:4: otherlv_19= ',' ( (lv_categorias_20_0= ruleCategoria ) )
            	    {
            	    otherlv_19=(Token)match(input,16,FOLLOW_13); 

            	    				newLeafNode(otherlv_19, grammarAccess.getCuestionarioAccess().getCommaKeyword_17_0());
            	    			
            	    // InternalCuestionario.g:245:4: ( (lv_categorias_20_0= ruleCategoria ) )
            	    // InternalCuestionario.g:246:5: (lv_categorias_20_0= ruleCategoria )
            	    {
            	    // InternalCuestionario.g:246:5: (lv_categorias_20_0= ruleCategoria )
            	    // InternalCuestionario.g:247:6: lv_categorias_20_0= ruleCategoria
            	    {

            	    						newCompositeNode(grammarAccess.getCuestionarioAccess().getCategoriasCategoriaParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_categorias_20_0=ruleCategoria();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCuestionarioRule());
            	    						}
            	    						add(
            	    							current,
            	    							"categorias",
            	    							lv_categorias_20_0,
            	    							"cuestionario.Cuestionario.Categoria");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            otherlv_21=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_21, grammarAccess.getCuestionarioAccess().getRightCurlyBracketKeyword_18());
            		
            otherlv_22=(Token)match(input,19,FOLLOW_2); 

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

            if ( (LA4_0==30) ) {
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
            otherlv_0=(Token)match(input,21,FOLLOW_5); 

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
                    			
                    otherlv_6=(Token)match(input,12,FOLLOW_13); 

                    				newLeafNode(otherlv_6, grammarAccess.getCategoriaAccess().getLeftCurlyBracketKeyword_5_1());
                    			
                    // InternalCuestionario.g:387:4: ( (lv_subcategorias_7_0= ruleCategoria ) )
                    // InternalCuestionario.g:388:5: (lv_subcategorias_7_0= ruleCategoria )
                    {
                    // InternalCuestionario.g:388:5: (lv_subcategorias_7_0= ruleCategoria )
                    // InternalCuestionario.g:389:6: lv_subcategorias_7_0= ruleCategoria
                    {

                    						newCompositeNode(grammarAccess.getCategoriaAccess().getSubcategoriasCategoriaParserRuleCall_5_2_0());
                    					
                    pushFollow(FOLLOW_11);
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

                        if ( (LA5_0==16) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCuestionario.g:407:5: otherlv_8= ',' ( (lv_subcategorias_9_0= ruleCategoria ) )
                    	    {
                    	    otherlv_8=(Token)match(input,16,FOLLOW_13); 

                    	    					newLeafNode(otherlv_8, grammarAccess.getCategoriaAccess().getCommaKeyword_5_3_0());
                    	    				
                    	    // InternalCuestionario.g:411:5: ( (lv_subcategorias_9_0= ruleCategoria ) )
                    	    // InternalCuestionario.g:412:6: (lv_subcategorias_9_0= ruleCategoria )
                    	    {
                    	    // InternalCuestionario.g:412:6: (lv_subcategorias_9_0= ruleCategoria )
                    	    // InternalCuestionario.g:413:7: lv_subcategorias_9_0= ruleCategoria
                    	    {

                    	    							newCompositeNode(grammarAccess.getCategoriaAccess().getSubcategoriasCategoriaParserRuleCall_5_3_1_0());
                    	    						
                    	    pushFollow(FOLLOW_11);
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

                    otherlv_10=(Token)match(input,19,FOLLOW_14); 

                    				newLeafNode(otherlv_10, grammarAccess.getCategoriaAccess().getRightCurlyBracketKeyword_5_4());
                    			

                    }
                    break;

            }

            otherlv_11=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRuleRespuesta"
    // InternalCuestionario.g:554:1: entryRuleRespuesta returns [EObject current=null] : iv_ruleRespuesta= ruleRespuesta EOF ;
    public final EObject entryRuleRespuesta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRespuesta = null;


        try {
            // InternalCuestionario.g:554:50: (iv_ruleRespuesta= ruleRespuesta EOF )
            // InternalCuestionario.g:555:2: iv_ruleRespuesta= ruleRespuesta EOF
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
    // InternalCuestionario.g:561:1: ruleRespuesta returns [EObject current=null] : (otherlv_0= 'Respuesta' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'opcion' ( (lv_opcion_4_0= ruleEString ) ) otherlv_5= '}' ) ;
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
            // InternalCuestionario.g:567:2: ( (otherlv_0= 'Respuesta' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'opcion' ( (lv_opcion_4_0= ruleEString ) ) otherlv_5= '}' ) )
            // InternalCuestionario.g:568:2: (otherlv_0= 'Respuesta' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'opcion' ( (lv_opcion_4_0= ruleEString ) ) otherlv_5= '}' )
            {
            // InternalCuestionario.g:568:2: (otherlv_0= 'Respuesta' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'opcion' ( (lv_opcion_4_0= ruleEString ) ) otherlv_5= '}' )
            // InternalCuestionario.g:569:3: otherlv_0= 'Respuesta' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'opcion' ( (lv_opcion_4_0= ruleEString ) ) otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,28,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getRespuestaAccess().getRespuestaKeyword_0());
            		
            // InternalCuestionario.g:573:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCuestionario.g:574:4: (lv_name_1_0= ruleEString )
            {
            // InternalCuestionario.g:574:4: (lv_name_1_0= ruleEString )
            // InternalCuestionario.g:575:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_23); 

            			newLeafNode(otherlv_2, grammarAccess.getRespuestaAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,29,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getRespuestaAccess().getOpcionKeyword_3());
            		
            // InternalCuestionario.g:600:3: ( (lv_opcion_4_0= ruleEString ) )
            // InternalCuestionario.g:601:4: (lv_opcion_4_0= ruleEString )
            {
            // InternalCuestionario.g:601:4: (lv_opcion_4_0= ruleEString )
            // InternalCuestionario.g:602:5: lv_opcion_4_0= ruleEString
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

            otherlv_5=(Token)match(input,19,FOLLOW_2); 

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


    // $ANTLR start "entryRulePreguntaUnica"
    // InternalCuestionario.g:627:1: entryRulePreguntaUnica returns [EObject current=null] : iv_rulePreguntaUnica= rulePreguntaUnica EOF ;
    public final EObject entryRulePreguntaUnica() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreguntaUnica = null;


        try {
            // InternalCuestionario.g:627:54: (iv_rulePreguntaUnica= rulePreguntaUnica EOF )
            // InternalCuestionario.g:628:2: iv_rulePreguntaUnica= rulePreguntaUnica EOF
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
    // InternalCuestionario.g:634:1: rulePreguntaUnica returns [EObject current=null] : (otherlv_0= 'PreguntaUnica' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) (otherlv_11= 'siguientePregunta' ( ( ruleEString ) ) )? otherlv_13= 'correcta' ( ( ruleEString ) ) otherlv_15= 'respuestas' otherlv_16= '{' ( (lv_respuestas_17_0= ruleRespuesta ) ) (otherlv_18= ',' ( (lv_respuestas_19_0= ruleRespuesta ) ) )* otherlv_20= '}' otherlv_21= '}' ) ;
    public final EObject rulePreguntaUnica() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_enunciado_4_0 = null;

        AntlrDatatypeRuleToken lv_puntuacion_6_0 = null;

        AntlrDatatypeRuleToken lv_penalizacion_8_0 = null;

        EObject lv_respuestas_17_0 = null;

        EObject lv_respuestas_19_0 = null;



        	enterRule();

        try {
            // InternalCuestionario.g:640:2: ( (otherlv_0= 'PreguntaUnica' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) (otherlv_11= 'siguientePregunta' ( ( ruleEString ) ) )? otherlv_13= 'correcta' ( ( ruleEString ) ) otherlv_15= 'respuestas' otherlv_16= '{' ( (lv_respuestas_17_0= ruleRespuesta ) ) (otherlv_18= ',' ( (lv_respuestas_19_0= ruleRespuesta ) ) )* otherlv_20= '}' otherlv_21= '}' ) )
            // InternalCuestionario.g:641:2: (otherlv_0= 'PreguntaUnica' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) (otherlv_11= 'siguientePregunta' ( ( ruleEString ) ) )? otherlv_13= 'correcta' ( ( ruleEString ) ) otherlv_15= 'respuestas' otherlv_16= '{' ( (lv_respuestas_17_0= ruleRespuesta ) ) (otherlv_18= ',' ( (lv_respuestas_19_0= ruleRespuesta ) ) )* otherlv_20= '}' otherlv_21= '}' )
            {
            // InternalCuestionario.g:641:2: (otherlv_0= 'PreguntaUnica' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) (otherlv_11= 'siguientePregunta' ( ( ruleEString ) ) )? otherlv_13= 'correcta' ( ( ruleEString ) ) otherlv_15= 'respuestas' otherlv_16= '{' ( (lv_respuestas_17_0= ruleRespuesta ) ) (otherlv_18= ',' ( (lv_respuestas_19_0= ruleRespuesta ) ) )* otherlv_20= '}' otherlv_21= '}' )
            // InternalCuestionario.g:642:3: otherlv_0= 'PreguntaUnica' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) (otherlv_11= 'siguientePregunta' ( ( ruleEString ) ) )? otherlv_13= 'correcta' ( ( ruleEString ) ) otherlv_15= 'respuestas' otherlv_16= '{' ( (lv_respuestas_17_0= ruleRespuesta ) ) (otherlv_18= ',' ( (lv_respuestas_19_0= ruleRespuesta ) ) )* otherlv_20= '}' otherlv_21= '}'
            {
            otherlv_0=(Token)match(input,30,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPreguntaUnicaAccess().getPreguntaUnicaKeyword_0());
            		
            // InternalCuestionario.g:646:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCuestionario.g:647:4: (lv_name_1_0= ruleEString )
            {
            // InternalCuestionario.g:647:4: (lv_name_1_0= ruleEString )
            // InternalCuestionario.g:648:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getPreguntaUnicaAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPreguntaUnicaAccess().getEnunciadoKeyword_3());
            		
            // InternalCuestionario.g:673:3: ( (lv_enunciado_4_0= ruleEString ) )
            // InternalCuestionario.g:674:4: (lv_enunciado_4_0= ruleEString )
            {
            // InternalCuestionario.g:674:4: (lv_enunciado_4_0= ruleEString )
            // InternalCuestionario.g:675:5: lv_enunciado_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getEnunciadoEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_5=(Token)match(input,32,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getPreguntaUnicaAccess().getPuntuacionKeyword_5());
            		
            // InternalCuestionario.g:696:3: ( (lv_puntuacion_6_0= ruleEDouble ) )
            // InternalCuestionario.g:697:4: (lv_puntuacion_6_0= ruleEDouble )
            {
            // InternalCuestionario.g:697:4: (lv_puntuacion_6_0= ruleEDouble )
            // InternalCuestionario.g:698:5: lv_puntuacion_6_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getPuntuacionEDoubleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_7=(Token)match(input,33,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getPreguntaUnicaAccess().getPenalizacionKeyword_7());
            		
            // InternalCuestionario.g:719:3: ( (lv_penalizacion_8_0= ruleEDouble ) )
            // InternalCuestionario.g:720:4: (lv_penalizacion_8_0= ruleEDouble )
            {
            // InternalCuestionario.g:720:4: (lv_penalizacion_8_0= ruleEDouble )
            // InternalCuestionario.g:721:5: lv_penalizacion_8_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getPenalizacionEDoubleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_9=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getPreguntaUnicaAccess().getCategoriaKeyword_9());
            		
            // InternalCuestionario.g:742:3: ( ( ruleEString ) )
            // InternalCuestionario.g:743:4: ( ruleEString )
            {
            // InternalCuestionario.g:743:4: ( ruleEString )
            // InternalCuestionario.g:744:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreguntaUnicaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getCategoriaCategoriaCrossReference_10_0());
            				
            pushFollow(FOLLOW_28);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:758:3: (otherlv_11= 'siguientePregunta' ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==35) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCuestionario.g:759:4: otherlv_11= 'siguientePregunta' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getPreguntaUnicaAccess().getSiguientePreguntaKeyword_11_0());
                    			
                    // InternalCuestionario.g:763:4: ( ( ruleEString ) )
                    // InternalCuestionario.g:764:5: ( ruleEString )
                    {
                    // InternalCuestionario.g:764:5: ( ruleEString )
                    // InternalCuestionario.g:765:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPreguntaUnicaRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getSiguientePreguntaPreguntaCrossReference_11_1_0());
                    					
                    pushFollow(FOLLOW_29);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,36,FOLLOW_5); 

            			newLeafNode(otherlv_13, grammarAccess.getPreguntaUnicaAccess().getCorrectaKeyword_12());
            		
            // InternalCuestionario.g:784:3: ( ( ruleEString ) )
            // InternalCuestionario.g:785:4: ( ruleEString )
            {
            // InternalCuestionario.g:785:4: ( ruleEString )
            // InternalCuestionario.g:786:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreguntaUnicaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getCorrectaRespuestaCrossReference_13_0());
            				
            pushFollow(FOLLOW_30);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_15, grammarAccess.getPreguntaUnicaAccess().getRespuestasKeyword_14());
            		
            otherlv_16=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_16, grammarAccess.getPreguntaUnicaAccess().getLeftCurlyBracketKeyword_15());
            		
            // InternalCuestionario.g:808:3: ( (lv_respuestas_17_0= ruleRespuesta ) )
            // InternalCuestionario.g:809:4: (lv_respuestas_17_0= ruleRespuesta )
            {
            // InternalCuestionario.g:809:4: (lv_respuestas_17_0= ruleRespuesta )
            // InternalCuestionario.g:810:5: lv_respuestas_17_0= ruleRespuesta
            {

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getRespuestasRespuestaParserRuleCall_16_0());
            				
            pushFollow(FOLLOW_11);
            lv_respuestas_17_0=ruleRespuesta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreguntaUnicaRule());
            					}
            					add(
            						current,
            						"respuestas",
            						lv_respuestas_17_0,
            						"cuestionario.Cuestionario.Respuesta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:827:3: (otherlv_18= ',' ( (lv_respuestas_19_0= ruleRespuesta ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==16) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCuestionario.g:828:4: otherlv_18= ',' ( (lv_respuestas_19_0= ruleRespuesta ) )
            	    {
            	    otherlv_18=(Token)match(input,16,FOLLOW_31); 

            	    				newLeafNode(otherlv_18, grammarAccess.getPreguntaUnicaAccess().getCommaKeyword_17_0());
            	    			
            	    // InternalCuestionario.g:832:4: ( (lv_respuestas_19_0= ruleRespuesta ) )
            	    // InternalCuestionario.g:833:5: (lv_respuestas_19_0= ruleRespuesta )
            	    {
            	    // InternalCuestionario.g:833:5: (lv_respuestas_19_0= ruleRespuesta )
            	    // InternalCuestionario.g:834:6: lv_respuestas_19_0= ruleRespuesta
            	    {

            	    						newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getRespuestasRespuestaParserRuleCall_17_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
            	    lv_respuestas_19_0=ruleRespuesta();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPreguntaUnicaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"respuestas",
            	    							lv_respuestas_19_0,
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

            otherlv_20=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_20, grammarAccess.getPreguntaUnicaAccess().getRightCurlyBracketKeyword_18());
            		
            otherlv_21=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_21, grammarAccess.getPreguntaUnicaAccess().getRightCurlyBracketKeyword_19());
            		

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
    // InternalCuestionario.g:864:1: entryRulePreguntaMultiple returns [EObject current=null] : iv_rulePreguntaMultiple= rulePreguntaMultiple EOF ;
    public final EObject entryRulePreguntaMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreguntaMultiple = null;


        try {
            // InternalCuestionario.g:864:57: (iv_rulePreguntaMultiple= rulePreguntaMultiple EOF )
            // InternalCuestionario.g:865:2: iv_rulePreguntaMultiple= rulePreguntaMultiple EOF
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
    // InternalCuestionario.g:871:1: rulePreguntaMultiple returns [EObject current=null] : (otherlv_0= 'PreguntaMultiple' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) (otherlv_11= 'siguientePregunta' ( ( ruleEString ) ) )? otherlv_13= 'correctas' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' otherlv_19= 'respuestas' otherlv_20= '{' ( (lv_respuestas_21_0= ruleRespuesta ) ) (otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) ) )* otherlv_24= '}' otherlv_25= '}' ) ;
    public final EObject rulePreguntaMultiple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_16=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_enunciado_4_0 = null;

        AntlrDatatypeRuleToken lv_puntuacion_6_0 = null;

        AntlrDatatypeRuleToken lv_penalizacion_8_0 = null;

        EObject lv_respuestas_21_0 = null;

        EObject lv_respuestas_23_0 = null;



        	enterRule();

        try {
            // InternalCuestionario.g:877:2: ( (otherlv_0= 'PreguntaMultiple' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) (otherlv_11= 'siguientePregunta' ( ( ruleEString ) ) )? otherlv_13= 'correctas' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' otherlv_19= 'respuestas' otherlv_20= '{' ( (lv_respuestas_21_0= ruleRespuesta ) ) (otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) ) )* otherlv_24= '}' otherlv_25= '}' ) )
            // InternalCuestionario.g:878:2: (otherlv_0= 'PreguntaMultiple' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) (otherlv_11= 'siguientePregunta' ( ( ruleEString ) ) )? otherlv_13= 'correctas' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' otherlv_19= 'respuestas' otherlv_20= '{' ( (lv_respuestas_21_0= ruleRespuesta ) ) (otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) ) )* otherlv_24= '}' otherlv_25= '}' )
            {
            // InternalCuestionario.g:878:2: (otherlv_0= 'PreguntaMultiple' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) (otherlv_11= 'siguientePregunta' ( ( ruleEString ) ) )? otherlv_13= 'correctas' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' otherlv_19= 'respuestas' otherlv_20= '{' ( (lv_respuestas_21_0= ruleRespuesta ) ) (otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) ) )* otherlv_24= '}' otherlv_25= '}' )
            // InternalCuestionario.g:879:3: otherlv_0= 'PreguntaMultiple' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'enunciado' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'puntuacion' ( (lv_puntuacion_6_0= ruleEDouble ) ) otherlv_7= 'penalizacion' ( (lv_penalizacion_8_0= ruleEDouble ) ) otherlv_9= 'categoria' ( ( ruleEString ) ) (otherlv_11= 'siguientePregunta' ( ( ruleEString ) ) )? otherlv_13= 'correctas' otherlv_14= '(' ( ( ruleEString ) ) (otherlv_16= ',' ( ( ruleEString ) ) )* otherlv_18= ')' otherlv_19= 'respuestas' otherlv_20= '{' ( (lv_respuestas_21_0= ruleRespuesta ) ) (otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) ) )* otherlv_24= '}' otherlv_25= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_5); 

            			newLeafNode(otherlv_0, grammarAccess.getPreguntaMultipleAccess().getPreguntaMultipleKeyword_0());
            		
            // InternalCuestionario.g:883:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCuestionario.g:884:4: (lv_name_1_0= ruleEString )
            {
            // InternalCuestionario.g:884:4: (lv_name_1_0= ruleEString )
            // InternalCuestionario.g:885:5: lv_name_1_0= ruleEString
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

            otherlv_2=(Token)match(input,12,FOLLOW_24); 

            			newLeafNode(otherlv_2, grammarAccess.getPreguntaMultipleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,31,FOLLOW_5); 

            			newLeafNode(otherlv_3, grammarAccess.getPreguntaMultipleAccess().getEnunciadoKeyword_3());
            		
            // InternalCuestionario.g:910:3: ( (lv_enunciado_4_0= ruleEString ) )
            // InternalCuestionario.g:911:4: (lv_enunciado_4_0= ruleEString )
            {
            // InternalCuestionario.g:911:4: (lv_enunciado_4_0= ruleEString )
            // InternalCuestionario.g:912:5: lv_enunciado_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getEnunciadoEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_25);
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

            otherlv_5=(Token)match(input,32,FOLLOW_16); 

            			newLeafNode(otherlv_5, grammarAccess.getPreguntaMultipleAccess().getPuntuacionKeyword_5());
            		
            // InternalCuestionario.g:933:3: ( (lv_puntuacion_6_0= ruleEDouble ) )
            // InternalCuestionario.g:934:4: (lv_puntuacion_6_0= ruleEDouble )
            {
            // InternalCuestionario.g:934:4: (lv_puntuacion_6_0= ruleEDouble )
            // InternalCuestionario.g:935:5: lv_puntuacion_6_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getPuntuacionEDoubleParserRuleCall_6_0());
            				
            pushFollow(FOLLOW_26);
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

            otherlv_7=(Token)match(input,33,FOLLOW_16); 

            			newLeafNode(otherlv_7, grammarAccess.getPreguntaMultipleAccess().getPenalizacionKeyword_7());
            		
            // InternalCuestionario.g:956:3: ( (lv_penalizacion_8_0= ruleEDouble ) )
            // InternalCuestionario.g:957:4: (lv_penalizacion_8_0= ruleEDouble )
            {
            // InternalCuestionario.g:957:4: (lv_penalizacion_8_0= ruleEDouble )
            // InternalCuestionario.g:958:5: lv_penalizacion_8_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getPenalizacionEDoubleParserRuleCall_8_0());
            				
            pushFollow(FOLLOW_27);
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

            otherlv_9=(Token)match(input,34,FOLLOW_5); 

            			newLeafNode(otherlv_9, grammarAccess.getPreguntaMultipleAccess().getCategoriaKeyword_9());
            		
            // InternalCuestionario.g:979:3: ( ( ruleEString ) )
            // InternalCuestionario.g:980:4: ( ruleEString )
            {
            // InternalCuestionario.g:980:4: ( ruleEString )
            // InternalCuestionario.g:981:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreguntaMultipleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getCategoriaCategoriaCrossReference_10_0());
            				
            pushFollow(FOLLOW_32);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:995:3: (otherlv_11= 'siguientePregunta' ( ( ruleEString ) ) )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==35) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCuestionario.g:996:4: otherlv_11= 'siguientePregunta' ( ( ruleEString ) )
                    {
                    otherlv_11=(Token)match(input,35,FOLLOW_5); 

                    				newLeafNode(otherlv_11, grammarAccess.getPreguntaMultipleAccess().getSiguientePreguntaKeyword_11_0());
                    			
                    // InternalCuestionario.g:1000:4: ( ( ruleEString ) )
                    // InternalCuestionario.g:1001:5: ( ruleEString )
                    {
                    // InternalCuestionario.g:1001:5: ( ruleEString )
                    // InternalCuestionario.g:1002:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPreguntaMultipleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getSiguientePreguntaPreguntaCrossReference_11_1_0());
                    					
                    pushFollow(FOLLOW_33);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }


                    }
                    break;

            }

            otherlv_13=(Token)match(input,39,FOLLOW_7); 

            			newLeafNode(otherlv_13, grammarAccess.getPreguntaMultipleAccess().getCorrectasKeyword_12());
            		
            otherlv_14=(Token)match(input,15,FOLLOW_5); 

            			newLeafNode(otherlv_14, grammarAccess.getPreguntaMultipleAccess().getLeftParenthesisKeyword_13());
            		
            // InternalCuestionario.g:1025:3: ( ( ruleEString ) )
            // InternalCuestionario.g:1026:4: ( ruleEString )
            {
            // InternalCuestionario.g:1026:4: ( ruleEString )
            // InternalCuestionario.g:1027:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreguntaMultipleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getCorrectasRespuestaCrossReference_14_0());
            				
            pushFollow(FOLLOW_8);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:1041:3: (otherlv_16= ',' ( ( ruleEString ) ) )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==16) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCuestionario.g:1042:4: otherlv_16= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_16=(Token)match(input,16,FOLLOW_5); 

            	    				newLeafNode(otherlv_16, grammarAccess.getPreguntaMultipleAccess().getCommaKeyword_15_0());
            	    			
            	    // InternalCuestionario.g:1046:4: ( ( ruleEString ) )
            	    // InternalCuestionario.g:1047:5: ( ruleEString )
            	    {
            	    // InternalCuestionario.g:1047:5: ( ruleEString )
            	    // InternalCuestionario.g:1048:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getPreguntaMultipleRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getCorrectasRespuestaCrossReference_15_1_0());
            	    					
            	    pushFollow(FOLLOW_8);
            	    ruleEString();

            	    state._fsp--;


            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

            otherlv_18=(Token)match(input,17,FOLLOW_30); 

            			newLeafNode(otherlv_18, grammarAccess.getPreguntaMultipleAccess().getRightParenthesisKeyword_16());
            		
            otherlv_19=(Token)match(input,37,FOLLOW_3); 

            			newLeafNode(otherlv_19, grammarAccess.getPreguntaMultipleAccess().getRespuestasKeyword_17());
            		
            otherlv_20=(Token)match(input,12,FOLLOW_31); 

            			newLeafNode(otherlv_20, grammarAccess.getPreguntaMultipleAccess().getLeftCurlyBracketKeyword_18());
            		
            // InternalCuestionario.g:1075:3: ( (lv_respuestas_21_0= ruleRespuesta ) )
            // InternalCuestionario.g:1076:4: (lv_respuestas_21_0= ruleRespuesta )
            {
            // InternalCuestionario.g:1076:4: (lv_respuestas_21_0= ruleRespuesta )
            // InternalCuestionario.g:1077:5: lv_respuestas_21_0= ruleRespuesta
            {

            					newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getRespuestasRespuestaParserRuleCall_19_0());
            				
            pushFollow(FOLLOW_11);
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

            // InternalCuestionario.g:1094:3: (otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) ) )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==16) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCuestionario.g:1095:4: otherlv_22= ',' ( (lv_respuestas_23_0= ruleRespuesta ) )
            	    {
            	    otherlv_22=(Token)match(input,16,FOLLOW_31); 

            	    				newLeafNode(otherlv_22, grammarAccess.getPreguntaMultipleAccess().getCommaKeyword_20_0());
            	    			
            	    // InternalCuestionario.g:1099:4: ( (lv_respuestas_23_0= ruleRespuesta ) )
            	    // InternalCuestionario.g:1100:5: (lv_respuestas_23_0= ruleRespuesta )
            	    {
            	    // InternalCuestionario.g:1100:5: (lv_respuestas_23_0= ruleRespuesta )
            	    // InternalCuestionario.g:1101:6: lv_respuestas_23_0= ruleRespuesta
            	    {

            	    						newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getRespuestasRespuestaParserRuleCall_20_1_0());
            	    					
            	    pushFollow(FOLLOW_11);
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
            	    break loop17;
                }
            } while (true);

            otherlv_24=(Token)match(input,19,FOLLOW_14); 

            			newLeafNode(otherlv_24, grammarAccess.getPreguntaMultipleAccess().getRightCurlyBracketKeyword_21());
            		
            otherlv_25=(Token)match(input,19,FOLLOW_2); 

            			newLeafNode(otherlv_25, grammarAccess.getPreguntaMultipleAccess().getRightCurlyBracketKeyword_22());
            		

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

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000030000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000090000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000003000040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000880000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x000000000C000002L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000001000040L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001800000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000008800000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000008000000000L});

}