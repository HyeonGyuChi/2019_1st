package d0408;

public class OverMaxException extends RuntimeException {
	public OverMaxException() {
		super();
	}

	public OverMaxException(String msg) {
		super("������ �� �ִ� �ְ������� �Ѿ����ϴ�." + msg);
	}
}
