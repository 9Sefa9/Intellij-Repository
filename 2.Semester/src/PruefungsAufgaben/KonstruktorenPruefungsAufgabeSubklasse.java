package PruefungsAufgaben;
public class KonstruktorenPruefungsAufgabeSubklasse extends KonstruktorenPruefungsAufgabeSuperklasse{
	
	
	public KonstruktorenPruefungsAufgabeSubklasse(int i1, int i2, int i3, int i4){
		super(i1,i2,i3,i4);
	}
	public KonstruktorenPruefungsAufgabeSubklasse(int i1, int i2, int i3){
		this(i1,i2,i3,1);
		
	}
	public KonstruktorenPruefungsAufgabeSubklasse(int i1, int i2){
		this(i1,i2,1,1);
	}
	public KonstruktorenPruefungsAufgabeSubklasse(int i1){
		this(i1,1,1,1);
	}
	public static void main(String[] args){
		
	KonstruktorenPruefungsAufgabeSubklasse o1 = new KonstruktorenPruefungsAufgabeSubklasse(4,6,8,10);
	KonstruktorenPruefungsAufgabeSubklasse o2 = new KonstruktorenPruefungsAufgabeSubklasse(5,7,9);
	KonstruktorenPruefungsAufgabeSubklasse o3 = new KonstruktorenPruefungsAufgabeSubklasse(6,7);
	KonstruktorenPruefungsAufgabeSubklasse o4 = new KonstruktorenPruefungsAufgabeSubklasse(9);
	
	if(o2.i4 ==1)
		System.out.println("ok");
	
	if(o3.i3 == 1 && o3.i4 == 1)
		System.out.println("ok");
	
	if(o4.i2 == 1 && o4.i3 == 1 && o4.i4 == 1)
		System.out.println("ok");
}
}