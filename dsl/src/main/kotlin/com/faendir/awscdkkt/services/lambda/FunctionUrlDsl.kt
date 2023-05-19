@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.FunctionUrl
import software.amazon.awscdk.services.lambda.FunctionUrlProps
import software.constructs.Construct

public fun Construct.functionUrl(
  id: String,
  props: FunctionUrlProps,
  initializer: FunctionUrl.() -> Unit = {},
): FunctionUrl = FunctionUrl(this, id, props).apply(initializer)
