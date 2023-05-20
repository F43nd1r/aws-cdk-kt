@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnEndpoint

public
    fun failoverConfigProperty(initializer: CfnEndpoint.FailoverConfigProperty.Builder.() -> Unit):
    CfnEndpoint.FailoverConfigProperty =
    CfnEndpoint.FailoverConfigProperty.builder().apply(initializer).build()
