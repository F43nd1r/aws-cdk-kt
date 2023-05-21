package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.SrvRecordProps

@Generated
public fun srvRecordProps(initializer: SrvRecordProps.Builder.() -> Unit = {}): SrvRecordProps =
    SrvRecordProps.builder().apply(initializer).build()
