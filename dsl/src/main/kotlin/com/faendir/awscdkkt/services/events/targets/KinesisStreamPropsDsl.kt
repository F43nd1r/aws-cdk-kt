@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.KinesisStreamProps

public fun kinesisStreamProps(initializer: KinesisStreamProps.Builder.() -> Unit):
    KinesisStreamProps = KinesisStreamProps.builder().apply(initializer).build()
