@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.vpclattice

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociation
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkVpcAssociationProps
import software.constructs.Construct

public fun Construct.cfnServiceNetworkVpcAssociation(id: String,
    initializer: CfnServiceNetworkVpcAssociation.() -> Unit = {}): CfnServiceNetworkVpcAssociation =
    CfnServiceNetworkVpcAssociation(this, id).apply(initializer)

public fun Construct.cfnServiceNetworkVpcAssociation(
  id: String,
  props: CfnServiceNetworkVpcAssociationProps,
  initializer: CfnServiceNetworkVpcAssociation.() -> Unit = {},
): CfnServiceNetworkVpcAssociation = CfnServiceNetworkVpcAssociation(this, id,
    props).apply(initializer)
