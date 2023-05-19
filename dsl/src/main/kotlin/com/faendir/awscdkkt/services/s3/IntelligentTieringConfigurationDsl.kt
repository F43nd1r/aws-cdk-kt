@file:Generated(value = ["Generated 2023-05-19 based on CDK 2.79.1"])

package com.faendir.awscdkkt.services.s3

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.s3.IntelligentTieringConfiguration

public
    fun intelligentTieringConfiguration(initializer: IntelligentTieringConfiguration.Builder.() -> Unit):
    IntelligentTieringConfiguration =
    IntelligentTieringConfiguration.builder().apply(initializer).build()
