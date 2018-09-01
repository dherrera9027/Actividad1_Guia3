public class dupla
{
    private int a;
    private int b;

    public final void Lee(tangible.RefObject<Integer> a2, tangible.RefObject<Integer> b2)
        {
            a2.argValue = a;
            b2.argValue = b;
        }

    public final void Guarda(int a2, int b2)
        {
            a = a2;
            b = b2;
        }
}

package <missing>;
