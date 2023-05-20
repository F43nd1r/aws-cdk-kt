@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

public
    fun logConfigurationProperty(initializer: CfnJobDefinition.LogConfigurationProperty.Builder.() -> Unit):
    CfnJobDefinition.LogConfigurationProperty =
    CfnJobDefinition.LogConfigurationProperty.builder().apply(initializer).build()
