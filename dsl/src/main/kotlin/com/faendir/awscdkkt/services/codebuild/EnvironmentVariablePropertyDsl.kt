package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

@Generated
public
    fun environmentVariableProperty(initializer: CfnProject.EnvironmentVariableProperty.Builder.() -> Unit
    = {}): CfnProject.EnvironmentVariableProperty =
    CfnProject.EnvironmentVariableProperty.builder().apply(initializer).build()
