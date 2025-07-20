package com.faendir.awscdkkt.generated.services.vpclattice

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnServiceNetworkVpcAssociation(id: String, initializer: @AwsCdkDsl CfnServiceNetworkVpcAssociation.() -> Unit = {}): CfnServiceNetworkVpcAssociation = CfnServiceNetworkVpcAssociation(this, id).apply(initializer)

@Generated
public fun Construct.cfnServiceNetworkVpcAssociation(
  id: String,
  props: CfnServiceNetworkVpcAssociationProps,
  initializer: @AwsCdkDsl CfnServiceNetworkVpcAssociation.() -> Unit = {},
): CfnServiceNetworkVpcAssociation = CfnServiceNetworkVpcAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnServiceNetworkVpcAssociation(id: String, initializer: @AwsCdkDsl CfnServiceNetworkVpcAssociation.Builder.() -> Unit = {}): CfnServiceNetworkVpcAssociation = CfnServiceNetworkVpcAssociation.Builder.create(this, id).apply(initializer).build()
