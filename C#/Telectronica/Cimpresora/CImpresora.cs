public abstract class CImpresora
{
	public	
abstract void Imprimir(string strTexto);

};

public class CImpresoraEpson : CImpresora
{
	public override void Imprimir(string strTexto) 	
	{

		//ImprimirTckFiscal(strTexto);
	}

	public void CerrarTkFiscal(){}
	protected bool EstaImprimiendo(){return true;}
	private int m_nNumeroSerie;
	private string m_strModelo;
};
