package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

@Generated
public fun environmentProperty(initializer: CfnProject.EnvironmentProperty.Builder.() -> Unit = {}):
    CfnProject.EnvironmentProperty =
    CfnProject.EnvironmentProperty.builder().apply(initializer).build()
