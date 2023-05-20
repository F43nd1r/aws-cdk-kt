@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnDedicatedIpPool
import software.amazon.awscdk.services.ses.CfnDedicatedIpPoolProps
import software.constructs.Construct

public fun Construct.cfnDedicatedIpPool(
  id: String,
  props: CfnDedicatedIpPoolProps,
  initializer: CfnDedicatedIpPool.() -> Unit = {},
): CfnDedicatedIpPool = CfnDedicatedIpPool(this, id, props).apply(initializer)

public fun Construct.cfnDedicatedIpPool(id: String, initializer: CfnDedicatedIpPool.() -> Unit =
    {}): CfnDedicatedIpPool = CfnDedicatedIpPool(this, id).apply(initializer)
