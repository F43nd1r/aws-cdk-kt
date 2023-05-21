package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.MxRecordValue

@Generated
public fun mxRecordValue(initializer: MxRecordValue.Builder.() -> Unit = {}): MxRecordValue =
    MxRecordValue.builder().apply(initializer).build()
