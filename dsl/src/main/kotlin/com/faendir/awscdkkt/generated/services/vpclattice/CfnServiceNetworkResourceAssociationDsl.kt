package com.faendir.awscdkkt.generated.services.vpclattice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociation
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkResourceAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServiceNetworkResourceAssociation(id: String, initializer: @AwsCdkDsl
    CfnServiceNetworkResourceAssociation.() -> Unit = {}): CfnServiceNetworkResourceAssociation =
    CfnServiceNetworkResourceAssociation(this, id).apply(initializer)

@Generated
public fun Construct.cfnServiceNetworkResourceAssociation(
  id: String,
  props: CfnServiceNetworkResourceAssociationProps,
  initializer: @AwsCdkDsl CfnServiceNetworkResourceAssociation.() -> Unit = {},
): CfnServiceNetworkResourceAssociation = CfnServiceNetworkResourceAssociation(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildCfnServiceNetworkResourceAssociation(id: String, initializer: @AwsCdkDsl
    CfnServiceNetworkResourceAssociation.Builder.() -> Unit = {}):
    CfnServiceNetworkResourceAssociation = CfnServiceNetworkResourceAssociation.Builder.create(this,
    id).apply(initializer).build()
