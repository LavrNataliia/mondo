package share.pac.strings;

/**
 * Created by Konstantin Polishchuk on 3/3/16.
 */

public class ProjectScript {
    public static String  goToInitialSignup = "require(\n" +
            "['app/controllers/auth/info'],\n" +
            "function(authInfo) {\n" +
            "   var user = authInfo.getUser();\n" +
            "   console.log('user_id', user.getId());\n" +
            "   console.log('getFirstName', user.getFirstName());\n" +
            "   user.save(\n" +
            "      { initialSignUpPast: 0},\n" +
            "      {\n" +
            "         url: user.url() + \"/initial-signup-past\",\n" +
            "         patch: true,\n" +
            "         validate: false\n" +
            "       }\n" +
            "    );\n" +
            "});";

    public static String goToDashboard = "require(\n" +
            "['app/controllers/auth/info'],\n" +
            "function(authInfo) {\n" +
            "   var user = authInfo.getUser();\n" +
            "   console.log('user_id', user.getId());\n" +
            "   console.log('getFirstName', user.getFirstName());\n" +
            "   user.save(\n" +
            "      { initialSignUpPast: 1},\n" +
            "      {\n" +
            "         url: user.url() + \"/initial-signup-past\",\n" +
            "         patch: true,\n" +
            "         validate: false\n" +
            "       }\n" +
            "    );\n" +
            "});";
}
