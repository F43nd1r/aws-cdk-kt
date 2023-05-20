@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.opsworks

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opsworks.CfnApp

public
    fun environmentVariableProperty(initializer: CfnApp.EnvironmentVariableProperty.Builder.() -> Unit):
    CfnApp.EnvironmentVariableProperty =
    CfnApp.EnvironmentVariableProperty.builder().apply(initializer).build()
