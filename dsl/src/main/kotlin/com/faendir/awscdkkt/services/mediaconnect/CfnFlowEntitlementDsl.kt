package com.faendir.awscdkkt.services.mediaconnect

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement
import software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFlowEntitlement(
  id: String,
  props: CfnFlowEntitlementProps,
  initializer: CfnFlowEntitlement.() -> Unit = {},
): CfnFlowEntitlement = CfnFlowEntitlement(this, id, props).apply(initializer)
