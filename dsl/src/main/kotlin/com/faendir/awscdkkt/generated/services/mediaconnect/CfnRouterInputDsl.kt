package com.faendir.awscdkkt.generated.services.mediaconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconnect.CfnRouterInput
import software.amazon.awscdk.services.mediaconnect.CfnRouterInputProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRouterInput(
  id: String,
  props: CfnRouterInputProps,
  initializer: @AwsCdkDsl CfnRouterInput.() -> Unit = {},
): CfnRouterInput = CfnRouterInput(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRouterInput(id: String, initializer: @AwsCdkDsl CfnRouterInput.Builder.() -> Unit = {}): CfnRouterInput = CfnRouterInput.Builder.create(this, id).apply(initializer).build()
