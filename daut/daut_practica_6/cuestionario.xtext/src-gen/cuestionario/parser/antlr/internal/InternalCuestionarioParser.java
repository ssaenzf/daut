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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'Cuestionario'", "'Preguntas:'", "','", "'Categorias:'", "'Inicial:'", "'Finales:'", "'categoria'", "'{'", "'dificultad'", "'SubCategorias:'", "'}'", "'-'", "'.'", "'E'", "'e'", "'pregUnica'", "'Enunciado:'", "'Respuestas'", "'Puntuacion:'", "'Penalizacion:'", "'Categoria:'", "'Correcta:'", "'isInicial'", "'('", "'siguientePreguntaAcierto:'", "'siguientePreguntaError:'", "')'", "'pregMultiple'", "'Correctas:'", "':'"
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
    // InternalCuestionario.g:71:1: ruleCuestionario returns [EObject current=null] : (otherlv_0= 'Cuestionario' otherlv_1= 'Preguntas:' ( (lv_preguntas_2_0= rulePregunta ) ) (otherlv_3= ',' ( (lv_preguntas_4_0= rulePregunta ) ) )* otherlv_5= 'Categorias:' ( (lv_categorias_6_0= ruleCategoria ) ) (otherlv_7= ',' ( (lv_categorias_8_0= ruleCategoria ) ) )* otherlv_9= 'Inicial:' ( ( ruleEString ) ) otherlv_11= 'Finales:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* ) ;
    public final EObject ruleCuestionario() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        EObject lv_preguntas_2_0 = null;

        EObject lv_preguntas_4_0 = null;

        EObject lv_categorias_6_0 = null;

        EObject lv_categorias_8_0 = null;



        	enterRule();

        try {
            // InternalCuestionario.g:77:2: ( (otherlv_0= 'Cuestionario' otherlv_1= 'Preguntas:' ( (lv_preguntas_2_0= rulePregunta ) ) (otherlv_3= ',' ( (lv_preguntas_4_0= rulePregunta ) ) )* otherlv_5= 'Categorias:' ( (lv_categorias_6_0= ruleCategoria ) ) (otherlv_7= ',' ( (lv_categorias_8_0= ruleCategoria ) ) )* otherlv_9= 'Inicial:' ( ( ruleEString ) ) otherlv_11= 'Finales:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* ) )
            // InternalCuestionario.g:78:2: (otherlv_0= 'Cuestionario' otherlv_1= 'Preguntas:' ( (lv_preguntas_2_0= rulePregunta ) ) (otherlv_3= ',' ( (lv_preguntas_4_0= rulePregunta ) ) )* otherlv_5= 'Categorias:' ( (lv_categorias_6_0= ruleCategoria ) ) (otherlv_7= ',' ( (lv_categorias_8_0= ruleCategoria ) ) )* otherlv_9= 'Inicial:' ( ( ruleEString ) ) otherlv_11= 'Finales:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )
            {
            // InternalCuestionario.g:78:2: (otherlv_0= 'Cuestionario' otherlv_1= 'Preguntas:' ( (lv_preguntas_2_0= rulePregunta ) ) (otherlv_3= ',' ( (lv_preguntas_4_0= rulePregunta ) ) )* otherlv_5= 'Categorias:' ( (lv_categorias_6_0= ruleCategoria ) ) (otherlv_7= ',' ( (lv_categorias_8_0= ruleCategoria ) ) )* otherlv_9= 'Inicial:' ( ( ruleEString ) ) otherlv_11= 'Finales:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )* )
            // InternalCuestionario.g:79:3: otherlv_0= 'Cuestionario' otherlv_1= 'Preguntas:' ( (lv_preguntas_2_0= rulePregunta ) ) (otherlv_3= ',' ( (lv_preguntas_4_0= rulePregunta ) ) )* otherlv_5= 'Categorias:' ( (lv_categorias_6_0= ruleCategoria ) ) (otherlv_7= ',' ( (lv_categorias_8_0= ruleCategoria ) ) )* otherlv_9= 'Inicial:' ( ( ruleEString ) ) otherlv_11= 'Finales:' ( ( ruleEString ) ) (otherlv_13= ',' ( ( ruleEString ) ) )*
            {
            otherlv_0=(Token)match(input,11,FOLLOW_3); 

            			newLeafNode(otherlv_0, grammarAccess.getCuestionarioAccess().getCuestionarioKeyword_0());
            		
            otherlv_1=(Token)match(input,12,FOLLOW_4); 

            			newLeafNode(otherlv_1, grammarAccess.getCuestionarioAccess().getPreguntasKeyword_1());
            		
            // InternalCuestionario.g:87:3: ( (lv_preguntas_2_0= rulePregunta ) )
            // InternalCuestionario.g:88:4: (lv_preguntas_2_0= rulePregunta )
            {
            // InternalCuestionario.g:88:4: (lv_preguntas_2_0= rulePregunta )
            // InternalCuestionario.g:89:5: lv_preguntas_2_0= rulePregunta
            {

            					newCompositeNode(grammarAccess.getCuestionarioAccess().getPreguntasPreguntaParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_5);
            lv_preguntas_2_0=rulePregunta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCuestionarioRule());
            					}
            					add(
            						current,
            						"preguntas",
            						lv_preguntas_2_0,
            						"cuestionario.Cuestionario.Pregunta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:106:3: (otherlv_3= ',' ( (lv_preguntas_4_0= rulePregunta ) ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalCuestionario.g:107:4: otherlv_3= ',' ( (lv_preguntas_4_0= rulePregunta ) )
            	    {
            	    otherlv_3=(Token)match(input,13,FOLLOW_4); 

            	    				newLeafNode(otherlv_3, grammarAccess.getCuestionarioAccess().getCommaKeyword_3_0());
            	    			
            	    // InternalCuestionario.g:111:4: ( (lv_preguntas_4_0= rulePregunta ) )
            	    // InternalCuestionario.g:112:5: (lv_preguntas_4_0= rulePregunta )
            	    {
            	    // InternalCuestionario.g:112:5: (lv_preguntas_4_0= rulePregunta )
            	    // InternalCuestionario.g:113:6: lv_preguntas_4_0= rulePregunta
            	    {

            	    						newCompositeNode(grammarAccess.getCuestionarioAccess().getPreguntasPreguntaParserRuleCall_3_1_0());
            	    					
            	    pushFollow(FOLLOW_5);
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


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            otherlv_5=(Token)match(input,14,FOLLOW_6); 

            			newLeafNode(otherlv_5, grammarAccess.getCuestionarioAccess().getCategoriasKeyword_4());
            		
            // InternalCuestionario.g:135:3: ( (lv_categorias_6_0= ruleCategoria ) )
            // InternalCuestionario.g:136:4: (lv_categorias_6_0= ruleCategoria )
            {
            // InternalCuestionario.g:136:4: (lv_categorias_6_0= ruleCategoria )
            // InternalCuestionario.g:137:5: lv_categorias_6_0= ruleCategoria
            {

            					newCompositeNode(grammarAccess.getCuestionarioAccess().getCategoriasCategoriaParserRuleCall_5_0());
            				
            pushFollow(FOLLOW_7);
            lv_categorias_6_0=ruleCategoria();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getCuestionarioRule());
            					}
            					add(
            						current,
            						"categorias",
            						lv_categorias_6_0,
            						"cuestionario.Cuestionario.Categoria");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:154:3: (otherlv_7= ',' ( (lv_categorias_8_0= ruleCategoria ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( (LA2_0==13) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCuestionario.g:155:4: otherlv_7= ',' ( (lv_categorias_8_0= ruleCategoria ) )
            	    {
            	    otherlv_7=(Token)match(input,13,FOLLOW_6); 

            	    				newLeafNode(otherlv_7, grammarAccess.getCuestionarioAccess().getCommaKeyword_6_0());
            	    			
            	    // InternalCuestionario.g:159:4: ( (lv_categorias_8_0= ruleCategoria ) )
            	    // InternalCuestionario.g:160:5: (lv_categorias_8_0= ruleCategoria )
            	    {
            	    // InternalCuestionario.g:160:5: (lv_categorias_8_0= ruleCategoria )
            	    // InternalCuestionario.g:161:6: lv_categorias_8_0= ruleCategoria
            	    {

            	    						newCompositeNode(grammarAccess.getCuestionarioAccess().getCategoriasCategoriaParserRuleCall_6_1_0());
            	    					
            	    pushFollow(FOLLOW_7);
            	    lv_categorias_8_0=ruleCategoria();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getCuestionarioRule());
            	    						}
            	    						add(
            	    							current,
            	    							"categorias",
            	    							lv_categorias_8_0,
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

            otherlv_9=(Token)match(input,15,FOLLOW_8); 

            			newLeafNode(otherlv_9, grammarAccess.getCuestionarioAccess().getInicialKeyword_7());
            		
            // InternalCuestionario.g:183:3: ( ( ruleEString ) )
            // InternalCuestionario.g:184:4: ( ruleEString )
            {
            // InternalCuestionario.g:184:4: ( ruleEString )
            // InternalCuestionario.g:185:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCuestionarioRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCuestionarioAccess().getPreguntaInicialPreguntaCrossReference_8_0());
            				
            pushFollow(FOLLOW_9);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_11=(Token)match(input,16,FOLLOW_8); 

            			newLeafNode(otherlv_11, grammarAccess.getCuestionarioAccess().getFinalesKeyword_9());
            		
            // InternalCuestionario.g:203:3: ( ( ruleEString ) )
            // InternalCuestionario.g:204:4: ( ruleEString )
            {
            // InternalCuestionario.g:204:4: ( ruleEString )
            // InternalCuestionario.g:205:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getCuestionarioRule());
            					}
            				

            					newCompositeNode(grammarAccess.getCuestionarioAccess().getPreguntasFinalesPreguntaCrossReference_10_0());
            				
            pushFollow(FOLLOW_10);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:219:3: (otherlv_13= ',' ( ( ruleEString ) ) )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==13) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCuestionario.g:220:4: otherlv_13= ',' ( ( ruleEString ) )
            	    {
            	    otherlv_13=(Token)match(input,13,FOLLOW_8); 

            	    				newLeafNode(otherlv_13, grammarAccess.getCuestionarioAccess().getCommaKeyword_11_0());
            	    			
            	    // InternalCuestionario.g:224:4: ( ( ruleEString ) )
            	    // InternalCuestionario.g:225:5: ( ruleEString )
            	    {
            	    // InternalCuestionario.g:225:5: ( ruleEString )
            	    // InternalCuestionario.g:226:6: ruleEString
            	    {

            	    						if (current==null) {
            	    							current = createModelElement(grammarAccess.getCuestionarioRule());
            	    						}
            	    					

            	    						newCompositeNode(grammarAccess.getCuestionarioAccess().getPreguntasFinalesPreguntaCrossReference_11_1_0());
            	    					
            	    pushFollow(FOLLOW_10);
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
    // InternalCuestionario.g:245:1: entryRulePregunta returns [EObject current=null] : iv_rulePregunta= rulePregunta EOF ;
    public final EObject entryRulePregunta() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePregunta = null;


        try {
            // InternalCuestionario.g:245:49: (iv_rulePregunta= rulePregunta EOF )
            // InternalCuestionario.g:246:2: iv_rulePregunta= rulePregunta EOF
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
    // InternalCuestionario.g:252:1: rulePregunta returns [EObject current=null] : (this_PreguntaUnica_0= rulePreguntaUnica | this_PreguntaMultiple_1= rulePreguntaMultiple ) ;
    public final EObject rulePregunta() throws RecognitionException {
        EObject current = null;

        EObject this_PreguntaUnica_0 = null;

        EObject this_PreguntaMultiple_1 = null;



        	enterRule();

        try {
            // InternalCuestionario.g:258:2: ( (this_PreguntaUnica_0= rulePreguntaUnica | this_PreguntaMultiple_1= rulePreguntaMultiple ) )
            // InternalCuestionario.g:259:2: (this_PreguntaUnica_0= rulePreguntaUnica | this_PreguntaMultiple_1= rulePreguntaMultiple )
            {
            // InternalCuestionario.g:259:2: (this_PreguntaUnica_0= rulePreguntaUnica | this_PreguntaMultiple_1= rulePreguntaMultiple )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
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
                    // InternalCuestionario.g:260:3: this_PreguntaUnica_0= rulePreguntaUnica
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
                    // InternalCuestionario.g:269:3: this_PreguntaMultiple_1= rulePreguntaMultiple
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
    // InternalCuestionario.g:281:1: entryRuleCategoria returns [EObject current=null] : iv_ruleCategoria= ruleCategoria EOF ;
    public final EObject entryRuleCategoria() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCategoria = null;


        try {
            // InternalCuestionario.g:281:50: (iv_ruleCategoria= ruleCategoria EOF )
            // InternalCuestionario.g:282:2: iv_ruleCategoria= ruleCategoria EOF
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
    // InternalCuestionario.g:288:1: ruleCategoria returns [EObject current=null] : (otherlv_0= 'categoria' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dificultad' ( (lv_dificultad_4_0= ruleEDouble ) ) (otherlv_5= 'SubCategorias:' ( (lv_subcategorias_6_0= ruleCategoria ) ) (otherlv_7= ',' ( (lv_subcategorias_8_0= ruleCategoria ) ) )* )? otherlv_9= '}' ) ;
    public final EObject ruleCategoria() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_dificultad_4_0 = null;

        EObject lv_subcategorias_6_0 = null;

        EObject lv_subcategorias_8_0 = null;



        	enterRule();

        try {
            // InternalCuestionario.g:294:2: ( (otherlv_0= 'categoria' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dificultad' ( (lv_dificultad_4_0= ruleEDouble ) ) (otherlv_5= 'SubCategorias:' ( (lv_subcategorias_6_0= ruleCategoria ) ) (otherlv_7= ',' ( (lv_subcategorias_8_0= ruleCategoria ) ) )* )? otherlv_9= '}' ) )
            // InternalCuestionario.g:295:2: (otherlv_0= 'categoria' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dificultad' ( (lv_dificultad_4_0= ruleEDouble ) ) (otherlv_5= 'SubCategorias:' ( (lv_subcategorias_6_0= ruleCategoria ) ) (otherlv_7= ',' ( (lv_subcategorias_8_0= ruleCategoria ) ) )* )? otherlv_9= '}' )
            {
            // InternalCuestionario.g:295:2: (otherlv_0= 'categoria' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dificultad' ( (lv_dificultad_4_0= ruleEDouble ) ) (otherlv_5= 'SubCategorias:' ( (lv_subcategorias_6_0= ruleCategoria ) ) (otherlv_7= ',' ( (lv_subcategorias_8_0= ruleCategoria ) ) )* )? otherlv_9= '}' )
            // InternalCuestionario.g:296:3: otherlv_0= 'categoria' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'dificultad' ( (lv_dificultad_4_0= ruleEDouble ) ) (otherlv_5= 'SubCategorias:' ( (lv_subcategorias_6_0= ruleCategoria ) ) (otherlv_7= ',' ( (lv_subcategorias_8_0= ruleCategoria ) ) )* )? otherlv_9= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getCategoriaAccess().getCategoriaKeyword_0());
            		
            // InternalCuestionario.g:300:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCuestionario.g:301:4: (lv_name_1_0= ruleEString )
            {
            // InternalCuestionario.g:301:4: (lv_name_1_0= ruleEString )
            // InternalCuestionario.g:302:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getCategoriaAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_2=(Token)match(input,18,FOLLOW_12); 

            			newLeafNode(otherlv_2, grammarAccess.getCategoriaAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,19,FOLLOW_13); 

            			newLeafNode(otherlv_3, grammarAccess.getCategoriaAccess().getDificultadKeyword_3());
            		
            // InternalCuestionario.g:327:3: ( (lv_dificultad_4_0= ruleEDouble ) )
            // InternalCuestionario.g:328:4: (lv_dificultad_4_0= ruleEDouble )
            {
            // InternalCuestionario.g:328:4: (lv_dificultad_4_0= ruleEDouble )
            // InternalCuestionario.g:329:5: lv_dificultad_4_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getCategoriaAccess().getDificultadEDoubleParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_14);
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

            // InternalCuestionario.g:346:3: (otherlv_5= 'SubCategorias:' ( (lv_subcategorias_6_0= ruleCategoria ) ) (otherlv_7= ',' ( (lv_subcategorias_8_0= ruleCategoria ) ) )* )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==20) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // InternalCuestionario.g:347:4: otherlv_5= 'SubCategorias:' ( (lv_subcategorias_6_0= ruleCategoria ) ) (otherlv_7= ',' ( (lv_subcategorias_8_0= ruleCategoria ) ) )*
                    {
                    otherlv_5=(Token)match(input,20,FOLLOW_6); 

                    				newLeafNode(otherlv_5, grammarAccess.getCategoriaAccess().getSubCategoriasKeyword_5_0());
                    			
                    // InternalCuestionario.g:351:4: ( (lv_subcategorias_6_0= ruleCategoria ) )
                    // InternalCuestionario.g:352:5: (lv_subcategorias_6_0= ruleCategoria )
                    {
                    // InternalCuestionario.g:352:5: (lv_subcategorias_6_0= ruleCategoria )
                    // InternalCuestionario.g:353:6: lv_subcategorias_6_0= ruleCategoria
                    {

                    						newCompositeNode(grammarAccess.getCategoriaAccess().getSubcategoriasCategoriaParserRuleCall_5_1_0());
                    					
                    pushFollow(FOLLOW_15);
                    lv_subcategorias_6_0=ruleCategoria();

                    state._fsp--;


                    						if (current==null) {
                    							current = createModelElementForParent(grammarAccess.getCategoriaRule());
                    						}
                    						add(
                    							current,
                    							"subcategorias",
                    							lv_subcategorias_6_0,
                    							"cuestionario.Cuestionario.Categoria");
                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCuestionario.g:370:4: (otherlv_7= ',' ( (lv_subcategorias_8_0= ruleCategoria ) ) )*
                    loop5:
                    do {
                        int alt5=2;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0==13) ) {
                            alt5=1;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCuestionario.g:371:5: otherlv_7= ',' ( (lv_subcategorias_8_0= ruleCategoria ) )
                    	    {
                    	    otherlv_7=(Token)match(input,13,FOLLOW_6); 

                    	    					newLeafNode(otherlv_7, grammarAccess.getCategoriaAccess().getCommaKeyword_5_2_0());
                    	    				
                    	    // InternalCuestionario.g:375:5: ( (lv_subcategorias_8_0= ruleCategoria ) )
                    	    // InternalCuestionario.g:376:6: (lv_subcategorias_8_0= ruleCategoria )
                    	    {
                    	    // InternalCuestionario.g:376:6: (lv_subcategorias_8_0= ruleCategoria )
                    	    // InternalCuestionario.g:377:7: lv_subcategorias_8_0= ruleCategoria
                    	    {

                    	    							newCompositeNode(grammarAccess.getCategoriaAccess().getSubcategoriasCategoriaParserRuleCall_5_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_15);
                    	    lv_subcategorias_8_0=ruleCategoria();

                    	    state._fsp--;


                    	    							if (current==null) {
                    	    								current = createModelElementForParent(grammarAccess.getCategoriaRule());
                    	    							}
                    	    							add(
                    	    								current,
                    	    								"subcategorias",
                    	    								lv_subcategorias_8_0,
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


                    }
                    break;

            }

            otherlv_9=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_9, grammarAccess.getCategoriaAccess().getRightCurlyBracketKeyword_6());
            		

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
    // InternalCuestionario.g:404:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // InternalCuestionario.g:404:47: (iv_ruleEString= ruleEString EOF )
            // InternalCuestionario.g:405:2: iv_ruleEString= ruleEString EOF
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
    // InternalCuestionario.g:411:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;


        	enterRule();

        try {
            // InternalCuestionario.g:417:2: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // InternalCuestionario.g:418:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // InternalCuestionario.g:418:2: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // InternalCuestionario.g:419:3: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FOLLOW_2); 

                    			current.merge(this_STRING_0);
                    		

                    			newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0());
                    		

                    }
                    break;
                case 2 :
                    // InternalCuestionario.g:427:3: this_ID_1= RULE_ID
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
    // InternalCuestionario.g:438:1: entryRuleEDouble returns [String current=null] : iv_ruleEDouble= ruleEDouble EOF ;
    public final String entryRuleEDouble() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEDouble = null;


        try {
            // InternalCuestionario.g:438:47: (iv_ruleEDouble= ruleEDouble EOF )
            // InternalCuestionario.g:439:2: iv_ruleEDouble= ruleEDouble EOF
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
    // InternalCuestionario.g:445:1: ruleEDouble returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) ;
    public final AntlrDatatypeRuleToken ruleEDouble() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;
        Token this_INT_7=null;


        	enterRule();

        try {
            // InternalCuestionario.g:451:2: ( ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? ) )
            // InternalCuestionario.g:452:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            {
            // InternalCuestionario.g:452:2: ( (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )? )
            // InternalCuestionario.g:453:3: (kw= '-' )? (this_INT_1= RULE_INT )? kw= '.' this_INT_3= RULE_INT ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            {
            // InternalCuestionario.g:453:3: (kw= '-' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==22) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // InternalCuestionario.g:454:4: kw= '-'
                    {
                    kw=(Token)match(input,22,FOLLOW_16); 

                    				current.merge(kw);
                    				newLeafNode(kw, grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0());
                    			

                    }
                    break;

            }

            // InternalCuestionario.g:460:3: (this_INT_1= RULE_INT )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_INT) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCuestionario.g:461:4: this_INT_1= RULE_INT
                    {
                    this_INT_1=(Token)match(input,RULE_INT,FOLLOW_17); 

                    				current.merge(this_INT_1);
                    			

                    				newLeafNode(this_INT_1, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1());
                    			

                    }
                    break;

            }

            kw=(Token)match(input,23,FOLLOW_18); 

            			current.merge(kw);
            			newLeafNode(kw, grammarAccess.getEDoubleAccess().getFullStopKeyword_2());
            		
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_19); 

            			current.merge(this_INT_3);
            		

            			newLeafNode(this_INT_3, grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3());
            		
            // InternalCuestionario.g:481:3: ( (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( ((LA12_0>=24 && LA12_0<=25)) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCuestionario.g:482:4: (kw= 'E' | kw= 'e' ) (kw= '-' )? this_INT_7= RULE_INT
                    {
                    // InternalCuestionario.g:482:4: (kw= 'E' | kw= 'e' )
                    int alt10=2;
                    int LA10_0 = input.LA(1);

                    if ( (LA10_0==24) ) {
                        alt10=1;
                    }
                    else if ( (LA10_0==25) ) {
                        alt10=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 10, 0, input);

                        throw nvae;
                    }
                    switch (alt10) {
                        case 1 :
                            // InternalCuestionario.g:483:5: kw= 'E'
                            {
                            kw=(Token)match(input,24,FOLLOW_20); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_0());
                            				

                            }
                            break;
                        case 2 :
                            // InternalCuestionario.g:489:5: kw= 'e'
                            {
                            kw=(Token)match(input,25,FOLLOW_20); 

                            					current.merge(kw);
                            					newLeafNode(kw, grammarAccess.getEDoubleAccess().getEKeyword_4_0_1());
                            				

                            }
                            break;

                    }

                    // InternalCuestionario.g:495:4: (kw= '-' )?
                    int alt11=2;
                    int LA11_0 = input.LA(1);

                    if ( (LA11_0==22) ) {
                        alt11=1;
                    }
                    switch (alt11) {
                        case 1 :
                            // InternalCuestionario.g:496:5: kw= '-'
                            {
                            kw=(Token)match(input,22,FOLLOW_18); 

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
    // InternalCuestionario.g:514:1: entryRulePreguntaUnica returns [EObject current=null] : iv_rulePreguntaUnica= rulePreguntaUnica EOF ;
    public final EObject entryRulePreguntaUnica() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreguntaUnica = null;


        try {
            // InternalCuestionario.g:514:54: (iv_rulePreguntaUnica= rulePreguntaUnica EOF )
            // InternalCuestionario.g:515:2: iv_rulePreguntaUnica= rulePreguntaUnica EOF
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
    // InternalCuestionario.g:521:1: rulePreguntaUnica returns [EObject current=null] : (otherlv_0= 'pregUnica' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Enunciado:' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'Respuestas' otherlv_6= '{' ( (lv_respuestas_7_0= ruleRespuesta ) ) (otherlv_8= ',' ( (lv_respuestas_9_0= ruleRespuesta ) ) )* otherlv_10= '}' otherlv_11= 'Puntuacion:' ( (lv_puntuacion_12_0= ruleEDouble ) ) otherlv_13= 'Penalizacion:' ( (lv_penalizacion_14_0= ruleEDouble ) ) otherlv_15= 'Categoria:' ( ( ruleEString ) ) otherlv_17= 'Correcta:' ( ( ruleEString ) ) ( ( (lv_isInicial_19_0= 'isInicial' ) ) otherlv_20= '(' (otherlv_21= 'siguientePreguntaAcierto:' ( ( ruleEString ) ) ) otherlv_23= ',' (otherlv_24= 'siguientePreguntaError:' ( ( ruleEString ) ) ) otherlv_26= ')' )? otherlv_27= '}' ) ;
    public final EObject rulePreguntaUnica() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token lv_isInicial_19_0=null;
        Token otherlv_20=null;
        Token otherlv_21=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_27=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_enunciado_4_0 = null;

        EObject lv_respuestas_7_0 = null;

        EObject lv_respuestas_9_0 = null;

        AntlrDatatypeRuleToken lv_puntuacion_12_0 = null;

        AntlrDatatypeRuleToken lv_penalizacion_14_0 = null;



        	enterRule();

        try {
            // InternalCuestionario.g:527:2: ( (otherlv_0= 'pregUnica' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Enunciado:' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'Respuestas' otherlv_6= '{' ( (lv_respuestas_7_0= ruleRespuesta ) ) (otherlv_8= ',' ( (lv_respuestas_9_0= ruleRespuesta ) ) )* otherlv_10= '}' otherlv_11= 'Puntuacion:' ( (lv_puntuacion_12_0= ruleEDouble ) ) otherlv_13= 'Penalizacion:' ( (lv_penalizacion_14_0= ruleEDouble ) ) otherlv_15= 'Categoria:' ( ( ruleEString ) ) otherlv_17= 'Correcta:' ( ( ruleEString ) ) ( ( (lv_isInicial_19_0= 'isInicial' ) ) otherlv_20= '(' (otherlv_21= 'siguientePreguntaAcierto:' ( ( ruleEString ) ) ) otherlv_23= ',' (otherlv_24= 'siguientePreguntaError:' ( ( ruleEString ) ) ) otherlv_26= ')' )? otherlv_27= '}' ) )
            // InternalCuestionario.g:528:2: (otherlv_0= 'pregUnica' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Enunciado:' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'Respuestas' otherlv_6= '{' ( (lv_respuestas_7_0= ruleRespuesta ) ) (otherlv_8= ',' ( (lv_respuestas_9_0= ruleRespuesta ) ) )* otherlv_10= '}' otherlv_11= 'Puntuacion:' ( (lv_puntuacion_12_0= ruleEDouble ) ) otherlv_13= 'Penalizacion:' ( (lv_penalizacion_14_0= ruleEDouble ) ) otherlv_15= 'Categoria:' ( ( ruleEString ) ) otherlv_17= 'Correcta:' ( ( ruleEString ) ) ( ( (lv_isInicial_19_0= 'isInicial' ) ) otherlv_20= '(' (otherlv_21= 'siguientePreguntaAcierto:' ( ( ruleEString ) ) ) otherlv_23= ',' (otherlv_24= 'siguientePreguntaError:' ( ( ruleEString ) ) ) otherlv_26= ')' )? otherlv_27= '}' )
            {
            // InternalCuestionario.g:528:2: (otherlv_0= 'pregUnica' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Enunciado:' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'Respuestas' otherlv_6= '{' ( (lv_respuestas_7_0= ruleRespuesta ) ) (otherlv_8= ',' ( (lv_respuestas_9_0= ruleRespuesta ) ) )* otherlv_10= '}' otherlv_11= 'Puntuacion:' ( (lv_puntuacion_12_0= ruleEDouble ) ) otherlv_13= 'Penalizacion:' ( (lv_penalizacion_14_0= ruleEDouble ) ) otherlv_15= 'Categoria:' ( ( ruleEString ) ) otherlv_17= 'Correcta:' ( ( ruleEString ) ) ( ( (lv_isInicial_19_0= 'isInicial' ) ) otherlv_20= '(' (otherlv_21= 'siguientePreguntaAcierto:' ( ( ruleEString ) ) ) otherlv_23= ',' (otherlv_24= 'siguientePreguntaError:' ( ( ruleEString ) ) ) otherlv_26= ')' )? otherlv_27= '}' )
            // InternalCuestionario.g:529:3: otherlv_0= 'pregUnica' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Enunciado:' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'Respuestas' otherlv_6= '{' ( (lv_respuestas_7_0= ruleRespuesta ) ) (otherlv_8= ',' ( (lv_respuestas_9_0= ruleRespuesta ) ) )* otherlv_10= '}' otherlv_11= 'Puntuacion:' ( (lv_puntuacion_12_0= ruleEDouble ) ) otherlv_13= 'Penalizacion:' ( (lv_penalizacion_14_0= ruleEDouble ) ) otherlv_15= 'Categoria:' ( ( ruleEString ) ) otherlv_17= 'Correcta:' ( ( ruleEString ) ) ( ( (lv_isInicial_19_0= 'isInicial' ) ) otherlv_20= '(' (otherlv_21= 'siguientePreguntaAcierto:' ( ( ruleEString ) ) ) otherlv_23= ',' (otherlv_24= 'siguientePreguntaError:' ( ( ruleEString ) ) ) otherlv_26= ')' )? otherlv_27= '}'
            {
            otherlv_0=(Token)match(input,26,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPreguntaUnicaAccess().getPregUnicaKeyword_0());
            		
            // InternalCuestionario.g:533:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCuestionario.g:534:4: (lv_name_1_0= ruleEString )
            {
            // InternalCuestionario.g:534:4: (lv_name_1_0= ruleEString )
            // InternalCuestionario.g:535:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_2=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getPreguntaUnicaAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPreguntaUnicaAccess().getEnunciadoKeyword_3());
            		
            // InternalCuestionario.g:560:3: ( (lv_enunciado_4_0= ruleEString ) )
            // InternalCuestionario.g:561:4: (lv_enunciado_4_0= ruleEString )
            {
            // InternalCuestionario.g:561:4: (lv_enunciado_4_0= ruleEString )
            // InternalCuestionario.g:562:5: lv_enunciado_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getEnunciadoEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_5=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getPreguntaUnicaAccess().getRespuestasKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getPreguntaUnicaAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalCuestionario.g:587:3: ( (lv_respuestas_7_0= ruleRespuesta ) )
            // InternalCuestionario.g:588:4: (lv_respuestas_7_0= ruleRespuesta )
            {
            // InternalCuestionario.g:588:4: (lv_respuestas_7_0= ruleRespuesta )
            // InternalCuestionario.g:589:5: lv_respuestas_7_0= ruleRespuesta
            {

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getRespuestasRespuestaParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_15);
            lv_respuestas_7_0=ruleRespuesta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreguntaUnicaRule());
            					}
            					add(
            						current,
            						"respuestas",
            						lv_respuestas_7_0,
            						"cuestionario.Cuestionario.Respuesta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:606:3: (otherlv_8= ',' ( (lv_respuestas_9_0= ruleRespuesta ) ) )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==13) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // InternalCuestionario.g:607:4: otherlv_8= ',' ( (lv_respuestas_9_0= ruleRespuesta ) )
            	    {
            	    otherlv_8=(Token)match(input,13,FOLLOW_8); 

            	    				newLeafNode(otherlv_8, grammarAccess.getPreguntaUnicaAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalCuestionario.g:611:4: ( (lv_respuestas_9_0= ruleRespuesta ) )
            	    // InternalCuestionario.g:612:5: (lv_respuestas_9_0= ruleRespuesta )
            	    {
            	    // InternalCuestionario.g:612:5: (lv_respuestas_9_0= ruleRespuesta )
            	    // InternalCuestionario.g:613:6: lv_respuestas_9_0= ruleRespuesta
            	    {

            	    						newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getRespuestasRespuestaParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_respuestas_9_0=ruleRespuesta();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPreguntaUnicaRule());
            	    						}
            	    						add(
            	    							current,
            	    							"respuestas",
            	    							lv_respuestas_9_0,
            	    							"cuestionario.Cuestionario.Respuesta");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);

            otherlv_10=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_10, grammarAccess.getPreguntaUnicaAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getPreguntaUnicaAccess().getPuntuacionKeyword_10());
            		
            // InternalCuestionario.g:639:3: ( (lv_puntuacion_12_0= ruleEDouble ) )
            // InternalCuestionario.g:640:4: (lv_puntuacion_12_0= ruleEDouble )
            {
            // InternalCuestionario.g:640:4: (lv_puntuacion_12_0= ruleEDouble )
            // InternalCuestionario.g:641:5: lv_puntuacion_12_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getPuntuacionEDoubleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_24);
            lv_puntuacion_12_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreguntaUnicaRule());
            					}
            					set(
            						current,
            						"puntuacion",
            						lv_puntuacion_12_0,
            						"cuestionario.Cuestionario.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getPreguntaUnicaAccess().getPenalizacionKeyword_12());
            		
            // InternalCuestionario.g:662:3: ( (lv_penalizacion_14_0= ruleEDouble ) )
            // InternalCuestionario.g:663:4: (lv_penalizacion_14_0= ruleEDouble )
            {
            // InternalCuestionario.g:663:4: (lv_penalizacion_14_0= ruleEDouble )
            // InternalCuestionario.g:664:5: lv_penalizacion_14_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getPenalizacionEDoubleParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_25);
            lv_penalizacion_14_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreguntaUnicaRule());
            					}
            					set(
            						current,
            						"penalizacion",
            						lv_penalizacion_14_0,
            						"cuestionario.Cuestionario.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getPreguntaUnicaAccess().getCategoriaKeyword_14());
            		
            // InternalCuestionario.g:685:3: ( ( ruleEString ) )
            // InternalCuestionario.g:686:4: ( ruleEString )
            {
            // InternalCuestionario.g:686:4: ( ruleEString )
            // InternalCuestionario.g:687:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreguntaUnicaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getCategoriaCategoriaCrossReference_15_0());
            				
            pushFollow(FOLLOW_26);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_17=(Token)match(input,32,FOLLOW_8); 

            			newLeafNode(otherlv_17, grammarAccess.getPreguntaUnicaAccess().getCorrectaKeyword_16());
            		
            // InternalCuestionario.g:705:3: ( ( ruleEString ) )
            // InternalCuestionario.g:706:4: ( ruleEString )
            {
            // InternalCuestionario.g:706:4: ( ruleEString )
            // InternalCuestionario.g:707:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreguntaUnicaRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getCorrectaRespuestaCrossReference_17_0());
            				
            pushFollow(FOLLOW_27);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:721:3: ( ( (lv_isInicial_19_0= 'isInicial' ) ) otherlv_20= '(' (otherlv_21= 'siguientePreguntaAcierto:' ( ( ruleEString ) ) ) otherlv_23= ',' (otherlv_24= 'siguientePreguntaError:' ( ( ruleEString ) ) ) otherlv_26= ')' )?
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==33) ) {
                alt14=1;
            }
            switch (alt14) {
                case 1 :
                    // InternalCuestionario.g:722:4: ( (lv_isInicial_19_0= 'isInicial' ) ) otherlv_20= '(' (otherlv_21= 'siguientePreguntaAcierto:' ( ( ruleEString ) ) ) otherlv_23= ',' (otherlv_24= 'siguientePreguntaError:' ( ( ruleEString ) ) ) otherlv_26= ')'
                    {
                    // InternalCuestionario.g:722:4: ( (lv_isInicial_19_0= 'isInicial' ) )
                    // InternalCuestionario.g:723:5: (lv_isInicial_19_0= 'isInicial' )
                    {
                    // InternalCuestionario.g:723:5: (lv_isInicial_19_0= 'isInicial' )
                    // InternalCuestionario.g:724:6: lv_isInicial_19_0= 'isInicial'
                    {
                    lv_isInicial_19_0=(Token)match(input,33,FOLLOW_28); 

                    						newLeafNode(lv_isInicial_19_0, grammarAccess.getPreguntaUnicaAccess().getIsInicialIsInicialKeyword_18_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPreguntaUnicaRule());
                    						}
                    						setWithLastConsumed(current, "isInicial", lv_isInicial_19_0 != null, "isInicial");
                    					

                    }


                    }

                    otherlv_20=(Token)match(input,34,FOLLOW_29); 

                    				newLeafNode(otherlv_20, grammarAccess.getPreguntaUnicaAccess().getLeftParenthesisKeyword_18_1());
                    			
                    // InternalCuestionario.g:740:4: (otherlv_21= 'siguientePreguntaAcierto:' ( ( ruleEString ) ) )
                    // InternalCuestionario.g:741:5: otherlv_21= 'siguientePreguntaAcierto:' ( ( ruleEString ) )
                    {
                    otherlv_21=(Token)match(input,35,FOLLOW_8); 

                    					newLeafNode(otherlv_21, grammarAccess.getPreguntaUnicaAccess().getSiguientePreguntaAciertoKeyword_18_2_0());
                    				
                    // InternalCuestionario.g:745:5: ( ( ruleEString ) )
                    // InternalCuestionario.g:746:6: ( ruleEString )
                    {
                    // InternalCuestionario.g:746:6: ( ruleEString )
                    // InternalCuestionario.g:747:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPreguntaUnicaRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getSiguientePreguntaAciertoPreguntaCrossReference_18_2_1_0());
                    						
                    pushFollow(FOLLOW_30);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_23=(Token)match(input,13,FOLLOW_31); 

                    				newLeafNode(otherlv_23, grammarAccess.getPreguntaUnicaAccess().getCommaKeyword_18_3());
                    			
                    // InternalCuestionario.g:766:4: (otherlv_24= 'siguientePreguntaError:' ( ( ruleEString ) ) )
                    // InternalCuestionario.g:767:5: otherlv_24= 'siguientePreguntaError:' ( ( ruleEString ) )
                    {
                    otherlv_24=(Token)match(input,36,FOLLOW_8); 

                    					newLeafNode(otherlv_24, grammarAccess.getPreguntaUnicaAccess().getSiguientePreguntaErrorKeyword_18_4_0());
                    				
                    // InternalCuestionario.g:771:5: ( ( ruleEString ) )
                    // InternalCuestionario.g:772:6: ( ruleEString )
                    {
                    // InternalCuestionario.g:772:6: ( ruleEString )
                    // InternalCuestionario.g:773:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPreguntaUnicaRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPreguntaUnicaAccess().getSiguientePreguntaErrorPreguntaCrossReference_18_4_1_0());
                    						
                    pushFollow(FOLLOW_32);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_26=(Token)match(input,37,FOLLOW_33); 

                    				newLeafNode(otherlv_26, grammarAccess.getPreguntaUnicaAccess().getRightParenthesisKeyword_18_5());
                    			

                    }
                    break;

            }

            otherlv_27=(Token)match(input,21,FOLLOW_2); 

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
    // InternalCuestionario.g:801:1: entryRulePreguntaMultiple returns [EObject current=null] : iv_rulePreguntaMultiple= rulePreguntaMultiple EOF ;
    public final EObject entryRulePreguntaMultiple() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePreguntaMultiple = null;


        try {
            // InternalCuestionario.g:801:57: (iv_rulePreguntaMultiple= rulePreguntaMultiple EOF )
            // InternalCuestionario.g:802:2: iv_rulePreguntaMultiple= rulePreguntaMultiple EOF
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
    // InternalCuestionario.g:808:1: rulePreguntaMultiple returns [EObject current=null] : (otherlv_0= 'pregMultiple' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Enunciado:' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'Respuestas' otherlv_6= '{' ( (lv_respuestas_7_0= ruleRespuesta ) ) (otherlv_8= ',' ( (lv_respuestas_9_0= ruleRespuesta ) ) )* otherlv_10= '}' otherlv_11= 'Puntuacion:' ( (lv_puntuacion_12_0= ruleEDouble ) ) otherlv_13= 'Penalizacion:' ( (lv_penalizacion_14_0= ruleEDouble ) ) otherlv_15= 'Categoria:' ( ( ruleEString ) ) (otherlv_17= 'Correctas:' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* )? ( ( (lv_isInicial_21_0= 'isInicial' ) ) otherlv_22= '(' (otherlv_23= 'siguientePreguntaAcierto:' ( ( ruleEString ) ) ) otherlv_25= ',' (otherlv_26= 'siguientePreguntaError:' ( ( ruleEString ) ) ) otherlv_28= ')' )? otherlv_29= '}' ) ;
    public final EObject rulePreguntaMultiple() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        Token otherlv_6=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_15=null;
        Token otherlv_17=null;
        Token otherlv_19=null;
        Token lv_isInicial_21_0=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_1_0 = null;

        AntlrDatatypeRuleToken lv_enunciado_4_0 = null;

        EObject lv_respuestas_7_0 = null;

        EObject lv_respuestas_9_0 = null;

        AntlrDatatypeRuleToken lv_puntuacion_12_0 = null;

        AntlrDatatypeRuleToken lv_penalizacion_14_0 = null;



        	enterRule();

        try {
            // InternalCuestionario.g:814:2: ( (otherlv_0= 'pregMultiple' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Enunciado:' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'Respuestas' otherlv_6= '{' ( (lv_respuestas_7_0= ruleRespuesta ) ) (otherlv_8= ',' ( (lv_respuestas_9_0= ruleRespuesta ) ) )* otherlv_10= '}' otherlv_11= 'Puntuacion:' ( (lv_puntuacion_12_0= ruleEDouble ) ) otherlv_13= 'Penalizacion:' ( (lv_penalizacion_14_0= ruleEDouble ) ) otherlv_15= 'Categoria:' ( ( ruleEString ) ) (otherlv_17= 'Correctas:' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* )? ( ( (lv_isInicial_21_0= 'isInicial' ) ) otherlv_22= '(' (otherlv_23= 'siguientePreguntaAcierto:' ( ( ruleEString ) ) ) otherlv_25= ',' (otherlv_26= 'siguientePreguntaError:' ( ( ruleEString ) ) ) otherlv_28= ')' )? otherlv_29= '}' ) )
            // InternalCuestionario.g:815:2: (otherlv_0= 'pregMultiple' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Enunciado:' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'Respuestas' otherlv_6= '{' ( (lv_respuestas_7_0= ruleRespuesta ) ) (otherlv_8= ',' ( (lv_respuestas_9_0= ruleRespuesta ) ) )* otherlv_10= '}' otherlv_11= 'Puntuacion:' ( (lv_puntuacion_12_0= ruleEDouble ) ) otherlv_13= 'Penalizacion:' ( (lv_penalizacion_14_0= ruleEDouble ) ) otherlv_15= 'Categoria:' ( ( ruleEString ) ) (otherlv_17= 'Correctas:' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* )? ( ( (lv_isInicial_21_0= 'isInicial' ) ) otherlv_22= '(' (otherlv_23= 'siguientePreguntaAcierto:' ( ( ruleEString ) ) ) otherlv_25= ',' (otherlv_26= 'siguientePreguntaError:' ( ( ruleEString ) ) ) otherlv_28= ')' )? otherlv_29= '}' )
            {
            // InternalCuestionario.g:815:2: (otherlv_0= 'pregMultiple' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Enunciado:' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'Respuestas' otherlv_6= '{' ( (lv_respuestas_7_0= ruleRespuesta ) ) (otherlv_8= ',' ( (lv_respuestas_9_0= ruleRespuesta ) ) )* otherlv_10= '}' otherlv_11= 'Puntuacion:' ( (lv_puntuacion_12_0= ruleEDouble ) ) otherlv_13= 'Penalizacion:' ( (lv_penalizacion_14_0= ruleEDouble ) ) otherlv_15= 'Categoria:' ( ( ruleEString ) ) (otherlv_17= 'Correctas:' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* )? ( ( (lv_isInicial_21_0= 'isInicial' ) ) otherlv_22= '(' (otherlv_23= 'siguientePreguntaAcierto:' ( ( ruleEString ) ) ) otherlv_25= ',' (otherlv_26= 'siguientePreguntaError:' ( ( ruleEString ) ) ) otherlv_28= ')' )? otherlv_29= '}' )
            // InternalCuestionario.g:816:3: otherlv_0= 'pregMultiple' ( (lv_name_1_0= ruleEString ) ) otherlv_2= '{' otherlv_3= 'Enunciado:' ( (lv_enunciado_4_0= ruleEString ) ) otherlv_5= 'Respuestas' otherlv_6= '{' ( (lv_respuestas_7_0= ruleRespuesta ) ) (otherlv_8= ',' ( (lv_respuestas_9_0= ruleRespuesta ) ) )* otherlv_10= '}' otherlv_11= 'Puntuacion:' ( (lv_puntuacion_12_0= ruleEDouble ) ) otherlv_13= 'Penalizacion:' ( (lv_penalizacion_14_0= ruleEDouble ) ) otherlv_15= 'Categoria:' ( ( ruleEString ) ) (otherlv_17= 'Correctas:' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* )? ( ( (lv_isInicial_21_0= 'isInicial' ) ) otherlv_22= '(' (otherlv_23= 'siguientePreguntaAcierto:' ( ( ruleEString ) ) ) otherlv_25= ',' (otherlv_26= 'siguientePreguntaError:' ( ( ruleEString ) ) ) otherlv_28= ')' )? otherlv_29= '}'
            {
            otherlv_0=(Token)match(input,38,FOLLOW_8); 

            			newLeafNode(otherlv_0, grammarAccess.getPreguntaMultipleAccess().getPregMultipleKeyword_0());
            		
            // InternalCuestionario.g:820:3: ( (lv_name_1_0= ruleEString ) )
            // InternalCuestionario.g:821:4: (lv_name_1_0= ruleEString )
            {
            // InternalCuestionario.g:821:4: (lv_name_1_0= ruleEString )
            // InternalCuestionario.g:822:5: lv_name_1_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getNameEStringParserRuleCall_1_0());
            				
            pushFollow(FOLLOW_11);
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

            otherlv_2=(Token)match(input,18,FOLLOW_21); 

            			newLeafNode(otherlv_2, grammarAccess.getPreguntaMultipleAccess().getLeftCurlyBracketKeyword_2());
            		
            otherlv_3=(Token)match(input,27,FOLLOW_8); 

            			newLeafNode(otherlv_3, grammarAccess.getPreguntaMultipleAccess().getEnunciadoKeyword_3());
            		
            // InternalCuestionario.g:847:3: ( (lv_enunciado_4_0= ruleEString ) )
            // InternalCuestionario.g:848:4: (lv_enunciado_4_0= ruleEString )
            {
            // InternalCuestionario.g:848:4: (lv_enunciado_4_0= ruleEString )
            // InternalCuestionario.g:849:5: lv_enunciado_4_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getEnunciadoEStringParserRuleCall_4_0());
            				
            pushFollow(FOLLOW_22);
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

            otherlv_5=(Token)match(input,28,FOLLOW_11); 

            			newLeafNode(otherlv_5, grammarAccess.getPreguntaMultipleAccess().getRespuestasKeyword_5());
            		
            otherlv_6=(Token)match(input,18,FOLLOW_8); 

            			newLeafNode(otherlv_6, grammarAccess.getPreguntaMultipleAccess().getLeftCurlyBracketKeyword_6());
            		
            // InternalCuestionario.g:874:3: ( (lv_respuestas_7_0= ruleRespuesta ) )
            // InternalCuestionario.g:875:4: (lv_respuestas_7_0= ruleRespuesta )
            {
            // InternalCuestionario.g:875:4: (lv_respuestas_7_0= ruleRespuesta )
            // InternalCuestionario.g:876:5: lv_respuestas_7_0= ruleRespuesta
            {

            					newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getRespuestasRespuestaParserRuleCall_7_0());
            				
            pushFollow(FOLLOW_15);
            lv_respuestas_7_0=ruleRespuesta();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreguntaMultipleRule());
            					}
            					add(
            						current,
            						"respuestas",
            						lv_respuestas_7_0,
            						"cuestionario.Cuestionario.Respuesta");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:893:3: (otherlv_8= ',' ( (lv_respuestas_9_0= ruleRespuesta ) ) )*
            loop15:
            do {
                int alt15=2;
                int LA15_0 = input.LA(1);

                if ( (LA15_0==13) ) {
                    alt15=1;
                }


                switch (alt15) {
            	case 1 :
            	    // InternalCuestionario.g:894:4: otherlv_8= ',' ( (lv_respuestas_9_0= ruleRespuesta ) )
            	    {
            	    otherlv_8=(Token)match(input,13,FOLLOW_8); 

            	    				newLeafNode(otherlv_8, grammarAccess.getPreguntaMultipleAccess().getCommaKeyword_8_0());
            	    			
            	    // InternalCuestionario.g:898:4: ( (lv_respuestas_9_0= ruleRespuesta ) )
            	    // InternalCuestionario.g:899:5: (lv_respuestas_9_0= ruleRespuesta )
            	    {
            	    // InternalCuestionario.g:899:5: (lv_respuestas_9_0= ruleRespuesta )
            	    // InternalCuestionario.g:900:6: lv_respuestas_9_0= ruleRespuesta
            	    {

            	    						newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getRespuestasRespuestaParserRuleCall_8_1_0());
            	    					
            	    pushFollow(FOLLOW_15);
            	    lv_respuestas_9_0=ruleRespuesta();

            	    state._fsp--;


            	    						if (current==null) {
            	    							current = createModelElementForParent(grammarAccess.getPreguntaMultipleRule());
            	    						}
            	    						add(
            	    							current,
            	    							"respuestas",
            	    							lv_respuestas_9_0,
            	    							"cuestionario.Cuestionario.Respuesta");
            	    						afterParserOrEnumRuleCall();
            	    					

            	    }


            	    }


            	    }
            	    break;

            	default :
            	    break loop15;
                }
            } while (true);

            otherlv_10=(Token)match(input,21,FOLLOW_23); 

            			newLeafNode(otherlv_10, grammarAccess.getPreguntaMultipleAccess().getRightCurlyBracketKeyword_9());
            		
            otherlv_11=(Token)match(input,29,FOLLOW_13); 

            			newLeafNode(otherlv_11, grammarAccess.getPreguntaMultipleAccess().getPuntuacionKeyword_10());
            		
            // InternalCuestionario.g:926:3: ( (lv_puntuacion_12_0= ruleEDouble ) )
            // InternalCuestionario.g:927:4: (lv_puntuacion_12_0= ruleEDouble )
            {
            // InternalCuestionario.g:927:4: (lv_puntuacion_12_0= ruleEDouble )
            // InternalCuestionario.g:928:5: lv_puntuacion_12_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getPuntuacionEDoubleParserRuleCall_11_0());
            				
            pushFollow(FOLLOW_24);
            lv_puntuacion_12_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreguntaMultipleRule());
            					}
            					set(
            						current,
            						"puntuacion",
            						lv_puntuacion_12_0,
            						"cuestionario.Cuestionario.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_13=(Token)match(input,30,FOLLOW_13); 

            			newLeafNode(otherlv_13, grammarAccess.getPreguntaMultipleAccess().getPenalizacionKeyword_12());
            		
            // InternalCuestionario.g:949:3: ( (lv_penalizacion_14_0= ruleEDouble ) )
            // InternalCuestionario.g:950:4: (lv_penalizacion_14_0= ruleEDouble )
            {
            // InternalCuestionario.g:950:4: (lv_penalizacion_14_0= ruleEDouble )
            // InternalCuestionario.g:951:5: lv_penalizacion_14_0= ruleEDouble
            {

            					newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getPenalizacionEDoubleParserRuleCall_13_0());
            				
            pushFollow(FOLLOW_25);
            lv_penalizacion_14_0=ruleEDouble();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getPreguntaMultipleRule());
            					}
            					set(
            						current,
            						"penalizacion",
            						lv_penalizacion_14_0,
            						"cuestionario.Cuestionario.EDouble");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_15=(Token)match(input,31,FOLLOW_8); 

            			newLeafNode(otherlv_15, grammarAccess.getPreguntaMultipleAccess().getCategoriaKeyword_14());
            		
            // InternalCuestionario.g:972:3: ( ( ruleEString ) )
            // InternalCuestionario.g:973:4: ( ruleEString )
            {
            // InternalCuestionario.g:973:4: ( ruleEString )
            // InternalCuestionario.g:974:5: ruleEString
            {

            					if (current==null) {
            						current = createModelElement(grammarAccess.getPreguntaMultipleRule());
            					}
            				

            					newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getCategoriaCategoriaCrossReference_15_0());
            				
            pushFollow(FOLLOW_34);
            ruleEString();

            state._fsp--;


            					afterParserOrEnumRuleCall();
            				

            }


            }

            // InternalCuestionario.g:988:3: (otherlv_17= 'Correctas:' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )* )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==39) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // InternalCuestionario.g:989:4: otherlv_17= 'Correctas:' ( ( ruleEString ) ) (otherlv_19= ',' ( ( ruleEString ) ) )*
                    {
                    otherlv_17=(Token)match(input,39,FOLLOW_8); 

                    				newLeafNode(otherlv_17, grammarAccess.getPreguntaMultipleAccess().getCorrectasKeyword_16_0());
                    			
                    // InternalCuestionario.g:993:4: ( ( ruleEString ) )
                    // InternalCuestionario.g:994:5: ( ruleEString )
                    {
                    // InternalCuestionario.g:994:5: ( ruleEString )
                    // InternalCuestionario.g:995:6: ruleEString
                    {

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPreguntaMultipleRule());
                    						}
                    					

                    						newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getCorrectasRespuestaCrossReference_16_1_0());
                    					
                    pushFollow(FOLLOW_35);
                    ruleEString();

                    state._fsp--;


                    						afterParserOrEnumRuleCall();
                    					

                    }


                    }

                    // InternalCuestionario.g:1009:4: (otherlv_19= ',' ( ( ruleEString ) ) )*
                    loop16:
                    do {
                        int alt16=2;
                        int LA16_0 = input.LA(1);

                        if ( (LA16_0==13) ) {
                            alt16=1;
                        }


                        switch (alt16) {
                    	case 1 :
                    	    // InternalCuestionario.g:1010:5: otherlv_19= ',' ( ( ruleEString ) )
                    	    {
                    	    otherlv_19=(Token)match(input,13,FOLLOW_8); 

                    	    					newLeafNode(otherlv_19, grammarAccess.getPreguntaMultipleAccess().getCommaKeyword_16_2_0());
                    	    				
                    	    // InternalCuestionario.g:1014:5: ( ( ruleEString ) )
                    	    // InternalCuestionario.g:1015:6: ( ruleEString )
                    	    {
                    	    // InternalCuestionario.g:1015:6: ( ruleEString )
                    	    // InternalCuestionario.g:1016:7: ruleEString
                    	    {

                    	    							if (current==null) {
                    	    								current = createModelElement(grammarAccess.getPreguntaMultipleRule());
                    	    							}
                    	    						

                    	    							newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getCorrectasRespuestaCrossReference_16_2_1_0());
                    	    						
                    	    pushFollow(FOLLOW_35);
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


                    }
                    break;

            }

            // InternalCuestionario.g:1032:3: ( ( (lv_isInicial_21_0= 'isInicial' ) ) otherlv_22= '(' (otherlv_23= 'siguientePreguntaAcierto:' ( ( ruleEString ) ) ) otherlv_25= ',' (otherlv_26= 'siguientePreguntaError:' ( ( ruleEString ) ) ) otherlv_28= ')' )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==33) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // InternalCuestionario.g:1033:4: ( (lv_isInicial_21_0= 'isInicial' ) ) otherlv_22= '(' (otherlv_23= 'siguientePreguntaAcierto:' ( ( ruleEString ) ) ) otherlv_25= ',' (otherlv_26= 'siguientePreguntaError:' ( ( ruleEString ) ) ) otherlv_28= ')'
                    {
                    // InternalCuestionario.g:1033:4: ( (lv_isInicial_21_0= 'isInicial' ) )
                    // InternalCuestionario.g:1034:5: (lv_isInicial_21_0= 'isInicial' )
                    {
                    // InternalCuestionario.g:1034:5: (lv_isInicial_21_0= 'isInicial' )
                    // InternalCuestionario.g:1035:6: lv_isInicial_21_0= 'isInicial'
                    {
                    lv_isInicial_21_0=(Token)match(input,33,FOLLOW_28); 

                    						newLeafNode(lv_isInicial_21_0, grammarAccess.getPreguntaMultipleAccess().getIsInicialIsInicialKeyword_17_0_0());
                    					

                    						if (current==null) {
                    							current = createModelElement(grammarAccess.getPreguntaMultipleRule());
                    						}
                    						setWithLastConsumed(current, "isInicial", lv_isInicial_21_0 != null, "isInicial");
                    					

                    }


                    }

                    otherlv_22=(Token)match(input,34,FOLLOW_29); 

                    				newLeafNode(otherlv_22, grammarAccess.getPreguntaMultipleAccess().getLeftParenthesisKeyword_17_1());
                    			
                    // InternalCuestionario.g:1051:4: (otherlv_23= 'siguientePreguntaAcierto:' ( ( ruleEString ) ) )
                    // InternalCuestionario.g:1052:5: otherlv_23= 'siguientePreguntaAcierto:' ( ( ruleEString ) )
                    {
                    otherlv_23=(Token)match(input,35,FOLLOW_8); 

                    					newLeafNode(otherlv_23, grammarAccess.getPreguntaMultipleAccess().getSiguientePreguntaAciertoKeyword_17_2_0());
                    				
                    // InternalCuestionario.g:1056:5: ( ( ruleEString ) )
                    // InternalCuestionario.g:1057:6: ( ruleEString )
                    {
                    // InternalCuestionario.g:1057:6: ( ruleEString )
                    // InternalCuestionario.g:1058:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPreguntaMultipleRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getSiguientePreguntaAciertoPreguntaCrossReference_17_2_1_0());
                    						
                    pushFollow(FOLLOW_30);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_25=(Token)match(input,13,FOLLOW_31); 

                    				newLeafNode(otherlv_25, grammarAccess.getPreguntaMultipleAccess().getCommaKeyword_17_3());
                    			
                    // InternalCuestionario.g:1077:4: (otherlv_26= 'siguientePreguntaError:' ( ( ruleEString ) ) )
                    // InternalCuestionario.g:1078:5: otherlv_26= 'siguientePreguntaError:' ( ( ruleEString ) )
                    {
                    otherlv_26=(Token)match(input,36,FOLLOW_8); 

                    					newLeafNode(otherlv_26, grammarAccess.getPreguntaMultipleAccess().getSiguientePreguntaErrorKeyword_17_4_0());
                    				
                    // InternalCuestionario.g:1082:5: ( ( ruleEString ) )
                    // InternalCuestionario.g:1083:6: ( ruleEString )
                    {
                    // InternalCuestionario.g:1083:6: ( ruleEString )
                    // InternalCuestionario.g:1084:7: ruleEString
                    {

                    							if (current==null) {
                    								current = createModelElement(grammarAccess.getPreguntaMultipleRule());
                    							}
                    						

                    							newCompositeNode(grammarAccess.getPreguntaMultipleAccess().getSiguientePreguntaErrorPreguntaCrossReference_17_4_1_0());
                    						
                    pushFollow(FOLLOW_32);
                    ruleEString();

                    state._fsp--;


                    							afterParserOrEnumRuleCall();
                    						

                    }


                    }


                    }

                    otherlv_28=(Token)match(input,37,FOLLOW_33); 

                    				newLeafNode(otherlv_28, grammarAccess.getPreguntaMultipleAccess().getRightParenthesisKeyword_17_5());
                    			

                    }
                    break;

            }

            otherlv_29=(Token)match(input,21,FOLLOW_2); 

            			newLeafNode(otherlv_29, grammarAccess.getPreguntaMultipleAccess().getRightCurlyBracketKeyword_18());
            		

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
    // InternalCuestionario.g:1112:1: entryRuleRespuesta returns [EObject current=null] : iv_ruleRespuesta= ruleRespuesta EOF ;
    public final EObject entryRuleRespuesta() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRespuesta = null;


        try {
            // InternalCuestionario.g:1112:50: (iv_ruleRespuesta= ruleRespuesta EOF )
            // InternalCuestionario.g:1113:2: iv_ruleRespuesta= ruleRespuesta EOF
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
    // InternalCuestionario.g:1119:1: ruleRespuesta returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_opcion_2_0= ruleEString ) ) ) ;
    public final EObject ruleRespuesta() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        AntlrDatatypeRuleToken lv_opcion_2_0 = null;



        	enterRule();

        try {
            // InternalCuestionario.g:1125:2: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_opcion_2_0= ruleEString ) ) ) )
            // InternalCuestionario.g:1126:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_opcion_2_0= ruleEString ) ) )
            {
            // InternalCuestionario.g:1126:2: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_opcion_2_0= ruleEString ) ) )
            // InternalCuestionario.g:1127:3: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_opcion_2_0= ruleEString ) )
            {
            // InternalCuestionario.g:1127:3: ( (lv_name_0_0= ruleEString ) )
            // InternalCuestionario.g:1128:4: (lv_name_0_0= ruleEString )
            {
            // InternalCuestionario.g:1128:4: (lv_name_0_0= ruleEString )
            // InternalCuestionario.g:1129:5: lv_name_0_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRespuestaAccess().getNameEStringParserRuleCall_0_0());
            				
            pushFollow(FOLLOW_36);
            lv_name_0_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRespuestaRule());
            					}
            					set(
            						current,
            						"name",
            						lv_name_0_0,
            						"cuestionario.Cuestionario.EString");
            					afterParserOrEnumRuleCall();
            				

            }


            }

            otherlv_1=(Token)match(input,40,FOLLOW_8); 

            			newLeafNode(otherlv_1, grammarAccess.getRespuestaAccess().getColonKeyword_1());
            		
            // InternalCuestionario.g:1150:3: ( (lv_opcion_2_0= ruleEString ) )
            // InternalCuestionario.g:1151:4: (lv_opcion_2_0= ruleEString )
            {
            // InternalCuestionario.g:1151:4: (lv_opcion_2_0= ruleEString )
            // InternalCuestionario.g:1152:5: lv_opcion_2_0= ruleEString
            {

            					newCompositeNode(grammarAccess.getRespuestaAccess().getOpcionEStringParserRuleCall_2_0());
            				
            pushFollow(FOLLOW_2);
            lv_opcion_2_0=ruleEString();

            state._fsp--;


            					if (current==null) {
            						current = createModelElementForParent(grammarAccess.getRespuestaRule());
            					}
            					set(
            						current,
            						"opcion",
            						lv_opcion_2_0,
            						"cuestionario.Cuestionario.EString");
            					afterParserOrEnumRuleCall();
            				

            }


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
    // $ANTLR end "ruleRespuesta"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000004004000000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000006000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x000000000000A000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000C00040L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000300000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000202000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000800040L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000003000002L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000400040L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000000200200000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_31 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_32 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_33 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_34 = new BitSet(new long[]{0x0000008200200000L});
    public static final BitSet FOLLOW_35 = new BitSet(new long[]{0x0000000200202000L});
    public static final BitSet FOLLOW_36 = new BitSet(new long[]{0x0000010000000000L});

}