package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.HostedZoneAttributes

@Generated
public fun hostedZoneAttributes(initializer: HostedZoneAttributes.Builder.() -> Unit = {}):
    HostedZoneAttributes = HostedZoneAttributes.builder().apply(initializer).build()
