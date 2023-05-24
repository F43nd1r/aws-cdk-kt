package com.faendir.awscdkkt.generated.services.vpclattice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServiceNetworkServiceAssociation(id: String,
    props: CfnServiceNetworkServiceAssociationProps): CfnServiceNetworkServiceAssociation =
    CfnServiceNetworkServiceAssociation(this, id, props)

@Generated
public fun Construct.cfnServiceNetworkServiceAssociation(
  id: String,
  props: CfnServiceNetworkServiceAssociationProps,
  initializer: @AwsCdkDsl CfnServiceNetworkServiceAssociation.() -> Unit,
): CfnServiceNetworkServiceAssociation = CfnServiceNetworkServiceAssociation(this, id,
    props).apply(initializer)

@Generated
public fun Construct.cfnServiceNetworkServiceAssociation(id: String):
    CfnServiceNetworkServiceAssociation = CfnServiceNetworkServiceAssociation(this, id)

@Generated
public fun Construct.cfnServiceNetworkServiceAssociation(id: String, initializer: @AwsCdkDsl
    CfnServiceNetworkServiceAssociation.() -> Unit): CfnServiceNetworkServiceAssociation =
    CfnServiceNetworkServiceAssociation(this, id).apply(initializer)

@Generated
public fun Construct.buildCfnServiceNetworkServiceAssociation(id: String, initializer: @AwsCdkDsl
    CfnServiceNetworkServiceAssociation.Builder.() -> Unit): CfnServiceNetworkServiceAssociation =
    CfnServiceNetworkServiceAssociation.Builder.create(this, id).apply(initializer).build()
