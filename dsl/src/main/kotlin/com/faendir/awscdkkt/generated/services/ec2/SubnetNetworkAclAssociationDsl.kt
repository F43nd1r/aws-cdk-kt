package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociation
import software.amazon.awscdk.services.ec2.SubnetNetworkAclAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.subnetNetworkAclAssociation(
  id: String,
  props: SubnetNetworkAclAssociationProps,
  initializer: @AwsCdkDsl SubnetNetworkAclAssociation.() -> Unit = {},
): SubnetNetworkAclAssociation = SubnetNetworkAclAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildSubnetNetworkAclAssociation(id: String, initializer: @AwsCdkDsl SubnetNetworkAclAssociation.Builder.() -> Unit = {}): SubnetNetworkAclAssociation = SubnetNetworkAclAssociation.Builder.create(this, id).apply(initializer).build()
