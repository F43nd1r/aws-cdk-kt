package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnContainer

@Generated
public
    fun environmentVariableProperty(initializer: CfnContainer.EnvironmentVariableProperty.Builder.() -> Unit
    = {}): CfnContainer.EnvironmentVariableProperty =
    CfnContainer.EnvironmentVariableProperty.builder().apply(initializer).build()
