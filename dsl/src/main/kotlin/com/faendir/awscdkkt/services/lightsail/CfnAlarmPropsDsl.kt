package com.faendir.awscdkkt.services.lightsail

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.lightsail.CfnAlarmProps

@Generated
public fun cfnAlarmProps(initializer: CfnAlarmProps.Builder.() -> Unit = {}): CfnAlarmProps =
    CfnAlarmProps.builder().apply(initializer).build()
