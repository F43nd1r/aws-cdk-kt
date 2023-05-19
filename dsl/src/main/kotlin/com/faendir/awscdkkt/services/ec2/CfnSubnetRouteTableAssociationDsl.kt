@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociation
import software.amazon.awscdk.services.ec2.CfnSubnetRouteTableAssociationProps
import software.constructs.Construct

public fun Construct.cfnSubnetRouteTableAssociation(
  id: String,
  props: CfnSubnetRouteTableAssociationProps,
  initializer: CfnSubnetRouteTableAssociation.() -> Unit = {},
): CfnSubnetRouteTableAssociation = CfnSubnetRouteTableAssociation(this, id,
    props).apply(initializer)
