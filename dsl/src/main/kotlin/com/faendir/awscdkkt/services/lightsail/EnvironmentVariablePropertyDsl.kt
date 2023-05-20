@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnContainer

public
    fun environmentVariableProperty(initializer: CfnContainer.EnvironmentVariableProperty.Builder.() -> Unit):
    CfnContainer.EnvironmentVariableProperty =
    CfnContainer.EnvironmentVariableProperty.builder().apply(initializer).build()
