package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2.targets

import javax.`annotation`.Generated
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.targets.InstanceIdTarget

@Generated
public fun instanceIdTarget(instanceId: String): InstanceIdTarget = InstanceIdTarget(instanceId)

@Generated
public fun instanceIdTarget(instanceId: String, port: Number): InstanceIdTarget =
    InstanceIdTarget(instanceId, port)
