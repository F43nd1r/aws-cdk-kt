@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation
import software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps
import software.constructs.Construct

public fun Construct.subnetNetworkAclAssociation(
  id: String,
  props: SubnetNetworkAclAssociationProps,
  initializer: SubnetNetworkAclAssociation.() -> Unit = {},
): SubnetNetworkAclAssociation = SubnetNetworkAclAssociation(this, id, props).apply(initializer)
