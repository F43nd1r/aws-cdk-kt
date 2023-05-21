package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.Stage
import software.amazon.awscdk.services.apigateway.StageProps
import software.constructs.Construct

@Generated
public fun Construct.stage(
  id: String,
  props: StageProps,
  initializer: Stage.() -> Unit = {},
): Stage = Stage(this, id, props).apply(initializer)
