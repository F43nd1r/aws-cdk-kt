@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.route53

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.route53.SrvRecordValue

public fun srvRecordValue(initializer: SrvRecordValue.Builder.() -> Unit): SrvRecordValue =
    SrvRecordValue.builder().apply(initializer).build()
