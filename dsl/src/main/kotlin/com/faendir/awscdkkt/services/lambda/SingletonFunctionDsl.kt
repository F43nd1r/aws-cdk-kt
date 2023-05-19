@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
