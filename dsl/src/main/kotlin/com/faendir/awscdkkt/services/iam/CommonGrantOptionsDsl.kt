package com.faendir.awscdkkt.services.iam

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.iam.CommonGrantOptions

@Generated
public fun commonGrantOptions(initializer: CommonGrantOptions.Builder.() -> Unit = {}):
    CommonGrantOptions = CommonGrantOptions.builder().apply(initializer).build()
