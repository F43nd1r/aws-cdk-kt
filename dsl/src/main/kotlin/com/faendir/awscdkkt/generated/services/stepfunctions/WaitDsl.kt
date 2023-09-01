package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.Wait
import software.amazon.awscdk.services.stepfunctions.WaitProps
import software.constructs.Construct

@Generated
public fun Construct.wait(
  id: String,
  props: WaitProps,
  initializer: @AwsCdkDsl Wait.() -> Unit = {},
): Wait = Wait(this, id, props).apply(initializer)

@Generated
public fun Construct.buildWait(id: String, initializer: @AwsCdkDsl Wait.Builder.() -> Unit = {}):
    Wait = Wait.Builder.create(this, id).apply(initializer).build()
