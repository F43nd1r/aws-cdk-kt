@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

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
