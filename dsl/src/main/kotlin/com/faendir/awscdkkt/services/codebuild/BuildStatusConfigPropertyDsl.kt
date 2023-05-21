package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

@Generated
public
    fun buildStatusConfigProperty(initializer: CfnProject.BuildStatusConfigProperty.Builder.() -> Unit
    = {}): CfnProject.BuildStatusConfigProperty =
    CfnProject.BuildStatusConfigProperty.builder().apply(initializer).build()
