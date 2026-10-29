package ma.emsi.hajarbelhachmi.tp1hajarbelhachmi.llm;

/**
 * Record qui regroupe le résultat d'un échange avec l'API du LLM :
 * le JSON de la requête envoyée, le JSON de la réponse reçue,
 * et le texte de la réponse extrait de ce JSON.
 *
 * @param questionJson   texte JSON de la requête envoyée à l'API du LLM.
 * @param reponseJson    texte JSON de la réponse reçue de l'API du LLM.
 * @param reponseExtraite texte de la réponse, à afficher à l'utilisateur.
 */
public record LlmInteraction(String questionJson, String reponseJson, String reponseExtraite) {
}
