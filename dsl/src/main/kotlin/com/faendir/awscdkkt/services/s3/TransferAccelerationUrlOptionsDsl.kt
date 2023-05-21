package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.TransferAccelerationUrlOptions

@Generated
public
    fun transferAccelerationUrlOptions(initializer: TransferAccelerationUrlOptions.Builder.() -> Unit
    = {}): TransferAccelerationUrlOptions =
    TransferAccelerationUrlOptions.builder().apply(initializer).build()
