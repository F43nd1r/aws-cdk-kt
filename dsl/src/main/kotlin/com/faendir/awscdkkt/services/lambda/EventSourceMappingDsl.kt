package com.faendir.awscdkkt.services.lambda

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
  initializer: EventSourceMapping.() -> Unit = {},
): EventSourceMapping = EventSourceMapping(this, id, props).apply(initializer)
