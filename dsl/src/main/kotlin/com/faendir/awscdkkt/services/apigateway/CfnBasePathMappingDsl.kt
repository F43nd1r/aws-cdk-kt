@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
