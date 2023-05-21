package com.faendir.awscdkkt.services.events.targets

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.KinesisFirehoseStreamProps

@Generated
public fun kinesisFirehoseStreamProps(initializer: KinesisFirehoseStreamProps.Builder.() -> Unit =
    {}): KinesisFirehoseStreamProps =
    KinesisFirehoseStreamProps.builder().apply(initializer).build()
