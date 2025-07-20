package com.faendir.awscdkkt.generated.services.mediaconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconnect.CfnBridgeOutput
import software.amazon.awscdk.services.mediaconnect.CfnBridgeOutputProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBridgeOutput(
  id: String,
  props: CfnBridgeOutputProps,
  initializer: @AwsCdkDsl CfnBridgeOutput.() -> Unit = {},
): CfnBridgeOutput = CfnBridgeOutput(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBridgeOutput(id: String, initializer: @AwsCdkDsl CfnBridgeOutput.Builder.() -> Unit = {}): CfnBridgeOutput = CfnBridgeOutput.Builder.create(this, id).apply(initializer).build()
