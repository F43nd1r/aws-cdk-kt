@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnHostedZone

public
    fun queryLoggingConfigProperty(initializer: CfnHostedZone.QueryLoggingConfigProperty.Builder.() -> Unit):
    CfnHostedZone.QueryLoggingConfigProperty =
    CfnHostedZone.QueryLoggingConfigProperty.builder().apply(initializer).build()
