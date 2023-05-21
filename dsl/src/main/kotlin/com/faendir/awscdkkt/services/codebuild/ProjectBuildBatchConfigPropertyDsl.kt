package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

@Generated
public
    fun projectBuildBatchConfigProperty(initializer: CfnProject.ProjectBuildBatchConfigProperty.Builder.() -> Unit
    = {}): CfnProject.ProjectBuildBatchConfigProperty =
    CfnProject.ProjectBuildBatchConfigProperty.builder().apply(initializer).build()
