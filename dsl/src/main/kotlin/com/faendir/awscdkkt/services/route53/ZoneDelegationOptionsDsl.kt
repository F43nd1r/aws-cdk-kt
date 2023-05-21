package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.ZoneDelegationOptions

@Generated
public fun zoneDelegationOptions(initializer: ZoneDelegationOptions.Builder.() -> Unit = {}):
    ZoneDelegationOptions = ZoneDelegationOptions.builder().apply(initializer).build()
