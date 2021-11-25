package exports;

public interface Exporter extends ExportVisitor{
	void start();
	void end();
	void delimiter();

}
