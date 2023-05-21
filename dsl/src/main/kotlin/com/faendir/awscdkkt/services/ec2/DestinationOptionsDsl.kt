package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.DestinationOptions

@Generated
public fun destinationOptions(initializer: DestinationOptions.Builder.() -> Unit = {}):
    DestinationOptions = DestinationOptions.builder().apply(initializer).build()
