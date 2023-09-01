package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.CfnLifecycleHook
import software.amazon.awscdk.services.autoscaling.CfnLifecycleHookProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLifecycleHook(
  id: String,
  props: CfnLifecycleHookProps,
  initializer: @AwsCdkDsl CfnLifecycleHook.() -> Unit = {},
): CfnLifecycleHook = CfnLifecycleHook(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLifecycleHook(id: String, initializer: @AwsCdkDsl
    CfnLifecycleHook.Builder.() -> Unit = {}): CfnLifecycleHook =
    CfnLifecycleHook.Builder.create(this, id).apply(initializer).build()
