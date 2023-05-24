package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2.targets

import javax.`annotation`.Generated
import kotlin.Number
import software.amazon.awscdk.services.elasticloadbalancingv2.ApplicationLoadBalancer
import software.amazon.awscdk.services.elasticloadbalancingv2.targets.AlbTarget

@Generated
public fun albTarget(alb: ApplicationLoadBalancer, port: Number): AlbTarget = AlbTarget(alb, port)
