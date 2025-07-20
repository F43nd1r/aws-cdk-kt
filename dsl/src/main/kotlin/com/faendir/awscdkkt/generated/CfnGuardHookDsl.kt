package com.faendir.awscdkkt.generated

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.CfnGuardHook
import software.amazon.awscdk.CfnGuardHookProps
import software.constructs.Construct

@Generated
public fun Construct.cfnGuardHook(
  id: String,
  props: CfnGuardHookProps,
  initializer: @AwsCdkDsl CfnGuardHook.() -> Unit = {},
): CfnGuardHook = CfnGuardHook(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnGuardHook(id: String, initializer: @AwsCdkDsl CfnGuardHook.Builder.() -> Unit = {}): CfnGuardHook = CfnGuardHook.Builder.create(this, id).apply(initializer).build()
