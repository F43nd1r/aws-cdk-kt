package com.faendir.awscdkkt.generated.services.events.targets

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.targets.KinesisStreamProps

@Generated
public fun buildKinesisStreamProps(initializer: @AwsCdkDsl KinesisStreamProps.Builder.() -> Unit =
    {}): KinesisStreamProps = KinesisStreamProps.Builder().apply(initializer).build()
