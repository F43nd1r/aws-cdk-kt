@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

public
    fun selfManagedEventSourceProperty(initializer: CfnEventSourceMapping.SelfManagedEventSourceProperty.Builder.() -> Unit):
    CfnEventSourceMapping.SelfManagedEventSourceProperty =
    CfnEventSourceMapping.SelfManagedEventSourceProperty.builder().apply(initializer).build()
