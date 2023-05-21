package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

@Generated
public
    fun projectFileSystemLocationProperty(initializer: CfnProject.ProjectFileSystemLocationProperty.Builder.() -> Unit
    = {}): CfnProject.ProjectFileSystemLocationProperty =
    CfnProject.ProjectFileSystemLocationProperty.builder().apply(initializer).build()
