package com.faendir.awscdkkt.services.iot

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iot.CfnSecurityProfile

@Generated
public
    fun alertTargetProperty(initializer: CfnSecurityProfile.AlertTargetProperty.Builder.() -> Unit =
    {}): CfnSecurityProfile.AlertTargetProperty =
    CfnSecurityProfile.AlertTargetProperty.builder().apply(initializer).build()
