@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.networkmanager

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.networkmanager.CfnLinkAssociation
import software.amazon.awscdk.services.networkmanager.CfnLinkAssociationProps
import software.constructs.Construct

public fun Construct.cfnLinkAssociation(
  id: String,
  props: CfnLinkAssociationProps,
  initializer: CfnLinkAssociation.() -> Unit = {},
): CfnLinkAssociation = CfnLinkAssociation(this, id, props).apply(initializer)
