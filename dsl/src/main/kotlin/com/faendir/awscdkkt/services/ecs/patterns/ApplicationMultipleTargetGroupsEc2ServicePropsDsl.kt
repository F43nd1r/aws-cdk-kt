package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2ServiceProps

@Generated
public
    fun applicationMultipleTargetGroupsEc2ServiceProps(initializer: ApplicationMultipleTargetGroupsEc2ServiceProps.Builder.() -> Unit
    = {}): ApplicationMultipleTargetGroupsEc2ServiceProps =
    ApplicationMultipleTargetGroupsEc2ServiceProps.builder().apply(initializer).build()
