@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.kinesis

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.Stream
import software.amazon.awscdk.services.kinesis.StreamProps
import software.constructs.Construct

public fun Construct.stream(id: String, initializer: Stream.() -> Unit = {}): Stream = Stream(this,
    id).apply(initializer)

public fun Construct.stream(
  id: String,
  props: StreamProps,
  initializer: Stream.() -> Unit = {},
): Stream = Stream(this, id, props).apply(initializer)
