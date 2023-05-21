package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnEmailIdentity

@Generated
public
    fun configurationSetAttributesProperty(initializer: CfnEmailIdentity.ConfigurationSetAttributesProperty.Builder.() -> Unit
    = {}): CfnEmailIdentity.ConfigurationSetAttributesProperty =
    CfnEmailIdentity.ConfigurationSetAttributesProperty.builder().apply(initializer).build()
