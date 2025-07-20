package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.SingletonFunction
import software.amazon.awscdk.services.lambda.SingletonFunctionProps
import software.constructs.Construct

@Generated
public fun Construct.singletonFunction(
  id: String,
  props: SingletonFunctionProps,
  initializer: @AwsCdkDsl SingletonFunction.() -> Unit = {},
): SingletonFunction = SingletonFunction(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSingletonFunction(id: String, initializer: @AwsCdkDsl SingletonFunction.Builder.() -> Unit = {}): SingletonFunction = SingletonFunction.Builder.create(this, id).apply(initializer).build()
