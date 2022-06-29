package com.github.liuzuolong.ideaplugintemplate.services

import com.intellij.openapi.project.Project
import com.github.liuzuolong.ideaplugintemplate.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
