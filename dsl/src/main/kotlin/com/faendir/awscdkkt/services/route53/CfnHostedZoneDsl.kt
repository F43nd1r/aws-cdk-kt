package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnHostedZone
import software.amazon.awscdk.services.route53.CfnHostedZoneProps
import software.constructs.Construct

@Generated
public fun Construct.cfnHostedZone(id: String, initializer: CfnHostedZone.() -> Unit = {}):
    CfnHostedZone = CfnHostedZone(this, id).apply(initializer)

@Generated
public fun Construct.cfnHostedZone(
  id: String,
  props: CfnHostedZoneProps,
  initializer: CfnHostedZone.() -> Unit = {},
): CfnHostedZone = CfnHostedZone(this, id, props).apply(initializer)
