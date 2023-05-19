@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnApiMapping
import software.amazon.awscdk.services.apigatewayv2.CfnApiMappingProps
import software.constructs.Construct

public fun Construct.cfnApiMapping(
  id: String,
  props: CfnApiMappingProps,
  initializer: CfnApiMapping.() -> Unit = {},
): CfnApiMapping = CfnApiMapping(this, id, props).apply(initializer)
