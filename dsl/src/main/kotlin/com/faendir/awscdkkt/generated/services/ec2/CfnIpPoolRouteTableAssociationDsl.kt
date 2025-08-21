package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnIpPoolRouteTableAssociation
import software.amazon.awscdk.services.ec2.CfnIpPoolRouteTableAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnIpPoolRouteTableAssociation(
  id: String,
  props: CfnIpPoolRouteTableAssociationProps,
  initializer: @AwsCdkDsl CfnIpPoolRouteTableAssociation.() -> Unit = {},
): CfnIpPoolRouteTableAssociation = CfnIpPoolRouteTableAssociation(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnIpPoolRouteTableAssociation(id: String, initializer: @AwsCdkDsl CfnIpPoolRouteTableAssociation.Builder.() -> Unit = {}): CfnIpPoolRouteTableAssociation = CfnIpPoolRouteTableAssociation.Builder.create(this, id).apply(initializer).build()
