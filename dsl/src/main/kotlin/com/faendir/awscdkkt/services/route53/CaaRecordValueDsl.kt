package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CaaRecordValue

@Generated
public fun caaRecordValue(initializer: CaaRecordValue.Builder.() -> Unit = {}): CaaRecordValue =
    CaaRecordValue.builder().apply(initializer).build()
