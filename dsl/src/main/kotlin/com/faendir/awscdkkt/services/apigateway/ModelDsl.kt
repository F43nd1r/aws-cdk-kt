@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.Model
import software.amazon.awscdk.services.apigateway.ModelProps
import software.constructs.Construct

public fun Construct.model(
  id: String,
  props: ModelProps,
  initializer: Model.() -> Unit = {},
): Model = Model(this, id, props).apply(initializer)
