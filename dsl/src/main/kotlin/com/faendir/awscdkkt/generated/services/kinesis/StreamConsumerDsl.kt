package com.faendir.awscdkkt.generated.services.kinesis

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.StreamConsumer
import software.amazon.awscdk.services.kinesis.StreamConsumerProps
import software.constructs.Construct

@Generated
public fun Construct.streamConsumer(
  id: String,
  props: StreamConsumerProps,
  initializer: @AwsCdkDsl StreamConsumer.() -> Unit = {},
): StreamConsumer = StreamConsumer(this, id, props).apply(initializer)

@Generated
public fun Construct.buildStreamConsumer(id: String, initializer: @AwsCdkDsl
    StreamConsumer.Builder.() -> Unit = {}): StreamConsumer = StreamConsumer.Builder.create(this,
    id).apply(initializer).build()
