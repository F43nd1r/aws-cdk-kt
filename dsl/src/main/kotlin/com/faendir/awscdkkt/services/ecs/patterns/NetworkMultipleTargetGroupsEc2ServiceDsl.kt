@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ecs.patterns

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsEc2Service
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsEc2ServiceProps
import software.constructs.Construct

public fun Construct.networkMultipleTargetGroupsEc2Service(id: String,
    initializer: NetworkMultipleTargetGroupsEc2Service.() -> Unit = {}):
    NetworkMultipleTargetGroupsEc2Service = NetworkMultipleTargetGroupsEc2Service(this,
    id).apply(initializer)

public fun Construct.networkMultipleTargetGroupsEc2Service(
  id: String,
  props: NetworkMultipleTargetGroupsEc2ServiceProps,
  initializer: NetworkMultipleTargetGroupsEc2Service.() -> Unit = {},
): NetworkMultipleTargetGroupsEc2Service = NetworkMultipleTargetGroupsEc2Service(this, id,
    props).apply(initializer)
