package com.faendir.awscdkkt.generated.services.elasticloadbalancingv2.targets

import javax.`annotation`.Generated
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.targets.IpTarget

@Generated
public fun ipTarget(ipAddress: String): IpTarget = IpTarget(ipAddress)

@Generated
public fun ipTarget(ipAddress: String, port: Number): IpTarget = IpTarget(ipAddress, port)

@Generated
public fun ipTarget(
  ipAddress: String,
  port: Number,
  availabilityZone: String,
): IpTarget = IpTarget(ipAddress, port, availabilityZone)
