package com.faendir.awscdkkt.generated.services.stepfunctions

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.stepfunctions.CustomState
import software.amazon.awscdk.services.stepfunctions.CustomStateProps
import software.constructs.Construct

@Generated
public fun Construct.customState(id: String, props: CustomStateProps): CustomState =
    CustomState(this, id, props)

@Generated
public fun Construct.customState(
  id: String,
  props: CustomStateProps,
  initializer: @AwsCdkDsl CustomState.() -> Unit,
): CustomState = CustomState(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCustomState(id: String, initializer: @AwsCdkDsl
    CustomState.Builder.() -> Unit): CustomState = CustomState.Builder.create(this,
    id).apply(initializer).build()
