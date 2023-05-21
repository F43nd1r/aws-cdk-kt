package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnHostedZone

@Generated
public fun vPCProperty(initializer: CfnHostedZone.VPCProperty.Builder.() -> Unit = {}):
    CfnHostedZone.VPCProperty = CfnHostedZone.VPCProperty.builder().apply(initializer).build()
