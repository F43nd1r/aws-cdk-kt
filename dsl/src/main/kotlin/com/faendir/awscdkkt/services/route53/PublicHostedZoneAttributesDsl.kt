package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.PublicHostedZoneAttributes

@Generated
public fun publicHostedZoneAttributes(initializer: PublicHostedZoneAttributes.Builder.() -> Unit =
    {}): PublicHostedZoneAttributes =
    PublicHostedZoneAttributes.builder().apply(initializer).build()
