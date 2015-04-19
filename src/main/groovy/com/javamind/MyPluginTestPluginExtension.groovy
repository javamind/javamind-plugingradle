package com.javamind

import org.gradle.api.Project

class MyPluginTestPluginExtension {

    def String from
    def String into
    def String task

    MyPluginTestPluginExtension(Project project) {
        from = project.testReportDir
        into = "${project.testReportDir}-${System.currentTimeMillis()}"
        task = "test"
    }
}