package com.faendir.awscdkkt.services.appstream

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociation
import software.amazon.awscdk.services.appstream.CfnApplicationEntitlementAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnApplicationEntitlementAssociation(
  id: String,
  props: CfnApplicationEntitlementAssociationProps,
  initializer: CfnApplicationEntitlementAssociation.() -> Unit = {},
): CfnApplicationEntitlementAssociation = CfnApplicationEntitlementAssociation(this, id,
    props).apply(initializer)
