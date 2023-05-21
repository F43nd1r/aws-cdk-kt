package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.RecordSetProps

@Generated
public fun recordSetProps(initializer: RecordSetProps.Builder.() -> Unit = {}): RecordSetProps =
    RecordSetProps.builder().apply(initializer).build()
