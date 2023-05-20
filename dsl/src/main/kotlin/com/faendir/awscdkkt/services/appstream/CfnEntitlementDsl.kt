@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.appstream

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnEntitlement
import software.amazon.awscdk.services.appstream.CfnEntitlementProps
import software.constructs.Construct

public fun Construct.cfnEntitlement(
  id: String,
  props: CfnEntitlementProps,
  initializer: CfnEntitlement.() -> Unit = {},
): CfnEntitlement = CfnEntitlement(this, id, props).apply(initializer)
