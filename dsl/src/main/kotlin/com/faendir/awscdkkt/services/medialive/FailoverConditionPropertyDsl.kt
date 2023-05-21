package com.faendir.awscdkkt.services.medialive

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.medialive.CfnChannel

@Generated
public
    fun failoverConditionProperty(initializer: CfnChannel.FailoverConditionProperty.Builder.() -> Unit
    = {}): CfnChannel.FailoverConditionProperty =
    CfnChannel.FailoverConditionProperty.builder().apply(initializer).build()
