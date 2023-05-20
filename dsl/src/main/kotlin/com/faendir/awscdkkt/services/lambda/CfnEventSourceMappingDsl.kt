@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
