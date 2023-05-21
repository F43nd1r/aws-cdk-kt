package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public
    fun destinationConfigProperty(initializer: CfnFunction.DestinationConfigProperty.Builder.() -> Unit
    = {}): CfnFunction.DestinationConfigProperty =
    CfnFunction.DestinationConfigProperty.builder().apply(initializer).build()
