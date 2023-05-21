package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.CfnReceiptFilter

@Generated
public fun filterProperty(initializer: CfnReceiptFilter.FilterProperty.Builder.() -> Unit = {}):
    CfnReceiptFilter.FilterProperty =
    CfnReceiptFilter.FilterProperty.builder().apply(initializer).build()
