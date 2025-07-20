package com.faendir.awscdkkt.generated.services.lambda

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.lambda.Function
import software.amazon.awscdk.services.lambda.FunctionProps
import software.constructs.Construct

@Generated
public fun Construct.function(
  id: String,
  props: FunctionProps,
  initializer: @AwsCdkDsl Function.() -> Unit = {},
): Function = Function(this, id, props).apply(initializer)

@Generated
public fun Construct.buildFunction(id: String, initializer: @AwsCdkDsl Function.Builder.() -> Unit = {}): Function = Function.Builder.create(this, id).apply(initializer).build()
