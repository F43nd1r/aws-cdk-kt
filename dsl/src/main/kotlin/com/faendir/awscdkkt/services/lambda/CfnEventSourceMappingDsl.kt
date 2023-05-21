package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping
import software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEventSourceMapping(
  id: String,
  props: CfnEventSourceMappingProps,
  initializer: CfnEventSourceMapping.() -> Unit = {},
): CfnEventSourceMapping = CfnEventSourceMapping(this, id, props).apply(initializer)
