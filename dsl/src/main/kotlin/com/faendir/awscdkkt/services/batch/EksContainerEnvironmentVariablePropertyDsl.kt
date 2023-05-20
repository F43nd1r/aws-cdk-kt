@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

public
    fun eksContainerEnvironmentVariableProperty(initializer: CfnJobDefinition.EksContainerEnvironmentVariableProperty.Builder.() -> Unit):
    CfnJobDefinition.EksContainerEnvironmentVariableProperty =
    CfnJobDefinition.EksContainerEnvironmentVariableProperty.builder().apply(initializer).build()
