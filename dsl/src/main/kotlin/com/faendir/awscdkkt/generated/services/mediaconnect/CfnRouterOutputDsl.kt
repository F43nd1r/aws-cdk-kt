package com.faendir.awscdkkt.generated.services.mediaconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconnect.CfnRouterOutput
import software.amazon.awscdk.services.mediaconnect.CfnRouterOutputProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRouterOutput(
  id: String,
  props: CfnRouterOutputProps,
  initializer: @AwsCdkDsl CfnRouterOutput.() -> Unit = {},
): CfnRouterOutput = CfnRouterOutput(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRouterOutput(id: String, initializer: @AwsCdkDsl CfnRouterOutput.Builder.() -> Unit = {}): CfnRouterOutput = CfnRouterOutput.Builder.create(this, id).apply(initializer).build()
