@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.logs.destinations

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.logs.destinations.KinesisDestinationProps

public fun kinesisDestinationProps(initializer: KinesisDestinationProps.Builder.() -> Unit):
    KinesisDestinationProps = KinesisDestinationProps.builder().apply(initializer).build()
