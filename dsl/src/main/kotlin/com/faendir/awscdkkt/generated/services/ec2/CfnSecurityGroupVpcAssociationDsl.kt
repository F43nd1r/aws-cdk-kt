package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSecurityGroupVpcAssociation
import software.amazon.awscdk.services.ec2.CfnSecurityGroupVpcAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSecurityGroupVpcAssociation(
  id: String,
  props: CfnSecurityGroupVpcAssociationProps,
  initializer: @AwsCdkDsl CfnSecurityGroupVpcAssociation.() -> Unit = {},
): CfnSecurityGroupVpcAssociation = CfnSecurityGroupVpcAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnSecurityGroupVpcAssociation(id: String, initializer: @AwsCdkDsl CfnSecurityGroupVpcAssociation.Builder.() -> Unit = {}): CfnSecurityGroupVpcAssociation = CfnSecurityGroupVpcAssociation.Builder.create(this, id).apply(initializer).build()
