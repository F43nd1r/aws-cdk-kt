@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.lambda.eventsources

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lambda.eventsources.KinesisEventSourceProps

public fun kinesisEventSourceProps(initializer: KinesisEventSourceProps.Builder.() -> Unit):
    KinesisEventSourceProps = KinesisEventSourceProps.builder().apply(initializer).build()
