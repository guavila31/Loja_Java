import com.formdev.flatlaf.FlatIntelliJLaf;

public class TemaTeste
	extends FlatIntelliJLaf
{
	public static final String NAME = "TemaTeste";

	public static boolean setup() {
		return setup( new TemaTeste() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, TemaTeste.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
