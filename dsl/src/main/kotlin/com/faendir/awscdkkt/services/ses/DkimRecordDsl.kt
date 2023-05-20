@file:Generated(value = ["Generated based on CDK v2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.DkimRecord

public fun dkimRecord(initializer: DkimRecord.Builder.() -> Unit): DkimRecord =
    DkimRecord.builder().apply(initializer).build()
