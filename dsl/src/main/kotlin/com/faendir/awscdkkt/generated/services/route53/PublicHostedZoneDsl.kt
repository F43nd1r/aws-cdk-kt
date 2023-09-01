package com.faendir.awscdkkt.generated.services.route53

import com.faendir.awscdkkt.AwsCdkDsl
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
  initializer: @AwsCdkDsl PublicHostedZone.() -> Unit = {},
): PublicHostedZone = PublicHostedZone(this, id, props).apply(initializer)

@Generated
public fun Construct.buildPublicHostedZone(id: String, initializer: @AwsCdkDsl
    PublicHostedZone.Builder.() -> Unit = {}): PublicHostedZone =
    PublicHostedZone.Builder.create(this, id).apply(initializer).build()
