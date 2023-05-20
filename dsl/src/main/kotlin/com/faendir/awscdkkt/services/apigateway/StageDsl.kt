@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.Stage
import software.amazon.awscdk.services.apigateway.StageProps
import software.constructs.Construct

public fun Construct.stage(
  id: String,
  props: StageProps,
  initializer: Stage.() -> Unit = {},
): Stage = Stage(this, id, props).apply(initializer)
