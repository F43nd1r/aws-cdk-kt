@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.vpclattice

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociation
import software.amazon.awscdk.services.vpclattice.CfnServiceNetworkServiceAssociationProps
import software.constructs.Construct

public fun Construct.cfnServiceNetworkServiceAssociation(
  id: String,
  props: CfnServiceNetworkServiceAssociationProps,
  initializer: CfnServiceNetworkServiceAssociation.() -> Unit = {},
): CfnServiceNetworkServiceAssociation = CfnServiceNetworkServiceAssociation(this, id,
    props).apply(initializer)

public fun Construct.cfnServiceNetworkServiceAssociation(id: String,
    initializer: CfnServiceNetworkServiceAssociation.() -> Unit = {}):
    CfnServiceNetworkServiceAssociation = CfnServiceNetworkServiceAssociation(this,
    id).apply(initializer)
