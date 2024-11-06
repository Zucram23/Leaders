//PowerActions interface - Definere de aktioner som alle leaders har.
//Derefter kan lederne have deres egne unikke Poweractions
public interface PowerActions {
    String implementPolicy(String policy);
    String repressOpposition();
    String holdParade();
}
