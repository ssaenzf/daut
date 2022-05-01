package cuestionario.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCuestionarioLexer extends Lexer {
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

    public InternalCuestionarioLexer() {;} 
    public InternalCuestionarioLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public InternalCuestionarioLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "InternalCuestionario.g"; }

    // $ANTLR start "T__11"
    public final void mT__11() throws RecognitionException {
        try {
            int _type = T__11;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:11:7: ( 'E' )
            // InternalCuestionario.g:11:9: 'E'
            {
            match('E'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__11"

    // $ANTLR start "T__12"
    public final void mT__12() throws RecognitionException {
        try {
            int _type = T__12;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:12:7: ( 'e' )
            // InternalCuestionario.g:12:9: 'e'
            {
            match('e'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__12"

    // $ANTLR start "T__13"
    public final void mT__13() throws RecognitionException {
        try {
            int _type = T__13;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:13:7: ( 'Cuestionario' )
            // InternalCuestionario.g:13:9: 'Cuestionario'
            {
            match("Cuestionario"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__13"

    // $ANTLR start "T__14"
    public final void mT__14() throws RecognitionException {
        try {
            int _type = T__14;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:14:7: ( '{' )
            // InternalCuestionario.g:14:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__14"

    // $ANTLR start "T__15"
    public final void mT__15() throws RecognitionException {
        try {
            int _type = T__15;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:15:7: ( 'preguntas' )
            // InternalCuestionario.g:15:9: 'preguntas'
            {
            match("preguntas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__15"

    // $ANTLR start "T__16"
    public final void mT__16() throws RecognitionException {
        try {
            int _type = T__16;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:16:7: ( '}' )
            // InternalCuestionario.g:16:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__16"

    // $ANTLR start "T__17"
    public final void mT__17() throws RecognitionException {
        try {
            int _type = T__17;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:17:7: ( 'categorias' )
            // InternalCuestionario.g:17:9: 'categorias'
            {
            match("categorias"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__17"

    // $ANTLR start "T__18"
    public final void mT__18() throws RecognitionException {
        try {
            int _type = T__18;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:18:7: ( 'preguntaInicial' )
            // InternalCuestionario.g:18:9: 'preguntaInicial'
            {
            match("preguntaInicial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__18"

    // $ANTLR start "T__19"
    public final void mT__19() throws RecognitionException {
        try {
            int _type = T__19;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:19:7: ( 'preguntasFinales' )
            // InternalCuestionario.g:19:9: 'preguntasFinales'
            {
            match("preguntasFinales"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__19"

    // $ANTLR start "T__20"
    public final void mT__20() throws RecognitionException {
        try {
            int _type = T__20;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:20:7: ( '(' )
            // InternalCuestionario.g:20:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__20"

    // $ANTLR start "T__21"
    public final void mT__21() throws RecognitionException {
        try {
            int _type = T__21;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:21:7: ( ')' )
            // InternalCuestionario.g:21:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__21"

    // $ANTLR start "T__22"
    public final void mT__22() throws RecognitionException {
        try {
            int _type = T__22;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:22:7: ( ',' )
            // InternalCuestionario.g:22:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__22"

    // $ANTLR start "T__23"
    public final void mT__23() throws RecognitionException {
        try {
            int _type = T__23;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:23:7: ( 'Categoria' )
            // InternalCuestionario.g:23:9: 'Categoria'
            {
            match("Categoria"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__23"

    // $ANTLR start "T__24"
    public final void mT__24() throws RecognitionException {
        try {
            int _type = T__24;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:24:7: ( 'dificultad' )
            // InternalCuestionario.g:24:9: 'dificultad'
            {
            match("dificultad"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__24"

    // $ANTLR start "T__25"
    public final void mT__25() throws RecognitionException {
        try {
            int _type = T__25;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:25:7: ( 'subcategorias' )
            // InternalCuestionario.g:25:9: 'subcategorias'
            {
            match("subcategorias"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__25"

    // $ANTLR start "T__26"
    public final void mT__26() throws RecognitionException {
        try {
            int _type = T__26;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:26:7: ( '-' )
            // InternalCuestionario.g:26:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__26"

    // $ANTLR start "T__27"
    public final void mT__27() throws RecognitionException {
        try {
            int _type = T__27;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:27:7: ( '.' )
            // InternalCuestionario.g:27:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__27"

    // $ANTLR start "T__28"
    public final void mT__28() throws RecognitionException {
        try {
            int _type = T__28;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:28:7: ( 'PreguntaUnica' )
            // InternalCuestionario.g:28:9: 'PreguntaUnica'
            {
            match("PreguntaUnica"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__28"

    // $ANTLR start "T__29"
    public final void mT__29() throws RecognitionException {
        try {
            int _type = T__29;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:29:7: ( 'enunciado' )
            // InternalCuestionario.g:29:9: 'enunciado'
            {
            match("enunciado"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__29"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:30:7: ( 'puntuacion' )
            // InternalCuestionario.g:30:9: 'puntuacion'
            {
            match("puntuacion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:31:7: ( 'penalizacion' )
            // InternalCuestionario.g:31:9: 'penalizacion'
            {
            match("penalizacion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:32:7: ( 'categoria' )
            // InternalCuestionario.g:32:9: 'categoria'
            {
            match("categoria"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:33:7: ( 'respuestas' )
            // InternalCuestionario.g:33:9: 'respuestas'
            {
            match("respuestas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:34:7: ( 'correcta' )
            // InternalCuestionario.g:34:9: 'correcta'
            {
            match("correcta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:35:7: ( 'siguientePreguntaAcierto' )
            // InternalCuestionario.g:35:9: 'siguientePreguntaAcierto'
            {
            match("siguientePreguntaAcierto"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:36:7: ( 'siguientePreguntaError' )
            // InternalCuestionario.g:36:9: 'siguientePreguntaError'
            {
            match("siguientePreguntaError"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:37:7: ( 'PreguntaMultiple' )
            // InternalCuestionario.g:37:9: 'PreguntaMultiple'
            {
            match("PreguntaMultiple"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:38:7: ( 'correctas' )
            // InternalCuestionario.g:38:9: 'correctas'
            {
            match("correctas"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:39:7: ( 'Respuesta' )
            // InternalCuestionario.g:39:9: 'Respuesta'
            {
            match("Respuesta"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:40:7: ( 'opcion' )
            // InternalCuestionario.g:40:9: 'opcion'
            {
            match("opcion"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:41:7: ( 'isInicial' )
            // InternalCuestionario.g:41:9: 'isInicial'
            {
            match("isInicial"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "RULE_ID"
    public final void mRULE_ID() throws RecognitionException {
        try {
            int _type = RULE_ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:4259:9: ( ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )* )
            // InternalCuestionario.g:4259:11: ( '^' )? ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            {
            // InternalCuestionario.g:4259:11: ( '^' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='^') ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // InternalCuestionario.g:4259:11: '^'
                    {
                    match('^'); 

                    }
                    break;

            }

            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

            // InternalCuestionario.g:4259:40: ( 'a' .. 'z' | 'A' .. 'Z' | '_' | '0' .. '9' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // InternalCuestionario.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ID"

    // $ANTLR start "RULE_INT"
    public final void mRULE_INT() throws RecognitionException {
        try {
            int _type = RULE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:4261:10: ( ( '0' .. '9' )+ )
            // InternalCuestionario.g:4261:12: ( '0' .. '9' )+
            {
            // InternalCuestionario.g:4261:12: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // InternalCuestionario.g:4261:13: '0' .. '9'
            	    {
            	    matchRange('0','9'); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_INT"

    // $ANTLR start "RULE_STRING"
    public final void mRULE_STRING() throws RecognitionException {
        try {
            int _type = RULE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:4263:13: ( ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' ) )
            // InternalCuestionario.g:4263:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            {
            // InternalCuestionario.g:4263:15: ( '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"' | '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\'' )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0=='\"') ) {
                alt6=1;
            }
            else if ( (LA6_0=='\'') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalCuestionario.g:4263:16: '\"' ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )* '\"'
                    {
                    match('\"'); 
                    // InternalCuestionario.g:4263:20: ( '\\\\' . | ~ ( ( '\\\\' | '\"' ) ) )*
                    loop4:
                    do {
                        int alt4=3;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0=='\\') ) {
                            alt4=1;
                        }
                        else if ( ((LA4_0>='\u0000' && LA4_0<='!')||(LA4_0>='#' && LA4_0<='[')||(LA4_0>=']' && LA4_0<='\uFFFF')) ) {
                            alt4=2;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // InternalCuestionario.g:4263:21: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCuestionario.g:4263:28: ~ ( ( '\\\\' | '\"' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    match('\"'); 

                    }
                    break;
                case 2 :
                    // InternalCuestionario.g:4263:48: '\\'' ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )* '\\''
                    {
                    match('\''); 
                    // InternalCuestionario.g:4263:53: ( '\\\\' . | ~ ( ( '\\\\' | '\\'' ) ) )*
                    loop5:
                    do {
                        int alt5=3;
                        int LA5_0 = input.LA(1);

                        if ( (LA5_0=='\\') ) {
                            alt5=1;
                        }
                        else if ( ((LA5_0>='\u0000' && LA5_0<='&')||(LA5_0>='(' && LA5_0<='[')||(LA5_0>=']' && LA5_0<='\uFFFF')) ) {
                            alt5=2;
                        }


                        switch (alt5) {
                    	case 1 :
                    	    // InternalCuestionario.g:4263:54: '\\\\' .
                    	    {
                    	    match('\\'); 
                    	    matchAny(); 

                    	    }
                    	    break;
                    	case 2 :
                    	    // InternalCuestionario.g:4263:61: ~ ( ( '\\\\' | '\\'' ) )
                    	    {
                    	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='&')||(input.LA(1)>='(' && input.LA(1)<='[')||(input.LA(1)>=']' && input.LA(1)<='\uFFFF') ) {
                    	        input.consume();

                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;}


                    	    }
                    	    break;

                    	default :
                    	    break loop5;
                        }
                    } while (true);

                    match('\''); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_STRING"

    // $ANTLR start "RULE_ML_COMMENT"
    public final void mRULE_ML_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_ML_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:4265:17: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // InternalCuestionario.g:4265:19: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 

            // InternalCuestionario.g:4265:24: ( options {greedy=false; } : . )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0=='*') ) {
                    int LA7_1 = input.LA(2);

                    if ( (LA7_1=='/') ) {
                        alt7=2;
                    }
                    else if ( ((LA7_1>='\u0000' && LA7_1<='.')||(LA7_1>='0' && LA7_1<='\uFFFF')) ) {
                        alt7=1;
                    }


                }
                else if ( ((LA7_0>='\u0000' && LA7_0<=')')||(LA7_0>='+' && LA7_0<='\uFFFF')) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalCuestionario.g:4265:52: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

            match("*/"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ML_COMMENT"

    // $ANTLR start "RULE_SL_COMMENT"
    public final void mRULE_SL_COMMENT() throws RecognitionException {
        try {
            int _type = RULE_SL_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:4267:17: ( '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )? )
            // InternalCuestionario.g:4267:19: '//' (~ ( ( '\\n' | '\\r' ) ) )* ( ( '\\r' )? '\\n' )?
            {
            match("//"); 

            // InternalCuestionario.g:4267:24: (~ ( ( '\\n' | '\\r' ) ) )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( ((LA8_0>='\u0000' && LA8_0<='\t')||(LA8_0>='\u000B' && LA8_0<='\f')||(LA8_0>='\u000E' && LA8_0<='\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalCuestionario.g:4267:24: ~ ( ( '\\n' | '\\r' ) )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

            // InternalCuestionario.g:4267:40: ( ( '\\r' )? '\\n' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\n'||LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // InternalCuestionario.g:4267:41: ( '\\r' )? '\\n'
                    {
                    // InternalCuestionario.g:4267:41: ( '\\r' )?
                    int alt9=2;
                    int LA9_0 = input.LA(1);

                    if ( (LA9_0=='\r') ) {
                        alt9=1;
                    }
                    switch (alt9) {
                        case 1 :
                            // InternalCuestionario.g:4267:41: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }

                    match('\n'); 

                    }
                    break;

            }


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_SL_COMMENT"

    // $ANTLR start "RULE_WS"
    public final void mRULE_WS() throws RecognitionException {
        try {
            int _type = RULE_WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:4269:9: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // InternalCuestionario.g:4269:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // InternalCuestionario.g:4269:11: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt11=0;
            loop11:
            do {
                int alt11=2;
                int LA11_0 = input.LA(1);

                if ( ((LA11_0>='\t' && LA11_0<='\n')||LA11_0=='\r'||LA11_0==' ') ) {
                    alt11=1;
                }


                switch (alt11) {
            	case 1 :
            	    // InternalCuestionario.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt11 >= 1 ) break loop11;
                        EarlyExitException eee =
                            new EarlyExitException(11, input);
                        throw eee;
                }
                cnt11++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_WS"

    // $ANTLR start "RULE_ANY_OTHER"
    public final void mRULE_ANY_OTHER() throws RecognitionException {
        try {
            int _type = RULE_ANY_OTHER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // InternalCuestionario.g:4271:16: ( . )
            // InternalCuestionario.g:4271:18: .
            {
            matchAny(); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "RULE_ANY_OTHER"

    public void mTokens() throws RecognitionException {
        // InternalCuestionario.g:1:8: ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER )
        int alt12=38;
        alt12 = dfa12.predict(input);
        switch (alt12) {
            case 1 :
                // InternalCuestionario.g:1:10: T__11
                {
                mT__11(); 

                }
                break;
            case 2 :
                // InternalCuestionario.g:1:16: T__12
                {
                mT__12(); 

                }
                break;
            case 3 :
                // InternalCuestionario.g:1:22: T__13
                {
                mT__13(); 

                }
                break;
            case 4 :
                // InternalCuestionario.g:1:28: T__14
                {
                mT__14(); 

                }
                break;
            case 5 :
                // InternalCuestionario.g:1:34: T__15
                {
                mT__15(); 

                }
                break;
            case 6 :
                // InternalCuestionario.g:1:40: T__16
                {
                mT__16(); 

                }
                break;
            case 7 :
                // InternalCuestionario.g:1:46: T__17
                {
                mT__17(); 

                }
                break;
            case 8 :
                // InternalCuestionario.g:1:52: T__18
                {
                mT__18(); 

                }
                break;
            case 9 :
                // InternalCuestionario.g:1:58: T__19
                {
                mT__19(); 

                }
                break;
            case 10 :
                // InternalCuestionario.g:1:64: T__20
                {
                mT__20(); 

                }
                break;
            case 11 :
                // InternalCuestionario.g:1:70: T__21
                {
                mT__21(); 

                }
                break;
            case 12 :
                // InternalCuestionario.g:1:76: T__22
                {
                mT__22(); 

                }
                break;
            case 13 :
                // InternalCuestionario.g:1:82: T__23
                {
                mT__23(); 

                }
                break;
            case 14 :
                // InternalCuestionario.g:1:88: T__24
                {
                mT__24(); 

                }
                break;
            case 15 :
                // InternalCuestionario.g:1:94: T__25
                {
                mT__25(); 

                }
                break;
            case 16 :
                // InternalCuestionario.g:1:100: T__26
                {
                mT__26(); 

                }
                break;
            case 17 :
                // InternalCuestionario.g:1:106: T__27
                {
                mT__27(); 

                }
                break;
            case 18 :
                // InternalCuestionario.g:1:112: T__28
                {
                mT__28(); 

                }
                break;
            case 19 :
                // InternalCuestionario.g:1:118: T__29
                {
                mT__29(); 

                }
                break;
            case 20 :
                // InternalCuestionario.g:1:124: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // InternalCuestionario.g:1:130: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // InternalCuestionario.g:1:136: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // InternalCuestionario.g:1:142: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // InternalCuestionario.g:1:148: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // InternalCuestionario.g:1:154: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // InternalCuestionario.g:1:160: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // InternalCuestionario.g:1:166: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // InternalCuestionario.g:1:172: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // InternalCuestionario.g:1:178: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // InternalCuestionario.g:1:184: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // InternalCuestionario.g:1:190: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // InternalCuestionario.g:1:196: RULE_ID
                {
                mRULE_ID(); 

                }
                break;
            case 33 :
                // InternalCuestionario.g:1:204: RULE_INT
                {
                mRULE_INT(); 

                }
                break;
            case 34 :
                // InternalCuestionario.g:1:213: RULE_STRING
                {
                mRULE_STRING(); 

                }
                break;
            case 35 :
                // InternalCuestionario.g:1:225: RULE_ML_COMMENT
                {
                mRULE_ML_COMMENT(); 

                }
                break;
            case 36 :
                // InternalCuestionario.g:1:241: RULE_SL_COMMENT
                {
                mRULE_SL_COMMENT(); 

                }
                break;
            case 37 :
                // InternalCuestionario.g:1:257: RULE_WS
                {
                mRULE_WS(); 

                }
                break;
            case 38 :
                // InternalCuestionario.g:1:265: RULE_ANY_OTHER
                {
                mRULE_ANY_OTHER(); 

                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    static final String DFA12_eotS =
        "\1\uffff\1\35\1\37\1\34\1\uffff\1\34\1\uffff\1\34\3\uffff\2\34\2\uffff\5\34\1\33\2\uffff\3\33\4\uffff\1\34\1\uffff\2\34\1\uffff\3\34\1\uffff\2\34\3\uffff\3\34\2\uffff\5\34\5\uffff\76\34\1\u0089\17\34\1\uffff\10\34\1\u00a3\7\34\1\u00ac\1\34\1\u00ae\1\u00b0\3\34\1\u00b5\1\u00b6\1\uffff\6\34\1\u00bd\1\u00be\1\uffff\1\34\1\uffff\1\34\1\uffff\1\34\1\u00c2\1\34\1\u00c4\2\uffff\1\u00c5\4\34\1\u00ca\2\uffff\3\34\1\uffff\1\34\2\uffff\4\34\1\uffff\1\u00d3\2\34\1\u00d6\4\34\1\uffff\2\34\1\uffff\1\u00dd\1\34\1\u00df\3\34\1\uffff\1\34\1\uffff\2\34\1\u00e6\2\34\1\u00e9\1\uffff\1\34\1\u00eb\1\uffff\1\34\1\uffff\11\34\1\u00f7\1\34\1\uffff\1\u00f9\1\uffff";
    static final String DFA12_eofS =
        "\u00fa\uffff";
    static final String DFA12_minS =
        "\1\0\2\60\1\141\1\uffff\1\145\1\uffff\1\141\3\uffff\2\151\2\uffff\1\162\2\145\1\160\1\163\1\101\2\uffff\2\0\1\52\4\uffff\1\165\1\uffff\1\145\1\164\1\uffff\1\145\2\156\1\uffff\1\164\1\162\3\uffff\1\146\1\142\1\147\2\uffff\1\145\2\163\1\143\1\111\5\uffff\1\156\1\163\1\145\1\147\1\164\1\141\1\145\1\162\1\151\1\143\1\165\1\147\2\160\1\151\1\156\1\143\1\164\1\147\2\165\1\154\1\147\1\145\1\143\1\141\1\151\3\165\1\157\3\151\1\157\1\156\1\141\1\151\1\157\1\143\1\165\1\164\1\145\1\156\2\145\1\156\1\143\1\141\1\157\1\162\1\164\1\143\1\172\1\162\1\164\1\154\1\145\1\156\1\164\2\163\1\60\1\151\1\144\1\156\1\151\1\141\1\151\1\141\1\151\1\141\1\164\1\147\1\164\1\141\2\164\1\uffff\1\141\1\157\2\141\1\111\1\157\1\143\1\141\1\60\1\141\1\157\1\145\1\115\2\141\1\154\1\60\1\162\2\60\2\156\1\151\2\60\1\uffff\1\144\1\162\1\120\1\156\1\165\1\163\2\60\1\uffff\1\151\1\uffff\1\151\1\uffff\1\151\1\60\1\157\1\60\2\uffff\1\60\1\151\1\162\1\151\1\154\1\60\2\uffff\1\157\1\156\1\143\1\uffff\1\156\2\uffff\1\141\1\145\1\143\1\164\1\uffff\1\60\1\141\1\151\1\60\1\163\1\147\1\141\1\151\1\uffff\1\154\1\141\1\uffff\1\60\1\165\1\60\1\160\1\145\1\154\1\uffff\1\156\1\uffff\1\154\1\163\1\60\1\164\1\145\1\60\1\uffff\1\141\1\60\1\uffff\1\101\1\uffff\1\143\1\162\1\151\1\162\1\145\1\157\2\162\1\164\1\60\1\157\1\uffff\1\60\1\uffff";
    static final String DFA12_maxS =
        "\1\uffff\2\172\1\165\1\uffff\1\165\1\uffff\1\157\3\uffff\1\151\1\165\2\uffff\1\162\2\145\1\160\1\163\1\172\2\uffff\2\uffff\1\57\4\uffff\1\165\1\uffff\1\145\1\164\1\uffff\1\145\2\156\1\uffff\1\164\1\162\3\uffff\1\146\1\142\1\147\2\uffff\1\145\2\163\1\143\1\111\5\uffff\1\156\1\163\1\145\1\147\1\164\1\141\1\145\1\162\1\151\1\143\1\165\1\147\2\160\1\151\1\156\1\143\1\164\1\147\2\165\1\154\1\147\1\145\1\143\1\141\1\151\3\165\1\157\3\151\1\157\1\156\1\141\1\151\1\157\1\143\1\165\1\164\1\145\1\156\2\145\1\156\1\143\1\141\1\157\1\162\1\164\1\143\1\172\1\162\1\164\1\154\1\145\1\156\1\164\2\163\1\172\1\151\1\144\1\156\1\151\1\141\1\151\1\141\1\151\1\141\1\164\1\147\1\164\1\141\2\164\1\uffff\1\141\1\157\2\141\1\163\1\157\1\143\1\141\1\172\1\141\1\157\1\145\1\125\2\141\1\154\1\172\1\162\2\172\2\156\1\151\2\172\1\uffff\1\144\1\162\1\120\1\156\1\165\1\163\2\172\1\uffff\1\151\1\uffff\1\151\1\uffff\1\151\1\172\1\157\1\172\2\uffff\1\172\1\151\1\162\1\151\1\154\1\172\2\uffff\1\157\1\156\1\143\1\uffff\1\156\2\uffff\1\141\1\145\1\143\1\164\1\uffff\1\172\1\141\1\151\1\172\1\163\1\147\1\141\1\151\1\uffff\1\154\1\141\1\uffff\1\172\1\165\1\172\1\160\1\145\1\154\1\uffff\1\156\1\uffff\1\154\1\163\1\172\1\164\1\145\1\172\1\uffff\1\141\1\172\1\uffff\1\105\1\uffff\1\143\1\162\1\151\1\162\1\145\1\157\2\162\1\164\1\172\1\157\1\uffff\1\172\1\uffff";
    static final String DFA12_acceptS =
        "\4\uffff\1\4\1\uffff\1\6\1\uffff\1\12\1\13\1\14\2\uffff\1\20\1\21\6\uffff\1\40\1\41\3\uffff\1\45\1\46\1\40\1\1\1\uffff\1\2\2\uffff\1\4\3\uffff\1\6\2\uffff\1\12\1\13\1\14\3\uffff\1\20\1\21\5\uffff\1\41\1\42\1\43\1\44\1\45\116\uffff\1\36\31\uffff\1\30\10\uffff\1\23\1\uffff\1\15\1\uffff\1\5\4\uffff\1\26\1\34\6\uffff\1\35\1\37\3\uffff\1\24\1\uffff\1\7\1\16\4\uffff\1\27\10\uffff\1\3\2\uffff\1\25\6\uffff\1\17\1\uffff\1\22\6\uffff\1\10\2\uffff\1\11\1\uffff\1\33\13\uffff\1\32\1\uffff\1\31";
    static final String DFA12_specialS =
        "\1\2\26\uffff\1\0\1\1\u00e1\uffff}>";
    static final String[] DFA12_transitionS = {
            "\11\33\2\32\2\33\1\32\22\33\1\32\1\33\1\27\4\33\1\30\1\10\1\11\2\33\1\12\1\15\1\16\1\31\12\26\7\33\2\25\1\3\1\25\1\1\12\25\1\17\1\25\1\21\10\25\3\33\1\24\1\25\1\33\2\25\1\7\1\13\1\2\3\25\1\23\5\25\1\22\1\5\1\25\1\20\1\14\7\25\1\4\1\33\1\6\uff82\33",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\15\34\1\36\14\34",
            "\1\41\23\uffff\1\40",
            "",
            "\1\45\14\uffff\1\43\2\uffff\1\44",
            "",
            "\1\47\15\uffff\1\50",
            "",
            "",
            "",
            "\1\54",
            "\1\56\13\uffff\1\55",
            "",
            "",
            "\1\61",
            "\1\62",
            "\1\63",
            "\1\64",
            "\1\65",
            "\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\0\67",
            "\0\67",
            "\1\70\4\uffff\1\71",
            "",
            "",
            "",
            "",
            "\1\73",
            "",
            "\1\74",
            "\1\75",
            "",
            "\1\76",
            "\1\77",
            "\1\100",
            "",
            "\1\101",
            "\1\102",
            "",
            "",
            "",
            "\1\103",
            "\1\104",
            "\1\105",
            "",
            "",
            "\1\106",
            "\1\107",
            "\1\110",
            "\1\111",
            "\1\112",
            "",
            "",
            "",
            "",
            "",
            "\1\113",
            "\1\114",
            "\1\115",
            "\1\116",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "\1\136",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\1\u0091",
            "\1\u0092",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\1\u0097",
            "\1\u0098",
            "",
            "\1\u0099",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009e\51\uffff\1\u009d",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\22\34\1\u00a2\7\34",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a8\7\uffff\1\u00a7",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00ad",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\5\34\1\u00af\24\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\22\34\1\u00b4\7\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u00b7",
            "\1\u00b8",
            "\1\u00b9",
            "\1\u00ba",
            "\1\u00bb",
            "\1\u00bc",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u00bf",
            "",
            "\1\u00c0",
            "",
            "\1\u00c1",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00c3",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\1\u00c9",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "",
            "\1\u00ce",
            "",
            "",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00d4",
            "\1\u00d5",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00d7",
            "\1\u00d8",
            "\1\u00d9",
            "\1\u00da",
            "",
            "\1\u00db",
            "\1\u00dc",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00de",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00e0",
            "\1\u00e1",
            "\1\u00e2",
            "",
            "\1\u00e3",
            "",
            "\1\u00e4",
            "\1\u00e5",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00e7",
            "\1\u00e8",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u00ea",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "",
            "\1\u00ec\3\uffff\1\u00ed",
            "",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\1\u00f3",
            "\1\u00f4",
            "\1\u00f5",
            "\1\u00f6",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            "\1\u00f8",
            "",
            "\12\34\7\uffff\32\34\4\uffff\1\34\1\uffff\32\34",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__11 | T__12 | T__13 | T__14 | T__15 | T__16 | T__17 | T__18 | T__19 | T__20 | T__21 | T__22 | T__23 | T__24 | T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | RULE_ID | RULE_INT | RULE_STRING | RULE_ML_COMMENT | RULE_SL_COMMENT | RULE_WS | RULE_ANY_OTHER );";
        }
        public int specialStateTransition(int s, IntStream _input) throws NoViableAltException {
            IntStream input = _input;
        	int _s = s;
            switch ( s ) {
                    case 0 : 
                        int LA12_23 = input.LA(1);

                        s = -1;
                        if ( ((LA12_23>='\u0000' && LA12_23<='\uFFFF')) ) {s = 55;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 1 : 
                        int LA12_24 = input.LA(1);

                        s = -1;
                        if ( ((LA12_24>='\u0000' && LA12_24<='\uFFFF')) ) {s = 55;}

                        else s = 27;

                        if ( s>=0 ) return s;
                        break;
                    case 2 : 
                        int LA12_0 = input.LA(1);

                        s = -1;
                        if ( (LA12_0=='E') ) {s = 1;}

                        else if ( (LA12_0=='e') ) {s = 2;}

                        else if ( (LA12_0=='C') ) {s = 3;}

                        else if ( (LA12_0=='{') ) {s = 4;}

                        else if ( (LA12_0=='p') ) {s = 5;}

                        else if ( (LA12_0=='}') ) {s = 6;}

                        else if ( (LA12_0=='c') ) {s = 7;}

                        else if ( (LA12_0=='(') ) {s = 8;}

                        else if ( (LA12_0==')') ) {s = 9;}

                        else if ( (LA12_0==',') ) {s = 10;}

                        else if ( (LA12_0=='d') ) {s = 11;}

                        else if ( (LA12_0=='s') ) {s = 12;}

                        else if ( (LA12_0=='-') ) {s = 13;}

                        else if ( (LA12_0=='.') ) {s = 14;}

                        else if ( (LA12_0=='P') ) {s = 15;}

                        else if ( (LA12_0=='r') ) {s = 16;}

                        else if ( (LA12_0=='R') ) {s = 17;}

                        else if ( (LA12_0=='o') ) {s = 18;}

                        else if ( (LA12_0=='i') ) {s = 19;}

                        else if ( (LA12_0=='^') ) {s = 20;}

                        else if ( ((LA12_0>='A' && LA12_0<='B')||LA12_0=='D'||(LA12_0>='F' && LA12_0<='O')||LA12_0=='Q'||(LA12_0>='S' && LA12_0<='Z')||LA12_0=='_'||(LA12_0>='a' && LA12_0<='b')||(LA12_0>='f' && LA12_0<='h')||(LA12_0>='j' && LA12_0<='n')||LA12_0=='q'||(LA12_0>='t' && LA12_0<='z')) ) {s = 21;}

                        else if ( ((LA12_0>='0' && LA12_0<='9')) ) {s = 22;}

                        else if ( (LA12_0=='\"') ) {s = 23;}

                        else if ( (LA12_0=='\'') ) {s = 24;}

                        else if ( (LA12_0=='/') ) {s = 25;}

                        else if ( ((LA12_0>='\t' && LA12_0<='\n')||LA12_0=='\r'||LA12_0==' ') ) {s = 26;}

                        else if ( ((LA12_0>='\u0000' && LA12_0<='\b')||(LA12_0>='\u000B' && LA12_0<='\f')||(LA12_0>='\u000E' && LA12_0<='\u001F')||LA12_0=='!'||(LA12_0>='#' && LA12_0<='&')||(LA12_0>='*' && LA12_0<='+')||(LA12_0>=':' && LA12_0<='@')||(LA12_0>='[' && LA12_0<=']')||LA12_0=='`'||LA12_0=='|'||(LA12_0>='~' && LA12_0<='\uFFFF')) ) {s = 27;}

                        if ( s>=0 ) return s;
                        break;
            }
            NoViableAltException nvae =
                new NoViableAltException(getDescription(), 12, _s, input);
            error(nvae);
            throw nvae;
        }
    }
 

}