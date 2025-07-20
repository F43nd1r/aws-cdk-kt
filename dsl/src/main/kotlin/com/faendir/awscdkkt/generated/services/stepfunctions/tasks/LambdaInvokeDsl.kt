package com.faendir.awscdkkt.generated.services.stepfunctions.tasks

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvoke
import software.amazon.awscdk.services.stepfunctions.tasks.LambdaInvokeProps
import software.constructs.Construct

@Generated
public fun Construct.lambdaInvoke(
  id: String,
  props: LambdaInvokeProps,
  initializer: @AwsCdkDsl LambdaInvoke.() -> Unit = {},
): LambdaInvoke = LambdaInvoke(this, id, props).apply(initializer)

@Generated
public fun Construct.buildLambdaInvoke(id: String, initializer: @AwsCdkDsl LambdaInvoke.Builder.() -> Unit = {}): LambdaInvoke = LambdaInvoke.Builder.create(this, id).apply(initializer).build()
