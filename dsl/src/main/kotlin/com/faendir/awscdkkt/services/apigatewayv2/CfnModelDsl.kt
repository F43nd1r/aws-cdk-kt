@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnModel
import software.amazon.awscdk.services.apigatewayv2.CfnModelProps
import software.constructs.Construct

public fun Construct.cfnModel(
  id: String,
  props: CfnModelProps,
  initializer: CfnModel.() -> Unit = {},
): CfnModel = CfnModel(this, id, props).apply(initializer)
