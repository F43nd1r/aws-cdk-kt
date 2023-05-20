@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.pipelines

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.pipelines.ECRSourceOptions

public fun eCRSourceOptions(initializer: ECRSourceOptions.Builder.() -> Unit): ECRSourceOptions =
    ECRSourceOptions.builder().apply(initializer).build()
