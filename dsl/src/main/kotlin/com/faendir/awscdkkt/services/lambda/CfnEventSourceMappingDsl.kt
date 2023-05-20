@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping
import software.amazon.awscdk.services.lambda.CfnEventSourceMappingProps
import software.constructs.Construct

public fun Construct.cfnEventSourceMapping(
  id: String,
  props: CfnEventSourceMappingProps,
  initializer: CfnEventSourceMapping.() -> Unit = {},
): CfnEventSourceMapping = CfnEventSourceMapping(this, id, props).apply(initializer)
