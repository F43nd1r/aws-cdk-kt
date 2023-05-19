@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociation
import software.amazon.awscdk.services.ec2.CfnClientVpnTargetNetworkAssociationProps
import software.constructs.Construct

public fun Construct.cfnClientVpnTargetNetworkAssociation(
  id: String,
  props: CfnClientVpnTargetNetworkAssociationProps,
  initializer: CfnClientVpnTargetNetworkAssociation.() -> Unit = {},
): CfnClientVpnTargetNetworkAssociation = CfnClientVpnTargetNetworkAssociation(this, id,
    props).apply(initializer)
