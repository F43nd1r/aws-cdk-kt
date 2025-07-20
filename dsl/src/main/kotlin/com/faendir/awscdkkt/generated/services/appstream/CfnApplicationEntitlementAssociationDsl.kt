package com.faendir.awscdkkt.generated.services.appstream

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnApplicationEntitlementAssociation.() -> Unit = {},
): CfnApplicationEntitlementAssociation = CfnApplicationEntitlementAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnApplicationEntitlementAssociation(id: String, initializer: @AwsCdkDsl CfnApplicationEntitlementAssociation.Builder.() -> Unit = {}): CfnApplicationEntitlementAssociation = CfnApplicationEntitlementAssociation.Builder.create(this, id).apply(initializer).build()
