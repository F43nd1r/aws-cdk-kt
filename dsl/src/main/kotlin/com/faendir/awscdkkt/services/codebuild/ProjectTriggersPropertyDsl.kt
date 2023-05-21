package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

@Generated
public
    fun projectTriggersProperty(initializer: CfnProject.ProjectTriggersProperty.Builder.() -> Unit =
    {}): CfnProject.ProjectTriggersProperty =
    CfnProject.ProjectTriggersProperty.builder().apply(initializer).build()
