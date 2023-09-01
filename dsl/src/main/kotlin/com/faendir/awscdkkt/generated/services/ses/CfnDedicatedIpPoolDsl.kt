package com.faendir.awscdkkt.generated.services.ses

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnDedicatedIpPool
import software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDedicatedIpPool(id: String, initializer: @AwsCdkDsl
    CfnDedicatedIpPool.() -> Unit = {}): CfnDedicatedIpPool = CfnDedicatedIpPool(this,
    id).apply(initializer)

@Generated
public fun Construct.cfnDedicatedIpPool(
  id: String,
  props: CfnDedicatedIpPoolProps,
  initializer: @AwsCdkDsl CfnDedicatedIpPool.() -> Unit = {},
): CfnDedicatedIpPool = CfnDedicatedIpPool(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnDedicatedIpPool(id: String, initializer: @AwsCdkDsl
    CfnDedicatedIpPool.Builder.() -> Unit = {}): CfnDedicatedIpPool =
    CfnDedicatedIpPool.Builder.create(this, id).apply(initializer).build()
