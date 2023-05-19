@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

public
    fun nodePropertiesProperty(initializer: CfnJobDefinition.NodePropertiesProperty.Builder.() -> Unit):
    CfnJobDefinition.NodePropertiesProperty =
    CfnJobDefinition.NodePropertiesProperty.builder().apply(initializer).build()
