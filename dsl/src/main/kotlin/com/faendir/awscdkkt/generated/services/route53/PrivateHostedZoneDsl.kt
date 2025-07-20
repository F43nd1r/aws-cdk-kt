package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.route53.PrivateHostedZone
import software.amazon.awscdk.services.route53.PrivateHostedZoneProps
import software.constructs.Construct

@Generated
public fun Construct.privateHostedZone(
  id: String,
  props: PrivateHostedZoneProps,
  initializer: @AwsCdkDsl PrivateHostedZone.() -> Unit = {},
): PrivateHostedZone = PrivateHostedZone(this, id, props).apply(initializer)

@Generated
public fun Construct.buildPrivateHostedZone(id: String, initializer: @AwsCdkDsl PrivateHostedZone.Builder.() -> Unit = {}): PrivateHostedZone = PrivateHostedZone.Builder.create(this, id).apply(initializer).build()
