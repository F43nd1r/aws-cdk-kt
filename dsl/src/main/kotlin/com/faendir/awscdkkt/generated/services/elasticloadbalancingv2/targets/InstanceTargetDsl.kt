package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2.targets

import javax.`annotation`.Generated
import kotlin.Number
import software.amazon.awscdk.services.ec2.Instance
import software.amazon.awscdk.services.elasticloadbalancingv2.targets.InstanceTarget

@Generated
public fun instanceTarget(instance: Instance): InstanceTarget = InstanceTarget(instance)

@Generated
public fun instanceTarget(instance: Instance, port: Number): InstanceTarget =
    InstanceTarget(instance, port)
