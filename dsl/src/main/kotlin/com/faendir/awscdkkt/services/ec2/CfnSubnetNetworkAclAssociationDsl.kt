package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociation
import software.amazon.awscdk.services.ec2.CfnSubnetNetworkAclAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSubnetNetworkAclAssociation(
  id: String,
  props: CfnSubnetNetworkAclAssociationProps,
  initializer: CfnSubnetNetworkAclAssociation.() -> Unit = {},
): CfnSubnetNetworkAclAssociation = CfnSubnetNetworkAclAssociation(this, id,
    props).apply(initializer)
