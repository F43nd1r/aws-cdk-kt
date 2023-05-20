@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.batch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.batch.CfnJobDefinition

public fun timeoutProperty(initializer: CfnJobDefinition.TimeoutProperty.Builder.() -> Unit):
    CfnJobDefinition.TimeoutProperty =
    CfnJobDefinition.TimeoutProperty.builder().apply(initializer).build()
