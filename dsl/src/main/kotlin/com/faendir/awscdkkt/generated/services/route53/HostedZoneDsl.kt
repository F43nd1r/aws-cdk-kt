package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.HostedZone
import software.amazon.awscdk.services.route53.HostedZoneProps
import software.constructs.Construct

@Generated
public fun Construct.hostedZone(
  id: String,
  props: HostedZoneProps,
  initializer: @AwsCdkDsl HostedZone.() -> Unit = {},
): HostedZone = HostedZone(this, id, props).apply(initializer)

@Generated
public fun Construct.buildHostedZone(id: String, initializer: @AwsCdkDsl HostedZone.Builder.() -> Unit = {}): HostedZone = HostedZone.Builder.create(this, id).apply(initializer).build()
