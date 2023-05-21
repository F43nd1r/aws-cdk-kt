package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnRouteTableProps

@Generated
public fun cfnRouteTableProps(initializer: CfnRouteTableProps.Builder.() -> Unit = {}):
    CfnRouteTableProps = CfnRouteTableProps.builder().apply(initializer).build()
