@file:Generated(value = ["Generated 2023-05-20 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

public
    fun failoverConditionProperty(initializer: CfnChannel.FailoverConditionProperty.Builder.() -> Unit):
    CfnChannel.FailoverConditionProperty =
    CfnChannel.FailoverConditionProperty.builder().apply(initializer).build()
