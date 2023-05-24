package com.faendir.awscdkkt.generated.services.mediaconnect

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlement
import software.amazon.awscdk.services.mediaconnect.CfnFlowEntitlementProps
import software.constructs.Construct

@Generated
public fun Construct.cfnFlowEntitlement(id: String, props: CfnFlowEntitlementProps):
    CfnFlowEntitlement = CfnFlowEntitlement(this, id, props)

@Generated
public fun Construct.cfnFlowEntitlement(
  id: String,
  props: CfnFlowEntitlementProps,
  initializer: @AwsCdkDsl CfnFlowEntitlement.() -> Unit,
): CfnFlowEntitlement = CfnFlowEntitlement(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnFlowEntitlement(id: String, initializer: @AwsCdkDsl
    CfnFlowEntitlement.Builder.() -> Unit): CfnFlowEntitlement =
    CfnFlowEntitlement.Builder.create(this, id).apply(initializer).build()
