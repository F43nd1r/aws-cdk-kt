package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnRouteProps

@Generated
public fun cfnRouteProps(initializer: CfnRouteProps.Builder.() -> Unit = {}): CfnRouteProps =
    CfnRouteProps.builder().apply(initializer).build()
