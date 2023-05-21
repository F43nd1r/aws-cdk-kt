package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.PublicHostedZone
import software.amazon.awscdk.services.route53.PublicHostedZoneProps
import software.constructs.Construct

@Generated
public fun Construct.publicHostedZone(
  id: String,
  props: PublicHostedZoneProps,
  initializer: PublicHostedZone.() -> Unit = {},
): PublicHostedZone = PublicHostedZone(this, id, props).apply(initializer)
