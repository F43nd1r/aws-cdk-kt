package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnEmailIdentity

@Generated
public
    fun dkimSigningAttributesProperty(initializer: CfnEmailIdentity.DkimSigningAttributesProperty.Builder.() -> Unit
    = {}): CfnEmailIdentity.DkimSigningAttributesProperty =
    CfnEmailIdentity.DkimSigningAttributesProperty.builder().apply(initializer).build()
