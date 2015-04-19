package com.javamind


import org.gradle.api.Plugin
import org.gradle.api.Project
import org.gradle.api.Task


class MyPluginTestPlugin implements Plugin<Project> {
    @Override
    public void apply(Project project) {
        //Create the extension
        project.extensions.create("myplugintest", MyPluginTestPluginExtension, project)

        //Create the tasks
        Task myplugintest = project.task(name:"myplugintest", type:MyPluginTask){}

        //Link the tasks to the build chain
        project.afterEvaluate {
            Task task = project.tasks.getByName(project.myplugintest.task)
            task.finalizedBy myplugintest
        }
    }
}