package com.faendir.awscdkkt.services.gamelift

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.gamelift.CfnFleet

@Generated
public fun ipPermissionProperty(initializer: CfnFleet.IpPermissionProperty.Builder.() -> Unit = {}):
    CfnFleet.IpPermissionProperty =
    CfnFleet.IpPermissionProperty.builder().apply(initializer).build()
