@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
