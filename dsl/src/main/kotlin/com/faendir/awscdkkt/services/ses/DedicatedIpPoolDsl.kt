@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ses.DedicatedIpPool
import software.amazon.awscdk.services.ses.DedicatedIpPoolProps
import software.constructs.Construct

public fun Construct.dedicatedIpPool(id: String, initializer: DedicatedIpPool.() -> Unit = {}):
    DedicatedIpPool = DedicatedIpPool(this, id).apply(initializer)

public fun Construct.dedicatedIpPool(
  id: String,
  props: DedicatedIpPoolProps,
  initializer: DedicatedIpPool.() -> Unit = {},
): DedicatedIpPool = DedicatedIpPool(this, id, props).apply(initializer)
