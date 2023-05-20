@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.lambda

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.SingletonFunction
import software.amazon.awscdk.services.lambda.SingletonFunctionProps
import software.constructs.Construct

public fun Construct.singletonFunction(
  id: String,
  props: SingletonFunctionProps,
  initializer: SingletonFunction.() -> Unit = {},
): SingletonFunction = SingletonFunction(this, id, props).apply(initializer)
