package com.faendir.awscdkkt.generated.services.kinesis

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.StreamConsumerProps

@Generated
public fun buildStreamConsumerProps(initializer: @AwsCdkDsl StreamConsumerProps.Builder.() -> Unit =
    {}): StreamConsumerProps = StreamConsumerProps.Builder().apply(initializer).build()
