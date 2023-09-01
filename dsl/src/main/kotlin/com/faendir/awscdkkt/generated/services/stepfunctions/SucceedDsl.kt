package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Succeed
import software.amazon.awscdk.services.stepfunctions.SucceedProps
import software.constructs.Construct

@Generated
public fun Construct.succeed(id: String, initializer: @AwsCdkDsl Succeed.() -> Unit = {}): Succeed =
    Succeed(this, id).apply(initializer)

@Generated
public fun Construct.succeed(
  id: String,
  props: SucceedProps,
  initializer: @AwsCdkDsl Succeed.() -> Unit = {},
): Succeed = Succeed(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSucceed(id: String, initializer: @AwsCdkDsl Succeed.Builder.() -> Unit =
    {}): Succeed = Succeed.Builder.create(this, id).apply(initializer).build()
