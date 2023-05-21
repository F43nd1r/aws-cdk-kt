package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsServiceBaseProps

@Generated
public
    fun networkMultipleTargetGroupsServiceBaseProps(initializer: NetworkMultipleTargetGroupsServiceBaseProps.Builder.() -> Unit
    = {}): NetworkMultipleTargetGroupsServiceBaseProps =
    NetworkMultipleTargetGroupsServiceBaseProps.builder().apply(initializer).build()
