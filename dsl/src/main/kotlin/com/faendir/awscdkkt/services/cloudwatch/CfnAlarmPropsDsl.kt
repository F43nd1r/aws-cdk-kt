package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.CfnAlarmProps

@Generated
public fun cfnAlarmProps(initializer: CfnAlarmProps.Builder.() -> Unit = {}): CfnAlarmProps =
    CfnAlarmProps.builder().apply(initializer).build()
