package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2Service
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2ServiceProps
import software.constructs.Construct

@Generated
public fun Construct.applicationMultipleTargetGroupsEc2Service(id: String,
    initializer: ApplicationMultipleTargetGroupsEc2Service.() -> Unit = {}):
    ApplicationMultipleTargetGroupsEc2Service = ApplicationMultipleTargetGroupsEc2Service(this,
    id).apply(initializer)

@Generated
public fun Construct.applicationMultipleTargetGroupsEc2Service(
  id: String,
  props: ApplicationMultipleTargetGroupsEc2ServiceProps,
  initializer: ApplicationMultipleTargetGroupsEc2Service.() -> Unit = {},
): ApplicationMultipleTargetGroupsEc2Service = ApplicationMultipleTargetGroupsEc2Service(this, id,
    props).apply(initializer)
