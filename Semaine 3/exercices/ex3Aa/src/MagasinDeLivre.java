import java.util.HashMap;
import java.util.Map;

public class MagasinDeLivre extends Magasin{

	@Override
	protected Article creerArticle(String name, int anneeDeParution) {
		return new Livre(name, anneeDeParution);
	}
}
