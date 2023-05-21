package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnSecurityProfile

@Generated
public fun behaviorProperty(initializer: CfnSecurityProfile.BehaviorProperty.Builder.() -> Unit =
    {}): CfnSecurityProfile.BehaviorProperty =
    CfnSecurityProfile.BehaviorProperty.builder().apply(initializer).build()
