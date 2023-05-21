package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.Model
import software.amazon.awscdk.services.apigateway.ModelProps
import software.constructs.Construct

@Generated
public fun Construct.model(
  id: String,
  props: ModelProps,
  initializer: Model.() -> Unit = {},
): Model = Model(this, id, props).apply(initializer)
