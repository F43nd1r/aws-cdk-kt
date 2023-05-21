package com.faendir.awscdkkt.services.pinpointemail

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool
import software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps
import software.constructs.Construct

@Generated
public fun Construct.cfnDedicatedIpPool(id: String, initializer: CfnDedicatedIpPool.() -> Unit =
    {}): CfnDedicatedIpPool = CfnDedicatedIpPool(this, id).apply(initializer)

@Generated
public fun Construct.cfnDedicatedIpPool(
  id: String,
  props: CfnDedicatedIpPoolProps,
  initializer: CfnDedicatedIpPool.() -> Unit = {},
): CfnDedicatedIpPool = CfnDedicatedIpPool(this, id, props).apply(initializer)
