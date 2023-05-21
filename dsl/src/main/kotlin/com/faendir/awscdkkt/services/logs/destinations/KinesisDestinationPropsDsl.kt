package com.faendir.awscdkkt.services.logs.destinations

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps

@Generated
public fun kinesisDestinationProps(initializer: KinesisDestinationProps.Builder.() -> Unit = {}):
    KinesisDestinationProps = KinesisDestinationProps.builder().apply(initializer).build()
