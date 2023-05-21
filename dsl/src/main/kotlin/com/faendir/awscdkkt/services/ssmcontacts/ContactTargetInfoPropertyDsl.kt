package com.faendir.awscdkkt.services.ssmcontacts

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ssmcontacts.CfnPlan

@Generated
public
    fun contactTargetInfoProperty(initializer: CfnPlan.ContactTargetInfoProperty.Builder.() -> Unit
    = {}): CfnPlan.ContactTargetInfoProperty =
    CfnPlan.ContactTargetInfoProperty.builder().apply(initializer).build()
