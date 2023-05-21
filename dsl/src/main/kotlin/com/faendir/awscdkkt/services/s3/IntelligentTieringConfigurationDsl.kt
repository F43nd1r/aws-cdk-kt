package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.IntelligentTieringConfiguration

@Generated
public
    fun intelligentTieringConfiguration(initializer: IntelligentTieringConfiguration.Builder.() -> Unit
    = {}): IntelligentTieringConfiguration =
    IntelligentTieringConfiguration.builder().apply(initializer).build()
