package com.faendir.awscdkkt.generated.services.logs.destinations

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps

@Generated
public fun buildKinesisDestinationProps(initializer: @AwsCdkDsl
    KinesisDestinationProps.Builder.() -> Unit): KinesisDestinationProps =
    KinesisDestinationProps.Builder().apply(initializer).build()
