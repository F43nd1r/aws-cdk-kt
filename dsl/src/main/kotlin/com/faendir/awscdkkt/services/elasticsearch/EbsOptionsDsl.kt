@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.EbsOptions

@Deprecated(message =
    "software.amazon.awscdk.services.elasticsearch.EbsOptions is deprecated in CDK.")
@Generated
public fun ebsOptions(initializer: EbsOptions.Builder.() -> Unit = {}): EbsOptions =
    EbsOptions.builder().apply(initializer).build()
