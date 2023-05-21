package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.TxtRecordProps

@Generated
public fun txtRecordProps(initializer: TxtRecordProps.Builder.() -> Unit = {}): TxtRecordProps =
    TxtRecordProps.builder().apply(initializer).build()
