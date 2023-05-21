package com.faendir.awscdkkt.services.ec2

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ec2.CfnLaunchTemplate

@Generated
public fun monitoringProperty(initializer: CfnLaunchTemplate.MonitoringProperty.Builder.() -> Unit =
    {}): CfnLaunchTemplate.MonitoringProperty =
    CfnLaunchTemplate.MonitoringProperty.builder().apply(initializer).build()
