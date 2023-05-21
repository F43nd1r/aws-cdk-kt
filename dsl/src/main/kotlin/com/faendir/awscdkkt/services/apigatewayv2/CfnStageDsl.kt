package com.faendir.awscdkkt.services.apigatewayv2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigatewayv2.CfnStage
import software.amazon.awscdk.services.apigatewayv2.CfnStageProps
import software.constructs.Construct

@Generated
public fun Construct.cfnStage(
  id: String,
  props: CfnStageProps,
  initializer: CfnStage.() -> Unit = {},
): CfnStage = CfnStage(this, id, props).apply(initializer)
