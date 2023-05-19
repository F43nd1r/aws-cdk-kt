@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.pinpointemail

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool
import software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPoolProps
import software.constructs.Construct

public fun Construct.cfnDedicatedIpPool(id: String, initializer: CfnDedicatedIpPool.() -> Unit =
    {}): CfnDedicatedIpPool = CfnDedicatedIpPool(this, id).apply(initializer)

public fun Construct.cfnDedicatedIpPool(
  id: String,
  props: CfnDedicatedIpPoolProps,
  initializer: CfnDedicatedIpPool.() -> Unit = {},
): CfnDedicatedIpPool = CfnDedicatedIpPool(this, id, props).apply(initializer)
