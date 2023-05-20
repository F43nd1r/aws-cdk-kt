@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptFilter

public fun ipFilterProperty(initializer: CfnReceiptFilter.IpFilterProperty.Builder.() -> Unit):
    CfnReceiptFilter.IpFilterProperty =
    CfnReceiptFilter.IpFilterProperty.builder().apply(initializer).build()
