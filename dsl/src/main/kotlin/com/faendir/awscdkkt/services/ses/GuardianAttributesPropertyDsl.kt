package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnVdmAttributes

@Generated
public
    fun guardianAttributesProperty(initializer: CfnVdmAttributes.GuardianAttributesProperty.Builder.() -> Unit
    = {}): CfnVdmAttributes.GuardianAttributesProperty =
    CfnVdmAttributes.GuardianAttributesProperty.builder().apply(initializer).build()
