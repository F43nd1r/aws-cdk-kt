@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnRouteTable
import software.amazon.awscdk.services.ec2.CfnRouteTableProps
import software.constructs.Construct

public fun Construct.cfnRouteTable(
  id: String,
  props: CfnRouteTableProps,
  initializer: CfnRouteTable.() -> Unit = {},
): CfnRouteTable = CfnRouteTable(this, id, props).apply(initializer)
