package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnHostedZone

@Generated
public
    fun queryLoggingConfigProperty(initializer: CfnHostedZone.QueryLoggingConfigProperty.Builder.() -> Unit
    = {}): CfnHostedZone.QueryLoggingConfigProperty =
    CfnHostedZone.QueryLoggingConfigProperty.builder().apply(initializer).build()
