package com.faendir.awscdkkt.generated.services.ec2

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnRouteTable
import software.amazon.awscdk.services.ec2.CfnRouteTableProps
import software.constructs.Construct

@Generated
public fun Construct.cfnRouteTable(id: String, props: CfnRouteTableProps): CfnRouteTable =
    CfnRouteTable(this, id, props)

@Generated
public fun Construct.cfnRouteTable(
  id: String,
  props: CfnRouteTableProps,
  initializer: @AwsCdkDsl CfnRouteTable.() -> Unit,
): CfnRouteTable = CfnRouteTable(this, id, props).apply(initializer)

@Generated
public fun Construct.buildCfnRouteTable(id: String, initializer: @AwsCdkDsl
    CfnRouteTable.Builder.() -> Unit): CfnRouteTable = CfnRouteTable.Builder.create(this,
    id).apply(initializer).build()
