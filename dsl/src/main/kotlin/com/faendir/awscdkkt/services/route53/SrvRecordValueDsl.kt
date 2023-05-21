package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.SrvRecordValue

@Generated
public fun srvRecordValue(initializer: SrvRecordValue.Builder.() -> Unit = {}): SrvRecordValue =
    SrvRecordValue.builder().apply(initializer).build()
