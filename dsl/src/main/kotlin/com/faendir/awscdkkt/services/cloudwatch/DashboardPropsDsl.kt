package com.faendir.awscdkkt.services.cloudwatch

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.cloudwatch.DashboardProps

@Generated
public fun dashboardProps(initializer: DashboardProps.Builder.() -> Unit = {}): DashboardProps =
    DashboardProps.builder().apply(initializer).build()
