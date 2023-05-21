package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.PublicHostedZoneProps

@Generated
public fun publicHostedZoneProps(initializer: PublicHostedZoneProps.Builder.() -> Unit = {}):
    PublicHostedZoneProps = PublicHostedZoneProps.builder().apply(initializer).build()
