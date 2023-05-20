@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CfnHealthCheck

public
    fun alarmIdentifierProperty(initializer: CfnHealthCheck.AlarmIdentifierProperty.Builder.() -> Unit):
    CfnHealthCheck.AlarmIdentifierProperty =
    CfnHealthCheck.AlarmIdentifierProperty.builder().apply(initializer).build()
