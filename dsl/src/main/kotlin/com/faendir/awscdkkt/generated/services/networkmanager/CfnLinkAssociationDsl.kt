package com.faendir.awscdkkt.generated.services.networkmanager

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnLinkAssociation
import software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnLinkAssociation(id: String, props: CfnLinkAssociationProps):
    CfnLinkAssociation = CfnLinkAssociation(this, id, props)

@Generated
public fun Construct.cfnLinkAssociation(
  id: String,
  props: CfnLinkAssociationProps,
  initializer: @AwsCdkDsl CfnLinkAssociation.() -> Unit,
): CfnLinkAssociation = CfnLinkAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnLinkAssociation(id: String, initializer: @AwsCdkDsl
    CfnLinkAssociation.Builder.() -> Unit): CfnLinkAssociation =
    CfnLinkAssociation.Builder.create(this, id).apply(initializer).build()
