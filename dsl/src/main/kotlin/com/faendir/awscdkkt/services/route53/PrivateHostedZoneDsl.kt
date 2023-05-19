@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

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
