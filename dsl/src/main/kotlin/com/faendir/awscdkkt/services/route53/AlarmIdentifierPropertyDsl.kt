@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnHealthCheck

public
    fun alarmIdentifierProperty(initializer: CfnHealthCheck.AlarmIdentifierProperty.Builder.() -> Unit):
    CfnHealthCheck.AlarmIdentifierProperty =
    CfnHealthCheck.AlarmIdentifierProperty.builder().apply(initializer).build()
