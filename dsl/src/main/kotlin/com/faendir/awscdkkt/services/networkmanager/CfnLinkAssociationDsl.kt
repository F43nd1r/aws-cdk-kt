@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
