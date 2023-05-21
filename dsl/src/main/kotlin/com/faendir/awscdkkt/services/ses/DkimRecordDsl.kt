package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.DkimRecord

@Generated
public fun dkimRecord(initializer: DkimRecord.Builder.() -> Unit = {}): DkimRecord =
    DkimRecord.builder().apply(initializer).build()
