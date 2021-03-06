public abstract class Console extends GameSystem
{
	public Console()
	{
		super();
	}
	public Console(String p)
	{
		super(p);
	}
	public abstract String getController();

	public String toString()
	{
		return "Platform: " + super.getPlatform() + "\n" + "Serial #: " + super.getSerialNo() + "\n" + "Controller: " + getController();
	}
}