package com.faendir.awscdkkt.generated.services.autoscaling

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.autoscaling.LifecycleHook
import software.amazon.awscdk.services.autoscaling.LifecycleHookProps
import software.constructs.Construct

@Generated
public fun Construct.lifecycleHook(
  id: String,
  props: LifecycleHookProps,
  initializer: @AwsCdkDsl LifecycleHook.() -> Unit = {},
): LifecycleHook = LifecycleHook(this, id, props).apply(initializer)

@Generated
public fun Construct.buildLifecycleHook(id: String, initializer: @AwsCdkDsl LifecycleHook.Builder.() -> Unit = {}): LifecycleHook = LifecycleHook.Builder.create(this, id).apply(initializer).build()
