package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsEc2Service
import software.amazon.awscdk.services.ecs.patterns.NetworkMultipleTargetGroupsEc2ServiceProps
import software.constructs.Construct

@Generated
public fun Construct.networkMultipleTargetGroupsEc2Service(id: String):
    NetworkMultipleTargetGroupsEc2Service = NetworkMultipleTargetGroupsEc2Service(this, id)

@Generated
public fun Construct.networkMultipleTargetGroupsEc2Service(id: String, initializer: @AwsCdkDsl
    NetworkMultipleTargetGroupsEc2Service.() -> Unit): NetworkMultipleTargetGroupsEc2Service =
    NetworkMultipleTargetGroupsEc2Service(this, id).apply(initializer)

@Generated
public fun Construct.networkMultipleTargetGroupsEc2Service(id: String,
    props: NetworkMultipleTargetGroupsEc2ServiceProps): NetworkMultipleTargetGroupsEc2Service =
    NetworkMultipleTargetGroupsEc2Service(this, id, props)

@Generated
public fun Construct.networkMultipleTargetGroupsEc2Service(
  id: String,
  props: NetworkMultipleTargetGroupsEc2ServiceProps,
  initializer: @AwsCdkDsl NetworkMultipleTargetGroupsEc2Service.() -> Unit,
): NetworkMultipleTargetGroupsEc2Service = NetworkMultipleTargetGroupsEc2Service(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildNetworkMultipleTargetGroupsEc2Service(id: String, initializer: @AwsCdkDsl
    NetworkMultipleTargetGroupsEc2Service.Builder.() -> Unit): NetworkMultipleTargetGroupsEc2Service
    = NetworkMultipleTargetGroupsEc2Service.Builder.create(this, id).apply(initializer).build()
