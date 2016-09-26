package com.jzb.gradle.autopack

import org.gradle.api.Plugin
import org.gradle.api.Project

class PackPlugin implements Plugin<Project> {

    void apply(Project target) {
        target.task('packTask', type: PackTask)
        def hasMarkets = true;
        applyPluginTasks(hasMarkets)
    }

    void applyPluginTasks(hasMarkets) {
        project.afterEvaluate {
//            def buildTypes = project.android.buildTypes
//            debug("applyPluginTasks() build types: ${buildTypes.collect { it.name }}")
//            checkProperties()
//            checkCleanTask()
//            //applySigningConfigs()
//            project.android.applicationVariants.all { variant ->
//                checkSigningConfig(variant)
//                if (variant.buildType.name != "debug") {
//                    if (hasMarkets) {
//                        // modify manifest and add archive apk
//                        // only when markets found and not debug
//                        debug("applyPluginTasks() markets found, add manifest and archive task.")
//                        checkArchiveTask(variant)
//                        checkManifest(variant)
//                    } else {
//                        debug("applyPluginTasks() markets not found, check version name.")
//                        checkVersionName(variant)
//                    }
//                }
//            }
        }
    }
}

////家长帮版本名字
//ext.customVersionName = "5.4.3"
////家长帮版本号码，必须为数字
//ext.customVersionCode = 48
//
//ext.apkName = "";
//
////获取Git的版本号
//ext.getGitRevision = { ->
//    def stdout = new ByteArrayOutputStream()
//    exec {
//        commandLine 'git', 'rev-parse', '--short', 'HEAD'
//        standardOutput = stdout
//    }
//    return stdout.toString().trim()
//}
