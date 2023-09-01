package com.faendir.awscdkkt.generated.services.ecs.patterns

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2Service
import software.amazon.awscdk.services.ecs.patterns.ApplicationMultipleTargetGroupsEc2ServiceProps
import software.constructs.Construct

@Generated
public fun Construct.applicationMultipleTargetGroupsEc2Service(id: String, initializer: @AwsCdkDsl
    ApplicationMultipleTargetGroupsEc2Service.() -> Unit = {}):
    ApplicationMultipleTargetGroupsEc2Service = ApplicationMultipleTargetGroupsEc2Service(this,
    id).apply(initializer)

@Generated
public fun Construct.applicationMultipleTargetGroupsEc2Service(
  id: String,
  props: ApplicationMultipleTargetGroupsEc2ServiceProps,
  initializer: @AwsCdkDsl ApplicationMultipleTargetGroupsEc2Service.() -> Unit = {},
): ApplicationMultipleTargetGroupsEc2Service = ApplicationMultipleTargetGroupsEc2Service(this, id,
    props).apply(initializer)

@Generated
public fun Construct.buildApplicationMultipleTargetGroupsEc2Service(id: String,
    initializer: @AwsCdkDsl ApplicationMultipleTargetGroupsEc2Service.Builder.() -> Unit = {}):
    ApplicationMultipleTargetGroupsEc2Service =
    ApplicationMultipleTargetGroupsEc2Service.Builder.create(this, id).apply(initializer).build()
