package com.faendir.awscdkkt.services.sam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.sam.CfnFunction

@Generated
public fun destinationProperty(initializer: CfnFunction.DestinationProperty.Builder.() -> Unit =
    {}): CfnFunction.DestinationProperty =
    CfnFunction.DestinationProperty.builder().apply(initializer).build()
