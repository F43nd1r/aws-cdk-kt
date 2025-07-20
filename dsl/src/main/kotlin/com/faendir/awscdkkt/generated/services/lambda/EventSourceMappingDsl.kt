package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.EventSourceMapping
import software.amazon.awscdk.services.lambda.EventSourceMappingProps
import software.constructs.Construct

@Generated
public fun Construct.eventSourceMapping(
  id: String,
  props: EventSourceMappingProps,
  initializer: @AwsCdkDsl EventSourceMapping.() -> Unit = {},
): EventSourceMapping = EventSourceMapping(this, id, props).apply(initializer)

@Generated
public fun Construct.buildEventSourceMapping(id: String, initializer: @AwsCdkDsl EventSourceMapping.Builder.() -> Unit = {}): EventSourceMapping = EventSourceMapping.Builder.create(this, id).apply(initializer).build()
