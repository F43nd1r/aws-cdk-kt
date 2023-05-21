package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation
import software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps
import software.constructs.Construct

@Generated
public fun Construct.cfnSubnetRouteTableAssociation(
  id: String,
  props: CfnSubnetRouteTableAssociationProps,
  initializer: CfnSubnetRouteTableAssociation.() -> Unit = {},
): CfnSubnetRouteTableAssociation = CfnSubnetRouteTableAssociation(this, id,
    props).apply(initializer)
