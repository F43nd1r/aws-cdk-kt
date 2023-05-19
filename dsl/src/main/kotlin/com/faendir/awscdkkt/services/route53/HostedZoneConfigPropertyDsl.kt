@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnHostedZone

public
    fun hostedZoneConfigProperty(initializer: CfnHostedZone.HostedZoneConfigProperty.Builder.() -> Unit):
    CfnHostedZone.HostedZoneConfigProperty =
    CfnHostedZone.HostedZoneConfigProperty.builder().apply(initializer).build()
