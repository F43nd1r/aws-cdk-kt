@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.PrivateHostedZone
import software.amazon.awscdk.services.route53.PrivateHostedZoneProps
import software.constructs.Construct

public fun Construct.privateHostedZone(
  id: String,
  props: PrivateHostedZoneProps,
  initializer: PrivateHostedZone.() -> Unit = {},
): PrivateHostedZone = PrivateHostedZone(this, id, props).apply(initializer)
