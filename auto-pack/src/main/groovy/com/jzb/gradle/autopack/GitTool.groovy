package com.jzb.gradle.autopack

public class GitTool {
    public static GitInfo sGitInfo;

    def getRevision = { ->
        def command = "git rev-parse --short HEAD"
        def proc = command.execute()
        proc.waitFor()
        String result = proc.in.text;


//        println("git rev-parse --short HEAD")
//        println "Process exit code: ${proc.exitValue()}"
//        println "Std Err: ${proc.err.text}"
//        println "Std Out: $result"

        return result
    }

    def getEmail = {
        def command = "git config user.email"
        def proc = command.execute()
        proc.waitFor()

        String result = proc.in.text;

//        println("git config user.email")
//        println "Process exit code: ${proc.exitValue()}"
//        println "Std Err: ${proc.err.text}"
//        println "Std Out: $result"

        return result
    }

    def initGitInfo = {
        if (sGitInfo == null) {
            sGitInfo = new GitInfo()
        }

        sGitInfo.revision = getRevision()
        sGitInfo.email = getEmail()
    }
}

