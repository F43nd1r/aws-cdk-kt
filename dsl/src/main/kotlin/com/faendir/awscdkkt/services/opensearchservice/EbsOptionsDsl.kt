package com.faendir.awscdkkt.services.opensearchservice

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.opensearchservice.EbsOptions

@Generated
public fun ebsOptions(initializer: EbsOptions.Builder.() -> Unit = {}): EbsOptions =
    EbsOptions.builder().apply(initializer).build()
