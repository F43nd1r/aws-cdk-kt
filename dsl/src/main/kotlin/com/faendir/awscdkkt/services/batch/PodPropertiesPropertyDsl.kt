@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

public
    fun podPropertiesProperty(initializer: CfnJobDefinition.PodPropertiesProperty.Builder.() -> Unit):
    CfnJobDefinition.PodPropertiesProperty =
    CfnJobDefinition.PodPropertiesProperty.builder().apply(initializer).build()
