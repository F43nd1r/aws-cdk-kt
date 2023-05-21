package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnApp

@Generated
public
    fun environmentVariableProperty(initializer: CfnApp.EnvironmentVariableProperty.Builder.() -> Unit
    = {}): CfnApp.EnvironmentVariableProperty =
    CfnApp.EnvironmentVariableProperty.builder().apply(initializer).build()
