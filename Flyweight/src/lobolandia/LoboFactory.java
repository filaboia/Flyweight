package lobolandia;

import java.util.HashMap;
import java.util.Map;

public class LoboFactory {
	
	private static final LoboFactory loboFactory = new LoboFactory();
	
	private Map<TipoLobo, String> loboPool = new HashMap<TipoLobo, String>();
	
	private LoboFactory() {}
	
	public static LoboFactory getInstance() {
		return loboFactory;
	}
	
	public String getLobo(TipoLobo tipoLobo) {
		String lobo = loboPool.get(tipoLobo);
		if (lobo == null) {
			lobo = createLobo(tipoLobo);
			loboPool.put(tipoLobo, lobo);
		}
		return lobo;
	}

	private String createLobo(TipoLobo tipoLobo) {
		String lobo = new String("         _\n"
								+"        / \\      _-'\n"
								+"      _/|  \\-''- _ /\n"
								+" __-' { |          \\\n"
								+"     /              \\\n"
								+"     /       \"o.  |o }\n"
								+"     |            \\ ;\n"
								+"                   ',\n"
								+"        \\_         __\\\n"
								+"          ''-_    \\.//\n"
								+"            / '-____'\n"
								+"           /\n"
								+"         _'\n"
								+"       _-'\n");
		switch (tipoLobo) {
		case NORTE:
			lobo = lobo + "Sou um lobo do Norte e moro em : ";
			break;
		case SUL:
			lobo = lobo + "Sou um lobo do Sul e moro em : ";
			break;
		case LESTE:
			lobo = lobo + "Sou um lobo do Leste e moro em : ";
			break;
		case OESTE:
			lobo = lobo + "Sou um lobo do Oeste e moro em : ";
			break;
		default:
		}
		
		return lobo;
	}

}
