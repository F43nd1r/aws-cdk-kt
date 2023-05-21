package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.FunctionUrl
import software.amazon.awscdk.services.lambda.FunctionUrlProps
import software.constructs.Construct

@Generated
public fun Construct.functionUrl(
  id: String,
  props: FunctionUrlProps,
  initializer: FunctionUrl.() -> Unit = {},
): FunctionUrl = FunctionUrl(this, id, props).apply(initializer)
