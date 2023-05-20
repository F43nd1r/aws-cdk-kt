@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnBasePathMapping
import software.amazon.awscdk.services.apigateway.CfnBasePathMappingProps
import software.constructs.Construct

public fun Construct.cfnBasePathMapping(
  id: String,
  props: CfnBasePathMappingProps,
  initializer: CfnBasePathMapping.() -> Unit = {},
): CfnBasePathMapping = CfnBasePathMapping(this, id, props).apply(initializer)
