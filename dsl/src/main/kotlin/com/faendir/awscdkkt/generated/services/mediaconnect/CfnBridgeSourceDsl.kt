package com.faendir.awscdkkt.generated.services.mediaconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSource
import software.amazon.awscdk.services.mediaconnect.CfnBridgeSourceProps
import software.constructs.Construct

@Generated
public fun Construct.cfnBridgeSource(
  id: String,
  props: CfnBridgeSourceProps,
  initializer: @AwsCdkDsl CfnBridgeSource.() -> Unit = {},
): CfnBridgeSource = CfnBridgeSource(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnBridgeSource(id: String, initializer: @AwsCdkDsl CfnBridgeSource.Builder.() -> Unit = {}): CfnBridgeSource = CfnBridgeSource.Builder.create(this, id).apply(initializer).build()
