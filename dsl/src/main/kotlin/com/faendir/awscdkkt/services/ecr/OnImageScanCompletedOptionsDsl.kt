package com.faendir.awscdkkt.services.ecr

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ecr.OnImageScanCompletedOptions

@Generated
public fun onImageScanCompletedOptions(initializer: OnImageScanCompletedOptions.Builder.() -> Unit =
    {}): OnImageScanCompletedOptions =
    OnImageScanCompletedOptions.builder().apply(initializer).build()
