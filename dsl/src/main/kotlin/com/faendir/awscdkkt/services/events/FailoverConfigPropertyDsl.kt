@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.events

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.events.CfnEndpoint

public
    fun failoverConfigProperty(initializer: CfnEndpoint.FailoverConfigProperty.Builder.() -> Unit):
    CfnEndpoint.FailoverConfigProperty =
    CfnEndpoint.FailoverConfigProperty.builder().apply(initializer).build()
