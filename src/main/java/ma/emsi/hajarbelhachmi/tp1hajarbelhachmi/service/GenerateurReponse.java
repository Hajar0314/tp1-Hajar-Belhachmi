
package ma.emsi.hajarbelhachmi.tp1hajarbelhachmi.service;

import jakarta.enterprise.context.Dependent;

import java.io.Serial;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

@Dependent
public class GenerateurReponse implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    private boolean roleSystemeAffiche = false;

    private static final Map<String, String> REPONSES =
            new LinkedHashMap<>();

    static {
        // =====================================================
        // 1. JAVA ET NOTIONS DE BASE
        // =====================================================

        REPONSES.put("stringbuilder", "StringBuilder permet de construire "
                + "et de modifier progressivement une chaîne de caractères, "
                + "notamment avec append().");

        REPONSES.put("tolowercase", "toLowerCase(Locale.FRENCH) convertit "
                + "une chaîne en minuscules. Cela facilite la comparaison "
                + "des questions sans tenir compte des majuscules.");

        REPONSES.put("touppercase", "toUpperCase(Locale.FRENCH) convertit "
                + "une chaîne en majuscules. Dans ce TP, cette opération "
                + "sert notamment à afficher le rôle système.");

        REPONSES.put("serialversionuid", "serialVersionUID identifie "
                + "la version d'une classe sérialisable. Il aide à contrôler "
                + "la compatibilité lors de la sérialisation.");

        REPONSES.put("serializable", "Serializable est une interface "
                + "marqueur qui indique qu'un objet peut être sérialisé. "
                + "Elle peut être utile pour conserver l'état d'un bean.");

        REPONSES.put("parametre", "Un paramètre permet de transmettre "
                + "une donnée à une méthode. Dans genererReponse(), "
                + "question et roleSysteme sont des paramètres.");

        REPONSES.put("methode", "Une méthode est un bloc de code "
                + "qui réalise une opération. Elle peut recevoir "
                + "des paramètres et retourner un résultat.");

        REPONSES.put("attribut", "Un attribut est une variable déclarée "
                + "dans une classe. Il représente une donnée de l'objet.");

        REPONSES.put("classe", "Une classe est un modèle qui définit "
                + "les attributs et les méthodes des objets.");

        REPONSES.put("objet", "Un objet est une instance d'une classe. "
                + "Il possède un état et peut exécuter des méthodes.");

        REPONSES.put("string", "String représente une chaîne de caractères "
                + "en Java. Les objets String sont immuables : une opération "
                + "de transformation produit une nouvelle chaîne.");

        REPONSES.put("locale", "Locale représente des conventions "
                + "linguistiques et régionales. Locale.FRENCH permet "
                + "d'utiliser les règles associées au français.");

        REPONSES.put("trim", "trim() supprime les espaces situés au début "
                + "et à la fin d'une chaîne. Il permet de repérer "
                + "une saisie composée uniquement d'espaces.");

        REPONSES.put("null", "null signifie qu'une référence ne désigne "
                + "aucun objet. Il faut vérifier les valeurs nulles "
                + "avant d'appeler certaines méthodes.");

        REPONSES.put("return", "return termine l'exécution d'une méthode "
                + "et peut renvoyer une valeur au code appelant.");

        REPONSES.put("java", "Java est un langage de programmation "
                + "orienté objet utilisé pour développer des applications "
                + "web, desktop et serveur.");

        // =====================================================
        // 2. JAKARTA EE, JSF ET PAGES WEB
        // =====================================================

        REPONSES.put("jakarta ee", "Jakarta EE est une plateforme "
                + "pour développer des applications Java d'entreprise. "
                + "Elle fournit plusieurs API, dont Jakarta Faces et CDI.");

        REPONSES.put("primefaces", "PrimeFaces est une bibliothèque "
                + "de composants pour Jakarta Faces. Elle propose "
                + "des boutons, des champs et d'autres composants "
                + "d'interface.");

        REPONSES.put("facelets", "Facelets est le système de vues "
                + "utilisé par Jakarta Faces. Il permet de construire "
                + "des pages à partir de fichiers XHTML.");

        REPONSES.put("jsf", "JSF, aujourd'hui appelé Jakarta Faces, "
                + "est une technologie Java pour créer des interfaces "
                + "web côté serveur à partir de composants.");

        REPONSES.put("xhtml", "XHTML est un format de page fondé sur XML. "
                + "Dans ce TP, index.xhtml définit l'interface "
                + "de l'application JSF.");

        REPONSES.put("html", "HTML définit la structure du contenu "
                + "d'une page web. Le navigateur affiche le HTML reçu "
                + "du serveur.");

        REPONSES.put("expression el", "EL signifie Expression Language. "
                + "Une expression comme #{bb.question} permet d'accéder "
                + "à une propriété ou une méthode exposée par un bean.");

        REPONSES.put("#{", "Dans #{bb.question}, bb est le nom du bean "
                + "accessible par EL et question est la propriété "
                + "à laquelle la page souhaite accéder.");

        REPONSES.put("formulaire", "Un formulaire permet à l'utilisateur "
                + "de saisir et de soumettre des données. JSF traite "
                + "les données soumises selon le cycle de vie de la requête.");

        REPONSES.put("composant", "Un composant JSF représente un élément "
                + "d'interface, comme un champ de saisie ou un bouton. "
                + "Il participe au traitement de la page côté serveur.");

        REPONSES.put("bouton", "Un bouton déclenche une action "
                + "de l'interface. Dans JSF, il peut appeler une méthode "
                + "du backing bean.");

        REPONSES.put("ajax", "Ajax permet d'effectuer des interactions "
                + "avec le serveur sans recharger toute la page. "
                + "Son fonctionnement dépend de la configuration "
                + "du composant utilisé.");

        // =====================================================
        // 3. CDI ET ANNOTATIONS
        // =====================================================

        REPONSES.put("@viewscoped", "@ViewScoped conserve l'état "
                + "d'un bean pendant la durée de vie de la vue JSF. "
                + "C'est adapté à une conversation qui reste sur la même page.");

        REPONSES.put("@dependent", "@Dependent est une portée CDI. "
                + "Le bean dépendant suit le cycle de vie de son objet "
                + "injecteur ou propriétaire.");

        REPONSES.put("@inject", "@Inject demande à CDI d'injecter "
                + "une dépendance. Dans Bb.java, cette annotation "
                + "permet d'obtenir GenerateurReponse.");

        REPONSES.put("@named", "@Named rend un bean accessible "
                + "par son nom dans les expressions EL. Avec @Named "
                + "sur Bb, la page peut utiliser #{bb}.");

        REPONSES.put("annotation", "Une annotation ajoute des métadonnées "
                + "au code Java. Par exemple, @Inject et @Named indiquent "
                + "à l'environnement comment gérer un bean.");

        REPONSES.put("portee", "La portée d'un bean définit la durée "
                + "de vie de son instance et la manière dont elle est "
                + "partagée. Le choix dépend du besoin de l'application.");

        REPONSES.put("injection", "L'injection de dépendances permet "
                + "à un composant de recevoir automatiquement les objets "
                + "dont il a besoin, au lieu de les créer manuellement.");

        REPONSES.put("cdi", "CDI signifie Contexts and Dependency Injection. "
                + "Il gère les beans, leurs portées et l'injection "
                + "de dépendances dans une application Jakarta EE.");

        REPONSES.put("bean", "Un bean est un objet géré dans un contexte "
                + "technologique. Dans ce TP, Bb est un backing bean "
                + "et GenerateurReponse produit les réponses.");

        // =====================================================
        // 4. BACKING BEAN : Bb.java
        // =====================================================

        REPONSES.put("bb.java", "Bb.java est le backing bean de l'application. "
                + "Il gère notamment la question, la réponse, "
                + "la conversation et l'appel au générateur.");

        REPONSES.put("backing bean", "Le backing bean relie la page JSF "
                + "à la logique Java. Dans ce TP, Bb.java contient "
                + "les propriétés et les méthodes utilisées par index.xhtml.");

        REPONSES.put("rolesystemeaffiche", "roleSystemeAffiche est "
                + "un booléen qui indique si le rôle système a déjà été "
                + "ajouté. Il évite de le répéter à chaque réponse.");

        REPONSES.put("rolesysteme", "roleSysteme contient le rôle "
                + "ou les instructions de départ associées à la conversation. "
                + "Le générateur peut l'afficher au début des échanges.");

        REPONSES.put("question vide", "Une question vide ne contient "
                + "aucune information utile. Bb peut vérifier si la saisie "
                + "est nulle, vide ou composée uniquement d'espaces, "
                + "puis afficher un FacesMessage.");

        REPONSES.put("question", "La propriété question contient "
                + "le texte saisi par l'utilisateur. La page JSF la relie "
                + "au bean avec une expression comme #{bb.question}.");

        REPONSES.put("reponse", "La propriété reponse contient "
                + "le texte produit par le traitement et destiné "
                + "à être affiché dans l'interface.");

        REPONSES.put("conversation", "La conversation conserve "
                + "l'historique des échanges. StringBuilder peut servir "
                + "à ajouter progressivement le texte à cet historique.");

        REPONSES.put("getter", "Un getter est une méthode qui permet "
                + "de lire la valeur d'une propriété, par exemple getQuestion().");

        REPONSES.put("setter", "Un setter est une méthode qui permet "
                + "de modifier la valeur d'une propriété, par exemple setQuestion().");

        REPONSES.put("getrolesysteme", "getRolesSysteme() renvoie "
                + "la liste des rôles disponibles si cette méthode "
                + "est définie ainsi dans Bb.java.");

        // =====================================================
        // 5. MÉTHODES ET TRAITEMENT DES QUESTIONS
        // =====================================================

        REPONSES.put("generateurreponse", "GenerateurReponse.java "
                + "contient le traitement personnalisé côté serveur. "
                + "Dans cette version, il associe des mots-clés "
                + "à des explications sur le TP0.");

        REPONSES.put("genererreponse", "genererReponse() reçoit "
                + "la question et le rôle système, recherche un sujet "
                + "correspondant et construit le texte retourné "
                + "à l'application.");

        REPONSES.put("nouveauchat", "nouveauChat() est destinée "
                + "à recommencer la conversation. Vérifie son code "
                + "pour savoir si elle efface l'historique ou effectue "
                + "uniquement une navigation vers index.");

        REPONSES.put("envoyer()", "envoyer() traite la soumission "
                + "de la question. Elle peut vérifier la saisie, appeler "
                + "genererReponse(), puis ajouter le résultat "
                + "à la conversation.");

        REPONSES.put("envoyer", "La méthode envoyer() est appelée "
                + "lorsque l'utilisateur envoie sa question. "
                + "Elle coordonne la validation et la génération "
                + "de la réponse.");

        REPONSES.put("facescontext", "FacesContext donne accès "
                + "au contexte de traitement JSF. Il permet notamment "
                + "d'ajouter des messages destinés à l'utilisateur.");

        REPONSES.put("facesmessage", "FacesMessage représente "
                + "un message à présenter dans l'interface JSF, "
                + "par exemple une erreur de validation.");

        REPONSES.put("validation", "La validation vérifie que les données "
                + "saisies sont acceptables avant de poursuivre le traitement. "
                + "Elle évite notamment de traiter une question vide.");

        REPONSES.put("exception", "Une exception signale une situation "
                + "anormale pendant l'exécution. Elle doit être traitée "
                + "de manière adaptée pour éviter un échec inattendu.");

        REPONSES.put("try catch", "try/catch permet de traiter certaines "
                + "exceptions. Le bloc try contient le code à surveiller "
                + "et catch définit le traitement d'une exception interceptée.");

        REPONSES.put("contains", "contains() vérifie si une chaîne "
                + "contient une séquence de caractères. Ici, elle permet "
                + "de détecter les mots-clés d'une question.");

        REPONSES.put("if else", "if/else permet de choisir un traitement "
                + "selon une condition. Dans le générateur, les conditions "
                + "permettent de choisir une réponse selon les mots-clés.");

        REPONSES.put("mot cle", "Un mot-clé est un terme utilisé "
                + "pour reconnaître le sujet d'une question. Ce générateur "
                + "recherche les mots-clés dans le texte pour sélectionner "
                + "une explication.");

        REPONSES.put("fallback", "Une réponse de secours est renvoyée "
                + "quand aucun mot-clé connu n'est détecté. Elle aide "
                + "l'utilisateur à reformuler sa question.");

        REPONSES.put("role systeme", "Le rôle système décrit le rôle "
                + "ou les instructions de départ de la conversation. "
                + "Dans ce générateur, il est affiché une seule fois "
                + "si une valeur est fournie.");

        // =====================================================
        // 6. MAVEN, SERVEUR ET DÉPLOIEMENT
        // =====================================================

        REPONSES.put("pom.xml", "pom.xml est le fichier de configuration "
                + "Maven. Il décrit les coordonnées du projet, "
                + "ses dépendances et les paramètres de construction.");

        REPONSES.put("maven", "Maven automatise la construction du projet "
                + "Java et la gestion de ses dépendances. Il lit notamment "
                + "le fichier pom.xml.");

        REPONSES.put("dependance", "Une dépendance est une bibliothèque "
                + "ou un module dont le projet a besoin. Maven peut "
                + "la télécharger et la mettre à disposition du projet.");

        REPONSES.put("welcome-file", "welcome-file indique une page "
                + "d'accueil à utiliser pour l'application web. "
                + "Par exemple, index.xhtml peut être configurée "
                + "comme page d'accueil.");

        REPONSES.put("web.xml", "web.xml est le descripteur de déploiement "
                + "web. Il peut notamment définir la page d'accueil "
                + "avec welcome-file-list.");

        REPONSES.put("localhost", "localhost désigne la machine locale. "
                + "Une URL utilisant localhost permet d'accéder à un service "
                + "exécuté sur le même ordinateur.");

        REPONSES.put("deploiement", "Le déploiement consiste à installer "
                + "et démarrer l'application sur un serveur comme Payara. "
                + "Après le déploiement, l'utilisateur peut accéder "
                + "à l'application par son URL.");

        REPONSES.put("payara", "Payara est un serveur d'applications "
                + "compatible avec Jakarta EE. Il exécute l'application "
                + "web et traite les requêtes du navigateur.");

        REPONSES.put("port", "Un port identifie un point d'accès réseau "
                + "utilisé par un service. L'URL peut inclure le port "
                + "configuré sur le serveur.");

        REPONSES.put("build", "Le build est la construction du projet. "
                + "Maven compile le code, traite les ressources et peut "
                + "produire une archive WAR.");

        REPONSES.put("war", "WAR signifie Web Application Archive. "
                + "C'est une archive qui contient une application web Java "
                + "destinée à un serveur compatible.");

        REPONSES.put("jar", "JAR signifie Java Archive. C'est une archive "
                + "utilisée pour regrouper des classes et des ressources. "
                + "Un WAR est spécifiquement destiné aux applications web.");

        REPONSES.put("git commit", "git commit enregistre un ensemble "
                + "de modifications dans l'historique local du dépôt Git. "
                + "Un message décrit l'objectif des changements.");

        REPONSES.put("git push", "git push envoie les commits locaux "
                + "vers un dépôt distant, par exemple sur GitHub, "
                + "si la branche et la connexion sont configurées.");

        REPONSES.put("github", "GitHub héberge des dépôts Git. "
                + "Il permet de conserver le code à distance, de suivre "
                + "les changements et de partager le projet.");
    }

    /**
     * Recherche une réponse selon les mots-clés.
     */
    private String trouverReponse(String question) {
        for (Map.Entry<String, String> entree : REPONSES.entrySet()) {
            String motCle = normaliser(entree.getKey());

            if (question.contains(motCle)) {
                return entree.getValue();
            }
        }

        return null;
    }

    /**
     * Normalise le texte pour faciliter la comparaison.
     */
    private String normaliser(String texte) {
        return texte.toLowerCase(Locale.FRENCH)
                .replace("é", "e")
                .replace("è", "e")
                .replace("ê", "e")
                .replace("à", "a")
                .replace("ù", "u")
                .replace("ô", "o")
                .replace("î", "i")
                .replace("ï", "i")
                .replace("ç", "c")
                .replace("'", " ");
    }

    /**
     * Génère une réponse à la question de l'utilisateur.
     */
    public String genererReponse(String question, String roleSysteme) {

        StringBuilder resultat = new StringBuilder("||");

        if (!roleSystemeAffiche
                && roleSysteme != null
                && !roleSysteme.isBlank()) {

            resultat.append(roleSysteme.toUpperCase(Locale.FRENCH));
            resultat.append("\n");
            roleSystemeAffiche = true;
        }

        String q = question == null ? "" : normaliser(question.trim());

        String reponse;

        if (q.isBlank()) {
            reponse = "Tu n'as pas saisi de question. "
                    + "Demande-moi une explication sur Java, JSF, CDI, "
                    + "le backing bean, Maven ou Payara.";
        } else {
            reponse = trouverReponse(q);

            if (reponse == null) {
                reponse = "Je suis l'assistant de révision du TP0 Jakarta EE. "
                        + "Je n'ai pas reconnu le sujet. Essaie une question "
                        + "sur @Inject, @Named, @ViewScoped, JSF, CDI, "
                        + "envoyer(), GenerateurReponse, XHTML, Maven, "
                        + "Payara ou le déploiement.";
            }
        }

        resultat.append(reponse).append("||");

        return resultat.toString();
    }
}
