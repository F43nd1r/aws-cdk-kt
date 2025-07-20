package com.faendir.awscdkkt.generated.services.kinesis

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.kinesis.Stream
import software.amazon.awscdk.services.kinesis.StreamProps
import software.constructs.Construct

@Generated
public fun Construct.stream(id: String, initializer: @AwsCdkDsl Stream.() -> Unit = {}): Stream = Stream(this, id).apply(initializer)

@Generated
public fun Construct.stream(
  id: String,
  props: StreamProps,
  initializer: @AwsCdkDsl Stream.() -> Unit = {},
): Stream = Stream(this, id, props).apply(initializer)

@Generated
public fun Construct.buildStream(id: String, initializer: @AwsCdkDsl Stream.Builder.() -> Unit = {}): Stream = Stream.Builder.create(this, id).apply(initializer).build()
