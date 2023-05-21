package com.faendir.awscdkkt.services.ses

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.ses.ByoDkimOptions

@Generated
public fun byoDkimOptions(initializer: ByoDkimOptions.Builder.() -> Unit = {}): ByoDkimOptions =
    ByoDkimOptions.builder().apply(initializer).build()
