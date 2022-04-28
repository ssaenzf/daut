package cuestionario.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import cuestionario.services.CuestionarioGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCuestionarioParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'E'", "'e'", "'Cuestionario'", "'{'", "'preguntaInicial'", "'preguntasFinales'", "'('", "')'", "'preguntas'", "'}'", "'categorias'", "','", "'Categoria'", "'dificultad'", "'subcategorias'", "'-'", "'.'", "'Respuesta'", "'opcion'", "'PreguntaUnica'", "'enunciado'", "'puntuacion'", "'penalizacion'", "'categoria'", "'correcta'", "'respuestas'", "'siguientePregunta'", "'PreguntaMultiple'", "'correctas'"
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

    	public void setGrammarAccess(CuestionarioGrammarAccess grammarAccess) {
    		this.grammarAccess = grammarAccess;
    	}

    	@Override
    	protected Grammar getGrammar() {
    		return grammarAccess.getGrammar();
    	}

    	@Override
    	protected String getValueForTokenName(String tokenName) {
    		return tokenName;
    	}



    // $ANTLR start "entryRuleCuestionario"
    // InternalCuestionario.g:53:1: entryRuleCuestionario : ruleCuestionario EOF ;
    public final void entryRuleCuestionario() throws RecognitionException {
        try {
            // InternalCuestionario.g:54:1: ( ruleCuestionario EOF )
            // InternalCuestionario.g:55:1: ruleCuestionario EOF
            {
             before(grammarAccess.getCuestionarioRule()); 
            pushFollow(FOLLOW_1);
            ruleCuestionario();

            state._fsp--;

             after(grammarAccess.getCuestionarioRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCuestionario"


    // $ANTLR start "ruleCuestionario"
    // InternalCuestionario.g:62:1: ruleCuestionario : ( ( rule__Cuestionario__Group__0 ) ) ;
    public final void ruleCuestionario() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:66:2: ( ( ( rule__Cuestionario__Group__0 ) ) )
            // InternalCuestionario.g:67:2: ( ( rule__Cuestionario__Group__0 ) )
            {
            // InternalCuestionario.g:67:2: ( ( rule__Cuestionario__Group__0 ) )
            // InternalCuestionario.g:68:3: ( rule__Cuestionario__Group__0 )
            {
             before(grammarAccess.getCuestionarioAccess().getGroup()); 
            // InternalCuestionario.g:69:3: ( rule__Cuestionario__Group__0 )
            // InternalCuestionario.g:69:4: rule__Cuestionario__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCuestionarioAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCuestionario"


    // $ANTLR start "entryRulePregunta"
    // InternalCuestionario.g:78:1: entryRulePregunta : rulePregunta EOF ;
    public final void entryRulePregunta() throws RecognitionException {
        try {
            // InternalCuestionario.g:79:1: ( rulePregunta EOF )
            // InternalCuestionario.g:80:1: rulePregunta EOF
            {
             before(grammarAccess.getPreguntaRule()); 
            pushFollow(FOLLOW_1);
            rulePregunta();

            state._fsp--;

             after(grammarAccess.getPreguntaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePregunta"


    // $ANTLR start "rulePregunta"
    // InternalCuestionario.g:87:1: rulePregunta : ( ( rule__Pregunta__Alternatives ) ) ;
    public final void rulePregunta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:91:2: ( ( ( rule__Pregunta__Alternatives ) ) )
            // InternalCuestionario.g:92:2: ( ( rule__Pregunta__Alternatives ) )
            {
            // InternalCuestionario.g:92:2: ( ( rule__Pregunta__Alternatives ) )
            // InternalCuestionario.g:93:3: ( rule__Pregunta__Alternatives )
            {
             before(grammarAccess.getPreguntaAccess().getAlternatives()); 
            // InternalCuestionario.g:94:3: ( rule__Pregunta__Alternatives )
            // InternalCuestionario.g:94:4: rule__Pregunta__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Pregunta__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePregunta"


    // $ANTLR start "entryRuleCategoria"
    // InternalCuestionario.g:103:1: entryRuleCategoria : ruleCategoria EOF ;
    public final void entryRuleCategoria() throws RecognitionException {
        try {
            // InternalCuestionario.g:104:1: ( ruleCategoria EOF )
            // InternalCuestionario.g:105:1: ruleCategoria EOF
            {
             before(grammarAccess.getCategoriaRule()); 
            pushFollow(FOLLOW_1);
            ruleCategoria();

            state._fsp--;

             after(grammarAccess.getCategoriaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleCategoria"


    // $ANTLR start "ruleCategoria"
    // InternalCuestionario.g:112:1: ruleCategoria : ( ( rule__Categoria__Group__0 ) ) ;
    public final void ruleCategoria() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:116:2: ( ( ( rule__Categoria__Group__0 ) ) )
            // InternalCuestionario.g:117:2: ( ( rule__Categoria__Group__0 ) )
            {
            // InternalCuestionario.g:117:2: ( ( rule__Categoria__Group__0 ) )
            // InternalCuestionario.g:118:3: ( rule__Categoria__Group__0 )
            {
             before(grammarAccess.getCategoriaAccess().getGroup()); 
            // InternalCuestionario.g:119:3: ( rule__Categoria__Group__0 )
            // InternalCuestionario.g:119:4: rule__Categoria__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Categoria__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getCategoriaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleCategoria"


    // $ANTLR start "entryRuleEString"
    // InternalCuestionario.g:128:1: entryRuleEString : ruleEString EOF ;
    public final void entryRuleEString() throws RecognitionException {
        try {
            // InternalCuestionario.g:129:1: ( ruleEString EOF )
            // InternalCuestionario.g:130:1: ruleEString EOF
            {
             before(grammarAccess.getEStringRule()); 
            pushFollow(FOLLOW_1);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getEStringRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEString"


    // $ANTLR start "ruleEString"
    // InternalCuestionario.g:137:1: ruleEString : ( ( rule__EString__Alternatives ) ) ;
    public final void ruleEString() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:141:2: ( ( ( rule__EString__Alternatives ) ) )
            // InternalCuestionario.g:142:2: ( ( rule__EString__Alternatives ) )
            {
            // InternalCuestionario.g:142:2: ( ( rule__EString__Alternatives ) )
            // InternalCuestionario.g:143:3: ( rule__EString__Alternatives )
            {
             before(grammarAccess.getEStringAccess().getAlternatives()); 
            // InternalCuestionario.g:144:3: ( rule__EString__Alternatives )
            // InternalCuestionario.g:144:4: rule__EString__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__EString__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getEStringAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEString"


    // $ANTLR start "entryRuleEDouble"
    // InternalCuestionario.g:153:1: entryRuleEDouble : ruleEDouble EOF ;
    public final void entryRuleEDouble() throws RecognitionException {
        try {
            // InternalCuestionario.g:154:1: ( ruleEDouble EOF )
            // InternalCuestionario.g:155:1: ruleEDouble EOF
            {
             before(grammarAccess.getEDoubleRule()); 
            pushFollow(FOLLOW_1);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getEDoubleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleEDouble"


    // $ANTLR start "ruleEDouble"
    // InternalCuestionario.g:162:1: ruleEDouble : ( ( rule__EDouble__Group__0 ) ) ;
    public final void ruleEDouble() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:166:2: ( ( ( rule__EDouble__Group__0 ) ) )
            // InternalCuestionario.g:167:2: ( ( rule__EDouble__Group__0 ) )
            {
            // InternalCuestionario.g:167:2: ( ( rule__EDouble__Group__0 ) )
            // InternalCuestionario.g:168:3: ( rule__EDouble__Group__0 )
            {
             before(grammarAccess.getEDoubleAccess().getGroup()); 
            // InternalCuestionario.g:169:3: ( rule__EDouble__Group__0 )
            // InternalCuestionario.g:169:4: rule__EDouble__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleEDouble"


    // $ANTLR start "entryRuleRespuesta"
    // InternalCuestionario.g:178:1: entryRuleRespuesta : ruleRespuesta EOF ;
    public final void entryRuleRespuesta() throws RecognitionException {
        try {
            // InternalCuestionario.g:179:1: ( ruleRespuesta EOF )
            // InternalCuestionario.g:180:1: ruleRespuesta EOF
            {
             before(grammarAccess.getRespuestaRule()); 
            pushFollow(FOLLOW_1);
            ruleRespuesta();

            state._fsp--;

             after(grammarAccess.getRespuestaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRuleRespuesta"


    // $ANTLR start "ruleRespuesta"
    // InternalCuestionario.g:187:1: ruleRespuesta : ( ( rule__Respuesta__Group__0 ) ) ;
    public final void ruleRespuesta() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:191:2: ( ( ( rule__Respuesta__Group__0 ) ) )
            // InternalCuestionario.g:192:2: ( ( rule__Respuesta__Group__0 ) )
            {
            // InternalCuestionario.g:192:2: ( ( rule__Respuesta__Group__0 ) )
            // InternalCuestionario.g:193:3: ( rule__Respuesta__Group__0 )
            {
             before(grammarAccess.getRespuestaAccess().getGroup()); 
            // InternalCuestionario.g:194:3: ( rule__Respuesta__Group__0 )
            // InternalCuestionario.g:194:4: rule__Respuesta__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Respuesta__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getRespuestaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleRespuesta"


    // $ANTLR start "entryRulePreguntaUnica"
    // InternalCuestionario.g:203:1: entryRulePreguntaUnica : rulePreguntaUnica EOF ;
    public final void entryRulePreguntaUnica() throws RecognitionException {
        try {
            // InternalCuestionario.g:204:1: ( rulePreguntaUnica EOF )
            // InternalCuestionario.g:205:1: rulePreguntaUnica EOF
            {
             before(grammarAccess.getPreguntaUnicaRule()); 
            pushFollow(FOLLOW_1);
            rulePreguntaUnica();

            state._fsp--;

             after(grammarAccess.getPreguntaUnicaRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePreguntaUnica"


    // $ANTLR start "rulePreguntaUnica"
    // InternalCuestionario.g:212:1: rulePreguntaUnica : ( ( rule__PreguntaUnica__Group__0 ) ) ;
    public final void rulePreguntaUnica() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:216:2: ( ( ( rule__PreguntaUnica__Group__0 ) ) )
            // InternalCuestionario.g:217:2: ( ( rule__PreguntaUnica__Group__0 ) )
            {
            // InternalCuestionario.g:217:2: ( ( rule__PreguntaUnica__Group__0 ) )
            // InternalCuestionario.g:218:3: ( rule__PreguntaUnica__Group__0 )
            {
             before(grammarAccess.getPreguntaUnicaAccess().getGroup()); 
            // InternalCuestionario.g:219:3: ( rule__PreguntaUnica__Group__0 )
            // InternalCuestionario.g:219:4: rule__PreguntaUnica__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaUnicaAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePreguntaUnica"


    // $ANTLR start "entryRulePreguntaMultiple"
    // InternalCuestionario.g:228:1: entryRulePreguntaMultiple : rulePreguntaMultiple EOF ;
    public final void entryRulePreguntaMultiple() throws RecognitionException {
        try {
            // InternalCuestionario.g:229:1: ( rulePreguntaMultiple EOF )
            // InternalCuestionario.g:230:1: rulePreguntaMultiple EOF
            {
             before(grammarAccess.getPreguntaMultipleRule()); 
            pushFollow(FOLLOW_1);
            rulePreguntaMultiple();

            state._fsp--;

             after(grammarAccess.getPreguntaMultipleRule()); 
            match(input,EOF,FOLLOW_2); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "entryRulePreguntaMultiple"


    // $ANTLR start "rulePreguntaMultiple"
    // InternalCuestionario.g:237:1: rulePreguntaMultiple : ( ( rule__PreguntaMultiple__Group__0 ) ) ;
    public final void rulePreguntaMultiple() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:241:2: ( ( ( rule__PreguntaMultiple__Group__0 ) ) )
            // InternalCuestionario.g:242:2: ( ( rule__PreguntaMultiple__Group__0 ) )
            {
            // InternalCuestionario.g:242:2: ( ( rule__PreguntaMultiple__Group__0 ) )
            // InternalCuestionario.g:243:3: ( rule__PreguntaMultiple__Group__0 )
            {
             before(grammarAccess.getPreguntaMultipleAccess().getGroup()); 
            // InternalCuestionario.g:244:3: ( rule__PreguntaMultiple__Group__0 )
            // InternalCuestionario.g:244:4: rule__PreguntaMultiple__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaMultipleAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rulePreguntaMultiple"


    // $ANTLR start "rule__Pregunta__Alternatives"
    // InternalCuestionario.g:252:1: rule__Pregunta__Alternatives : ( ( rulePreguntaUnica ) | ( rulePreguntaMultiple ) );
    public final void rule__Pregunta__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:256:1: ( ( rulePreguntaUnica ) | ( rulePreguntaMultiple ) )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==30) ) {
                alt1=1;
            }
            else if ( (LA1_0==38) ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // InternalCuestionario.g:257:2: ( rulePreguntaUnica )
                    {
                    // InternalCuestionario.g:257:2: ( rulePreguntaUnica )
                    // InternalCuestionario.g:258:3: rulePreguntaUnica
                    {
                     before(grammarAccess.getPreguntaAccess().getPreguntaUnicaParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    rulePreguntaUnica();

                    state._fsp--;

                     after(grammarAccess.getPreguntaAccess().getPreguntaUnicaParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCuestionario.g:263:2: ( rulePreguntaMultiple )
                    {
                    // InternalCuestionario.g:263:2: ( rulePreguntaMultiple )
                    // InternalCuestionario.g:264:3: rulePreguntaMultiple
                    {
                     before(grammarAccess.getPreguntaAccess().getPreguntaMultipleParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    rulePreguntaMultiple();

                    state._fsp--;

                     after(grammarAccess.getPreguntaAccess().getPreguntaMultipleParserRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Pregunta__Alternatives"


    // $ANTLR start "rule__EString__Alternatives"
    // InternalCuestionario.g:273:1: rule__EString__Alternatives : ( ( RULE_STRING ) | ( RULE_ID ) );
    public final void rule__EString__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:277:1: ( ( RULE_STRING ) | ( RULE_ID ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==RULE_STRING) ) {
                alt2=1;
            }
            else if ( (LA2_0==RULE_ID) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalCuestionario.g:278:2: ( RULE_STRING )
                    {
                    // InternalCuestionario.g:278:2: ( RULE_STRING )
                    // InternalCuestionario.g:279:3: RULE_STRING
                    {
                     before(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                    match(input,RULE_STRING,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCuestionario.g:284:2: ( RULE_ID )
                    {
                    // InternalCuestionario.g:284:2: ( RULE_ID )
                    // InternalCuestionario.g:285:3: RULE_ID
                    {
                     before(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 
                    match(input,RULE_ID,FOLLOW_2); 
                     after(grammarAccess.getEStringAccess().getIDTerminalRuleCall_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EString__Alternatives"


    // $ANTLR start "rule__EDouble__Alternatives_4_0"
    // InternalCuestionario.g:294:1: rule__EDouble__Alternatives_4_0 : ( ( 'E' ) | ( 'e' ) );
    public final void rule__EDouble__Alternatives_4_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:298:1: ( ( 'E' ) | ( 'e' ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==11) ) {
                alt3=1;
            }
            else if ( (LA3_0==12) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalCuestionario.g:299:2: ( 'E' )
                    {
                    // InternalCuestionario.g:299:2: ( 'E' )
                    // InternalCuestionario.g:300:3: 'E'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalCuestionario.g:305:2: ( 'e' )
                    {
                    // InternalCuestionario.g:305:2: ( 'e' )
                    // InternalCuestionario.g:306:3: 'e'
                    {
                     before(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getEDoubleAccess().getEKeyword_4_0_1()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Alternatives_4_0"


    // $ANTLR start "rule__Cuestionario__Group__0"
    // InternalCuestionario.g:315:1: rule__Cuestionario__Group__0 : rule__Cuestionario__Group__0__Impl rule__Cuestionario__Group__1 ;
    public final void rule__Cuestionario__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:319:1: ( rule__Cuestionario__Group__0__Impl rule__Cuestionario__Group__1 )
            // InternalCuestionario.g:320:2: rule__Cuestionario__Group__0__Impl rule__Cuestionario__Group__1
            {
            pushFollow(FOLLOW_3);
            rule__Cuestionario__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__0"


    // $ANTLR start "rule__Cuestionario__Group__0__Impl"
    // InternalCuestionario.g:327:1: rule__Cuestionario__Group__0__Impl : ( 'Cuestionario' ) ;
    public final void rule__Cuestionario__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:331:1: ( ( 'Cuestionario' ) )
            // InternalCuestionario.g:332:1: ( 'Cuestionario' )
            {
            // InternalCuestionario.g:332:1: ( 'Cuestionario' )
            // InternalCuestionario.g:333:2: 'Cuestionario'
            {
             before(grammarAccess.getCuestionarioAccess().getCuestionarioKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getCuestionarioAccess().getCuestionarioKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__0__Impl"


    // $ANTLR start "rule__Cuestionario__Group__1"
    // InternalCuestionario.g:342:1: rule__Cuestionario__Group__1 : rule__Cuestionario__Group__1__Impl rule__Cuestionario__Group__2 ;
    public final void rule__Cuestionario__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:346:1: ( rule__Cuestionario__Group__1__Impl rule__Cuestionario__Group__2 )
            // InternalCuestionario.g:347:2: rule__Cuestionario__Group__1__Impl rule__Cuestionario__Group__2
            {
            pushFollow(FOLLOW_4);
            rule__Cuestionario__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__1"


    // $ANTLR start "rule__Cuestionario__Group__1__Impl"
    // InternalCuestionario.g:354:1: rule__Cuestionario__Group__1__Impl : ( '{' ) ;
    public final void rule__Cuestionario__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:358:1: ( ( '{' ) )
            // InternalCuestionario.g:359:1: ( '{' )
            {
            // InternalCuestionario.g:359:1: ( '{' )
            // InternalCuestionario.g:360:2: '{'
            {
             before(grammarAccess.getCuestionarioAccess().getLeftCurlyBracketKeyword_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCuestionarioAccess().getLeftCurlyBracketKeyword_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__1__Impl"


    // $ANTLR start "rule__Cuestionario__Group__2"
    // InternalCuestionario.g:369:1: rule__Cuestionario__Group__2 : rule__Cuestionario__Group__2__Impl rule__Cuestionario__Group__3 ;
    public final void rule__Cuestionario__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:373:1: ( rule__Cuestionario__Group__2__Impl rule__Cuestionario__Group__3 )
            // InternalCuestionario.g:374:2: rule__Cuestionario__Group__2__Impl rule__Cuestionario__Group__3
            {
            pushFollow(FOLLOW_5);
            rule__Cuestionario__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__2"


    // $ANTLR start "rule__Cuestionario__Group__2__Impl"
    // InternalCuestionario.g:381:1: rule__Cuestionario__Group__2__Impl : ( 'preguntaInicial' ) ;
    public final void rule__Cuestionario__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:385:1: ( ( 'preguntaInicial' ) )
            // InternalCuestionario.g:386:1: ( 'preguntaInicial' )
            {
            // InternalCuestionario.g:386:1: ( 'preguntaInicial' )
            // InternalCuestionario.g:387:2: 'preguntaInicial'
            {
             before(grammarAccess.getCuestionarioAccess().getPreguntaInicialKeyword_2()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getCuestionarioAccess().getPreguntaInicialKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__2__Impl"


    // $ANTLR start "rule__Cuestionario__Group__3"
    // InternalCuestionario.g:396:1: rule__Cuestionario__Group__3 : rule__Cuestionario__Group__3__Impl rule__Cuestionario__Group__4 ;
    public final void rule__Cuestionario__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:400:1: ( rule__Cuestionario__Group__3__Impl rule__Cuestionario__Group__4 )
            // InternalCuestionario.g:401:2: rule__Cuestionario__Group__3__Impl rule__Cuestionario__Group__4
            {
            pushFollow(FOLLOW_6);
            rule__Cuestionario__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__3"


    // $ANTLR start "rule__Cuestionario__Group__3__Impl"
    // InternalCuestionario.g:408:1: rule__Cuestionario__Group__3__Impl : ( ( rule__Cuestionario__PreguntaInicialAssignment_3 ) ) ;
    public final void rule__Cuestionario__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:412:1: ( ( ( rule__Cuestionario__PreguntaInicialAssignment_3 ) ) )
            // InternalCuestionario.g:413:1: ( ( rule__Cuestionario__PreguntaInicialAssignment_3 ) )
            {
            // InternalCuestionario.g:413:1: ( ( rule__Cuestionario__PreguntaInicialAssignment_3 ) )
            // InternalCuestionario.g:414:2: ( rule__Cuestionario__PreguntaInicialAssignment_3 )
            {
             before(grammarAccess.getCuestionarioAccess().getPreguntaInicialAssignment_3()); 
            // InternalCuestionario.g:415:2: ( rule__Cuestionario__PreguntaInicialAssignment_3 )
            // InternalCuestionario.g:415:3: rule__Cuestionario__PreguntaInicialAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Cuestionario__PreguntaInicialAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getCuestionarioAccess().getPreguntaInicialAssignment_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__3__Impl"


    // $ANTLR start "rule__Cuestionario__Group__4"
    // InternalCuestionario.g:423:1: rule__Cuestionario__Group__4 : rule__Cuestionario__Group__4__Impl rule__Cuestionario__Group__5 ;
    public final void rule__Cuestionario__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:427:1: ( rule__Cuestionario__Group__4__Impl rule__Cuestionario__Group__5 )
            // InternalCuestionario.g:428:2: rule__Cuestionario__Group__4__Impl rule__Cuestionario__Group__5
            {
            pushFollow(FOLLOW_7);
            rule__Cuestionario__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__4"


    // $ANTLR start "rule__Cuestionario__Group__4__Impl"
    // InternalCuestionario.g:435:1: rule__Cuestionario__Group__4__Impl : ( 'preguntasFinales' ) ;
    public final void rule__Cuestionario__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:439:1: ( ( 'preguntasFinales' ) )
            // InternalCuestionario.g:440:1: ( 'preguntasFinales' )
            {
            // InternalCuestionario.g:440:1: ( 'preguntasFinales' )
            // InternalCuestionario.g:441:2: 'preguntasFinales'
            {
             before(grammarAccess.getCuestionarioAccess().getPreguntasFinalesKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getCuestionarioAccess().getPreguntasFinalesKeyword_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__4__Impl"


    // $ANTLR start "rule__Cuestionario__Group__5"
    // InternalCuestionario.g:450:1: rule__Cuestionario__Group__5 : rule__Cuestionario__Group__5__Impl rule__Cuestionario__Group__6 ;
    public final void rule__Cuestionario__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:454:1: ( rule__Cuestionario__Group__5__Impl rule__Cuestionario__Group__6 )
            // InternalCuestionario.g:455:2: rule__Cuestionario__Group__5__Impl rule__Cuestionario__Group__6
            {
            pushFollow(FOLLOW_5);
            rule__Cuestionario__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__5"


    // $ANTLR start "rule__Cuestionario__Group__5__Impl"
    // InternalCuestionario.g:462:1: rule__Cuestionario__Group__5__Impl : ( '(' ) ;
    public final void rule__Cuestionario__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:466:1: ( ( '(' ) )
            // InternalCuestionario.g:467:1: ( '(' )
            {
            // InternalCuestionario.g:467:1: ( '(' )
            // InternalCuestionario.g:468:2: '('
            {
             before(grammarAccess.getCuestionarioAccess().getLeftParenthesisKeyword_5()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getCuestionarioAccess().getLeftParenthesisKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__5__Impl"


    // $ANTLR start "rule__Cuestionario__Group__6"
    // InternalCuestionario.g:477:1: rule__Cuestionario__Group__6 : rule__Cuestionario__Group__6__Impl rule__Cuestionario__Group__7 ;
    public final void rule__Cuestionario__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:481:1: ( rule__Cuestionario__Group__6__Impl rule__Cuestionario__Group__7 )
            // InternalCuestionario.g:482:2: rule__Cuestionario__Group__6__Impl rule__Cuestionario__Group__7
            {
            pushFollow(FOLLOW_8);
            rule__Cuestionario__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__6"


    // $ANTLR start "rule__Cuestionario__Group__6__Impl"
    // InternalCuestionario.g:489:1: rule__Cuestionario__Group__6__Impl : ( ( rule__Cuestionario__PreguntasFinalesAssignment_6 ) ) ;
    public final void rule__Cuestionario__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:493:1: ( ( ( rule__Cuestionario__PreguntasFinalesAssignment_6 ) ) )
            // InternalCuestionario.g:494:1: ( ( rule__Cuestionario__PreguntasFinalesAssignment_6 ) )
            {
            // InternalCuestionario.g:494:1: ( ( rule__Cuestionario__PreguntasFinalesAssignment_6 ) )
            // InternalCuestionario.g:495:2: ( rule__Cuestionario__PreguntasFinalesAssignment_6 )
            {
             before(grammarAccess.getCuestionarioAccess().getPreguntasFinalesAssignment_6()); 
            // InternalCuestionario.g:496:2: ( rule__Cuestionario__PreguntasFinalesAssignment_6 )
            // InternalCuestionario.g:496:3: rule__Cuestionario__PreguntasFinalesAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__Cuestionario__PreguntasFinalesAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getCuestionarioAccess().getPreguntasFinalesAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__6__Impl"


    // $ANTLR start "rule__Cuestionario__Group__7"
    // InternalCuestionario.g:504:1: rule__Cuestionario__Group__7 : rule__Cuestionario__Group__7__Impl rule__Cuestionario__Group__8 ;
    public final void rule__Cuestionario__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:508:1: ( rule__Cuestionario__Group__7__Impl rule__Cuestionario__Group__8 )
            // InternalCuestionario.g:509:2: rule__Cuestionario__Group__7__Impl rule__Cuestionario__Group__8
            {
            pushFollow(FOLLOW_8);
            rule__Cuestionario__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__7"


    // $ANTLR start "rule__Cuestionario__Group__7__Impl"
    // InternalCuestionario.g:516:1: rule__Cuestionario__Group__7__Impl : ( ( rule__Cuestionario__Group_7__0 )* ) ;
    public final void rule__Cuestionario__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:520:1: ( ( ( rule__Cuestionario__Group_7__0 )* ) )
            // InternalCuestionario.g:521:1: ( ( rule__Cuestionario__Group_7__0 )* )
            {
            // InternalCuestionario.g:521:1: ( ( rule__Cuestionario__Group_7__0 )* )
            // InternalCuestionario.g:522:2: ( rule__Cuestionario__Group_7__0 )*
            {
             before(grammarAccess.getCuestionarioAccess().getGroup_7()); 
            // InternalCuestionario.g:523:2: ( rule__Cuestionario__Group_7__0 )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==22) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // InternalCuestionario.g:523:3: rule__Cuestionario__Group_7__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Cuestionario__Group_7__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

             after(grammarAccess.getCuestionarioAccess().getGroup_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__7__Impl"


    // $ANTLR start "rule__Cuestionario__Group__8"
    // InternalCuestionario.g:531:1: rule__Cuestionario__Group__8 : rule__Cuestionario__Group__8__Impl rule__Cuestionario__Group__9 ;
    public final void rule__Cuestionario__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:535:1: ( rule__Cuestionario__Group__8__Impl rule__Cuestionario__Group__9 )
            // InternalCuestionario.g:536:2: rule__Cuestionario__Group__8__Impl rule__Cuestionario__Group__9
            {
            pushFollow(FOLLOW_10);
            rule__Cuestionario__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__8"


    // $ANTLR start "rule__Cuestionario__Group__8__Impl"
    // InternalCuestionario.g:543:1: rule__Cuestionario__Group__8__Impl : ( ')' ) ;
    public final void rule__Cuestionario__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:547:1: ( ( ')' ) )
            // InternalCuestionario.g:548:1: ( ')' )
            {
            // InternalCuestionario.g:548:1: ( ')' )
            // InternalCuestionario.g:549:2: ')'
            {
             before(grammarAccess.getCuestionarioAccess().getRightParenthesisKeyword_8()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getCuestionarioAccess().getRightParenthesisKeyword_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__8__Impl"


    // $ANTLR start "rule__Cuestionario__Group__9"
    // InternalCuestionario.g:558:1: rule__Cuestionario__Group__9 : rule__Cuestionario__Group__9__Impl rule__Cuestionario__Group__10 ;
    public final void rule__Cuestionario__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:562:1: ( rule__Cuestionario__Group__9__Impl rule__Cuestionario__Group__10 )
            // InternalCuestionario.g:563:2: rule__Cuestionario__Group__9__Impl rule__Cuestionario__Group__10
            {
            pushFollow(FOLLOW_3);
            rule__Cuestionario__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__9"


    // $ANTLR start "rule__Cuestionario__Group__9__Impl"
    // InternalCuestionario.g:570:1: rule__Cuestionario__Group__9__Impl : ( 'preguntas' ) ;
    public final void rule__Cuestionario__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:574:1: ( ( 'preguntas' ) )
            // InternalCuestionario.g:575:1: ( 'preguntas' )
            {
            // InternalCuestionario.g:575:1: ( 'preguntas' )
            // InternalCuestionario.g:576:2: 'preguntas'
            {
             before(grammarAccess.getCuestionarioAccess().getPreguntasKeyword_9()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getCuestionarioAccess().getPreguntasKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__9__Impl"


    // $ANTLR start "rule__Cuestionario__Group__10"
    // InternalCuestionario.g:585:1: rule__Cuestionario__Group__10 : rule__Cuestionario__Group__10__Impl rule__Cuestionario__Group__11 ;
    public final void rule__Cuestionario__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:589:1: ( rule__Cuestionario__Group__10__Impl rule__Cuestionario__Group__11 )
            // InternalCuestionario.g:590:2: rule__Cuestionario__Group__10__Impl rule__Cuestionario__Group__11
            {
            pushFollow(FOLLOW_11);
            rule__Cuestionario__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__10"


    // $ANTLR start "rule__Cuestionario__Group__10__Impl"
    // InternalCuestionario.g:597:1: rule__Cuestionario__Group__10__Impl : ( '{' ) ;
    public final void rule__Cuestionario__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:601:1: ( ( '{' ) )
            // InternalCuestionario.g:602:1: ( '{' )
            {
            // InternalCuestionario.g:602:1: ( '{' )
            // InternalCuestionario.g:603:2: '{'
            {
             before(grammarAccess.getCuestionarioAccess().getLeftCurlyBracketKeyword_10()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCuestionarioAccess().getLeftCurlyBracketKeyword_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__10__Impl"


    // $ANTLR start "rule__Cuestionario__Group__11"
    // InternalCuestionario.g:612:1: rule__Cuestionario__Group__11 : rule__Cuestionario__Group__11__Impl rule__Cuestionario__Group__12 ;
    public final void rule__Cuestionario__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:616:1: ( rule__Cuestionario__Group__11__Impl rule__Cuestionario__Group__12 )
            // InternalCuestionario.g:617:2: rule__Cuestionario__Group__11__Impl rule__Cuestionario__Group__12
            {
            pushFollow(FOLLOW_12);
            rule__Cuestionario__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__11"


    // $ANTLR start "rule__Cuestionario__Group__11__Impl"
    // InternalCuestionario.g:624:1: rule__Cuestionario__Group__11__Impl : ( ( rule__Cuestionario__PreguntasAssignment_11 ) ) ;
    public final void rule__Cuestionario__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:628:1: ( ( ( rule__Cuestionario__PreguntasAssignment_11 ) ) )
            // InternalCuestionario.g:629:1: ( ( rule__Cuestionario__PreguntasAssignment_11 ) )
            {
            // InternalCuestionario.g:629:1: ( ( rule__Cuestionario__PreguntasAssignment_11 ) )
            // InternalCuestionario.g:630:2: ( rule__Cuestionario__PreguntasAssignment_11 )
            {
             before(grammarAccess.getCuestionarioAccess().getPreguntasAssignment_11()); 
            // InternalCuestionario.g:631:2: ( rule__Cuestionario__PreguntasAssignment_11 )
            // InternalCuestionario.g:631:3: rule__Cuestionario__PreguntasAssignment_11
            {
            pushFollow(FOLLOW_2);
            rule__Cuestionario__PreguntasAssignment_11();

            state._fsp--;


            }

             after(grammarAccess.getCuestionarioAccess().getPreguntasAssignment_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__11__Impl"


    // $ANTLR start "rule__Cuestionario__Group__12"
    // InternalCuestionario.g:639:1: rule__Cuestionario__Group__12 : rule__Cuestionario__Group__12__Impl rule__Cuestionario__Group__13 ;
    public final void rule__Cuestionario__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:643:1: ( rule__Cuestionario__Group__12__Impl rule__Cuestionario__Group__13 )
            // InternalCuestionario.g:644:2: rule__Cuestionario__Group__12__Impl rule__Cuestionario__Group__13
            {
            pushFollow(FOLLOW_12);
            rule__Cuestionario__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__12"


    // $ANTLR start "rule__Cuestionario__Group__12__Impl"
    // InternalCuestionario.g:651:1: rule__Cuestionario__Group__12__Impl : ( ( rule__Cuestionario__Group_12__0 )* ) ;
    public final void rule__Cuestionario__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:655:1: ( ( ( rule__Cuestionario__Group_12__0 )* ) )
            // InternalCuestionario.g:656:1: ( ( rule__Cuestionario__Group_12__0 )* )
            {
            // InternalCuestionario.g:656:1: ( ( rule__Cuestionario__Group_12__0 )* )
            // InternalCuestionario.g:657:2: ( rule__Cuestionario__Group_12__0 )*
            {
             before(grammarAccess.getCuestionarioAccess().getGroup_12()); 
            // InternalCuestionario.g:658:2: ( rule__Cuestionario__Group_12__0 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==22) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // InternalCuestionario.g:658:3: rule__Cuestionario__Group_12__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Cuestionario__Group_12__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getCuestionarioAccess().getGroup_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__12__Impl"


    // $ANTLR start "rule__Cuestionario__Group__13"
    // InternalCuestionario.g:666:1: rule__Cuestionario__Group__13 : rule__Cuestionario__Group__13__Impl rule__Cuestionario__Group__14 ;
    public final void rule__Cuestionario__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:670:1: ( rule__Cuestionario__Group__13__Impl rule__Cuestionario__Group__14 )
            // InternalCuestionario.g:671:2: rule__Cuestionario__Group__13__Impl rule__Cuestionario__Group__14
            {
            pushFollow(FOLLOW_13);
            rule__Cuestionario__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__13"


    // $ANTLR start "rule__Cuestionario__Group__13__Impl"
    // InternalCuestionario.g:678:1: rule__Cuestionario__Group__13__Impl : ( '}' ) ;
    public final void rule__Cuestionario__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:682:1: ( ( '}' ) )
            // InternalCuestionario.g:683:1: ( '}' )
            {
            // InternalCuestionario.g:683:1: ( '}' )
            // InternalCuestionario.g:684:2: '}'
            {
             before(grammarAccess.getCuestionarioAccess().getRightCurlyBracketKeyword_13()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCuestionarioAccess().getRightCurlyBracketKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__13__Impl"


    // $ANTLR start "rule__Cuestionario__Group__14"
    // InternalCuestionario.g:693:1: rule__Cuestionario__Group__14 : rule__Cuestionario__Group__14__Impl rule__Cuestionario__Group__15 ;
    public final void rule__Cuestionario__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:697:1: ( rule__Cuestionario__Group__14__Impl rule__Cuestionario__Group__15 )
            // InternalCuestionario.g:698:2: rule__Cuestionario__Group__14__Impl rule__Cuestionario__Group__15
            {
            pushFollow(FOLLOW_3);
            rule__Cuestionario__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__14"


    // $ANTLR start "rule__Cuestionario__Group__14__Impl"
    // InternalCuestionario.g:705:1: rule__Cuestionario__Group__14__Impl : ( 'categorias' ) ;
    public final void rule__Cuestionario__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:709:1: ( ( 'categorias' ) )
            // InternalCuestionario.g:710:1: ( 'categorias' )
            {
            // InternalCuestionario.g:710:1: ( 'categorias' )
            // InternalCuestionario.g:711:2: 'categorias'
            {
             before(grammarAccess.getCuestionarioAccess().getCategoriasKeyword_14()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getCuestionarioAccess().getCategoriasKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__14__Impl"


    // $ANTLR start "rule__Cuestionario__Group__15"
    // InternalCuestionario.g:720:1: rule__Cuestionario__Group__15 : rule__Cuestionario__Group__15__Impl rule__Cuestionario__Group__16 ;
    public final void rule__Cuestionario__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:724:1: ( rule__Cuestionario__Group__15__Impl rule__Cuestionario__Group__16 )
            // InternalCuestionario.g:725:2: rule__Cuestionario__Group__15__Impl rule__Cuestionario__Group__16
            {
            pushFollow(FOLLOW_14);
            rule__Cuestionario__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__15"


    // $ANTLR start "rule__Cuestionario__Group__15__Impl"
    // InternalCuestionario.g:732:1: rule__Cuestionario__Group__15__Impl : ( '{' ) ;
    public final void rule__Cuestionario__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:736:1: ( ( '{' ) )
            // InternalCuestionario.g:737:1: ( '{' )
            {
            // InternalCuestionario.g:737:1: ( '{' )
            // InternalCuestionario.g:738:2: '{'
            {
             before(grammarAccess.getCuestionarioAccess().getLeftCurlyBracketKeyword_15()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCuestionarioAccess().getLeftCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__15__Impl"


    // $ANTLR start "rule__Cuestionario__Group__16"
    // InternalCuestionario.g:747:1: rule__Cuestionario__Group__16 : rule__Cuestionario__Group__16__Impl rule__Cuestionario__Group__17 ;
    public final void rule__Cuestionario__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:751:1: ( rule__Cuestionario__Group__16__Impl rule__Cuestionario__Group__17 )
            // InternalCuestionario.g:752:2: rule__Cuestionario__Group__16__Impl rule__Cuestionario__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__Cuestionario__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__16"


    // $ANTLR start "rule__Cuestionario__Group__16__Impl"
    // InternalCuestionario.g:759:1: rule__Cuestionario__Group__16__Impl : ( ( rule__Cuestionario__CategoriasAssignment_16 ) ) ;
    public final void rule__Cuestionario__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:763:1: ( ( ( rule__Cuestionario__CategoriasAssignment_16 ) ) )
            // InternalCuestionario.g:764:1: ( ( rule__Cuestionario__CategoriasAssignment_16 ) )
            {
            // InternalCuestionario.g:764:1: ( ( rule__Cuestionario__CategoriasAssignment_16 ) )
            // InternalCuestionario.g:765:2: ( rule__Cuestionario__CategoriasAssignment_16 )
            {
             before(grammarAccess.getCuestionarioAccess().getCategoriasAssignment_16()); 
            // InternalCuestionario.g:766:2: ( rule__Cuestionario__CategoriasAssignment_16 )
            // InternalCuestionario.g:766:3: rule__Cuestionario__CategoriasAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__Cuestionario__CategoriasAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getCuestionarioAccess().getCategoriasAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__16__Impl"


    // $ANTLR start "rule__Cuestionario__Group__17"
    // InternalCuestionario.g:774:1: rule__Cuestionario__Group__17 : rule__Cuestionario__Group__17__Impl rule__Cuestionario__Group__18 ;
    public final void rule__Cuestionario__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:778:1: ( rule__Cuestionario__Group__17__Impl rule__Cuestionario__Group__18 )
            // InternalCuestionario.g:779:2: rule__Cuestionario__Group__17__Impl rule__Cuestionario__Group__18
            {
            pushFollow(FOLLOW_12);
            rule__Cuestionario__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__17"


    // $ANTLR start "rule__Cuestionario__Group__17__Impl"
    // InternalCuestionario.g:786:1: rule__Cuestionario__Group__17__Impl : ( ( rule__Cuestionario__Group_17__0 )* ) ;
    public final void rule__Cuestionario__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:790:1: ( ( ( rule__Cuestionario__Group_17__0 )* ) )
            // InternalCuestionario.g:791:1: ( ( rule__Cuestionario__Group_17__0 )* )
            {
            // InternalCuestionario.g:791:1: ( ( rule__Cuestionario__Group_17__0 )* )
            // InternalCuestionario.g:792:2: ( rule__Cuestionario__Group_17__0 )*
            {
             before(grammarAccess.getCuestionarioAccess().getGroup_17()); 
            // InternalCuestionario.g:793:2: ( rule__Cuestionario__Group_17__0 )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0==22) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // InternalCuestionario.g:793:3: rule__Cuestionario__Group_17__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Cuestionario__Group_17__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop6;
                }
            } while (true);

             after(grammarAccess.getCuestionarioAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__17__Impl"


    // $ANTLR start "rule__Cuestionario__Group__18"
    // InternalCuestionario.g:801:1: rule__Cuestionario__Group__18 : rule__Cuestionario__Group__18__Impl rule__Cuestionario__Group__19 ;
    public final void rule__Cuestionario__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:805:1: ( rule__Cuestionario__Group__18__Impl rule__Cuestionario__Group__19 )
            // InternalCuestionario.g:806:2: rule__Cuestionario__Group__18__Impl rule__Cuestionario__Group__19
            {
            pushFollow(FOLLOW_15);
            rule__Cuestionario__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__18"


    // $ANTLR start "rule__Cuestionario__Group__18__Impl"
    // InternalCuestionario.g:813:1: rule__Cuestionario__Group__18__Impl : ( '}' ) ;
    public final void rule__Cuestionario__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:817:1: ( ( '}' ) )
            // InternalCuestionario.g:818:1: ( '}' )
            {
            // InternalCuestionario.g:818:1: ( '}' )
            // InternalCuestionario.g:819:2: '}'
            {
             before(grammarAccess.getCuestionarioAccess().getRightCurlyBracketKeyword_18()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCuestionarioAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__18__Impl"


    // $ANTLR start "rule__Cuestionario__Group__19"
    // InternalCuestionario.g:828:1: rule__Cuestionario__Group__19 : rule__Cuestionario__Group__19__Impl ;
    public final void rule__Cuestionario__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:832:1: ( rule__Cuestionario__Group__19__Impl )
            // InternalCuestionario.g:833:2: rule__Cuestionario__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__19"


    // $ANTLR start "rule__Cuestionario__Group__19__Impl"
    // InternalCuestionario.g:839:1: rule__Cuestionario__Group__19__Impl : ( '}' ) ;
    public final void rule__Cuestionario__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:843:1: ( ( '}' ) )
            // InternalCuestionario.g:844:1: ( '}' )
            {
            // InternalCuestionario.g:844:1: ( '}' )
            // InternalCuestionario.g:845:2: '}'
            {
             before(grammarAccess.getCuestionarioAccess().getRightCurlyBracketKeyword_19()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCuestionarioAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group__19__Impl"


    // $ANTLR start "rule__Cuestionario__Group_7__0"
    // InternalCuestionario.g:855:1: rule__Cuestionario__Group_7__0 : rule__Cuestionario__Group_7__0__Impl rule__Cuestionario__Group_7__1 ;
    public final void rule__Cuestionario__Group_7__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:859:1: ( rule__Cuestionario__Group_7__0__Impl rule__Cuestionario__Group_7__1 )
            // InternalCuestionario.g:860:2: rule__Cuestionario__Group_7__0__Impl rule__Cuestionario__Group_7__1
            {
            pushFollow(FOLLOW_5);
            rule__Cuestionario__Group_7__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group_7__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group_7__0"


    // $ANTLR start "rule__Cuestionario__Group_7__0__Impl"
    // InternalCuestionario.g:867:1: rule__Cuestionario__Group_7__0__Impl : ( ',' ) ;
    public final void rule__Cuestionario__Group_7__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:871:1: ( ( ',' ) )
            // InternalCuestionario.g:872:1: ( ',' )
            {
            // InternalCuestionario.g:872:1: ( ',' )
            // InternalCuestionario.g:873:2: ','
            {
             before(grammarAccess.getCuestionarioAccess().getCommaKeyword_7_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCuestionarioAccess().getCommaKeyword_7_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group_7__0__Impl"


    // $ANTLR start "rule__Cuestionario__Group_7__1"
    // InternalCuestionario.g:882:1: rule__Cuestionario__Group_7__1 : rule__Cuestionario__Group_7__1__Impl ;
    public final void rule__Cuestionario__Group_7__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:886:1: ( rule__Cuestionario__Group_7__1__Impl )
            // InternalCuestionario.g:887:2: rule__Cuestionario__Group_7__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group_7__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group_7__1"


    // $ANTLR start "rule__Cuestionario__Group_7__1__Impl"
    // InternalCuestionario.g:893:1: rule__Cuestionario__Group_7__1__Impl : ( ( rule__Cuestionario__PreguntasFinalesAssignment_7_1 ) ) ;
    public final void rule__Cuestionario__Group_7__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:897:1: ( ( ( rule__Cuestionario__PreguntasFinalesAssignment_7_1 ) ) )
            // InternalCuestionario.g:898:1: ( ( rule__Cuestionario__PreguntasFinalesAssignment_7_1 ) )
            {
            // InternalCuestionario.g:898:1: ( ( rule__Cuestionario__PreguntasFinalesAssignment_7_1 ) )
            // InternalCuestionario.g:899:2: ( rule__Cuestionario__PreguntasFinalesAssignment_7_1 )
            {
             before(grammarAccess.getCuestionarioAccess().getPreguntasFinalesAssignment_7_1()); 
            // InternalCuestionario.g:900:2: ( rule__Cuestionario__PreguntasFinalesAssignment_7_1 )
            // InternalCuestionario.g:900:3: rule__Cuestionario__PreguntasFinalesAssignment_7_1
            {
            pushFollow(FOLLOW_2);
            rule__Cuestionario__PreguntasFinalesAssignment_7_1();

            state._fsp--;


            }

             after(grammarAccess.getCuestionarioAccess().getPreguntasFinalesAssignment_7_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group_7__1__Impl"


    // $ANTLR start "rule__Cuestionario__Group_12__0"
    // InternalCuestionario.g:909:1: rule__Cuestionario__Group_12__0 : rule__Cuestionario__Group_12__0__Impl rule__Cuestionario__Group_12__1 ;
    public final void rule__Cuestionario__Group_12__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:913:1: ( rule__Cuestionario__Group_12__0__Impl rule__Cuestionario__Group_12__1 )
            // InternalCuestionario.g:914:2: rule__Cuestionario__Group_12__0__Impl rule__Cuestionario__Group_12__1
            {
            pushFollow(FOLLOW_11);
            rule__Cuestionario__Group_12__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group_12__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group_12__0"


    // $ANTLR start "rule__Cuestionario__Group_12__0__Impl"
    // InternalCuestionario.g:921:1: rule__Cuestionario__Group_12__0__Impl : ( ',' ) ;
    public final void rule__Cuestionario__Group_12__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:925:1: ( ( ',' ) )
            // InternalCuestionario.g:926:1: ( ',' )
            {
            // InternalCuestionario.g:926:1: ( ',' )
            // InternalCuestionario.g:927:2: ','
            {
             before(grammarAccess.getCuestionarioAccess().getCommaKeyword_12_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCuestionarioAccess().getCommaKeyword_12_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group_12__0__Impl"


    // $ANTLR start "rule__Cuestionario__Group_12__1"
    // InternalCuestionario.g:936:1: rule__Cuestionario__Group_12__1 : rule__Cuestionario__Group_12__1__Impl ;
    public final void rule__Cuestionario__Group_12__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:940:1: ( rule__Cuestionario__Group_12__1__Impl )
            // InternalCuestionario.g:941:2: rule__Cuestionario__Group_12__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group_12__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group_12__1"


    // $ANTLR start "rule__Cuestionario__Group_12__1__Impl"
    // InternalCuestionario.g:947:1: rule__Cuestionario__Group_12__1__Impl : ( ( rule__Cuestionario__PreguntasAssignment_12_1 ) ) ;
    public final void rule__Cuestionario__Group_12__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:951:1: ( ( ( rule__Cuestionario__PreguntasAssignment_12_1 ) ) )
            // InternalCuestionario.g:952:1: ( ( rule__Cuestionario__PreguntasAssignment_12_1 ) )
            {
            // InternalCuestionario.g:952:1: ( ( rule__Cuestionario__PreguntasAssignment_12_1 ) )
            // InternalCuestionario.g:953:2: ( rule__Cuestionario__PreguntasAssignment_12_1 )
            {
             before(grammarAccess.getCuestionarioAccess().getPreguntasAssignment_12_1()); 
            // InternalCuestionario.g:954:2: ( rule__Cuestionario__PreguntasAssignment_12_1 )
            // InternalCuestionario.g:954:3: rule__Cuestionario__PreguntasAssignment_12_1
            {
            pushFollow(FOLLOW_2);
            rule__Cuestionario__PreguntasAssignment_12_1();

            state._fsp--;


            }

             after(grammarAccess.getCuestionarioAccess().getPreguntasAssignment_12_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group_12__1__Impl"


    // $ANTLR start "rule__Cuestionario__Group_17__0"
    // InternalCuestionario.g:963:1: rule__Cuestionario__Group_17__0 : rule__Cuestionario__Group_17__0__Impl rule__Cuestionario__Group_17__1 ;
    public final void rule__Cuestionario__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:967:1: ( rule__Cuestionario__Group_17__0__Impl rule__Cuestionario__Group_17__1 )
            // InternalCuestionario.g:968:2: rule__Cuestionario__Group_17__0__Impl rule__Cuestionario__Group_17__1
            {
            pushFollow(FOLLOW_14);
            rule__Cuestionario__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group_17__0"


    // $ANTLR start "rule__Cuestionario__Group_17__0__Impl"
    // InternalCuestionario.g:975:1: rule__Cuestionario__Group_17__0__Impl : ( ',' ) ;
    public final void rule__Cuestionario__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:979:1: ( ( ',' ) )
            // InternalCuestionario.g:980:1: ( ',' )
            {
            // InternalCuestionario.g:980:1: ( ',' )
            // InternalCuestionario.g:981:2: ','
            {
             before(grammarAccess.getCuestionarioAccess().getCommaKeyword_17_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCuestionarioAccess().getCommaKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group_17__0__Impl"


    // $ANTLR start "rule__Cuestionario__Group_17__1"
    // InternalCuestionario.g:990:1: rule__Cuestionario__Group_17__1 : rule__Cuestionario__Group_17__1__Impl ;
    public final void rule__Cuestionario__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:994:1: ( rule__Cuestionario__Group_17__1__Impl )
            // InternalCuestionario.g:995:2: rule__Cuestionario__Group_17__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Cuestionario__Group_17__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group_17__1"


    // $ANTLR start "rule__Cuestionario__Group_17__1__Impl"
    // InternalCuestionario.g:1001:1: rule__Cuestionario__Group_17__1__Impl : ( ( rule__Cuestionario__CategoriasAssignment_17_1 ) ) ;
    public final void rule__Cuestionario__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1005:1: ( ( ( rule__Cuestionario__CategoriasAssignment_17_1 ) ) )
            // InternalCuestionario.g:1006:1: ( ( rule__Cuestionario__CategoriasAssignment_17_1 ) )
            {
            // InternalCuestionario.g:1006:1: ( ( rule__Cuestionario__CategoriasAssignment_17_1 ) )
            // InternalCuestionario.g:1007:2: ( rule__Cuestionario__CategoriasAssignment_17_1 )
            {
             before(grammarAccess.getCuestionarioAccess().getCategoriasAssignment_17_1()); 
            // InternalCuestionario.g:1008:2: ( rule__Cuestionario__CategoriasAssignment_17_1 )
            // InternalCuestionario.g:1008:3: rule__Cuestionario__CategoriasAssignment_17_1
            {
            pushFollow(FOLLOW_2);
            rule__Cuestionario__CategoriasAssignment_17_1();

            state._fsp--;


            }

             after(grammarAccess.getCuestionarioAccess().getCategoriasAssignment_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__Group_17__1__Impl"


    // $ANTLR start "rule__Categoria__Group__0"
    // InternalCuestionario.g:1017:1: rule__Categoria__Group__0 : rule__Categoria__Group__0__Impl rule__Categoria__Group__1 ;
    public final void rule__Categoria__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1021:1: ( rule__Categoria__Group__0__Impl rule__Categoria__Group__1 )
            // InternalCuestionario.g:1022:2: rule__Categoria__Group__0__Impl rule__Categoria__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Categoria__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Categoria__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__0"


    // $ANTLR start "rule__Categoria__Group__0__Impl"
    // InternalCuestionario.g:1029:1: rule__Categoria__Group__0__Impl : ( 'Categoria' ) ;
    public final void rule__Categoria__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1033:1: ( ( 'Categoria' ) )
            // InternalCuestionario.g:1034:1: ( 'Categoria' )
            {
            // InternalCuestionario.g:1034:1: ( 'Categoria' )
            // InternalCuestionario.g:1035:2: 'Categoria'
            {
             before(grammarAccess.getCategoriaAccess().getCategoriaKeyword_0()); 
            match(input,23,FOLLOW_2); 
             after(grammarAccess.getCategoriaAccess().getCategoriaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__0__Impl"


    // $ANTLR start "rule__Categoria__Group__1"
    // InternalCuestionario.g:1044:1: rule__Categoria__Group__1 : rule__Categoria__Group__1__Impl rule__Categoria__Group__2 ;
    public final void rule__Categoria__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1048:1: ( rule__Categoria__Group__1__Impl rule__Categoria__Group__2 )
            // InternalCuestionario.g:1049:2: rule__Categoria__Group__1__Impl rule__Categoria__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Categoria__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Categoria__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__1"


    // $ANTLR start "rule__Categoria__Group__1__Impl"
    // InternalCuestionario.g:1056:1: rule__Categoria__Group__1__Impl : ( ( rule__Categoria__NameAssignment_1 ) ) ;
    public final void rule__Categoria__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1060:1: ( ( ( rule__Categoria__NameAssignment_1 ) ) )
            // InternalCuestionario.g:1061:1: ( ( rule__Categoria__NameAssignment_1 ) )
            {
            // InternalCuestionario.g:1061:1: ( ( rule__Categoria__NameAssignment_1 ) )
            // InternalCuestionario.g:1062:2: ( rule__Categoria__NameAssignment_1 )
            {
             before(grammarAccess.getCategoriaAccess().getNameAssignment_1()); 
            // InternalCuestionario.g:1063:2: ( rule__Categoria__NameAssignment_1 )
            // InternalCuestionario.g:1063:3: rule__Categoria__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Categoria__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoriaAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__1__Impl"


    // $ANTLR start "rule__Categoria__Group__2"
    // InternalCuestionario.g:1071:1: rule__Categoria__Group__2 : rule__Categoria__Group__2__Impl rule__Categoria__Group__3 ;
    public final void rule__Categoria__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1075:1: ( rule__Categoria__Group__2__Impl rule__Categoria__Group__3 )
            // InternalCuestionario.g:1076:2: rule__Categoria__Group__2__Impl rule__Categoria__Group__3
            {
            pushFollow(FOLLOW_16);
            rule__Categoria__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Categoria__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__2"


    // $ANTLR start "rule__Categoria__Group__2__Impl"
    // InternalCuestionario.g:1083:1: rule__Categoria__Group__2__Impl : ( '{' ) ;
    public final void rule__Categoria__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1087:1: ( ( '{' ) )
            // InternalCuestionario.g:1088:1: ( '{' )
            {
            // InternalCuestionario.g:1088:1: ( '{' )
            // InternalCuestionario.g:1089:2: '{'
            {
             before(grammarAccess.getCategoriaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCategoriaAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__2__Impl"


    // $ANTLR start "rule__Categoria__Group__3"
    // InternalCuestionario.g:1098:1: rule__Categoria__Group__3 : rule__Categoria__Group__3__Impl rule__Categoria__Group__4 ;
    public final void rule__Categoria__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1102:1: ( rule__Categoria__Group__3__Impl rule__Categoria__Group__4 )
            // InternalCuestionario.g:1103:2: rule__Categoria__Group__3__Impl rule__Categoria__Group__4
            {
            pushFollow(FOLLOW_17);
            rule__Categoria__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Categoria__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__3"


    // $ANTLR start "rule__Categoria__Group__3__Impl"
    // InternalCuestionario.g:1110:1: rule__Categoria__Group__3__Impl : ( 'dificultad' ) ;
    public final void rule__Categoria__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1114:1: ( ( 'dificultad' ) )
            // InternalCuestionario.g:1115:1: ( 'dificultad' )
            {
            // InternalCuestionario.g:1115:1: ( 'dificultad' )
            // InternalCuestionario.g:1116:2: 'dificultad'
            {
             before(grammarAccess.getCategoriaAccess().getDificultadKeyword_3()); 
            match(input,24,FOLLOW_2); 
             after(grammarAccess.getCategoriaAccess().getDificultadKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__3__Impl"


    // $ANTLR start "rule__Categoria__Group__4"
    // InternalCuestionario.g:1125:1: rule__Categoria__Group__4 : rule__Categoria__Group__4__Impl rule__Categoria__Group__5 ;
    public final void rule__Categoria__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1129:1: ( rule__Categoria__Group__4__Impl rule__Categoria__Group__5 )
            // InternalCuestionario.g:1130:2: rule__Categoria__Group__4__Impl rule__Categoria__Group__5
            {
            pushFollow(FOLLOW_18);
            rule__Categoria__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Categoria__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__4"


    // $ANTLR start "rule__Categoria__Group__4__Impl"
    // InternalCuestionario.g:1137:1: rule__Categoria__Group__4__Impl : ( ( rule__Categoria__DificultadAssignment_4 ) ) ;
    public final void rule__Categoria__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1141:1: ( ( ( rule__Categoria__DificultadAssignment_4 ) ) )
            // InternalCuestionario.g:1142:1: ( ( rule__Categoria__DificultadAssignment_4 ) )
            {
            // InternalCuestionario.g:1142:1: ( ( rule__Categoria__DificultadAssignment_4 ) )
            // InternalCuestionario.g:1143:2: ( rule__Categoria__DificultadAssignment_4 )
            {
             before(grammarAccess.getCategoriaAccess().getDificultadAssignment_4()); 
            // InternalCuestionario.g:1144:2: ( rule__Categoria__DificultadAssignment_4 )
            // InternalCuestionario.g:1144:3: rule__Categoria__DificultadAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Categoria__DificultadAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getCategoriaAccess().getDificultadAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__4__Impl"


    // $ANTLR start "rule__Categoria__Group__5"
    // InternalCuestionario.g:1152:1: rule__Categoria__Group__5 : rule__Categoria__Group__5__Impl rule__Categoria__Group__6 ;
    public final void rule__Categoria__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1156:1: ( rule__Categoria__Group__5__Impl rule__Categoria__Group__6 )
            // InternalCuestionario.g:1157:2: rule__Categoria__Group__5__Impl rule__Categoria__Group__6
            {
            pushFollow(FOLLOW_18);
            rule__Categoria__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Categoria__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__5"


    // $ANTLR start "rule__Categoria__Group__5__Impl"
    // InternalCuestionario.g:1164:1: rule__Categoria__Group__5__Impl : ( ( rule__Categoria__Group_5__0 )? ) ;
    public final void rule__Categoria__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1168:1: ( ( ( rule__Categoria__Group_5__0 )? ) )
            // InternalCuestionario.g:1169:1: ( ( rule__Categoria__Group_5__0 )? )
            {
            // InternalCuestionario.g:1169:1: ( ( rule__Categoria__Group_5__0 )? )
            // InternalCuestionario.g:1170:2: ( rule__Categoria__Group_5__0 )?
            {
             before(grammarAccess.getCategoriaAccess().getGroup_5()); 
            // InternalCuestionario.g:1171:2: ( rule__Categoria__Group_5__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // InternalCuestionario.g:1171:3: rule__Categoria__Group_5__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Categoria__Group_5__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getCategoriaAccess().getGroup_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__5__Impl"


    // $ANTLR start "rule__Categoria__Group__6"
    // InternalCuestionario.g:1179:1: rule__Categoria__Group__6 : rule__Categoria__Group__6__Impl ;
    public final void rule__Categoria__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1183:1: ( rule__Categoria__Group__6__Impl )
            // InternalCuestionario.g:1184:2: rule__Categoria__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Categoria__Group__6__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__6"


    // $ANTLR start "rule__Categoria__Group__6__Impl"
    // InternalCuestionario.g:1190:1: rule__Categoria__Group__6__Impl : ( '}' ) ;
    public final void rule__Categoria__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1194:1: ( ( '}' ) )
            // InternalCuestionario.g:1195:1: ( '}' )
            {
            // InternalCuestionario.g:1195:1: ( '}' )
            // InternalCuestionario.g:1196:2: '}'
            {
             before(grammarAccess.getCategoriaAccess().getRightCurlyBracketKeyword_6()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCategoriaAccess().getRightCurlyBracketKeyword_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group__6__Impl"


    // $ANTLR start "rule__Categoria__Group_5__0"
    // InternalCuestionario.g:1206:1: rule__Categoria__Group_5__0 : rule__Categoria__Group_5__0__Impl rule__Categoria__Group_5__1 ;
    public final void rule__Categoria__Group_5__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1210:1: ( rule__Categoria__Group_5__0__Impl rule__Categoria__Group_5__1 )
            // InternalCuestionario.g:1211:2: rule__Categoria__Group_5__0__Impl rule__Categoria__Group_5__1
            {
            pushFollow(FOLLOW_3);
            rule__Categoria__Group_5__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Categoria__Group_5__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_5__0"


    // $ANTLR start "rule__Categoria__Group_5__0__Impl"
    // InternalCuestionario.g:1218:1: rule__Categoria__Group_5__0__Impl : ( 'subcategorias' ) ;
    public final void rule__Categoria__Group_5__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1222:1: ( ( 'subcategorias' ) )
            // InternalCuestionario.g:1223:1: ( 'subcategorias' )
            {
            // InternalCuestionario.g:1223:1: ( 'subcategorias' )
            // InternalCuestionario.g:1224:2: 'subcategorias'
            {
             before(grammarAccess.getCategoriaAccess().getSubcategoriasKeyword_5_0()); 
            match(input,25,FOLLOW_2); 
             after(grammarAccess.getCategoriaAccess().getSubcategoriasKeyword_5_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_5__0__Impl"


    // $ANTLR start "rule__Categoria__Group_5__1"
    // InternalCuestionario.g:1233:1: rule__Categoria__Group_5__1 : rule__Categoria__Group_5__1__Impl rule__Categoria__Group_5__2 ;
    public final void rule__Categoria__Group_5__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1237:1: ( rule__Categoria__Group_5__1__Impl rule__Categoria__Group_5__2 )
            // InternalCuestionario.g:1238:2: rule__Categoria__Group_5__1__Impl rule__Categoria__Group_5__2
            {
            pushFollow(FOLLOW_14);
            rule__Categoria__Group_5__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Categoria__Group_5__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_5__1"


    // $ANTLR start "rule__Categoria__Group_5__1__Impl"
    // InternalCuestionario.g:1245:1: rule__Categoria__Group_5__1__Impl : ( '{' ) ;
    public final void rule__Categoria__Group_5__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1249:1: ( ( '{' ) )
            // InternalCuestionario.g:1250:1: ( '{' )
            {
            // InternalCuestionario.g:1250:1: ( '{' )
            // InternalCuestionario.g:1251:2: '{'
            {
             before(grammarAccess.getCategoriaAccess().getLeftCurlyBracketKeyword_5_1()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getCategoriaAccess().getLeftCurlyBracketKeyword_5_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_5__1__Impl"


    // $ANTLR start "rule__Categoria__Group_5__2"
    // InternalCuestionario.g:1260:1: rule__Categoria__Group_5__2 : rule__Categoria__Group_5__2__Impl rule__Categoria__Group_5__3 ;
    public final void rule__Categoria__Group_5__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1264:1: ( rule__Categoria__Group_5__2__Impl rule__Categoria__Group_5__3 )
            // InternalCuestionario.g:1265:2: rule__Categoria__Group_5__2__Impl rule__Categoria__Group_5__3
            {
            pushFollow(FOLLOW_12);
            rule__Categoria__Group_5__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Categoria__Group_5__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_5__2"


    // $ANTLR start "rule__Categoria__Group_5__2__Impl"
    // InternalCuestionario.g:1272:1: rule__Categoria__Group_5__2__Impl : ( ( rule__Categoria__SubcategoriasAssignment_5_2 ) ) ;
    public final void rule__Categoria__Group_5__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1276:1: ( ( ( rule__Categoria__SubcategoriasAssignment_5_2 ) ) )
            // InternalCuestionario.g:1277:1: ( ( rule__Categoria__SubcategoriasAssignment_5_2 ) )
            {
            // InternalCuestionario.g:1277:1: ( ( rule__Categoria__SubcategoriasAssignment_5_2 ) )
            // InternalCuestionario.g:1278:2: ( rule__Categoria__SubcategoriasAssignment_5_2 )
            {
             before(grammarAccess.getCategoriaAccess().getSubcategoriasAssignment_5_2()); 
            // InternalCuestionario.g:1279:2: ( rule__Categoria__SubcategoriasAssignment_5_2 )
            // InternalCuestionario.g:1279:3: rule__Categoria__SubcategoriasAssignment_5_2
            {
            pushFollow(FOLLOW_2);
            rule__Categoria__SubcategoriasAssignment_5_2();

            state._fsp--;


            }

             after(grammarAccess.getCategoriaAccess().getSubcategoriasAssignment_5_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_5__2__Impl"


    // $ANTLR start "rule__Categoria__Group_5__3"
    // InternalCuestionario.g:1287:1: rule__Categoria__Group_5__3 : rule__Categoria__Group_5__3__Impl rule__Categoria__Group_5__4 ;
    public final void rule__Categoria__Group_5__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1291:1: ( rule__Categoria__Group_5__3__Impl rule__Categoria__Group_5__4 )
            // InternalCuestionario.g:1292:2: rule__Categoria__Group_5__3__Impl rule__Categoria__Group_5__4
            {
            pushFollow(FOLLOW_12);
            rule__Categoria__Group_5__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Categoria__Group_5__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_5__3"


    // $ANTLR start "rule__Categoria__Group_5__3__Impl"
    // InternalCuestionario.g:1299:1: rule__Categoria__Group_5__3__Impl : ( ( rule__Categoria__Group_5_3__0 )* ) ;
    public final void rule__Categoria__Group_5__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1303:1: ( ( ( rule__Categoria__Group_5_3__0 )* ) )
            // InternalCuestionario.g:1304:1: ( ( rule__Categoria__Group_5_3__0 )* )
            {
            // InternalCuestionario.g:1304:1: ( ( rule__Categoria__Group_5_3__0 )* )
            // InternalCuestionario.g:1305:2: ( rule__Categoria__Group_5_3__0 )*
            {
             before(grammarAccess.getCategoriaAccess().getGroup_5_3()); 
            // InternalCuestionario.g:1306:2: ( rule__Categoria__Group_5_3__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==22) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCuestionario.g:1306:3: rule__Categoria__Group_5_3__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__Categoria__Group_5_3__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getCategoriaAccess().getGroup_5_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_5__3__Impl"


    // $ANTLR start "rule__Categoria__Group_5__4"
    // InternalCuestionario.g:1314:1: rule__Categoria__Group_5__4 : rule__Categoria__Group_5__4__Impl ;
    public final void rule__Categoria__Group_5__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1318:1: ( rule__Categoria__Group_5__4__Impl )
            // InternalCuestionario.g:1319:2: rule__Categoria__Group_5__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Categoria__Group_5__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_5__4"


    // $ANTLR start "rule__Categoria__Group_5__4__Impl"
    // InternalCuestionario.g:1325:1: rule__Categoria__Group_5__4__Impl : ( '}' ) ;
    public final void rule__Categoria__Group_5__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1329:1: ( ( '}' ) )
            // InternalCuestionario.g:1330:1: ( '}' )
            {
            // InternalCuestionario.g:1330:1: ( '}' )
            // InternalCuestionario.g:1331:2: '}'
            {
             before(grammarAccess.getCategoriaAccess().getRightCurlyBracketKeyword_5_4()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getCategoriaAccess().getRightCurlyBracketKeyword_5_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_5__4__Impl"


    // $ANTLR start "rule__Categoria__Group_5_3__0"
    // InternalCuestionario.g:1341:1: rule__Categoria__Group_5_3__0 : rule__Categoria__Group_5_3__0__Impl rule__Categoria__Group_5_3__1 ;
    public final void rule__Categoria__Group_5_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1345:1: ( rule__Categoria__Group_5_3__0__Impl rule__Categoria__Group_5_3__1 )
            // InternalCuestionario.g:1346:2: rule__Categoria__Group_5_3__0__Impl rule__Categoria__Group_5_3__1
            {
            pushFollow(FOLLOW_14);
            rule__Categoria__Group_5_3__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Categoria__Group_5_3__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_5_3__0"


    // $ANTLR start "rule__Categoria__Group_5_3__0__Impl"
    // InternalCuestionario.g:1353:1: rule__Categoria__Group_5_3__0__Impl : ( ',' ) ;
    public final void rule__Categoria__Group_5_3__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1357:1: ( ( ',' ) )
            // InternalCuestionario.g:1358:1: ( ',' )
            {
            // InternalCuestionario.g:1358:1: ( ',' )
            // InternalCuestionario.g:1359:2: ','
            {
             before(grammarAccess.getCategoriaAccess().getCommaKeyword_5_3_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getCategoriaAccess().getCommaKeyword_5_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_5_3__0__Impl"


    // $ANTLR start "rule__Categoria__Group_5_3__1"
    // InternalCuestionario.g:1368:1: rule__Categoria__Group_5_3__1 : rule__Categoria__Group_5_3__1__Impl ;
    public final void rule__Categoria__Group_5_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1372:1: ( rule__Categoria__Group_5_3__1__Impl )
            // InternalCuestionario.g:1373:2: rule__Categoria__Group_5_3__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Categoria__Group_5_3__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_5_3__1"


    // $ANTLR start "rule__Categoria__Group_5_3__1__Impl"
    // InternalCuestionario.g:1379:1: rule__Categoria__Group_5_3__1__Impl : ( ( rule__Categoria__SubcategoriasAssignment_5_3_1 ) ) ;
    public final void rule__Categoria__Group_5_3__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1383:1: ( ( ( rule__Categoria__SubcategoriasAssignment_5_3_1 ) ) )
            // InternalCuestionario.g:1384:1: ( ( rule__Categoria__SubcategoriasAssignment_5_3_1 ) )
            {
            // InternalCuestionario.g:1384:1: ( ( rule__Categoria__SubcategoriasAssignment_5_3_1 ) )
            // InternalCuestionario.g:1385:2: ( rule__Categoria__SubcategoriasAssignment_5_3_1 )
            {
             before(grammarAccess.getCategoriaAccess().getSubcategoriasAssignment_5_3_1()); 
            // InternalCuestionario.g:1386:2: ( rule__Categoria__SubcategoriasAssignment_5_3_1 )
            // InternalCuestionario.g:1386:3: rule__Categoria__SubcategoriasAssignment_5_3_1
            {
            pushFollow(FOLLOW_2);
            rule__Categoria__SubcategoriasAssignment_5_3_1();

            state._fsp--;


            }

             after(grammarAccess.getCategoriaAccess().getSubcategoriasAssignment_5_3_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__Group_5_3__1__Impl"


    // $ANTLR start "rule__EDouble__Group__0"
    // InternalCuestionario.g:1395:1: rule__EDouble__Group__0 : rule__EDouble__Group__0__Impl rule__EDouble__Group__1 ;
    public final void rule__EDouble__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1399:1: ( rule__EDouble__Group__0__Impl rule__EDouble__Group__1 )
            // InternalCuestionario.g:1400:2: rule__EDouble__Group__0__Impl rule__EDouble__Group__1
            {
            pushFollow(FOLLOW_17);
            rule__EDouble__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0"


    // $ANTLR start "rule__EDouble__Group__0__Impl"
    // InternalCuestionario.g:1407:1: rule__EDouble__Group__0__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1411:1: ( ( ( '-' )? ) )
            // InternalCuestionario.g:1412:1: ( ( '-' )? )
            {
            // InternalCuestionario.g:1412:1: ( ( '-' )? )
            // InternalCuestionario.g:1413:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 
            // InternalCuestionario.g:1414:2: ( '-' )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==26) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // InternalCuestionario.g:1414:3: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__0__Impl"


    // $ANTLR start "rule__EDouble__Group__1"
    // InternalCuestionario.g:1422:1: rule__EDouble__Group__1 : rule__EDouble__Group__1__Impl rule__EDouble__Group__2 ;
    public final void rule__EDouble__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1426:1: ( rule__EDouble__Group__1__Impl rule__EDouble__Group__2 )
            // InternalCuestionario.g:1427:2: rule__EDouble__Group__1__Impl rule__EDouble__Group__2
            {
            pushFollow(FOLLOW_17);
            rule__EDouble__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1"


    // $ANTLR start "rule__EDouble__Group__1__Impl"
    // InternalCuestionario.g:1434:1: rule__EDouble__Group__1__Impl : ( ( RULE_INT )? ) ;
    public final void rule__EDouble__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1438:1: ( ( ( RULE_INT )? ) )
            // InternalCuestionario.g:1439:1: ( ( RULE_INT )? )
            {
            // InternalCuestionario.g:1439:1: ( ( RULE_INT )? )
            // InternalCuestionario.g:1440:2: ( RULE_INT )?
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 
            // InternalCuestionario.g:1441:2: ( RULE_INT )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_INT) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCuestionario.g:1441:3: RULE_INT
                    {
                    match(input,RULE_INT,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__1__Impl"


    // $ANTLR start "rule__EDouble__Group__2"
    // InternalCuestionario.g:1449:1: rule__EDouble__Group__2 : rule__EDouble__Group__2__Impl rule__EDouble__Group__3 ;
    public final void rule__EDouble__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1453:1: ( rule__EDouble__Group__2__Impl rule__EDouble__Group__3 )
            // InternalCuestionario.g:1454:2: rule__EDouble__Group__2__Impl rule__EDouble__Group__3
            {
            pushFollow(FOLLOW_19);
            rule__EDouble__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2"


    // $ANTLR start "rule__EDouble__Group__2__Impl"
    // InternalCuestionario.g:1461:1: rule__EDouble__Group__2__Impl : ( '.' ) ;
    public final void rule__EDouble__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1465:1: ( ( '.' ) )
            // InternalCuestionario.g:1466:1: ( '.' )
            {
            // InternalCuestionario.g:1466:1: ( '.' )
            // InternalCuestionario.g:1467:2: '.'
            {
             before(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 
            match(input,27,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getFullStopKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__2__Impl"


    // $ANTLR start "rule__EDouble__Group__3"
    // InternalCuestionario.g:1476:1: rule__EDouble__Group__3 : rule__EDouble__Group__3__Impl rule__EDouble__Group__4 ;
    public final void rule__EDouble__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1480:1: ( rule__EDouble__Group__3__Impl rule__EDouble__Group__4 )
            // InternalCuestionario.g:1481:2: rule__EDouble__Group__3__Impl rule__EDouble__Group__4
            {
            pushFollow(FOLLOW_20);
            rule__EDouble__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3"


    // $ANTLR start "rule__EDouble__Group__3__Impl"
    // InternalCuestionario.g:1488:1: rule__EDouble__Group__3__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1492:1: ( ( RULE_INT ) )
            // InternalCuestionario.g:1493:1: ( RULE_INT )
            {
            // InternalCuestionario.g:1493:1: ( RULE_INT )
            // InternalCuestionario.g:1494:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__3__Impl"


    // $ANTLR start "rule__EDouble__Group__4"
    // InternalCuestionario.g:1503:1: rule__EDouble__Group__4 : rule__EDouble__Group__4__Impl ;
    public final void rule__EDouble__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1507:1: ( rule__EDouble__Group__4__Impl )
            // InternalCuestionario.g:1508:2: rule__EDouble__Group__4__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4"


    // $ANTLR start "rule__EDouble__Group__4__Impl"
    // InternalCuestionario.g:1514:1: rule__EDouble__Group__4__Impl : ( ( rule__EDouble__Group_4__0 )? ) ;
    public final void rule__EDouble__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1518:1: ( ( ( rule__EDouble__Group_4__0 )? ) )
            // InternalCuestionario.g:1519:1: ( ( rule__EDouble__Group_4__0 )? )
            {
            // InternalCuestionario.g:1519:1: ( ( rule__EDouble__Group_4__0 )? )
            // InternalCuestionario.g:1520:2: ( rule__EDouble__Group_4__0 )?
            {
             before(grammarAccess.getEDoubleAccess().getGroup_4()); 
            // InternalCuestionario.g:1521:2: ( rule__EDouble__Group_4__0 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=11 && LA11_0<=12)) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // InternalCuestionario.g:1521:3: rule__EDouble__Group_4__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__EDouble__Group_4__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getGroup_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group__4__Impl"


    // $ANTLR start "rule__EDouble__Group_4__0"
    // InternalCuestionario.g:1530:1: rule__EDouble__Group_4__0 : rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 ;
    public final void rule__EDouble__Group_4__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1534:1: ( rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1 )
            // InternalCuestionario.g:1535:2: rule__EDouble__Group_4__0__Impl rule__EDouble__Group_4__1
            {
            pushFollow(FOLLOW_21);
            rule__EDouble__Group_4__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0"


    // $ANTLR start "rule__EDouble__Group_4__0__Impl"
    // InternalCuestionario.g:1542:1: rule__EDouble__Group_4__0__Impl : ( ( rule__EDouble__Alternatives_4_0 ) ) ;
    public final void rule__EDouble__Group_4__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1546:1: ( ( ( rule__EDouble__Alternatives_4_0 ) ) )
            // InternalCuestionario.g:1547:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            {
            // InternalCuestionario.g:1547:1: ( ( rule__EDouble__Alternatives_4_0 ) )
            // InternalCuestionario.g:1548:2: ( rule__EDouble__Alternatives_4_0 )
            {
             before(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 
            // InternalCuestionario.g:1549:2: ( rule__EDouble__Alternatives_4_0 )
            // InternalCuestionario.g:1549:3: rule__EDouble__Alternatives_4_0
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Alternatives_4_0();

            state._fsp--;


            }

             after(grammarAccess.getEDoubleAccess().getAlternatives_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__0__Impl"


    // $ANTLR start "rule__EDouble__Group_4__1"
    // InternalCuestionario.g:1557:1: rule__EDouble__Group_4__1 : rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 ;
    public final void rule__EDouble__Group_4__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1561:1: ( rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2 )
            // InternalCuestionario.g:1562:2: rule__EDouble__Group_4__1__Impl rule__EDouble__Group_4__2
            {
            pushFollow(FOLLOW_21);
            rule__EDouble__Group_4__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1"


    // $ANTLR start "rule__EDouble__Group_4__1__Impl"
    // InternalCuestionario.g:1569:1: rule__EDouble__Group_4__1__Impl : ( ( '-' )? ) ;
    public final void rule__EDouble__Group_4__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1573:1: ( ( ( '-' )? ) )
            // InternalCuestionario.g:1574:1: ( ( '-' )? )
            {
            // InternalCuestionario.g:1574:1: ( ( '-' )? )
            // InternalCuestionario.g:1575:2: ( '-' )?
            {
             before(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 
            // InternalCuestionario.g:1576:2: ( '-' )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==26) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // InternalCuestionario.g:1576:3: '-'
                    {
                    match(input,26,FOLLOW_2); 

                    }
                    break;

            }

             after(grammarAccess.getEDoubleAccess().getHyphenMinusKeyword_4_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__1__Impl"


    // $ANTLR start "rule__EDouble__Group_4__2"
    // InternalCuestionario.g:1584:1: rule__EDouble__Group_4__2 : rule__EDouble__Group_4__2__Impl ;
    public final void rule__EDouble__Group_4__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1588:1: ( rule__EDouble__Group_4__2__Impl )
            // InternalCuestionario.g:1589:2: rule__EDouble__Group_4__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__EDouble__Group_4__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2"


    // $ANTLR start "rule__EDouble__Group_4__2__Impl"
    // InternalCuestionario.g:1595:1: rule__EDouble__Group_4__2__Impl : ( RULE_INT ) ;
    public final void rule__EDouble__Group_4__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1599:1: ( ( RULE_INT ) )
            // InternalCuestionario.g:1600:1: ( RULE_INT )
            {
            // InternalCuestionario.g:1600:1: ( RULE_INT )
            // InternalCuestionario.g:1601:2: RULE_INT
            {
             before(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getEDoubleAccess().getINTTerminalRuleCall_4_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__EDouble__Group_4__2__Impl"


    // $ANTLR start "rule__Respuesta__Group__0"
    // InternalCuestionario.g:1611:1: rule__Respuesta__Group__0 : rule__Respuesta__Group__0__Impl rule__Respuesta__Group__1 ;
    public final void rule__Respuesta__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1615:1: ( rule__Respuesta__Group__0__Impl rule__Respuesta__Group__1 )
            // InternalCuestionario.g:1616:2: rule__Respuesta__Group__0__Impl rule__Respuesta__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__Respuesta__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Respuesta__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Respuesta__Group__0"


    // $ANTLR start "rule__Respuesta__Group__0__Impl"
    // InternalCuestionario.g:1623:1: rule__Respuesta__Group__0__Impl : ( 'Respuesta' ) ;
    public final void rule__Respuesta__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1627:1: ( ( 'Respuesta' ) )
            // InternalCuestionario.g:1628:1: ( 'Respuesta' )
            {
            // InternalCuestionario.g:1628:1: ( 'Respuesta' )
            // InternalCuestionario.g:1629:2: 'Respuesta'
            {
             before(grammarAccess.getRespuestaAccess().getRespuestaKeyword_0()); 
            match(input,28,FOLLOW_2); 
             after(grammarAccess.getRespuestaAccess().getRespuestaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Respuesta__Group__0__Impl"


    // $ANTLR start "rule__Respuesta__Group__1"
    // InternalCuestionario.g:1638:1: rule__Respuesta__Group__1 : rule__Respuesta__Group__1__Impl rule__Respuesta__Group__2 ;
    public final void rule__Respuesta__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1642:1: ( rule__Respuesta__Group__1__Impl rule__Respuesta__Group__2 )
            // InternalCuestionario.g:1643:2: rule__Respuesta__Group__1__Impl rule__Respuesta__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__Respuesta__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Respuesta__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Respuesta__Group__1"


    // $ANTLR start "rule__Respuesta__Group__1__Impl"
    // InternalCuestionario.g:1650:1: rule__Respuesta__Group__1__Impl : ( ( rule__Respuesta__NameAssignment_1 ) ) ;
    public final void rule__Respuesta__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1654:1: ( ( ( rule__Respuesta__NameAssignment_1 ) ) )
            // InternalCuestionario.g:1655:1: ( ( rule__Respuesta__NameAssignment_1 ) )
            {
            // InternalCuestionario.g:1655:1: ( ( rule__Respuesta__NameAssignment_1 ) )
            // InternalCuestionario.g:1656:2: ( rule__Respuesta__NameAssignment_1 )
            {
             before(grammarAccess.getRespuestaAccess().getNameAssignment_1()); 
            // InternalCuestionario.g:1657:2: ( rule__Respuesta__NameAssignment_1 )
            // InternalCuestionario.g:1657:3: rule__Respuesta__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Respuesta__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getRespuestaAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Respuesta__Group__1__Impl"


    // $ANTLR start "rule__Respuesta__Group__2"
    // InternalCuestionario.g:1665:1: rule__Respuesta__Group__2 : rule__Respuesta__Group__2__Impl rule__Respuesta__Group__3 ;
    public final void rule__Respuesta__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1669:1: ( rule__Respuesta__Group__2__Impl rule__Respuesta__Group__3 )
            // InternalCuestionario.g:1670:2: rule__Respuesta__Group__2__Impl rule__Respuesta__Group__3
            {
            pushFollow(FOLLOW_22);
            rule__Respuesta__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Respuesta__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Respuesta__Group__2"


    // $ANTLR start "rule__Respuesta__Group__2__Impl"
    // InternalCuestionario.g:1677:1: rule__Respuesta__Group__2__Impl : ( '{' ) ;
    public final void rule__Respuesta__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1681:1: ( ( '{' ) )
            // InternalCuestionario.g:1682:1: ( '{' )
            {
            // InternalCuestionario.g:1682:1: ( '{' )
            // InternalCuestionario.g:1683:2: '{'
            {
             before(grammarAccess.getRespuestaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getRespuestaAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Respuesta__Group__2__Impl"


    // $ANTLR start "rule__Respuesta__Group__3"
    // InternalCuestionario.g:1692:1: rule__Respuesta__Group__3 : rule__Respuesta__Group__3__Impl rule__Respuesta__Group__4 ;
    public final void rule__Respuesta__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1696:1: ( rule__Respuesta__Group__3__Impl rule__Respuesta__Group__4 )
            // InternalCuestionario.g:1697:2: rule__Respuesta__Group__3__Impl rule__Respuesta__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__Respuesta__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Respuesta__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Respuesta__Group__3"


    // $ANTLR start "rule__Respuesta__Group__3__Impl"
    // InternalCuestionario.g:1704:1: rule__Respuesta__Group__3__Impl : ( 'opcion' ) ;
    public final void rule__Respuesta__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1708:1: ( ( 'opcion' ) )
            // InternalCuestionario.g:1709:1: ( 'opcion' )
            {
            // InternalCuestionario.g:1709:1: ( 'opcion' )
            // InternalCuestionario.g:1710:2: 'opcion'
            {
             before(grammarAccess.getRespuestaAccess().getOpcionKeyword_3()); 
            match(input,29,FOLLOW_2); 
             after(grammarAccess.getRespuestaAccess().getOpcionKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Respuesta__Group__3__Impl"


    // $ANTLR start "rule__Respuesta__Group__4"
    // InternalCuestionario.g:1719:1: rule__Respuesta__Group__4 : rule__Respuesta__Group__4__Impl rule__Respuesta__Group__5 ;
    public final void rule__Respuesta__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1723:1: ( rule__Respuesta__Group__4__Impl rule__Respuesta__Group__5 )
            // InternalCuestionario.g:1724:2: rule__Respuesta__Group__4__Impl rule__Respuesta__Group__5
            {
            pushFollow(FOLLOW_15);
            rule__Respuesta__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Respuesta__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Respuesta__Group__4"


    // $ANTLR start "rule__Respuesta__Group__4__Impl"
    // InternalCuestionario.g:1731:1: rule__Respuesta__Group__4__Impl : ( ( rule__Respuesta__OpcionAssignment_4 ) ) ;
    public final void rule__Respuesta__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1735:1: ( ( ( rule__Respuesta__OpcionAssignment_4 ) ) )
            // InternalCuestionario.g:1736:1: ( ( rule__Respuesta__OpcionAssignment_4 ) )
            {
            // InternalCuestionario.g:1736:1: ( ( rule__Respuesta__OpcionAssignment_4 ) )
            // InternalCuestionario.g:1737:2: ( rule__Respuesta__OpcionAssignment_4 )
            {
             before(grammarAccess.getRespuestaAccess().getOpcionAssignment_4()); 
            // InternalCuestionario.g:1738:2: ( rule__Respuesta__OpcionAssignment_4 )
            // InternalCuestionario.g:1738:3: rule__Respuesta__OpcionAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__Respuesta__OpcionAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getRespuestaAccess().getOpcionAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Respuesta__Group__4__Impl"


    // $ANTLR start "rule__Respuesta__Group__5"
    // InternalCuestionario.g:1746:1: rule__Respuesta__Group__5 : rule__Respuesta__Group__5__Impl ;
    public final void rule__Respuesta__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1750:1: ( rule__Respuesta__Group__5__Impl )
            // InternalCuestionario.g:1751:2: rule__Respuesta__Group__5__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Respuesta__Group__5__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Respuesta__Group__5"


    // $ANTLR start "rule__Respuesta__Group__5__Impl"
    // InternalCuestionario.g:1757:1: rule__Respuesta__Group__5__Impl : ( '}' ) ;
    public final void rule__Respuesta__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1761:1: ( ( '}' ) )
            // InternalCuestionario.g:1762:1: ( '}' )
            {
            // InternalCuestionario.g:1762:1: ( '}' )
            // InternalCuestionario.g:1763:2: '}'
            {
             before(grammarAccess.getRespuestaAccess().getRightCurlyBracketKeyword_5()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getRespuestaAccess().getRightCurlyBracketKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Respuesta__Group__5__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__0"
    // InternalCuestionario.g:1773:1: rule__PreguntaUnica__Group__0 : rule__PreguntaUnica__Group__0__Impl rule__PreguntaUnica__Group__1 ;
    public final void rule__PreguntaUnica__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1777:1: ( rule__PreguntaUnica__Group__0__Impl rule__PreguntaUnica__Group__1 )
            // InternalCuestionario.g:1778:2: rule__PreguntaUnica__Group__0__Impl rule__PreguntaUnica__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PreguntaUnica__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__0"


    // $ANTLR start "rule__PreguntaUnica__Group__0__Impl"
    // InternalCuestionario.g:1785:1: rule__PreguntaUnica__Group__0__Impl : ( 'PreguntaUnica' ) ;
    public final void rule__PreguntaUnica__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1789:1: ( ( 'PreguntaUnica' ) )
            // InternalCuestionario.g:1790:1: ( 'PreguntaUnica' )
            {
            // InternalCuestionario.g:1790:1: ( 'PreguntaUnica' )
            // InternalCuestionario.g:1791:2: 'PreguntaUnica'
            {
             before(grammarAccess.getPreguntaUnicaAccess().getPreguntaUnicaKeyword_0()); 
            match(input,30,FOLLOW_2); 
             after(grammarAccess.getPreguntaUnicaAccess().getPreguntaUnicaKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__0__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__1"
    // InternalCuestionario.g:1800:1: rule__PreguntaUnica__Group__1 : rule__PreguntaUnica__Group__1__Impl rule__PreguntaUnica__Group__2 ;
    public final void rule__PreguntaUnica__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1804:1: ( rule__PreguntaUnica__Group__1__Impl rule__PreguntaUnica__Group__2 )
            // InternalCuestionario.g:1805:2: rule__PreguntaUnica__Group__1__Impl rule__PreguntaUnica__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__PreguntaUnica__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__1"


    // $ANTLR start "rule__PreguntaUnica__Group__1__Impl"
    // InternalCuestionario.g:1812:1: rule__PreguntaUnica__Group__1__Impl : ( ( rule__PreguntaUnica__NameAssignment_1 ) ) ;
    public final void rule__PreguntaUnica__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1816:1: ( ( ( rule__PreguntaUnica__NameAssignment_1 ) ) )
            // InternalCuestionario.g:1817:1: ( ( rule__PreguntaUnica__NameAssignment_1 ) )
            {
            // InternalCuestionario.g:1817:1: ( ( rule__PreguntaUnica__NameAssignment_1 ) )
            // InternalCuestionario.g:1818:2: ( rule__PreguntaUnica__NameAssignment_1 )
            {
             before(grammarAccess.getPreguntaUnicaAccess().getNameAssignment_1()); 
            // InternalCuestionario.g:1819:2: ( rule__PreguntaUnica__NameAssignment_1 )
            // InternalCuestionario.g:1819:3: rule__PreguntaUnica__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaUnicaAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__1__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__2"
    // InternalCuestionario.g:1827:1: rule__PreguntaUnica__Group__2 : rule__PreguntaUnica__Group__2__Impl rule__PreguntaUnica__Group__3 ;
    public final void rule__PreguntaUnica__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1831:1: ( rule__PreguntaUnica__Group__2__Impl rule__PreguntaUnica__Group__3 )
            // InternalCuestionario.g:1832:2: rule__PreguntaUnica__Group__2__Impl rule__PreguntaUnica__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__PreguntaUnica__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__2"


    // $ANTLR start "rule__PreguntaUnica__Group__2__Impl"
    // InternalCuestionario.g:1839:1: rule__PreguntaUnica__Group__2__Impl : ( '{' ) ;
    public final void rule__PreguntaUnica__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1843:1: ( ( '{' ) )
            // InternalCuestionario.g:1844:1: ( '{' )
            {
            // InternalCuestionario.g:1844:1: ( '{' )
            // InternalCuestionario.g:1845:2: '{'
            {
             before(grammarAccess.getPreguntaUnicaAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPreguntaUnicaAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__2__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__3"
    // InternalCuestionario.g:1854:1: rule__PreguntaUnica__Group__3 : rule__PreguntaUnica__Group__3__Impl rule__PreguntaUnica__Group__4 ;
    public final void rule__PreguntaUnica__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1858:1: ( rule__PreguntaUnica__Group__3__Impl rule__PreguntaUnica__Group__4 )
            // InternalCuestionario.g:1859:2: rule__PreguntaUnica__Group__3__Impl rule__PreguntaUnica__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__PreguntaUnica__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__3"


    // $ANTLR start "rule__PreguntaUnica__Group__3__Impl"
    // InternalCuestionario.g:1866:1: rule__PreguntaUnica__Group__3__Impl : ( 'enunciado' ) ;
    public final void rule__PreguntaUnica__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1870:1: ( ( 'enunciado' ) )
            // InternalCuestionario.g:1871:1: ( 'enunciado' )
            {
            // InternalCuestionario.g:1871:1: ( 'enunciado' )
            // InternalCuestionario.g:1872:2: 'enunciado'
            {
             before(grammarAccess.getPreguntaUnicaAccess().getEnunciadoKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPreguntaUnicaAccess().getEnunciadoKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__3__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__4"
    // InternalCuestionario.g:1881:1: rule__PreguntaUnica__Group__4 : rule__PreguntaUnica__Group__4__Impl rule__PreguntaUnica__Group__5 ;
    public final void rule__PreguntaUnica__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1885:1: ( rule__PreguntaUnica__Group__4__Impl rule__PreguntaUnica__Group__5 )
            // InternalCuestionario.g:1886:2: rule__PreguntaUnica__Group__4__Impl rule__PreguntaUnica__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__PreguntaUnica__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__4"


    // $ANTLR start "rule__PreguntaUnica__Group__4__Impl"
    // InternalCuestionario.g:1893:1: rule__PreguntaUnica__Group__4__Impl : ( ( rule__PreguntaUnica__EnunciadoAssignment_4 ) ) ;
    public final void rule__PreguntaUnica__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1897:1: ( ( ( rule__PreguntaUnica__EnunciadoAssignment_4 ) ) )
            // InternalCuestionario.g:1898:1: ( ( rule__PreguntaUnica__EnunciadoAssignment_4 ) )
            {
            // InternalCuestionario.g:1898:1: ( ( rule__PreguntaUnica__EnunciadoAssignment_4 ) )
            // InternalCuestionario.g:1899:2: ( rule__PreguntaUnica__EnunciadoAssignment_4 )
            {
             before(grammarAccess.getPreguntaUnicaAccess().getEnunciadoAssignment_4()); 
            // InternalCuestionario.g:1900:2: ( rule__PreguntaUnica__EnunciadoAssignment_4 )
            // InternalCuestionario.g:1900:3: rule__PreguntaUnica__EnunciadoAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__EnunciadoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaUnicaAccess().getEnunciadoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__4__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__5"
    // InternalCuestionario.g:1908:1: rule__PreguntaUnica__Group__5 : rule__PreguntaUnica__Group__5__Impl rule__PreguntaUnica__Group__6 ;
    public final void rule__PreguntaUnica__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1912:1: ( rule__PreguntaUnica__Group__5__Impl rule__PreguntaUnica__Group__6 )
            // InternalCuestionario.g:1913:2: rule__PreguntaUnica__Group__5__Impl rule__PreguntaUnica__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__PreguntaUnica__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__5"


    // $ANTLR start "rule__PreguntaUnica__Group__5__Impl"
    // InternalCuestionario.g:1920:1: rule__PreguntaUnica__Group__5__Impl : ( 'puntuacion' ) ;
    public final void rule__PreguntaUnica__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1924:1: ( ( 'puntuacion' ) )
            // InternalCuestionario.g:1925:1: ( 'puntuacion' )
            {
            // InternalCuestionario.g:1925:1: ( 'puntuacion' )
            // InternalCuestionario.g:1926:2: 'puntuacion'
            {
             before(grammarAccess.getPreguntaUnicaAccess().getPuntuacionKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPreguntaUnicaAccess().getPuntuacionKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__5__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__6"
    // InternalCuestionario.g:1935:1: rule__PreguntaUnica__Group__6 : rule__PreguntaUnica__Group__6__Impl rule__PreguntaUnica__Group__7 ;
    public final void rule__PreguntaUnica__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1939:1: ( rule__PreguntaUnica__Group__6__Impl rule__PreguntaUnica__Group__7 )
            // InternalCuestionario.g:1940:2: rule__PreguntaUnica__Group__6__Impl rule__PreguntaUnica__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__PreguntaUnica__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__6"


    // $ANTLR start "rule__PreguntaUnica__Group__6__Impl"
    // InternalCuestionario.g:1947:1: rule__PreguntaUnica__Group__6__Impl : ( ( rule__PreguntaUnica__PuntuacionAssignment_6 ) ) ;
    public final void rule__PreguntaUnica__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1951:1: ( ( ( rule__PreguntaUnica__PuntuacionAssignment_6 ) ) )
            // InternalCuestionario.g:1952:1: ( ( rule__PreguntaUnica__PuntuacionAssignment_6 ) )
            {
            // InternalCuestionario.g:1952:1: ( ( rule__PreguntaUnica__PuntuacionAssignment_6 ) )
            // InternalCuestionario.g:1953:2: ( rule__PreguntaUnica__PuntuacionAssignment_6 )
            {
             before(grammarAccess.getPreguntaUnicaAccess().getPuntuacionAssignment_6()); 
            // InternalCuestionario.g:1954:2: ( rule__PreguntaUnica__PuntuacionAssignment_6 )
            // InternalCuestionario.g:1954:3: rule__PreguntaUnica__PuntuacionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__PuntuacionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaUnicaAccess().getPuntuacionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__6__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__7"
    // InternalCuestionario.g:1962:1: rule__PreguntaUnica__Group__7 : rule__PreguntaUnica__Group__7__Impl rule__PreguntaUnica__Group__8 ;
    public final void rule__PreguntaUnica__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1966:1: ( rule__PreguntaUnica__Group__7__Impl rule__PreguntaUnica__Group__8 )
            // InternalCuestionario.g:1967:2: rule__PreguntaUnica__Group__7__Impl rule__PreguntaUnica__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__PreguntaUnica__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__7"


    // $ANTLR start "rule__PreguntaUnica__Group__7__Impl"
    // InternalCuestionario.g:1974:1: rule__PreguntaUnica__Group__7__Impl : ( 'penalizacion' ) ;
    public final void rule__PreguntaUnica__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1978:1: ( ( 'penalizacion' ) )
            // InternalCuestionario.g:1979:1: ( 'penalizacion' )
            {
            // InternalCuestionario.g:1979:1: ( 'penalizacion' )
            // InternalCuestionario.g:1980:2: 'penalizacion'
            {
             before(grammarAccess.getPreguntaUnicaAccess().getPenalizacionKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPreguntaUnicaAccess().getPenalizacionKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__7__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__8"
    // InternalCuestionario.g:1989:1: rule__PreguntaUnica__Group__8 : rule__PreguntaUnica__Group__8__Impl rule__PreguntaUnica__Group__9 ;
    public final void rule__PreguntaUnica__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:1993:1: ( rule__PreguntaUnica__Group__8__Impl rule__PreguntaUnica__Group__9 )
            // InternalCuestionario.g:1994:2: rule__PreguntaUnica__Group__8__Impl rule__PreguntaUnica__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__PreguntaUnica__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__8"


    // $ANTLR start "rule__PreguntaUnica__Group__8__Impl"
    // InternalCuestionario.g:2001:1: rule__PreguntaUnica__Group__8__Impl : ( ( rule__PreguntaUnica__PenalizacionAssignment_8 ) ) ;
    public final void rule__PreguntaUnica__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2005:1: ( ( ( rule__PreguntaUnica__PenalizacionAssignment_8 ) ) )
            // InternalCuestionario.g:2006:1: ( ( rule__PreguntaUnica__PenalizacionAssignment_8 ) )
            {
            // InternalCuestionario.g:2006:1: ( ( rule__PreguntaUnica__PenalizacionAssignment_8 ) )
            // InternalCuestionario.g:2007:2: ( rule__PreguntaUnica__PenalizacionAssignment_8 )
            {
             before(grammarAccess.getPreguntaUnicaAccess().getPenalizacionAssignment_8()); 
            // InternalCuestionario.g:2008:2: ( rule__PreguntaUnica__PenalizacionAssignment_8 )
            // InternalCuestionario.g:2008:3: rule__PreguntaUnica__PenalizacionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__PenalizacionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaUnicaAccess().getPenalizacionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__8__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__9"
    // InternalCuestionario.g:2016:1: rule__PreguntaUnica__Group__9 : rule__PreguntaUnica__Group__9__Impl rule__PreguntaUnica__Group__10 ;
    public final void rule__PreguntaUnica__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2020:1: ( rule__PreguntaUnica__Group__9__Impl rule__PreguntaUnica__Group__10 )
            // InternalCuestionario.g:2021:2: rule__PreguntaUnica__Group__9__Impl rule__PreguntaUnica__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__PreguntaUnica__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__9"


    // $ANTLR start "rule__PreguntaUnica__Group__9__Impl"
    // InternalCuestionario.g:2028:1: rule__PreguntaUnica__Group__9__Impl : ( 'categoria' ) ;
    public final void rule__PreguntaUnica__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2032:1: ( ( 'categoria' ) )
            // InternalCuestionario.g:2033:1: ( 'categoria' )
            {
            // InternalCuestionario.g:2033:1: ( 'categoria' )
            // InternalCuestionario.g:2034:2: 'categoria'
            {
             before(grammarAccess.getPreguntaUnicaAccess().getCategoriaKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPreguntaUnicaAccess().getCategoriaKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__9__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__10"
    // InternalCuestionario.g:2043:1: rule__PreguntaUnica__Group__10 : rule__PreguntaUnica__Group__10__Impl rule__PreguntaUnica__Group__11 ;
    public final void rule__PreguntaUnica__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2047:1: ( rule__PreguntaUnica__Group__10__Impl rule__PreguntaUnica__Group__11 )
            // InternalCuestionario.g:2048:2: rule__PreguntaUnica__Group__10__Impl rule__PreguntaUnica__Group__11
            {
            pushFollow(FOLLOW_27);
            rule__PreguntaUnica__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__10"


    // $ANTLR start "rule__PreguntaUnica__Group__10__Impl"
    // InternalCuestionario.g:2055:1: rule__PreguntaUnica__Group__10__Impl : ( ( rule__PreguntaUnica__CategoriaAssignment_10 ) ) ;
    public final void rule__PreguntaUnica__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2059:1: ( ( ( rule__PreguntaUnica__CategoriaAssignment_10 ) ) )
            // InternalCuestionario.g:2060:1: ( ( rule__PreguntaUnica__CategoriaAssignment_10 ) )
            {
            // InternalCuestionario.g:2060:1: ( ( rule__PreguntaUnica__CategoriaAssignment_10 ) )
            // InternalCuestionario.g:2061:2: ( rule__PreguntaUnica__CategoriaAssignment_10 )
            {
             before(grammarAccess.getPreguntaUnicaAccess().getCategoriaAssignment_10()); 
            // InternalCuestionario.g:2062:2: ( rule__PreguntaUnica__CategoriaAssignment_10 )
            // InternalCuestionario.g:2062:3: rule__PreguntaUnica__CategoriaAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__CategoriaAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaUnicaAccess().getCategoriaAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__10__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__11"
    // InternalCuestionario.g:2070:1: rule__PreguntaUnica__Group__11 : rule__PreguntaUnica__Group__11__Impl rule__PreguntaUnica__Group__12 ;
    public final void rule__PreguntaUnica__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2074:1: ( rule__PreguntaUnica__Group__11__Impl rule__PreguntaUnica__Group__12 )
            // InternalCuestionario.g:2075:2: rule__PreguntaUnica__Group__11__Impl rule__PreguntaUnica__Group__12
            {
            pushFollow(FOLLOW_27);
            rule__PreguntaUnica__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__11"


    // $ANTLR start "rule__PreguntaUnica__Group__11__Impl"
    // InternalCuestionario.g:2082:1: rule__PreguntaUnica__Group__11__Impl : ( ( rule__PreguntaUnica__Group_11__0 )? ) ;
    public final void rule__PreguntaUnica__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2086:1: ( ( ( rule__PreguntaUnica__Group_11__0 )? ) )
            // InternalCuestionario.g:2087:1: ( ( rule__PreguntaUnica__Group_11__0 )? )
            {
            // InternalCuestionario.g:2087:1: ( ( rule__PreguntaUnica__Group_11__0 )? )
            // InternalCuestionario.g:2088:2: ( rule__PreguntaUnica__Group_11__0 )?
            {
             before(grammarAccess.getPreguntaUnicaAccess().getGroup_11()); 
            // InternalCuestionario.g:2089:2: ( rule__PreguntaUnica__Group_11__0 )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==37) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // InternalCuestionario.g:2089:3: rule__PreguntaUnica__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PreguntaUnica__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPreguntaUnicaAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__11__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__12"
    // InternalCuestionario.g:2097:1: rule__PreguntaUnica__Group__12 : rule__PreguntaUnica__Group__12__Impl rule__PreguntaUnica__Group__13 ;
    public final void rule__PreguntaUnica__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2101:1: ( rule__PreguntaUnica__Group__12__Impl rule__PreguntaUnica__Group__13 )
            // InternalCuestionario.g:2102:2: rule__PreguntaUnica__Group__12__Impl rule__PreguntaUnica__Group__13
            {
            pushFollow(FOLLOW_5);
            rule__PreguntaUnica__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__12"


    // $ANTLR start "rule__PreguntaUnica__Group__12__Impl"
    // InternalCuestionario.g:2109:1: rule__PreguntaUnica__Group__12__Impl : ( 'correcta' ) ;
    public final void rule__PreguntaUnica__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2113:1: ( ( 'correcta' ) )
            // InternalCuestionario.g:2114:1: ( 'correcta' )
            {
            // InternalCuestionario.g:2114:1: ( 'correcta' )
            // InternalCuestionario.g:2115:2: 'correcta'
            {
             before(grammarAccess.getPreguntaUnicaAccess().getCorrectaKeyword_12()); 
            match(input,35,FOLLOW_2); 
             after(grammarAccess.getPreguntaUnicaAccess().getCorrectaKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__12__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__13"
    // InternalCuestionario.g:2124:1: rule__PreguntaUnica__Group__13 : rule__PreguntaUnica__Group__13__Impl rule__PreguntaUnica__Group__14 ;
    public final void rule__PreguntaUnica__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2128:1: ( rule__PreguntaUnica__Group__13__Impl rule__PreguntaUnica__Group__14 )
            // InternalCuestionario.g:2129:2: rule__PreguntaUnica__Group__13__Impl rule__PreguntaUnica__Group__14
            {
            pushFollow(FOLLOW_28);
            rule__PreguntaUnica__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__13"


    // $ANTLR start "rule__PreguntaUnica__Group__13__Impl"
    // InternalCuestionario.g:2136:1: rule__PreguntaUnica__Group__13__Impl : ( ( rule__PreguntaUnica__CorrectaAssignment_13 ) ) ;
    public final void rule__PreguntaUnica__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2140:1: ( ( ( rule__PreguntaUnica__CorrectaAssignment_13 ) ) )
            // InternalCuestionario.g:2141:1: ( ( rule__PreguntaUnica__CorrectaAssignment_13 ) )
            {
            // InternalCuestionario.g:2141:1: ( ( rule__PreguntaUnica__CorrectaAssignment_13 ) )
            // InternalCuestionario.g:2142:2: ( rule__PreguntaUnica__CorrectaAssignment_13 )
            {
             before(grammarAccess.getPreguntaUnicaAccess().getCorrectaAssignment_13()); 
            // InternalCuestionario.g:2143:2: ( rule__PreguntaUnica__CorrectaAssignment_13 )
            // InternalCuestionario.g:2143:3: rule__PreguntaUnica__CorrectaAssignment_13
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__CorrectaAssignment_13();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaUnicaAccess().getCorrectaAssignment_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__13__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__14"
    // InternalCuestionario.g:2151:1: rule__PreguntaUnica__Group__14 : rule__PreguntaUnica__Group__14__Impl rule__PreguntaUnica__Group__15 ;
    public final void rule__PreguntaUnica__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2155:1: ( rule__PreguntaUnica__Group__14__Impl rule__PreguntaUnica__Group__15 )
            // InternalCuestionario.g:2156:2: rule__PreguntaUnica__Group__14__Impl rule__PreguntaUnica__Group__15
            {
            pushFollow(FOLLOW_3);
            rule__PreguntaUnica__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__14"


    // $ANTLR start "rule__PreguntaUnica__Group__14__Impl"
    // InternalCuestionario.g:2163:1: rule__PreguntaUnica__Group__14__Impl : ( 'respuestas' ) ;
    public final void rule__PreguntaUnica__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2167:1: ( ( 'respuestas' ) )
            // InternalCuestionario.g:2168:1: ( 'respuestas' )
            {
            // InternalCuestionario.g:2168:1: ( 'respuestas' )
            // InternalCuestionario.g:2169:2: 'respuestas'
            {
             before(grammarAccess.getPreguntaUnicaAccess().getRespuestasKeyword_14()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPreguntaUnicaAccess().getRespuestasKeyword_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__14__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__15"
    // InternalCuestionario.g:2178:1: rule__PreguntaUnica__Group__15 : rule__PreguntaUnica__Group__15__Impl rule__PreguntaUnica__Group__16 ;
    public final void rule__PreguntaUnica__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2182:1: ( rule__PreguntaUnica__Group__15__Impl rule__PreguntaUnica__Group__16 )
            // InternalCuestionario.g:2183:2: rule__PreguntaUnica__Group__15__Impl rule__PreguntaUnica__Group__16
            {
            pushFollow(FOLLOW_29);
            rule__PreguntaUnica__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__15"


    // $ANTLR start "rule__PreguntaUnica__Group__15__Impl"
    // InternalCuestionario.g:2190:1: rule__PreguntaUnica__Group__15__Impl : ( '{' ) ;
    public final void rule__PreguntaUnica__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2194:1: ( ( '{' ) )
            // InternalCuestionario.g:2195:1: ( '{' )
            {
            // InternalCuestionario.g:2195:1: ( '{' )
            // InternalCuestionario.g:2196:2: '{'
            {
             before(grammarAccess.getPreguntaUnicaAccess().getLeftCurlyBracketKeyword_15()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPreguntaUnicaAccess().getLeftCurlyBracketKeyword_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__15__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__16"
    // InternalCuestionario.g:2205:1: rule__PreguntaUnica__Group__16 : rule__PreguntaUnica__Group__16__Impl rule__PreguntaUnica__Group__17 ;
    public final void rule__PreguntaUnica__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2209:1: ( rule__PreguntaUnica__Group__16__Impl rule__PreguntaUnica__Group__17 )
            // InternalCuestionario.g:2210:2: rule__PreguntaUnica__Group__16__Impl rule__PreguntaUnica__Group__17
            {
            pushFollow(FOLLOW_12);
            rule__PreguntaUnica__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__16"


    // $ANTLR start "rule__PreguntaUnica__Group__16__Impl"
    // InternalCuestionario.g:2217:1: rule__PreguntaUnica__Group__16__Impl : ( ( rule__PreguntaUnica__RespuestasAssignment_16 ) ) ;
    public final void rule__PreguntaUnica__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2221:1: ( ( ( rule__PreguntaUnica__RespuestasAssignment_16 ) ) )
            // InternalCuestionario.g:2222:1: ( ( rule__PreguntaUnica__RespuestasAssignment_16 ) )
            {
            // InternalCuestionario.g:2222:1: ( ( rule__PreguntaUnica__RespuestasAssignment_16 ) )
            // InternalCuestionario.g:2223:2: ( rule__PreguntaUnica__RespuestasAssignment_16 )
            {
             before(grammarAccess.getPreguntaUnicaAccess().getRespuestasAssignment_16()); 
            // InternalCuestionario.g:2224:2: ( rule__PreguntaUnica__RespuestasAssignment_16 )
            // InternalCuestionario.g:2224:3: rule__PreguntaUnica__RespuestasAssignment_16
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__RespuestasAssignment_16();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaUnicaAccess().getRespuestasAssignment_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__16__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__17"
    // InternalCuestionario.g:2232:1: rule__PreguntaUnica__Group__17 : rule__PreguntaUnica__Group__17__Impl rule__PreguntaUnica__Group__18 ;
    public final void rule__PreguntaUnica__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2236:1: ( rule__PreguntaUnica__Group__17__Impl rule__PreguntaUnica__Group__18 )
            // InternalCuestionario.g:2237:2: rule__PreguntaUnica__Group__17__Impl rule__PreguntaUnica__Group__18
            {
            pushFollow(FOLLOW_12);
            rule__PreguntaUnica__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__17"


    // $ANTLR start "rule__PreguntaUnica__Group__17__Impl"
    // InternalCuestionario.g:2244:1: rule__PreguntaUnica__Group__17__Impl : ( ( rule__PreguntaUnica__Group_17__0 )* ) ;
    public final void rule__PreguntaUnica__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2248:1: ( ( ( rule__PreguntaUnica__Group_17__0 )* ) )
            // InternalCuestionario.g:2249:1: ( ( rule__PreguntaUnica__Group_17__0 )* )
            {
            // InternalCuestionario.g:2249:1: ( ( rule__PreguntaUnica__Group_17__0 )* )
            // InternalCuestionario.g:2250:2: ( rule__PreguntaUnica__Group_17__0 )*
            {
             before(grammarAccess.getPreguntaUnicaAccess().getGroup_17()); 
            // InternalCuestionario.g:2251:2: ( rule__PreguntaUnica__Group_17__0 )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==22) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // InternalCuestionario.g:2251:3: rule__PreguntaUnica__Group_17__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PreguntaUnica__Group_17__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop14;
                }
            } while (true);

             after(grammarAccess.getPreguntaUnicaAccess().getGroup_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__17__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__18"
    // InternalCuestionario.g:2259:1: rule__PreguntaUnica__Group__18 : rule__PreguntaUnica__Group__18__Impl rule__PreguntaUnica__Group__19 ;
    public final void rule__PreguntaUnica__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2263:1: ( rule__PreguntaUnica__Group__18__Impl rule__PreguntaUnica__Group__19 )
            // InternalCuestionario.g:2264:2: rule__PreguntaUnica__Group__18__Impl rule__PreguntaUnica__Group__19
            {
            pushFollow(FOLLOW_15);
            rule__PreguntaUnica__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__18"


    // $ANTLR start "rule__PreguntaUnica__Group__18__Impl"
    // InternalCuestionario.g:2271:1: rule__PreguntaUnica__Group__18__Impl : ( '}' ) ;
    public final void rule__PreguntaUnica__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2275:1: ( ( '}' ) )
            // InternalCuestionario.g:2276:1: ( '}' )
            {
            // InternalCuestionario.g:2276:1: ( '}' )
            // InternalCuestionario.g:2277:2: '}'
            {
             before(grammarAccess.getPreguntaUnicaAccess().getRightCurlyBracketKeyword_18()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPreguntaUnicaAccess().getRightCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__18__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group__19"
    // InternalCuestionario.g:2286:1: rule__PreguntaUnica__Group__19 : rule__PreguntaUnica__Group__19__Impl ;
    public final void rule__PreguntaUnica__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2290:1: ( rule__PreguntaUnica__Group__19__Impl )
            // InternalCuestionario.g:2291:2: rule__PreguntaUnica__Group__19__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group__19__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__19"


    // $ANTLR start "rule__PreguntaUnica__Group__19__Impl"
    // InternalCuestionario.g:2297:1: rule__PreguntaUnica__Group__19__Impl : ( '}' ) ;
    public final void rule__PreguntaUnica__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2301:1: ( ( '}' ) )
            // InternalCuestionario.g:2302:1: ( '}' )
            {
            // InternalCuestionario.g:2302:1: ( '}' )
            // InternalCuestionario.g:2303:2: '}'
            {
             before(grammarAccess.getPreguntaUnicaAccess().getRightCurlyBracketKeyword_19()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPreguntaUnicaAccess().getRightCurlyBracketKeyword_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group__19__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group_11__0"
    // InternalCuestionario.g:2313:1: rule__PreguntaUnica__Group_11__0 : rule__PreguntaUnica__Group_11__0__Impl rule__PreguntaUnica__Group_11__1 ;
    public final void rule__PreguntaUnica__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2317:1: ( rule__PreguntaUnica__Group_11__0__Impl rule__PreguntaUnica__Group_11__1 )
            // InternalCuestionario.g:2318:2: rule__PreguntaUnica__Group_11__0__Impl rule__PreguntaUnica__Group_11__1
            {
            pushFollow(FOLLOW_5);
            rule__PreguntaUnica__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group_11__0"


    // $ANTLR start "rule__PreguntaUnica__Group_11__0__Impl"
    // InternalCuestionario.g:2325:1: rule__PreguntaUnica__Group_11__0__Impl : ( 'siguientePregunta' ) ;
    public final void rule__PreguntaUnica__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2329:1: ( ( 'siguientePregunta' ) )
            // InternalCuestionario.g:2330:1: ( 'siguientePregunta' )
            {
            // InternalCuestionario.g:2330:1: ( 'siguientePregunta' )
            // InternalCuestionario.g:2331:2: 'siguientePregunta'
            {
             before(grammarAccess.getPreguntaUnicaAccess().getSiguientePreguntaKeyword_11_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPreguntaUnicaAccess().getSiguientePreguntaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group_11__0__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group_11__1"
    // InternalCuestionario.g:2340:1: rule__PreguntaUnica__Group_11__1 : rule__PreguntaUnica__Group_11__1__Impl ;
    public final void rule__PreguntaUnica__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2344:1: ( rule__PreguntaUnica__Group_11__1__Impl )
            // InternalCuestionario.g:2345:2: rule__PreguntaUnica__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group_11__1"


    // $ANTLR start "rule__PreguntaUnica__Group_11__1__Impl"
    // InternalCuestionario.g:2351:1: rule__PreguntaUnica__Group_11__1__Impl : ( ( rule__PreguntaUnica__SiguientePreguntaAssignment_11_1 ) ) ;
    public final void rule__PreguntaUnica__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2355:1: ( ( ( rule__PreguntaUnica__SiguientePreguntaAssignment_11_1 ) ) )
            // InternalCuestionario.g:2356:1: ( ( rule__PreguntaUnica__SiguientePreguntaAssignment_11_1 ) )
            {
            // InternalCuestionario.g:2356:1: ( ( rule__PreguntaUnica__SiguientePreguntaAssignment_11_1 ) )
            // InternalCuestionario.g:2357:2: ( rule__PreguntaUnica__SiguientePreguntaAssignment_11_1 )
            {
             before(grammarAccess.getPreguntaUnicaAccess().getSiguientePreguntaAssignment_11_1()); 
            // InternalCuestionario.g:2358:2: ( rule__PreguntaUnica__SiguientePreguntaAssignment_11_1 )
            // InternalCuestionario.g:2358:3: rule__PreguntaUnica__SiguientePreguntaAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__SiguientePreguntaAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaUnicaAccess().getSiguientePreguntaAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group_11__1__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group_17__0"
    // InternalCuestionario.g:2367:1: rule__PreguntaUnica__Group_17__0 : rule__PreguntaUnica__Group_17__0__Impl rule__PreguntaUnica__Group_17__1 ;
    public final void rule__PreguntaUnica__Group_17__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2371:1: ( rule__PreguntaUnica__Group_17__0__Impl rule__PreguntaUnica__Group_17__1 )
            // InternalCuestionario.g:2372:2: rule__PreguntaUnica__Group_17__0__Impl rule__PreguntaUnica__Group_17__1
            {
            pushFollow(FOLLOW_29);
            rule__PreguntaUnica__Group_17__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group_17__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group_17__0"


    // $ANTLR start "rule__PreguntaUnica__Group_17__0__Impl"
    // InternalCuestionario.g:2379:1: rule__PreguntaUnica__Group_17__0__Impl : ( ',' ) ;
    public final void rule__PreguntaUnica__Group_17__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2383:1: ( ( ',' ) )
            // InternalCuestionario.g:2384:1: ( ',' )
            {
            // InternalCuestionario.g:2384:1: ( ',' )
            // InternalCuestionario.g:2385:2: ','
            {
             before(grammarAccess.getPreguntaUnicaAccess().getCommaKeyword_17_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPreguntaUnicaAccess().getCommaKeyword_17_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group_17__0__Impl"


    // $ANTLR start "rule__PreguntaUnica__Group_17__1"
    // InternalCuestionario.g:2394:1: rule__PreguntaUnica__Group_17__1 : rule__PreguntaUnica__Group_17__1__Impl ;
    public final void rule__PreguntaUnica__Group_17__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2398:1: ( rule__PreguntaUnica__Group_17__1__Impl )
            // InternalCuestionario.g:2399:2: rule__PreguntaUnica__Group_17__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__Group_17__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group_17__1"


    // $ANTLR start "rule__PreguntaUnica__Group_17__1__Impl"
    // InternalCuestionario.g:2405:1: rule__PreguntaUnica__Group_17__1__Impl : ( ( rule__PreguntaUnica__RespuestasAssignment_17_1 ) ) ;
    public final void rule__PreguntaUnica__Group_17__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2409:1: ( ( ( rule__PreguntaUnica__RespuestasAssignment_17_1 ) ) )
            // InternalCuestionario.g:2410:1: ( ( rule__PreguntaUnica__RespuestasAssignment_17_1 ) )
            {
            // InternalCuestionario.g:2410:1: ( ( rule__PreguntaUnica__RespuestasAssignment_17_1 ) )
            // InternalCuestionario.g:2411:2: ( rule__PreguntaUnica__RespuestasAssignment_17_1 )
            {
             before(grammarAccess.getPreguntaUnicaAccess().getRespuestasAssignment_17_1()); 
            // InternalCuestionario.g:2412:2: ( rule__PreguntaUnica__RespuestasAssignment_17_1 )
            // InternalCuestionario.g:2412:3: rule__PreguntaUnica__RespuestasAssignment_17_1
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaUnica__RespuestasAssignment_17_1();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaUnicaAccess().getRespuestasAssignment_17_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__Group_17__1__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__0"
    // InternalCuestionario.g:2421:1: rule__PreguntaMultiple__Group__0 : rule__PreguntaMultiple__Group__0__Impl rule__PreguntaMultiple__Group__1 ;
    public final void rule__PreguntaMultiple__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2425:1: ( rule__PreguntaMultiple__Group__0__Impl rule__PreguntaMultiple__Group__1 )
            // InternalCuestionario.g:2426:2: rule__PreguntaMultiple__Group__0__Impl rule__PreguntaMultiple__Group__1
            {
            pushFollow(FOLLOW_5);
            rule__PreguntaMultiple__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__0"


    // $ANTLR start "rule__PreguntaMultiple__Group__0__Impl"
    // InternalCuestionario.g:2433:1: rule__PreguntaMultiple__Group__0__Impl : ( 'PreguntaMultiple' ) ;
    public final void rule__PreguntaMultiple__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2437:1: ( ( 'PreguntaMultiple' ) )
            // InternalCuestionario.g:2438:1: ( 'PreguntaMultiple' )
            {
            // InternalCuestionario.g:2438:1: ( 'PreguntaMultiple' )
            // InternalCuestionario.g:2439:2: 'PreguntaMultiple'
            {
             before(grammarAccess.getPreguntaMultipleAccess().getPreguntaMultipleKeyword_0()); 
            match(input,38,FOLLOW_2); 
             after(grammarAccess.getPreguntaMultipleAccess().getPreguntaMultipleKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__0__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__1"
    // InternalCuestionario.g:2448:1: rule__PreguntaMultiple__Group__1 : rule__PreguntaMultiple__Group__1__Impl rule__PreguntaMultiple__Group__2 ;
    public final void rule__PreguntaMultiple__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2452:1: ( rule__PreguntaMultiple__Group__1__Impl rule__PreguntaMultiple__Group__2 )
            // InternalCuestionario.g:2453:2: rule__PreguntaMultiple__Group__1__Impl rule__PreguntaMultiple__Group__2
            {
            pushFollow(FOLLOW_3);
            rule__PreguntaMultiple__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__1"


    // $ANTLR start "rule__PreguntaMultiple__Group__1__Impl"
    // InternalCuestionario.g:2460:1: rule__PreguntaMultiple__Group__1__Impl : ( ( rule__PreguntaMultiple__NameAssignment_1 ) ) ;
    public final void rule__PreguntaMultiple__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2464:1: ( ( ( rule__PreguntaMultiple__NameAssignment_1 ) ) )
            // InternalCuestionario.g:2465:1: ( ( rule__PreguntaMultiple__NameAssignment_1 ) )
            {
            // InternalCuestionario.g:2465:1: ( ( rule__PreguntaMultiple__NameAssignment_1 ) )
            // InternalCuestionario.g:2466:2: ( rule__PreguntaMultiple__NameAssignment_1 )
            {
             before(grammarAccess.getPreguntaMultipleAccess().getNameAssignment_1()); 
            // InternalCuestionario.g:2467:2: ( rule__PreguntaMultiple__NameAssignment_1 )
            // InternalCuestionario.g:2467:3: rule__PreguntaMultiple__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaMultipleAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__1__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__2"
    // InternalCuestionario.g:2475:1: rule__PreguntaMultiple__Group__2 : rule__PreguntaMultiple__Group__2__Impl rule__PreguntaMultiple__Group__3 ;
    public final void rule__PreguntaMultiple__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2479:1: ( rule__PreguntaMultiple__Group__2__Impl rule__PreguntaMultiple__Group__3 )
            // InternalCuestionario.g:2480:2: rule__PreguntaMultiple__Group__2__Impl rule__PreguntaMultiple__Group__3
            {
            pushFollow(FOLLOW_23);
            rule__PreguntaMultiple__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__2"


    // $ANTLR start "rule__PreguntaMultiple__Group__2__Impl"
    // InternalCuestionario.g:2487:1: rule__PreguntaMultiple__Group__2__Impl : ( '{' ) ;
    public final void rule__PreguntaMultiple__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2491:1: ( ( '{' ) )
            // InternalCuestionario.g:2492:1: ( '{' )
            {
            // InternalCuestionario.g:2492:1: ( '{' )
            // InternalCuestionario.g:2493:2: '{'
            {
             before(grammarAccess.getPreguntaMultipleAccess().getLeftCurlyBracketKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPreguntaMultipleAccess().getLeftCurlyBracketKeyword_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__2__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__3"
    // InternalCuestionario.g:2502:1: rule__PreguntaMultiple__Group__3 : rule__PreguntaMultiple__Group__3__Impl rule__PreguntaMultiple__Group__4 ;
    public final void rule__PreguntaMultiple__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2506:1: ( rule__PreguntaMultiple__Group__3__Impl rule__PreguntaMultiple__Group__4 )
            // InternalCuestionario.g:2507:2: rule__PreguntaMultiple__Group__3__Impl rule__PreguntaMultiple__Group__4
            {
            pushFollow(FOLLOW_5);
            rule__PreguntaMultiple__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__3"


    // $ANTLR start "rule__PreguntaMultiple__Group__3__Impl"
    // InternalCuestionario.g:2514:1: rule__PreguntaMultiple__Group__3__Impl : ( 'enunciado' ) ;
    public final void rule__PreguntaMultiple__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2518:1: ( ( 'enunciado' ) )
            // InternalCuestionario.g:2519:1: ( 'enunciado' )
            {
            // InternalCuestionario.g:2519:1: ( 'enunciado' )
            // InternalCuestionario.g:2520:2: 'enunciado'
            {
             before(grammarAccess.getPreguntaMultipleAccess().getEnunciadoKeyword_3()); 
            match(input,31,FOLLOW_2); 
             after(grammarAccess.getPreguntaMultipleAccess().getEnunciadoKeyword_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__3__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__4"
    // InternalCuestionario.g:2529:1: rule__PreguntaMultiple__Group__4 : rule__PreguntaMultiple__Group__4__Impl rule__PreguntaMultiple__Group__5 ;
    public final void rule__PreguntaMultiple__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2533:1: ( rule__PreguntaMultiple__Group__4__Impl rule__PreguntaMultiple__Group__5 )
            // InternalCuestionario.g:2534:2: rule__PreguntaMultiple__Group__4__Impl rule__PreguntaMultiple__Group__5
            {
            pushFollow(FOLLOW_24);
            rule__PreguntaMultiple__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__5();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__4"


    // $ANTLR start "rule__PreguntaMultiple__Group__4__Impl"
    // InternalCuestionario.g:2541:1: rule__PreguntaMultiple__Group__4__Impl : ( ( rule__PreguntaMultiple__EnunciadoAssignment_4 ) ) ;
    public final void rule__PreguntaMultiple__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2545:1: ( ( ( rule__PreguntaMultiple__EnunciadoAssignment_4 ) ) )
            // InternalCuestionario.g:2546:1: ( ( rule__PreguntaMultiple__EnunciadoAssignment_4 ) )
            {
            // InternalCuestionario.g:2546:1: ( ( rule__PreguntaMultiple__EnunciadoAssignment_4 ) )
            // InternalCuestionario.g:2547:2: ( rule__PreguntaMultiple__EnunciadoAssignment_4 )
            {
             before(grammarAccess.getPreguntaMultipleAccess().getEnunciadoAssignment_4()); 
            // InternalCuestionario.g:2548:2: ( rule__PreguntaMultiple__EnunciadoAssignment_4 )
            // InternalCuestionario.g:2548:3: rule__PreguntaMultiple__EnunciadoAssignment_4
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__EnunciadoAssignment_4();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaMultipleAccess().getEnunciadoAssignment_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__4__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__5"
    // InternalCuestionario.g:2556:1: rule__PreguntaMultiple__Group__5 : rule__PreguntaMultiple__Group__5__Impl rule__PreguntaMultiple__Group__6 ;
    public final void rule__PreguntaMultiple__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2560:1: ( rule__PreguntaMultiple__Group__5__Impl rule__PreguntaMultiple__Group__6 )
            // InternalCuestionario.g:2561:2: rule__PreguntaMultiple__Group__5__Impl rule__PreguntaMultiple__Group__6
            {
            pushFollow(FOLLOW_17);
            rule__PreguntaMultiple__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__6();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__5"


    // $ANTLR start "rule__PreguntaMultiple__Group__5__Impl"
    // InternalCuestionario.g:2568:1: rule__PreguntaMultiple__Group__5__Impl : ( 'puntuacion' ) ;
    public final void rule__PreguntaMultiple__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2572:1: ( ( 'puntuacion' ) )
            // InternalCuestionario.g:2573:1: ( 'puntuacion' )
            {
            // InternalCuestionario.g:2573:1: ( 'puntuacion' )
            // InternalCuestionario.g:2574:2: 'puntuacion'
            {
             before(grammarAccess.getPreguntaMultipleAccess().getPuntuacionKeyword_5()); 
            match(input,32,FOLLOW_2); 
             after(grammarAccess.getPreguntaMultipleAccess().getPuntuacionKeyword_5()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__5__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__6"
    // InternalCuestionario.g:2583:1: rule__PreguntaMultiple__Group__6 : rule__PreguntaMultiple__Group__6__Impl rule__PreguntaMultiple__Group__7 ;
    public final void rule__PreguntaMultiple__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2587:1: ( rule__PreguntaMultiple__Group__6__Impl rule__PreguntaMultiple__Group__7 )
            // InternalCuestionario.g:2588:2: rule__PreguntaMultiple__Group__6__Impl rule__PreguntaMultiple__Group__7
            {
            pushFollow(FOLLOW_25);
            rule__PreguntaMultiple__Group__6__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__7();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__6"


    // $ANTLR start "rule__PreguntaMultiple__Group__6__Impl"
    // InternalCuestionario.g:2595:1: rule__PreguntaMultiple__Group__6__Impl : ( ( rule__PreguntaMultiple__PuntuacionAssignment_6 ) ) ;
    public final void rule__PreguntaMultiple__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2599:1: ( ( ( rule__PreguntaMultiple__PuntuacionAssignment_6 ) ) )
            // InternalCuestionario.g:2600:1: ( ( rule__PreguntaMultiple__PuntuacionAssignment_6 ) )
            {
            // InternalCuestionario.g:2600:1: ( ( rule__PreguntaMultiple__PuntuacionAssignment_6 ) )
            // InternalCuestionario.g:2601:2: ( rule__PreguntaMultiple__PuntuacionAssignment_6 )
            {
             before(grammarAccess.getPreguntaMultipleAccess().getPuntuacionAssignment_6()); 
            // InternalCuestionario.g:2602:2: ( rule__PreguntaMultiple__PuntuacionAssignment_6 )
            // InternalCuestionario.g:2602:3: rule__PreguntaMultiple__PuntuacionAssignment_6
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__PuntuacionAssignment_6();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaMultipleAccess().getPuntuacionAssignment_6()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__6__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__7"
    // InternalCuestionario.g:2610:1: rule__PreguntaMultiple__Group__7 : rule__PreguntaMultiple__Group__7__Impl rule__PreguntaMultiple__Group__8 ;
    public final void rule__PreguntaMultiple__Group__7() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2614:1: ( rule__PreguntaMultiple__Group__7__Impl rule__PreguntaMultiple__Group__8 )
            // InternalCuestionario.g:2615:2: rule__PreguntaMultiple__Group__7__Impl rule__PreguntaMultiple__Group__8
            {
            pushFollow(FOLLOW_17);
            rule__PreguntaMultiple__Group__7__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__8();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__7"


    // $ANTLR start "rule__PreguntaMultiple__Group__7__Impl"
    // InternalCuestionario.g:2622:1: rule__PreguntaMultiple__Group__7__Impl : ( 'penalizacion' ) ;
    public final void rule__PreguntaMultiple__Group__7__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2626:1: ( ( 'penalizacion' ) )
            // InternalCuestionario.g:2627:1: ( 'penalizacion' )
            {
            // InternalCuestionario.g:2627:1: ( 'penalizacion' )
            // InternalCuestionario.g:2628:2: 'penalizacion'
            {
             before(grammarAccess.getPreguntaMultipleAccess().getPenalizacionKeyword_7()); 
            match(input,33,FOLLOW_2); 
             after(grammarAccess.getPreguntaMultipleAccess().getPenalizacionKeyword_7()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__7__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__8"
    // InternalCuestionario.g:2637:1: rule__PreguntaMultiple__Group__8 : rule__PreguntaMultiple__Group__8__Impl rule__PreguntaMultiple__Group__9 ;
    public final void rule__PreguntaMultiple__Group__8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2641:1: ( rule__PreguntaMultiple__Group__8__Impl rule__PreguntaMultiple__Group__9 )
            // InternalCuestionario.g:2642:2: rule__PreguntaMultiple__Group__8__Impl rule__PreguntaMultiple__Group__9
            {
            pushFollow(FOLLOW_26);
            rule__PreguntaMultiple__Group__8__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__9();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__8"


    // $ANTLR start "rule__PreguntaMultiple__Group__8__Impl"
    // InternalCuestionario.g:2649:1: rule__PreguntaMultiple__Group__8__Impl : ( ( rule__PreguntaMultiple__PenalizacionAssignment_8 ) ) ;
    public final void rule__PreguntaMultiple__Group__8__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2653:1: ( ( ( rule__PreguntaMultiple__PenalizacionAssignment_8 ) ) )
            // InternalCuestionario.g:2654:1: ( ( rule__PreguntaMultiple__PenalizacionAssignment_8 ) )
            {
            // InternalCuestionario.g:2654:1: ( ( rule__PreguntaMultiple__PenalizacionAssignment_8 ) )
            // InternalCuestionario.g:2655:2: ( rule__PreguntaMultiple__PenalizacionAssignment_8 )
            {
             before(grammarAccess.getPreguntaMultipleAccess().getPenalizacionAssignment_8()); 
            // InternalCuestionario.g:2656:2: ( rule__PreguntaMultiple__PenalizacionAssignment_8 )
            // InternalCuestionario.g:2656:3: rule__PreguntaMultiple__PenalizacionAssignment_8
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__PenalizacionAssignment_8();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaMultipleAccess().getPenalizacionAssignment_8()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__8__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__9"
    // InternalCuestionario.g:2664:1: rule__PreguntaMultiple__Group__9 : rule__PreguntaMultiple__Group__9__Impl rule__PreguntaMultiple__Group__10 ;
    public final void rule__PreguntaMultiple__Group__9() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2668:1: ( rule__PreguntaMultiple__Group__9__Impl rule__PreguntaMultiple__Group__10 )
            // InternalCuestionario.g:2669:2: rule__PreguntaMultiple__Group__9__Impl rule__PreguntaMultiple__Group__10
            {
            pushFollow(FOLLOW_5);
            rule__PreguntaMultiple__Group__9__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__10();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__9"


    // $ANTLR start "rule__PreguntaMultiple__Group__9__Impl"
    // InternalCuestionario.g:2676:1: rule__PreguntaMultiple__Group__9__Impl : ( 'categoria' ) ;
    public final void rule__PreguntaMultiple__Group__9__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2680:1: ( ( 'categoria' ) )
            // InternalCuestionario.g:2681:1: ( 'categoria' )
            {
            // InternalCuestionario.g:2681:1: ( 'categoria' )
            // InternalCuestionario.g:2682:2: 'categoria'
            {
             before(grammarAccess.getPreguntaMultipleAccess().getCategoriaKeyword_9()); 
            match(input,34,FOLLOW_2); 
             after(grammarAccess.getPreguntaMultipleAccess().getCategoriaKeyword_9()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__9__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__10"
    // InternalCuestionario.g:2691:1: rule__PreguntaMultiple__Group__10 : rule__PreguntaMultiple__Group__10__Impl rule__PreguntaMultiple__Group__11 ;
    public final void rule__PreguntaMultiple__Group__10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2695:1: ( rule__PreguntaMultiple__Group__10__Impl rule__PreguntaMultiple__Group__11 )
            // InternalCuestionario.g:2696:2: rule__PreguntaMultiple__Group__10__Impl rule__PreguntaMultiple__Group__11
            {
            pushFollow(FOLLOW_30);
            rule__PreguntaMultiple__Group__10__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__11();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__10"


    // $ANTLR start "rule__PreguntaMultiple__Group__10__Impl"
    // InternalCuestionario.g:2703:1: rule__PreguntaMultiple__Group__10__Impl : ( ( rule__PreguntaMultiple__CategoriaAssignment_10 ) ) ;
    public final void rule__PreguntaMultiple__Group__10__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2707:1: ( ( ( rule__PreguntaMultiple__CategoriaAssignment_10 ) ) )
            // InternalCuestionario.g:2708:1: ( ( rule__PreguntaMultiple__CategoriaAssignment_10 ) )
            {
            // InternalCuestionario.g:2708:1: ( ( rule__PreguntaMultiple__CategoriaAssignment_10 ) )
            // InternalCuestionario.g:2709:2: ( rule__PreguntaMultiple__CategoriaAssignment_10 )
            {
             before(grammarAccess.getPreguntaMultipleAccess().getCategoriaAssignment_10()); 
            // InternalCuestionario.g:2710:2: ( rule__PreguntaMultiple__CategoriaAssignment_10 )
            // InternalCuestionario.g:2710:3: rule__PreguntaMultiple__CategoriaAssignment_10
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__CategoriaAssignment_10();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaMultipleAccess().getCategoriaAssignment_10()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__10__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__11"
    // InternalCuestionario.g:2718:1: rule__PreguntaMultiple__Group__11 : rule__PreguntaMultiple__Group__11__Impl rule__PreguntaMultiple__Group__12 ;
    public final void rule__PreguntaMultiple__Group__11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2722:1: ( rule__PreguntaMultiple__Group__11__Impl rule__PreguntaMultiple__Group__12 )
            // InternalCuestionario.g:2723:2: rule__PreguntaMultiple__Group__11__Impl rule__PreguntaMultiple__Group__12
            {
            pushFollow(FOLLOW_30);
            rule__PreguntaMultiple__Group__11__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__12();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__11"


    // $ANTLR start "rule__PreguntaMultiple__Group__11__Impl"
    // InternalCuestionario.g:2730:1: rule__PreguntaMultiple__Group__11__Impl : ( ( rule__PreguntaMultiple__Group_11__0 )? ) ;
    public final void rule__PreguntaMultiple__Group__11__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2734:1: ( ( ( rule__PreguntaMultiple__Group_11__0 )? ) )
            // InternalCuestionario.g:2735:1: ( ( rule__PreguntaMultiple__Group_11__0 )? )
            {
            // InternalCuestionario.g:2735:1: ( ( rule__PreguntaMultiple__Group_11__0 )? )
            // InternalCuestionario.g:2736:2: ( rule__PreguntaMultiple__Group_11__0 )?
            {
             before(grammarAccess.getPreguntaMultipleAccess().getGroup_11()); 
            // InternalCuestionario.g:2737:2: ( rule__PreguntaMultiple__Group_11__0 )?
            int alt15=2;
            int LA15_0 = input.LA(1);

            if ( (LA15_0==37) ) {
                alt15=1;
            }
            switch (alt15) {
                case 1 :
                    // InternalCuestionario.g:2737:3: rule__PreguntaMultiple__Group_11__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PreguntaMultiple__Group_11__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getPreguntaMultipleAccess().getGroup_11()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__11__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__12"
    // InternalCuestionario.g:2745:1: rule__PreguntaMultiple__Group__12 : rule__PreguntaMultiple__Group__12__Impl rule__PreguntaMultiple__Group__13 ;
    public final void rule__PreguntaMultiple__Group__12() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2749:1: ( rule__PreguntaMultiple__Group__12__Impl rule__PreguntaMultiple__Group__13 )
            // InternalCuestionario.g:2750:2: rule__PreguntaMultiple__Group__12__Impl rule__PreguntaMultiple__Group__13
            {
            pushFollow(FOLLOW_7);
            rule__PreguntaMultiple__Group__12__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__13();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__12"


    // $ANTLR start "rule__PreguntaMultiple__Group__12__Impl"
    // InternalCuestionario.g:2757:1: rule__PreguntaMultiple__Group__12__Impl : ( 'correctas' ) ;
    public final void rule__PreguntaMultiple__Group__12__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2761:1: ( ( 'correctas' ) )
            // InternalCuestionario.g:2762:1: ( 'correctas' )
            {
            // InternalCuestionario.g:2762:1: ( 'correctas' )
            // InternalCuestionario.g:2763:2: 'correctas'
            {
             before(grammarAccess.getPreguntaMultipleAccess().getCorrectasKeyword_12()); 
            match(input,39,FOLLOW_2); 
             after(grammarAccess.getPreguntaMultipleAccess().getCorrectasKeyword_12()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__12__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__13"
    // InternalCuestionario.g:2772:1: rule__PreguntaMultiple__Group__13 : rule__PreguntaMultiple__Group__13__Impl rule__PreguntaMultiple__Group__14 ;
    public final void rule__PreguntaMultiple__Group__13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2776:1: ( rule__PreguntaMultiple__Group__13__Impl rule__PreguntaMultiple__Group__14 )
            // InternalCuestionario.g:2777:2: rule__PreguntaMultiple__Group__13__Impl rule__PreguntaMultiple__Group__14
            {
            pushFollow(FOLLOW_5);
            rule__PreguntaMultiple__Group__13__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__14();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__13"


    // $ANTLR start "rule__PreguntaMultiple__Group__13__Impl"
    // InternalCuestionario.g:2784:1: rule__PreguntaMultiple__Group__13__Impl : ( '(' ) ;
    public final void rule__PreguntaMultiple__Group__13__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2788:1: ( ( '(' ) )
            // InternalCuestionario.g:2789:1: ( '(' )
            {
            // InternalCuestionario.g:2789:1: ( '(' )
            // InternalCuestionario.g:2790:2: '('
            {
             before(grammarAccess.getPreguntaMultipleAccess().getLeftParenthesisKeyword_13()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getPreguntaMultipleAccess().getLeftParenthesisKeyword_13()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__13__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__14"
    // InternalCuestionario.g:2799:1: rule__PreguntaMultiple__Group__14 : rule__PreguntaMultiple__Group__14__Impl rule__PreguntaMultiple__Group__15 ;
    public final void rule__PreguntaMultiple__Group__14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2803:1: ( rule__PreguntaMultiple__Group__14__Impl rule__PreguntaMultiple__Group__15 )
            // InternalCuestionario.g:2804:2: rule__PreguntaMultiple__Group__14__Impl rule__PreguntaMultiple__Group__15
            {
            pushFollow(FOLLOW_8);
            rule__PreguntaMultiple__Group__14__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__15();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__14"


    // $ANTLR start "rule__PreguntaMultiple__Group__14__Impl"
    // InternalCuestionario.g:2811:1: rule__PreguntaMultiple__Group__14__Impl : ( ( rule__PreguntaMultiple__CorrectasAssignment_14 ) ) ;
    public final void rule__PreguntaMultiple__Group__14__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2815:1: ( ( ( rule__PreguntaMultiple__CorrectasAssignment_14 ) ) )
            // InternalCuestionario.g:2816:1: ( ( rule__PreguntaMultiple__CorrectasAssignment_14 ) )
            {
            // InternalCuestionario.g:2816:1: ( ( rule__PreguntaMultiple__CorrectasAssignment_14 ) )
            // InternalCuestionario.g:2817:2: ( rule__PreguntaMultiple__CorrectasAssignment_14 )
            {
             before(grammarAccess.getPreguntaMultipleAccess().getCorrectasAssignment_14()); 
            // InternalCuestionario.g:2818:2: ( rule__PreguntaMultiple__CorrectasAssignment_14 )
            // InternalCuestionario.g:2818:3: rule__PreguntaMultiple__CorrectasAssignment_14
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__CorrectasAssignment_14();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaMultipleAccess().getCorrectasAssignment_14()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__14__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__15"
    // InternalCuestionario.g:2826:1: rule__PreguntaMultiple__Group__15 : rule__PreguntaMultiple__Group__15__Impl rule__PreguntaMultiple__Group__16 ;
    public final void rule__PreguntaMultiple__Group__15() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2830:1: ( rule__PreguntaMultiple__Group__15__Impl rule__PreguntaMultiple__Group__16 )
            // InternalCuestionario.g:2831:2: rule__PreguntaMultiple__Group__15__Impl rule__PreguntaMultiple__Group__16
            {
            pushFollow(FOLLOW_8);
            rule__PreguntaMultiple__Group__15__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__16();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__15"


    // $ANTLR start "rule__PreguntaMultiple__Group__15__Impl"
    // InternalCuestionario.g:2838:1: rule__PreguntaMultiple__Group__15__Impl : ( ( rule__PreguntaMultiple__Group_15__0 )* ) ;
    public final void rule__PreguntaMultiple__Group__15__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2842:1: ( ( ( rule__PreguntaMultiple__Group_15__0 )* ) )
            // InternalCuestionario.g:2843:1: ( ( rule__PreguntaMultiple__Group_15__0 )* )
            {
            // InternalCuestionario.g:2843:1: ( ( rule__PreguntaMultiple__Group_15__0 )* )
            // InternalCuestionario.g:2844:2: ( rule__PreguntaMultiple__Group_15__0 )*
            {
             before(grammarAccess.getPreguntaMultipleAccess().getGroup_15()); 
            // InternalCuestionario.g:2845:2: ( rule__PreguntaMultiple__Group_15__0 )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==22) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // InternalCuestionario.g:2845:3: rule__PreguntaMultiple__Group_15__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PreguntaMultiple__Group_15__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);

             after(grammarAccess.getPreguntaMultipleAccess().getGroup_15()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__15__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__16"
    // InternalCuestionario.g:2853:1: rule__PreguntaMultiple__Group__16 : rule__PreguntaMultiple__Group__16__Impl rule__PreguntaMultiple__Group__17 ;
    public final void rule__PreguntaMultiple__Group__16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2857:1: ( rule__PreguntaMultiple__Group__16__Impl rule__PreguntaMultiple__Group__17 )
            // InternalCuestionario.g:2858:2: rule__PreguntaMultiple__Group__16__Impl rule__PreguntaMultiple__Group__17
            {
            pushFollow(FOLLOW_28);
            rule__PreguntaMultiple__Group__16__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__17();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__16"


    // $ANTLR start "rule__PreguntaMultiple__Group__16__Impl"
    // InternalCuestionario.g:2865:1: rule__PreguntaMultiple__Group__16__Impl : ( ')' ) ;
    public final void rule__PreguntaMultiple__Group__16__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2869:1: ( ( ')' ) )
            // InternalCuestionario.g:2870:1: ( ')' )
            {
            // InternalCuestionario.g:2870:1: ( ')' )
            // InternalCuestionario.g:2871:2: ')'
            {
             before(grammarAccess.getPreguntaMultipleAccess().getRightParenthesisKeyword_16()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPreguntaMultipleAccess().getRightParenthesisKeyword_16()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__16__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__17"
    // InternalCuestionario.g:2880:1: rule__PreguntaMultiple__Group__17 : rule__PreguntaMultiple__Group__17__Impl rule__PreguntaMultiple__Group__18 ;
    public final void rule__PreguntaMultiple__Group__17() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2884:1: ( rule__PreguntaMultiple__Group__17__Impl rule__PreguntaMultiple__Group__18 )
            // InternalCuestionario.g:2885:2: rule__PreguntaMultiple__Group__17__Impl rule__PreguntaMultiple__Group__18
            {
            pushFollow(FOLLOW_3);
            rule__PreguntaMultiple__Group__17__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__18();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__17"


    // $ANTLR start "rule__PreguntaMultiple__Group__17__Impl"
    // InternalCuestionario.g:2892:1: rule__PreguntaMultiple__Group__17__Impl : ( 'respuestas' ) ;
    public final void rule__PreguntaMultiple__Group__17__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2896:1: ( ( 'respuestas' ) )
            // InternalCuestionario.g:2897:1: ( 'respuestas' )
            {
            // InternalCuestionario.g:2897:1: ( 'respuestas' )
            // InternalCuestionario.g:2898:2: 'respuestas'
            {
             before(grammarAccess.getPreguntaMultipleAccess().getRespuestasKeyword_17()); 
            match(input,36,FOLLOW_2); 
             after(grammarAccess.getPreguntaMultipleAccess().getRespuestasKeyword_17()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__17__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__18"
    // InternalCuestionario.g:2907:1: rule__PreguntaMultiple__Group__18 : rule__PreguntaMultiple__Group__18__Impl rule__PreguntaMultiple__Group__19 ;
    public final void rule__PreguntaMultiple__Group__18() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2911:1: ( rule__PreguntaMultiple__Group__18__Impl rule__PreguntaMultiple__Group__19 )
            // InternalCuestionario.g:2912:2: rule__PreguntaMultiple__Group__18__Impl rule__PreguntaMultiple__Group__19
            {
            pushFollow(FOLLOW_29);
            rule__PreguntaMultiple__Group__18__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__19();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__18"


    // $ANTLR start "rule__PreguntaMultiple__Group__18__Impl"
    // InternalCuestionario.g:2919:1: rule__PreguntaMultiple__Group__18__Impl : ( '{' ) ;
    public final void rule__PreguntaMultiple__Group__18__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2923:1: ( ( '{' ) )
            // InternalCuestionario.g:2924:1: ( '{' )
            {
            // InternalCuestionario.g:2924:1: ( '{' )
            // InternalCuestionario.g:2925:2: '{'
            {
             before(grammarAccess.getPreguntaMultipleAccess().getLeftCurlyBracketKeyword_18()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getPreguntaMultipleAccess().getLeftCurlyBracketKeyword_18()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__18__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__19"
    // InternalCuestionario.g:2934:1: rule__PreguntaMultiple__Group__19 : rule__PreguntaMultiple__Group__19__Impl rule__PreguntaMultiple__Group__20 ;
    public final void rule__PreguntaMultiple__Group__19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2938:1: ( rule__PreguntaMultiple__Group__19__Impl rule__PreguntaMultiple__Group__20 )
            // InternalCuestionario.g:2939:2: rule__PreguntaMultiple__Group__19__Impl rule__PreguntaMultiple__Group__20
            {
            pushFollow(FOLLOW_12);
            rule__PreguntaMultiple__Group__19__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__20();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__19"


    // $ANTLR start "rule__PreguntaMultiple__Group__19__Impl"
    // InternalCuestionario.g:2946:1: rule__PreguntaMultiple__Group__19__Impl : ( ( rule__PreguntaMultiple__RespuestasAssignment_19 ) ) ;
    public final void rule__PreguntaMultiple__Group__19__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2950:1: ( ( ( rule__PreguntaMultiple__RespuestasAssignment_19 ) ) )
            // InternalCuestionario.g:2951:1: ( ( rule__PreguntaMultiple__RespuestasAssignment_19 ) )
            {
            // InternalCuestionario.g:2951:1: ( ( rule__PreguntaMultiple__RespuestasAssignment_19 ) )
            // InternalCuestionario.g:2952:2: ( rule__PreguntaMultiple__RespuestasAssignment_19 )
            {
             before(grammarAccess.getPreguntaMultipleAccess().getRespuestasAssignment_19()); 
            // InternalCuestionario.g:2953:2: ( rule__PreguntaMultiple__RespuestasAssignment_19 )
            // InternalCuestionario.g:2953:3: rule__PreguntaMultiple__RespuestasAssignment_19
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__RespuestasAssignment_19();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaMultipleAccess().getRespuestasAssignment_19()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__19__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__20"
    // InternalCuestionario.g:2961:1: rule__PreguntaMultiple__Group__20 : rule__PreguntaMultiple__Group__20__Impl rule__PreguntaMultiple__Group__21 ;
    public final void rule__PreguntaMultiple__Group__20() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2965:1: ( rule__PreguntaMultiple__Group__20__Impl rule__PreguntaMultiple__Group__21 )
            // InternalCuestionario.g:2966:2: rule__PreguntaMultiple__Group__20__Impl rule__PreguntaMultiple__Group__21
            {
            pushFollow(FOLLOW_12);
            rule__PreguntaMultiple__Group__20__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__21();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__20"


    // $ANTLR start "rule__PreguntaMultiple__Group__20__Impl"
    // InternalCuestionario.g:2973:1: rule__PreguntaMultiple__Group__20__Impl : ( ( rule__PreguntaMultiple__Group_20__0 )* ) ;
    public final void rule__PreguntaMultiple__Group__20__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2977:1: ( ( ( rule__PreguntaMultiple__Group_20__0 )* ) )
            // InternalCuestionario.g:2978:1: ( ( rule__PreguntaMultiple__Group_20__0 )* )
            {
            // InternalCuestionario.g:2978:1: ( ( rule__PreguntaMultiple__Group_20__0 )* )
            // InternalCuestionario.g:2979:2: ( rule__PreguntaMultiple__Group_20__0 )*
            {
             before(grammarAccess.getPreguntaMultipleAccess().getGroup_20()); 
            // InternalCuestionario.g:2980:2: ( rule__PreguntaMultiple__Group_20__0 )*
            loop17:
            do {
                int alt17=2;
                int LA17_0 = input.LA(1);

                if ( (LA17_0==22) ) {
                    alt17=1;
                }


                switch (alt17) {
            	case 1 :
            	    // InternalCuestionario.g:2980:3: rule__PreguntaMultiple__Group_20__0
            	    {
            	    pushFollow(FOLLOW_9);
            	    rule__PreguntaMultiple__Group_20__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop17;
                }
            } while (true);

             after(grammarAccess.getPreguntaMultipleAccess().getGroup_20()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__20__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__21"
    // InternalCuestionario.g:2988:1: rule__PreguntaMultiple__Group__21 : rule__PreguntaMultiple__Group__21__Impl rule__PreguntaMultiple__Group__22 ;
    public final void rule__PreguntaMultiple__Group__21() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:2992:1: ( rule__PreguntaMultiple__Group__21__Impl rule__PreguntaMultiple__Group__22 )
            // InternalCuestionario.g:2993:2: rule__PreguntaMultiple__Group__21__Impl rule__PreguntaMultiple__Group__22
            {
            pushFollow(FOLLOW_15);
            rule__PreguntaMultiple__Group__21__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__22();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__21"


    // $ANTLR start "rule__PreguntaMultiple__Group__21__Impl"
    // InternalCuestionario.g:3000:1: rule__PreguntaMultiple__Group__21__Impl : ( '}' ) ;
    public final void rule__PreguntaMultiple__Group__21__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3004:1: ( ( '}' ) )
            // InternalCuestionario.g:3005:1: ( '}' )
            {
            // InternalCuestionario.g:3005:1: ( '}' )
            // InternalCuestionario.g:3006:2: '}'
            {
             before(grammarAccess.getPreguntaMultipleAccess().getRightCurlyBracketKeyword_21()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPreguntaMultipleAccess().getRightCurlyBracketKeyword_21()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__21__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group__22"
    // InternalCuestionario.g:3015:1: rule__PreguntaMultiple__Group__22 : rule__PreguntaMultiple__Group__22__Impl ;
    public final void rule__PreguntaMultiple__Group__22() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3019:1: ( rule__PreguntaMultiple__Group__22__Impl )
            // InternalCuestionario.g:3020:2: rule__PreguntaMultiple__Group__22__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group__22__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__22"


    // $ANTLR start "rule__PreguntaMultiple__Group__22__Impl"
    // InternalCuestionario.g:3026:1: rule__PreguntaMultiple__Group__22__Impl : ( '}' ) ;
    public final void rule__PreguntaMultiple__Group__22__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3030:1: ( ( '}' ) )
            // InternalCuestionario.g:3031:1: ( '}' )
            {
            // InternalCuestionario.g:3031:1: ( '}' )
            // InternalCuestionario.g:3032:2: '}'
            {
             before(grammarAccess.getPreguntaMultipleAccess().getRightCurlyBracketKeyword_22()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPreguntaMultipleAccess().getRightCurlyBracketKeyword_22()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group__22__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group_11__0"
    // InternalCuestionario.g:3042:1: rule__PreguntaMultiple__Group_11__0 : rule__PreguntaMultiple__Group_11__0__Impl rule__PreguntaMultiple__Group_11__1 ;
    public final void rule__PreguntaMultiple__Group_11__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3046:1: ( rule__PreguntaMultiple__Group_11__0__Impl rule__PreguntaMultiple__Group_11__1 )
            // InternalCuestionario.g:3047:2: rule__PreguntaMultiple__Group_11__0__Impl rule__PreguntaMultiple__Group_11__1
            {
            pushFollow(FOLLOW_5);
            rule__PreguntaMultiple__Group_11__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group_11__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group_11__0"


    // $ANTLR start "rule__PreguntaMultiple__Group_11__0__Impl"
    // InternalCuestionario.g:3054:1: rule__PreguntaMultiple__Group_11__0__Impl : ( 'siguientePregunta' ) ;
    public final void rule__PreguntaMultiple__Group_11__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3058:1: ( ( 'siguientePregunta' ) )
            // InternalCuestionario.g:3059:1: ( 'siguientePregunta' )
            {
            // InternalCuestionario.g:3059:1: ( 'siguientePregunta' )
            // InternalCuestionario.g:3060:2: 'siguientePregunta'
            {
             before(grammarAccess.getPreguntaMultipleAccess().getSiguientePreguntaKeyword_11_0()); 
            match(input,37,FOLLOW_2); 
             after(grammarAccess.getPreguntaMultipleAccess().getSiguientePreguntaKeyword_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group_11__0__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group_11__1"
    // InternalCuestionario.g:3069:1: rule__PreguntaMultiple__Group_11__1 : rule__PreguntaMultiple__Group_11__1__Impl ;
    public final void rule__PreguntaMultiple__Group_11__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3073:1: ( rule__PreguntaMultiple__Group_11__1__Impl )
            // InternalCuestionario.g:3074:2: rule__PreguntaMultiple__Group_11__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group_11__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group_11__1"


    // $ANTLR start "rule__PreguntaMultiple__Group_11__1__Impl"
    // InternalCuestionario.g:3080:1: rule__PreguntaMultiple__Group_11__1__Impl : ( ( rule__PreguntaMultiple__SiguientePreguntaAssignment_11_1 ) ) ;
    public final void rule__PreguntaMultiple__Group_11__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3084:1: ( ( ( rule__PreguntaMultiple__SiguientePreguntaAssignment_11_1 ) ) )
            // InternalCuestionario.g:3085:1: ( ( rule__PreguntaMultiple__SiguientePreguntaAssignment_11_1 ) )
            {
            // InternalCuestionario.g:3085:1: ( ( rule__PreguntaMultiple__SiguientePreguntaAssignment_11_1 ) )
            // InternalCuestionario.g:3086:2: ( rule__PreguntaMultiple__SiguientePreguntaAssignment_11_1 )
            {
             before(grammarAccess.getPreguntaMultipleAccess().getSiguientePreguntaAssignment_11_1()); 
            // InternalCuestionario.g:3087:2: ( rule__PreguntaMultiple__SiguientePreguntaAssignment_11_1 )
            // InternalCuestionario.g:3087:3: rule__PreguntaMultiple__SiguientePreguntaAssignment_11_1
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__SiguientePreguntaAssignment_11_1();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaMultipleAccess().getSiguientePreguntaAssignment_11_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group_11__1__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group_15__0"
    // InternalCuestionario.g:3096:1: rule__PreguntaMultiple__Group_15__0 : rule__PreguntaMultiple__Group_15__0__Impl rule__PreguntaMultiple__Group_15__1 ;
    public final void rule__PreguntaMultiple__Group_15__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3100:1: ( rule__PreguntaMultiple__Group_15__0__Impl rule__PreguntaMultiple__Group_15__1 )
            // InternalCuestionario.g:3101:2: rule__PreguntaMultiple__Group_15__0__Impl rule__PreguntaMultiple__Group_15__1
            {
            pushFollow(FOLLOW_5);
            rule__PreguntaMultiple__Group_15__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group_15__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group_15__0"


    // $ANTLR start "rule__PreguntaMultiple__Group_15__0__Impl"
    // InternalCuestionario.g:3108:1: rule__PreguntaMultiple__Group_15__0__Impl : ( ',' ) ;
    public final void rule__PreguntaMultiple__Group_15__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3112:1: ( ( ',' ) )
            // InternalCuestionario.g:3113:1: ( ',' )
            {
            // InternalCuestionario.g:3113:1: ( ',' )
            // InternalCuestionario.g:3114:2: ','
            {
             before(grammarAccess.getPreguntaMultipleAccess().getCommaKeyword_15_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPreguntaMultipleAccess().getCommaKeyword_15_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group_15__0__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group_15__1"
    // InternalCuestionario.g:3123:1: rule__PreguntaMultiple__Group_15__1 : rule__PreguntaMultiple__Group_15__1__Impl ;
    public final void rule__PreguntaMultiple__Group_15__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3127:1: ( rule__PreguntaMultiple__Group_15__1__Impl )
            // InternalCuestionario.g:3128:2: rule__PreguntaMultiple__Group_15__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group_15__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group_15__1"


    // $ANTLR start "rule__PreguntaMultiple__Group_15__1__Impl"
    // InternalCuestionario.g:3134:1: rule__PreguntaMultiple__Group_15__1__Impl : ( ( rule__PreguntaMultiple__CorrectasAssignment_15_1 ) ) ;
    public final void rule__PreguntaMultiple__Group_15__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3138:1: ( ( ( rule__PreguntaMultiple__CorrectasAssignment_15_1 ) ) )
            // InternalCuestionario.g:3139:1: ( ( rule__PreguntaMultiple__CorrectasAssignment_15_1 ) )
            {
            // InternalCuestionario.g:3139:1: ( ( rule__PreguntaMultiple__CorrectasAssignment_15_1 ) )
            // InternalCuestionario.g:3140:2: ( rule__PreguntaMultiple__CorrectasAssignment_15_1 )
            {
             before(grammarAccess.getPreguntaMultipleAccess().getCorrectasAssignment_15_1()); 
            // InternalCuestionario.g:3141:2: ( rule__PreguntaMultiple__CorrectasAssignment_15_1 )
            // InternalCuestionario.g:3141:3: rule__PreguntaMultiple__CorrectasAssignment_15_1
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__CorrectasAssignment_15_1();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaMultipleAccess().getCorrectasAssignment_15_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group_15__1__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group_20__0"
    // InternalCuestionario.g:3150:1: rule__PreguntaMultiple__Group_20__0 : rule__PreguntaMultiple__Group_20__0__Impl rule__PreguntaMultiple__Group_20__1 ;
    public final void rule__PreguntaMultiple__Group_20__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3154:1: ( rule__PreguntaMultiple__Group_20__0__Impl rule__PreguntaMultiple__Group_20__1 )
            // InternalCuestionario.g:3155:2: rule__PreguntaMultiple__Group_20__0__Impl rule__PreguntaMultiple__Group_20__1
            {
            pushFollow(FOLLOW_29);
            rule__PreguntaMultiple__Group_20__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group_20__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group_20__0"


    // $ANTLR start "rule__PreguntaMultiple__Group_20__0__Impl"
    // InternalCuestionario.g:3162:1: rule__PreguntaMultiple__Group_20__0__Impl : ( ',' ) ;
    public final void rule__PreguntaMultiple__Group_20__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3166:1: ( ( ',' ) )
            // InternalCuestionario.g:3167:1: ( ',' )
            {
            // InternalCuestionario.g:3167:1: ( ',' )
            // InternalCuestionario.g:3168:2: ','
            {
             before(grammarAccess.getPreguntaMultipleAccess().getCommaKeyword_20_0()); 
            match(input,22,FOLLOW_2); 
             after(grammarAccess.getPreguntaMultipleAccess().getCommaKeyword_20_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group_20__0__Impl"


    // $ANTLR start "rule__PreguntaMultiple__Group_20__1"
    // InternalCuestionario.g:3177:1: rule__PreguntaMultiple__Group_20__1 : rule__PreguntaMultiple__Group_20__1__Impl ;
    public final void rule__PreguntaMultiple__Group_20__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3181:1: ( rule__PreguntaMultiple__Group_20__1__Impl )
            // InternalCuestionario.g:3182:2: rule__PreguntaMultiple__Group_20__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__Group_20__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group_20__1"


    // $ANTLR start "rule__PreguntaMultiple__Group_20__1__Impl"
    // InternalCuestionario.g:3188:1: rule__PreguntaMultiple__Group_20__1__Impl : ( ( rule__PreguntaMultiple__RespuestasAssignment_20_1 ) ) ;
    public final void rule__PreguntaMultiple__Group_20__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3192:1: ( ( ( rule__PreguntaMultiple__RespuestasAssignment_20_1 ) ) )
            // InternalCuestionario.g:3193:1: ( ( rule__PreguntaMultiple__RespuestasAssignment_20_1 ) )
            {
            // InternalCuestionario.g:3193:1: ( ( rule__PreguntaMultiple__RespuestasAssignment_20_1 ) )
            // InternalCuestionario.g:3194:2: ( rule__PreguntaMultiple__RespuestasAssignment_20_1 )
            {
             before(grammarAccess.getPreguntaMultipleAccess().getRespuestasAssignment_20_1()); 
            // InternalCuestionario.g:3195:2: ( rule__PreguntaMultiple__RespuestasAssignment_20_1 )
            // InternalCuestionario.g:3195:3: rule__PreguntaMultiple__RespuestasAssignment_20_1
            {
            pushFollow(FOLLOW_2);
            rule__PreguntaMultiple__RespuestasAssignment_20_1();

            state._fsp--;


            }

             after(grammarAccess.getPreguntaMultipleAccess().getRespuestasAssignment_20_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__Group_20__1__Impl"


    // $ANTLR start "rule__Cuestionario__PreguntaInicialAssignment_3"
    // InternalCuestionario.g:3204:1: rule__Cuestionario__PreguntaInicialAssignment_3 : ( ( ruleEString ) ) ;
    public final void rule__Cuestionario__PreguntaInicialAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3208:1: ( ( ( ruleEString ) ) )
            // InternalCuestionario.g:3209:2: ( ( ruleEString ) )
            {
            // InternalCuestionario.g:3209:2: ( ( ruleEString ) )
            // InternalCuestionario.g:3210:3: ( ruleEString )
            {
             before(grammarAccess.getCuestionarioAccess().getPreguntaInicialPreguntaCrossReference_3_0()); 
            // InternalCuestionario.g:3211:3: ( ruleEString )
            // InternalCuestionario.g:3212:4: ruleEString
            {
             before(grammarAccess.getCuestionarioAccess().getPreguntaInicialPreguntaEStringParserRuleCall_3_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCuestionarioAccess().getPreguntaInicialPreguntaEStringParserRuleCall_3_0_1()); 

            }

             after(grammarAccess.getCuestionarioAccess().getPreguntaInicialPreguntaCrossReference_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__PreguntaInicialAssignment_3"


    // $ANTLR start "rule__Cuestionario__PreguntasFinalesAssignment_6"
    // InternalCuestionario.g:3223:1: rule__Cuestionario__PreguntasFinalesAssignment_6 : ( ( ruleEString ) ) ;
    public final void rule__Cuestionario__PreguntasFinalesAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3227:1: ( ( ( ruleEString ) ) )
            // InternalCuestionario.g:3228:2: ( ( ruleEString ) )
            {
            // InternalCuestionario.g:3228:2: ( ( ruleEString ) )
            // InternalCuestionario.g:3229:3: ( ruleEString )
            {
             before(grammarAccess.getCuestionarioAccess().getPreguntasFinalesPreguntaCrossReference_6_0()); 
            // InternalCuestionario.g:3230:3: ( ruleEString )
            // InternalCuestionario.g:3231:4: ruleEString
            {
             before(grammarAccess.getCuestionarioAccess().getPreguntasFinalesPreguntaEStringParserRuleCall_6_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCuestionarioAccess().getPreguntasFinalesPreguntaEStringParserRuleCall_6_0_1()); 

            }

             after(grammarAccess.getCuestionarioAccess().getPreguntasFinalesPreguntaCrossReference_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__PreguntasFinalesAssignment_6"


    // $ANTLR start "rule__Cuestionario__PreguntasFinalesAssignment_7_1"
    // InternalCuestionario.g:3242:1: rule__Cuestionario__PreguntasFinalesAssignment_7_1 : ( ( ruleEString ) ) ;
    public final void rule__Cuestionario__PreguntasFinalesAssignment_7_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3246:1: ( ( ( ruleEString ) ) )
            // InternalCuestionario.g:3247:2: ( ( ruleEString ) )
            {
            // InternalCuestionario.g:3247:2: ( ( ruleEString ) )
            // InternalCuestionario.g:3248:3: ( ruleEString )
            {
             before(grammarAccess.getCuestionarioAccess().getPreguntasFinalesPreguntaCrossReference_7_1_0()); 
            // InternalCuestionario.g:3249:3: ( ruleEString )
            // InternalCuestionario.g:3250:4: ruleEString
            {
             before(grammarAccess.getCuestionarioAccess().getPreguntasFinalesPreguntaEStringParserRuleCall_7_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCuestionarioAccess().getPreguntasFinalesPreguntaEStringParserRuleCall_7_1_0_1()); 

            }

             after(grammarAccess.getCuestionarioAccess().getPreguntasFinalesPreguntaCrossReference_7_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__PreguntasFinalesAssignment_7_1"


    // $ANTLR start "rule__Cuestionario__PreguntasAssignment_11"
    // InternalCuestionario.g:3261:1: rule__Cuestionario__PreguntasAssignment_11 : ( rulePregunta ) ;
    public final void rule__Cuestionario__PreguntasAssignment_11() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3265:1: ( ( rulePregunta ) )
            // InternalCuestionario.g:3266:2: ( rulePregunta )
            {
            // InternalCuestionario.g:3266:2: ( rulePregunta )
            // InternalCuestionario.g:3267:3: rulePregunta
            {
             before(grammarAccess.getCuestionarioAccess().getPreguntasPreguntaParserRuleCall_11_0()); 
            pushFollow(FOLLOW_2);
            rulePregunta();

            state._fsp--;

             after(grammarAccess.getCuestionarioAccess().getPreguntasPreguntaParserRuleCall_11_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__PreguntasAssignment_11"


    // $ANTLR start "rule__Cuestionario__PreguntasAssignment_12_1"
    // InternalCuestionario.g:3276:1: rule__Cuestionario__PreguntasAssignment_12_1 : ( rulePregunta ) ;
    public final void rule__Cuestionario__PreguntasAssignment_12_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3280:1: ( ( rulePregunta ) )
            // InternalCuestionario.g:3281:2: ( rulePregunta )
            {
            // InternalCuestionario.g:3281:2: ( rulePregunta )
            // InternalCuestionario.g:3282:3: rulePregunta
            {
             before(grammarAccess.getCuestionarioAccess().getPreguntasPreguntaParserRuleCall_12_1_0()); 
            pushFollow(FOLLOW_2);
            rulePregunta();

            state._fsp--;

             after(grammarAccess.getCuestionarioAccess().getPreguntasPreguntaParserRuleCall_12_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__PreguntasAssignment_12_1"


    // $ANTLR start "rule__Cuestionario__CategoriasAssignment_16"
    // InternalCuestionario.g:3291:1: rule__Cuestionario__CategoriasAssignment_16 : ( ruleCategoria ) ;
    public final void rule__Cuestionario__CategoriasAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3295:1: ( ( ruleCategoria ) )
            // InternalCuestionario.g:3296:2: ( ruleCategoria )
            {
            // InternalCuestionario.g:3296:2: ( ruleCategoria )
            // InternalCuestionario.g:3297:3: ruleCategoria
            {
             before(grammarAccess.getCuestionarioAccess().getCategoriasCategoriaParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleCategoria();

            state._fsp--;

             after(grammarAccess.getCuestionarioAccess().getCategoriasCategoriaParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__CategoriasAssignment_16"


    // $ANTLR start "rule__Cuestionario__CategoriasAssignment_17_1"
    // InternalCuestionario.g:3306:1: rule__Cuestionario__CategoriasAssignment_17_1 : ( ruleCategoria ) ;
    public final void rule__Cuestionario__CategoriasAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3310:1: ( ( ruleCategoria ) )
            // InternalCuestionario.g:3311:2: ( ruleCategoria )
            {
            // InternalCuestionario.g:3311:2: ( ruleCategoria )
            // InternalCuestionario.g:3312:3: ruleCategoria
            {
             before(grammarAccess.getCuestionarioAccess().getCategoriasCategoriaParserRuleCall_17_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCategoria();

            state._fsp--;

             after(grammarAccess.getCuestionarioAccess().getCategoriasCategoriaParserRuleCall_17_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Cuestionario__CategoriasAssignment_17_1"


    // $ANTLR start "rule__Categoria__NameAssignment_1"
    // InternalCuestionario.g:3321:1: rule__Categoria__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Categoria__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3325:1: ( ( ruleEString ) )
            // InternalCuestionario.g:3326:2: ( ruleEString )
            {
            // InternalCuestionario.g:3326:2: ( ruleEString )
            // InternalCuestionario.g:3327:3: ruleEString
            {
             before(grammarAccess.getCategoriaAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getCategoriaAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__NameAssignment_1"


    // $ANTLR start "rule__Categoria__DificultadAssignment_4"
    // InternalCuestionario.g:3336:1: rule__Categoria__DificultadAssignment_4 : ( ruleEDouble ) ;
    public final void rule__Categoria__DificultadAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3340:1: ( ( ruleEDouble ) )
            // InternalCuestionario.g:3341:2: ( ruleEDouble )
            {
            // InternalCuestionario.g:3341:2: ( ruleEDouble )
            // InternalCuestionario.g:3342:3: ruleEDouble
            {
             before(grammarAccess.getCategoriaAccess().getDificultadEDoubleParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getCategoriaAccess().getDificultadEDoubleParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__DificultadAssignment_4"


    // $ANTLR start "rule__Categoria__SubcategoriasAssignment_5_2"
    // InternalCuestionario.g:3351:1: rule__Categoria__SubcategoriasAssignment_5_2 : ( ruleCategoria ) ;
    public final void rule__Categoria__SubcategoriasAssignment_5_2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3355:1: ( ( ruleCategoria ) )
            // InternalCuestionario.g:3356:2: ( ruleCategoria )
            {
            // InternalCuestionario.g:3356:2: ( ruleCategoria )
            // InternalCuestionario.g:3357:3: ruleCategoria
            {
             before(grammarAccess.getCategoriaAccess().getSubcategoriasCategoriaParserRuleCall_5_2_0()); 
            pushFollow(FOLLOW_2);
            ruleCategoria();

            state._fsp--;

             after(grammarAccess.getCategoriaAccess().getSubcategoriasCategoriaParserRuleCall_5_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__SubcategoriasAssignment_5_2"


    // $ANTLR start "rule__Categoria__SubcategoriasAssignment_5_3_1"
    // InternalCuestionario.g:3366:1: rule__Categoria__SubcategoriasAssignment_5_3_1 : ( ruleCategoria ) ;
    public final void rule__Categoria__SubcategoriasAssignment_5_3_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3370:1: ( ( ruleCategoria ) )
            // InternalCuestionario.g:3371:2: ( ruleCategoria )
            {
            // InternalCuestionario.g:3371:2: ( ruleCategoria )
            // InternalCuestionario.g:3372:3: ruleCategoria
            {
             before(grammarAccess.getCategoriaAccess().getSubcategoriasCategoriaParserRuleCall_5_3_1_0()); 
            pushFollow(FOLLOW_2);
            ruleCategoria();

            state._fsp--;

             after(grammarAccess.getCategoriaAccess().getSubcategoriasCategoriaParserRuleCall_5_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Categoria__SubcategoriasAssignment_5_3_1"


    // $ANTLR start "rule__Respuesta__NameAssignment_1"
    // InternalCuestionario.g:3381:1: rule__Respuesta__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__Respuesta__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3385:1: ( ( ruleEString ) )
            // InternalCuestionario.g:3386:2: ( ruleEString )
            {
            // InternalCuestionario.g:3386:2: ( ruleEString )
            // InternalCuestionario.g:3387:3: ruleEString
            {
             before(grammarAccess.getRespuestaAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRespuestaAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Respuesta__NameAssignment_1"


    // $ANTLR start "rule__Respuesta__OpcionAssignment_4"
    // InternalCuestionario.g:3396:1: rule__Respuesta__OpcionAssignment_4 : ( ruleEString ) ;
    public final void rule__Respuesta__OpcionAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3400:1: ( ( ruleEString ) )
            // InternalCuestionario.g:3401:2: ( ruleEString )
            {
            // InternalCuestionario.g:3401:2: ( ruleEString )
            // InternalCuestionario.g:3402:3: ruleEString
            {
             before(grammarAccess.getRespuestaAccess().getOpcionEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getRespuestaAccess().getOpcionEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Respuesta__OpcionAssignment_4"


    // $ANTLR start "rule__PreguntaUnica__NameAssignment_1"
    // InternalCuestionario.g:3411:1: rule__PreguntaUnica__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PreguntaUnica__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3415:1: ( ( ruleEString ) )
            // InternalCuestionario.g:3416:2: ( ruleEString )
            {
            // InternalCuestionario.g:3416:2: ( ruleEString )
            // InternalCuestionario.g:3417:3: ruleEString
            {
             before(grammarAccess.getPreguntaUnicaAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPreguntaUnicaAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__NameAssignment_1"


    // $ANTLR start "rule__PreguntaUnica__EnunciadoAssignment_4"
    // InternalCuestionario.g:3426:1: rule__PreguntaUnica__EnunciadoAssignment_4 : ( ruleEString ) ;
    public final void rule__PreguntaUnica__EnunciadoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3430:1: ( ( ruleEString ) )
            // InternalCuestionario.g:3431:2: ( ruleEString )
            {
            // InternalCuestionario.g:3431:2: ( ruleEString )
            // InternalCuestionario.g:3432:3: ruleEString
            {
             before(grammarAccess.getPreguntaUnicaAccess().getEnunciadoEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPreguntaUnicaAccess().getEnunciadoEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__EnunciadoAssignment_4"


    // $ANTLR start "rule__PreguntaUnica__PuntuacionAssignment_6"
    // InternalCuestionario.g:3441:1: rule__PreguntaUnica__PuntuacionAssignment_6 : ( ruleEDouble ) ;
    public final void rule__PreguntaUnica__PuntuacionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3445:1: ( ( ruleEDouble ) )
            // InternalCuestionario.g:3446:2: ( ruleEDouble )
            {
            // InternalCuestionario.g:3446:2: ( ruleEDouble )
            // InternalCuestionario.g:3447:3: ruleEDouble
            {
             before(grammarAccess.getPreguntaUnicaAccess().getPuntuacionEDoubleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPreguntaUnicaAccess().getPuntuacionEDoubleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__PuntuacionAssignment_6"


    // $ANTLR start "rule__PreguntaUnica__PenalizacionAssignment_8"
    // InternalCuestionario.g:3456:1: rule__PreguntaUnica__PenalizacionAssignment_8 : ( ruleEDouble ) ;
    public final void rule__PreguntaUnica__PenalizacionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3460:1: ( ( ruleEDouble ) )
            // InternalCuestionario.g:3461:2: ( ruleEDouble )
            {
            // InternalCuestionario.g:3461:2: ( ruleEDouble )
            // InternalCuestionario.g:3462:3: ruleEDouble
            {
             before(grammarAccess.getPreguntaUnicaAccess().getPenalizacionEDoubleParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPreguntaUnicaAccess().getPenalizacionEDoubleParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__PenalizacionAssignment_8"


    // $ANTLR start "rule__PreguntaUnica__CategoriaAssignment_10"
    // InternalCuestionario.g:3471:1: rule__PreguntaUnica__CategoriaAssignment_10 : ( ( ruleEString ) ) ;
    public final void rule__PreguntaUnica__CategoriaAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3475:1: ( ( ( ruleEString ) ) )
            // InternalCuestionario.g:3476:2: ( ( ruleEString ) )
            {
            // InternalCuestionario.g:3476:2: ( ( ruleEString ) )
            // InternalCuestionario.g:3477:3: ( ruleEString )
            {
             before(grammarAccess.getPreguntaUnicaAccess().getCategoriaCategoriaCrossReference_10_0()); 
            // InternalCuestionario.g:3478:3: ( ruleEString )
            // InternalCuestionario.g:3479:4: ruleEString
            {
             before(grammarAccess.getPreguntaUnicaAccess().getCategoriaCategoriaEStringParserRuleCall_10_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPreguntaUnicaAccess().getCategoriaCategoriaEStringParserRuleCall_10_0_1()); 

            }

             after(grammarAccess.getPreguntaUnicaAccess().getCategoriaCategoriaCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__CategoriaAssignment_10"


    // $ANTLR start "rule__PreguntaUnica__SiguientePreguntaAssignment_11_1"
    // InternalCuestionario.g:3490:1: rule__PreguntaUnica__SiguientePreguntaAssignment_11_1 : ( ( ruleEString ) ) ;
    public final void rule__PreguntaUnica__SiguientePreguntaAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3494:1: ( ( ( ruleEString ) ) )
            // InternalCuestionario.g:3495:2: ( ( ruleEString ) )
            {
            // InternalCuestionario.g:3495:2: ( ( ruleEString ) )
            // InternalCuestionario.g:3496:3: ( ruleEString )
            {
             before(grammarAccess.getPreguntaUnicaAccess().getSiguientePreguntaPreguntaCrossReference_11_1_0()); 
            // InternalCuestionario.g:3497:3: ( ruleEString )
            // InternalCuestionario.g:3498:4: ruleEString
            {
             before(grammarAccess.getPreguntaUnicaAccess().getSiguientePreguntaPreguntaEStringParserRuleCall_11_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPreguntaUnicaAccess().getSiguientePreguntaPreguntaEStringParserRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getPreguntaUnicaAccess().getSiguientePreguntaPreguntaCrossReference_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__SiguientePreguntaAssignment_11_1"


    // $ANTLR start "rule__PreguntaUnica__CorrectaAssignment_13"
    // InternalCuestionario.g:3509:1: rule__PreguntaUnica__CorrectaAssignment_13 : ( ( ruleEString ) ) ;
    public final void rule__PreguntaUnica__CorrectaAssignment_13() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3513:1: ( ( ( ruleEString ) ) )
            // InternalCuestionario.g:3514:2: ( ( ruleEString ) )
            {
            // InternalCuestionario.g:3514:2: ( ( ruleEString ) )
            // InternalCuestionario.g:3515:3: ( ruleEString )
            {
             before(grammarAccess.getPreguntaUnicaAccess().getCorrectaRespuestaCrossReference_13_0()); 
            // InternalCuestionario.g:3516:3: ( ruleEString )
            // InternalCuestionario.g:3517:4: ruleEString
            {
             before(grammarAccess.getPreguntaUnicaAccess().getCorrectaRespuestaEStringParserRuleCall_13_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPreguntaUnicaAccess().getCorrectaRespuestaEStringParserRuleCall_13_0_1()); 

            }

             after(grammarAccess.getPreguntaUnicaAccess().getCorrectaRespuestaCrossReference_13_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__CorrectaAssignment_13"


    // $ANTLR start "rule__PreguntaUnica__RespuestasAssignment_16"
    // InternalCuestionario.g:3528:1: rule__PreguntaUnica__RespuestasAssignment_16 : ( ruleRespuesta ) ;
    public final void rule__PreguntaUnica__RespuestasAssignment_16() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3532:1: ( ( ruleRespuesta ) )
            // InternalCuestionario.g:3533:2: ( ruleRespuesta )
            {
            // InternalCuestionario.g:3533:2: ( ruleRespuesta )
            // InternalCuestionario.g:3534:3: ruleRespuesta
            {
             before(grammarAccess.getPreguntaUnicaAccess().getRespuestasRespuestaParserRuleCall_16_0()); 
            pushFollow(FOLLOW_2);
            ruleRespuesta();

            state._fsp--;

             after(grammarAccess.getPreguntaUnicaAccess().getRespuestasRespuestaParserRuleCall_16_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__RespuestasAssignment_16"


    // $ANTLR start "rule__PreguntaUnica__RespuestasAssignment_17_1"
    // InternalCuestionario.g:3543:1: rule__PreguntaUnica__RespuestasAssignment_17_1 : ( ruleRespuesta ) ;
    public final void rule__PreguntaUnica__RespuestasAssignment_17_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3547:1: ( ( ruleRespuesta ) )
            // InternalCuestionario.g:3548:2: ( ruleRespuesta )
            {
            // InternalCuestionario.g:3548:2: ( ruleRespuesta )
            // InternalCuestionario.g:3549:3: ruleRespuesta
            {
             before(grammarAccess.getPreguntaUnicaAccess().getRespuestasRespuestaParserRuleCall_17_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRespuesta();

            state._fsp--;

             after(grammarAccess.getPreguntaUnicaAccess().getRespuestasRespuestaParserRuleCall_17_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaUnica__RespuestasAssignment_17_1"


    // $ANTLR start "rule__PreguntaMultiple__NameAssignment_1"
    // InternalCuestionario.g:3558:1: rule__PreguntaMultiple__NameAssignment_1 : ( ruleEString ) ;
    public final void rule__PreguntaMultiple__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3562:1: ( ( ruleEString ) )
            // InternalCuestionario.g:3563:2: ( ruleEString )
            {
            // InternalCuestionario.g:3563:2: ( ruleEString )
            // InternalCuestionario.g:3564:3: ruleEString
            {
             before(grammarAccess.getPreguntaMultipleAccess().getNameEStringParserRuleCall_1_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPreguntaMultipleAccess().getNameEStringParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__NameAssignment_1"


    // $ANTLR start "rule__PreguntaMultiple__EnunciadoAssignment_4"
    // InternalCuestionario.g:3573:1: rule__PreguntaMultiple__EnunciadoAssignment_4 : ( ruleEString ) ;
    public final void rule__PreguntaMultiple__EnunciadoAssignment_4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3577:1: ( ( ruleEString ) )
            // InternalCuestionario.g:3578:2: ( ruleEString )
            {
            // InternalCuestionario.g:3578:2: ( ruleEString )
            // InternalCuestionario.g:3579:3: ruleEString
            {
             before(grammarAccess.getPreguntaMultipleAccess().getEnunciadoEStringParserRuleCall_4_0()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPreguntaMultipleAccess().getEnunciadoEStringParserRuleCall_4_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__EnunciadoAssignment_4"


    // $ANTLR start "rule__PreguntaMultiple__PuntuacionAssignment_6"
    // InternalCuestionario.g:3588:1: rule__PreguntaMultiple__PuntuacionAssignment_6 : ( ruleEDouble ) ;
    public final void rule__PreguntaMultiple__PuntuacionAssignment_6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3592:1: ( ( ruleEDouble ) )
            // InternalCuestionario.g:3593:2: ( ruleEDouble )
            {
            // InternalCuestionario.g:3593:2: ( ruleEDouble )
            // InternalCuestionario.g:3594:3: ruleEDouble
            {
             before(grammarAccess.getPreguntaMultipleAccess().getPuntuacionEDoubleParserRuleCall_6_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPreguntaMultipleAccess().getPuntuacionEDoubleParserRuleCall_6_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__PuntuacionAssignment_6"


    // $ANTLR start "rule__PreguntaMultiple__PenalizacionAssignment_8"
    // InternalCuestionario.g:3603:1: rule__PreguntaMultiple__PenalizacionAssignment_8 : ( ruleEDouble ) ;
    public final void rule__PreguntaMultiple__PenalizacionAssignment_8() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3607:1: ( ( ruleEDouble ) )
            // InternalCuestionario.g:3608:2: ( ruleEDouble )
            {
            // InternalCuestionario.g:3608:2: ( ruleEDouble )
            // InternalCuestionario.g:3609:3: ruleEDouble
            {
             before(grammarAccess.getPreguntaMultipleAccess().getPenalizacionEDoubleParserRuleCall_8_0()); 
            pushFollow(FOLLOW_2);
            ruleEDouble();

            state._fsp--;

             after(grammarAccess.getPreguntaMultipleAccess().getPenalizacionEDoubleParserRuleCall_8_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__PenalizacionAssignment_8"


    // $ANTLR start "rule__PreguntaMultiple__CategoriaAssignment_10"
    // InternalCuestionario.g:3618:1: rule__PreguntaMultiple__CategoriaAssignment_10 : ( ( ruleEString ) ) ;
    public final void rule__PreguntaMultiple__CategoriaAssignment_10() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3622:1: ( ( ( ruleEString ) ) )
            // InternalCuestionario.g:3623:2: ( ( ruleEString ) )
            {
            // InternalCuestionario.g:3623:2: ( ( ruleEString ) )
            // InternalCuestionario.g:3624:3: ( ruleEString )
            {
             before(grammarAccess.getPreguntaMultipleAccess().getCategoriaCategoriaCrossReference_10_0()); 
            // InternalCuestionario.g:3625:3: ( ruleEString )
            // InternalCuestionario.g:3626:4: ruleEString
            {
             before(grammarAccess.getPreguntaMultipleAccess().getCategoriaCategoriaEStringParserRuleCall_10_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPreguntaMultipleAccess().getCategoriaCategoriaEStringParserRuleCall_10_0_1()); 

            }

             after(grammarAccess.getPreguntaMultipleAccess().getCategoriaCategoriaCrossReference_10_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__CategoriaAssignment_10"


    // $ANTLR start "rule__PreguntaMultiple__SiguientePreguntaAssignment_11_1"
    // InternalCuestionario.g:3637:1: rule__PreguntaMultiple__SiguientePreguntaAssignment_11_1 : ( ( ruleEString ) ) ;
    public final void rule__PreguntaMultiple__SiguientePreguntaAssignment_11_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3641:1: ( ( ( ruleEString ) ) )
            // InternalCuestionario.g:3642:2: ( ( ruleEString ) )
            {
            // InternalCuestionario.g:3642:2: ( ( ruleEString ) )
            // InternalCuestionario.g:3643:3: ( ruleEString )
            {
             before(grammarAccess.getPreguntaMultipleAccess().getSiguientePreguntaPreguntaCrossReference_11_1_0()); 
            // InternalCuestionario.g:3644:3: ( ruleEString )
            // InternalCuestionario.g:3645:4: ruleEString
            {
             before(grammarAccess.getPreguntaMultipleAccess().getSiguientePreguntaPreguntaEStringParserRuleCall_11_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPreguntaMultipleAccess().getSiguientePreguntaPreguntaEStringParserRuleCall_11_1_0_1()); 

            }

             after(grammarAccess.getPreguntaMultipleAccess().getSiguientePreguntaPreguntaCrossReference_11_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__SiguientePreguntaAssignment_11_1"


    // $ANTLR start "rule__PreguntaMultiple__CorrectasAssignment_14"
    // InternalCuestionario.g:3656:1: rule__PreguntaMultiple__CorrectasAssignment_14 : ( ( ruleEString ) ) ;
    public final void rule__PreguntaMultiple__CorrectasAssignment_14() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3660:1: ( ( ( ruleEString ) ) )
            // InternalCuestionario.g:3661:2: ( ( ruleEString ) )
            {
            // InternalCuestionario.g:3661:2: ( ( ruleEString ) )
            // InternalCuestionario.g:3662:3: ( ruleEString )
            {
             before(grammarAccess.getPreguntaMultipleAccess().getCorrectasRespuestaCrossReference_14_0()); 
            // InternalCuestionario.g:3663:3: ( ruleEString )
            // InternalCuestionario.g:3664:4: ruleEString
            {
             before(grammarAccess.getPreguntaMultipleAccess().getCorrectasRespuestaEStringParserRuleCall_14_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPreguntaMultipleAccess().getCorrectasRespuestaEStringParserRuleCall_14_0_1()); 

            }

             after(grammarAccess.getPreguntaMultipleAccess().getCorrectasRespuestaCrossReference_14_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__CorrectasAssignment_14"


    // $ANTLR start "rule__PreguntaMultiple__CorrectasAssignment_15_1"
    // InternalCuestionario.g:3675:1: rule__PreguntaMultiple__CorrectasAssignment_15_1 : ( ( ruleEString ) ) ;
    public final void rule__PreguntaMultiple__CorrectasAssignment_15_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3679:1: ( ( ( ruleEString ) ) )
            // InternalCuestionario.g:3680:2: ( ( ruleEString ) )
            {
            // InternalCuestionario.g:3680:2: ( ( ruleEString ) )
            // InternalCuestionario.g:3681:3: ( ruleEString )
            {
             before(grammarAccess.getPreguntaMultipleAccess().getCorrectasRespuestaCrossReference_15_1_0()); 
            // InternalCuestionario.g:3682:3: ( ruleEString )
            // InternalCuestionario.g:3683:4: ruleEString
            {
             before(grammarAccess.getPreguntaMultipleAccess().getCorrectasRespuestaEStringParserRuleCall_15_1_0_1()); 
            pushFollow(FOLLOW_2);
            ruleEString();

            state._fsp--;

             after(grammarAccess.getPreguntaMultipleAccess().getCorrectasRespuestaEStringParserRuleCall_15_1_0_1()); 

            }

             after(grammarAccess.getPreguntaMultipleAccess().getCorrectasRespuestaCrossReference_15_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__CorrectasAssignment_15_1"


    // $ANTLR start "rule__PreguntaMultiple__RespuestasAssignment_19"
    // InternalCuestionario.g:3694:1: rule__PreguntaMultiple__RespuestasAssignment_19 : ( ruleRespuesta ) ;
    public final void rule__PreguntaMultiple__RespuestasAssignment_19() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3698:1: ( ( ruleRespuesta ) )
            // InternalCuestionario.g:3699:2: ( ruleRespuesta )
            {
            // InternalCuestionario.g:3699:2: ( ruleRespuesta )
            // InternalCuestionario.g:3700:3: ruleRespuesta
            {
             before(grammarAccess.getPreguntaMultipleAccess().getRespuestasRespuestaParserRuleCall_19_0()); 
            pushFollow(FOLLOW_2);
            ruleRespuesta();

            state._fsp--;

             after(grammarAccess.getPreguntaMultipleAccess().getRespuestasRespuestaParserRuleCall_19_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__RespuestasAssignment_19"


    // $ANTLR start "rule__PreguntaMultiple__RespuestasAssignment_20_1"
    // InternalCuestionario.g:3709:1: rule__PreguntaMultiple__RespuestasAssignment_20_1 : ( ruleRespuesta ) ;
    public final void rule__PreguntaMultiple__RespuestasAssignment_20_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalCuestionario.g:3713:1: ( ( ruleRespuesta ) )
            // InternalCuestionario.g:3714:2: ( ruleRespuesta )
            {
            // InternalCuestionario.g:3714:2: ( ruleRespuesta )
            // InternalCuestionario.g:3715:3: ruleRespuesta
            {
             before(grammarAccess.getPreguntaMultipleAccess().getRespuestasRespuestaParserRuleCall_20_1_0()); 
            pushFollow(FOLLOW_2);
            ruleRespuesta();

            state._fsp--;

             after(grammarAccess.getPreguntaMultipleAccess().getRespuestasRespuestaParserRuleCall_20_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PreguntaMultiple__RespuestasAssignment_20_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000008000L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000000030L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000440000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x0000000000400002L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000004040000000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000500000L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_17 = new BitSet(new long[]{0x000000000C000040L});
    public static final BitSet FOLLOW_18 = new BitSet(new long[]{0x0000000002100000L});
    public static final BitSet FOLLOW_19 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_20 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_21 = new BitSet(new long[]{0x0000000004000040L});
    public static final BitSet FOLLOW_22 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_23 = new BitSet(new long[]{0x0000000080000000L});
    public static final BitSet FOLLOW_24 = new BitSet(new long[]{0x0000000100000000L});
    public static final BitSet FOLLOW_25 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_26 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_27 = new BitSet(new long[]{0x0000002800000000L});
    public static final BitSet FOLLOW_28 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_29 = new BitSet(new long[]{0x0000000010000000L});
    public static final BitSet FOLLOW_30 = new BitSet(new long[]{0x000000A000000000L});

}