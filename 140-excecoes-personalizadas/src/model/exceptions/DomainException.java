package model.exceptions;

public class DomainException extends Exception {
	//RunTimeException o compilador não te obriga a tratar;
	//Exception voce sera obrigado a tratar(try/catch);
	private static final long serialVersionUID = 1L;

	public DomainException(String msg) {
		super(msg);
	}
}
