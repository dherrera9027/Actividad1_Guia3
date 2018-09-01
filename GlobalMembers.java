 public class GlobalMembers
{
    public static int Main()
	{
	dupla primerPar = new dupla();
	int x;
	int y;
	primerPar.Guarda(12, 32);
        tangible.RefObject<Integer> tempRef_x = new tangible.RefObject<Integer>(x);
        tangible.RefObject<Integer> tempRef_y = new tangible.RefObject<Integer>(y);
	primerPar.Lee(tempRef_x, tempRef_y);
	y = tempRef_y.argValue;
	x = tempRef_x.argValue;
	System.out.print("Valor de primerPar.a: ");
	System.out.print(x);
	System.out.print("\n");
	System.out.print("Valor de primerPar.b: ");
	System.out.print(y);
	System.out.print("\n");
	return 0;
	}
}
package tangible;
