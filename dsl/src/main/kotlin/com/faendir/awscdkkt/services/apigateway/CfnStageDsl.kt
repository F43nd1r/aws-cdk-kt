@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.CfnStage
import software.amazon.awscdk.services.apigateway.CfnStageProps
import software.constructs.Construct

public fun Construct.cfnStage(
  id: String,
  props: CfnStageProps,
  initializer: CfnStage.() -> Unit = {},
): CfnStage = CfnStage(this, id, props).apply(initializer)
