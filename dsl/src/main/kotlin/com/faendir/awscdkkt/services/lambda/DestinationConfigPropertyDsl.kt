@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

public
    fun destinationConfigProperty(initializer: CfnEventSourceMapping.DestinationConfigProperty.Builder.() -> Unit):
    CfnEventSourceMapping.DestinationConfigProperty =
    CfnEventSourceMapping.DestinationConfigProperty.builder().apply(initializer).build()
