package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

@Generated
public
    fun projectSourceVersionProperty(initializer: CfnProject.ProjectSourceVersionProperty.Builder.() -> Unit
    = {}): CfnProject.ProjectSourceVersionProperty =
    CfnProject.ProjectSourceVersionProperty.builder().apply(initializer).build()
