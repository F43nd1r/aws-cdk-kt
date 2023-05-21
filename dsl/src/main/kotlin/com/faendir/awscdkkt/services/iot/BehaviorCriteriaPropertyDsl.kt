package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnSecurityProfile

@Generated
public
    fun behaviorCriteriaProperty(initializer: CfnSecurityProfile.BehaviorCriteriaProperty.Builder.() -> Unit
    = {}): CfnSecurityProfile.BehaviorCriteriaProperty =
    CfnSecurityProfile.BehaviorCriteriaProperty.builder().apply(initializer).build()
