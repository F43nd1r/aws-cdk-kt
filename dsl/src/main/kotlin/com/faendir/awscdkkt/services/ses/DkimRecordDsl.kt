@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.DkimRecord

public fun dkimRecord(initializer: DkimRecord.Builder.() -> Unit): DkimRecord =
    DkimRecord.builder().apply(initializer).build()
