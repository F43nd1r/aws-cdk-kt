package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.HostedZoneProviderProps

@Generated
public fun hostedZoneProviderProps(initializer: HostedZoneProviderProps.Builder.() -> Unit = {}):
    HostedZoneProviderProps = HostedZoneProviderProps.builder().apply(initializer).build()
