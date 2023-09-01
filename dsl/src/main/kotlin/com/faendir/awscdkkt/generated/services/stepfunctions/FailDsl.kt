package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Fail
import software.amazon.awscdk.services.stepfunctions.FailProps
import software.constructs.Construct

@Generated
public fun Construct.fail(id: String, initializer: @AwsCdkDsl Fail.() -> Unit = {}): Fail =
    Fail(this, id).apply(initializer)

@Generated
public fun Construct.fail(
  id: String,
  props: FailProps,
  initializer: @AwsCdkDsl Fail.() -> Unit = {},
): Fail = Fail(this, id, props).apply(initializer)

@Generated
public fun Construct.buildFail(id: String, initializer: @AwsCdkDsl Fail.Builder.() -> Unit = {}):
    Fail = Fail.Builder.create(this, id).apply(initializer).build()
