@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.codebuild

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.codebuild.CfnProject

public
    fun environmentVariableProperty(initializer: CfnProject.EnvironmentVariableProperty.Builder.() -> Unit):
    CfnProject.EnvironmentVariableProperty =
    CfnProject.EnvironmentVariableProperty.builder().apply(initializer).build()
