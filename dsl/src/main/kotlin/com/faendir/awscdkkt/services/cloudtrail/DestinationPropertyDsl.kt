package com.faendir.awscdkkt.services.cloudtrail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudtrail.CfnChannel

@Generated
public fun destinationProperty(initializer: CfnChannel.DestinationProperty.Builder.() -> Unit = {}):
    CfnChannel.DestinationProperty =
    CfnChannel.DestinationProperty.builder().apply(initializer).build()
