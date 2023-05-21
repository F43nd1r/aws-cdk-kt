package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.CnameRecordProps

@Generated
public fun cnameRecordProps(initializer: CnameRecordProps.Builder.() -> Unit = {}): CnameRecordProps
    = CnameRecordProps.builder().apply(initializer).build()
