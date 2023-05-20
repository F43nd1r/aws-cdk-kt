@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsEc2ServiceProps

public
    fun networkMultipleTargetGroupsEc2ServiceProps(initializer: NetworkMultipleTargetGroupsEc2ServiceProps.Builder.() -> Unit):
    NetworkMultipleTargetGroupsEc2ServiceProps =
    NetworkMultipleTargetGroupsEc2ServiceProps.builder().apply(initializer).build()
