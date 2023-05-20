@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnEmailIdentity

public
    fun dkimAttributesProperty(initializer: CfnEmailIdentity.DkimAttributesProperty.Builder.() -> Unit):
    CfnEmailIdentity.DkimAttributesProperty =
    CfnEmailIdentity.DkimAttributesProperty.builder().apply(initializer).build()
