package com.faendir.awscdkkt.generated.services.storagegateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.storagegateway.CfnTapePool
import software.amazon.awscdk.services.storagegateway.CfnTapePoolProps
import software.constructs.Construct

@Generated
public fun Construct.cfnTapePool(
  id: String,
  props: CfnTapePoolProps,
  initializer: @AwsCdkDsl CfnTapePool.() -> Unit = {},
): CfnTapePool = CfnTapePool(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnTapePool(id: String, initializer: @AwsCdkDsl CfnTapePool.Builder.() -> Unit = {}): CfnTapePool = CfnTapePool.Builder.create(this, id).apply(initializer).build()
