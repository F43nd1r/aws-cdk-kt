package com.faendir.awscdkkt.generated.services.appstream

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnEntitlement
import software.amazon.awscdk.services.appstream.CfnEntitlementProps
import software.constructs.Construct

@Generated
public fun Construct.cfnEntitlement(id: String, props: CfnEntitlementProps): CfnEntitlement =
    CfnEntitlement(this, id, props)

@Generated
public fun Construct.cfnEntitlement(
  id: String,
  props: CfnEntitlementProps,
  initializer: @AwsCdkDsl CfnEntitlement.() -> Unit,
): CfnEntitlement = CfnEntitlement(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnEntitlement(id: String, initializer: @AwsCdkDsl
    CfnEntitlement.Builder.() -> Unit): CfnEntitlement = CfnEntitlement.Builder.create(this,
    id).apply(initializer).build()
