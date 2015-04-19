package com.javamind

import org.gradle.api.tasks.Copy
import org.gradle.api.tasks.TaskAction


class MyPluginTask extends Copy {

    MyPluginTask(){
        from project.myplugintest.from
        into project.myplugintest.into
    }

    @TaskAction
    def exec() {
        println "Reports copied into ${project.myplugintest.into}"
    }
}