package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

@Generated
public
    fun destinationConfigProperty(initializer: CfnEventSourceMapping.DestinationConfigProperty.Builder.() -> Unit
    = {}): CfnEventSourceMapping.DestinationConfigProperty =
    CfnEventSourceMapping.DestinationConfigProperty.builder().apply(initializer).build()
