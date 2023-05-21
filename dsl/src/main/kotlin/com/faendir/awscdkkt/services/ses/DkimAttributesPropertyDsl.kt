package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnEmailIdentity

@Generated
public
    fun dkimAttributesProperty(initializer: CfnEmailIdentity.DkimAttributesProperty.Builder.() -> Unit
    = {}): CfnEmailIdentity.DkimAttributesProperty =
    CfnEmailIdentity.DkimAttributesProperty.builder().apply(initializer).build()
