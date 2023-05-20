@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.HostedZone
import software.amazon.awscdk.services.route53.HostedZoneProps
import software.constructs.Construct

public fun Construct.hostedZone(
  id: String,
  props: HostedZoneProps,
  initializer: HostedZone.() -> Unit = {},
): HostedZone = HostedZone(this, id, props).apply(initializer)
