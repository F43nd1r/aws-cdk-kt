package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl CfnSubnetNetworkAclAssociation.() -> Unit = {},
): CfnSubnetNetworkAclAssociation = CfnSubnetNetworkAclAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSubnetNetworkAclAssociation(id: String, initializer: @AwsCdkDsl CfnSubnetNetworkAclAssociation.Builder.() -> Unit = {}): CfnSubnetNetworkAclAssociation = CfnSubnetNetworkAclAssociation.Builder.create(this, id).apply(initializer).build()
