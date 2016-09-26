package com.jzb.gradle.autopack

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class PackTask extends DefaultTask {
    String greeting = 'hello from PackTask'

    @TaskAction
    def greet() {
        GitTool gitTool = new GitTool()
        println greeting
        gitTool.initGitInfo()
    }
}
