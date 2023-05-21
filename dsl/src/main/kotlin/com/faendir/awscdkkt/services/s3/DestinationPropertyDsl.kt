package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.CfnBucket

@Generated
public fun destinationProperty(initializer: CfnBucket.DestinationProperty.Builder.() -> Unit = {}):
    CfnBucket.DestinationProperty =
    CfnBucket.DestinationProperty.builder().apply(initializer).build()
