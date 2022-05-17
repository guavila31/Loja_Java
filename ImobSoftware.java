import com.formdev.flatlaf.FlatLightLaf;

public class ImobSoftware
	extends FlatLightLaf
{
	public static final String NAME = "ImobSoftware";

	public static boolean setup() {
		return setup( new ImobSoftware() );
	}

	public static void installLafInfo() {
		installLafInfo( NAME, ImobSoftware.class );
	}

	@Override
	public String getName() {
		return NAME;
	}
}
