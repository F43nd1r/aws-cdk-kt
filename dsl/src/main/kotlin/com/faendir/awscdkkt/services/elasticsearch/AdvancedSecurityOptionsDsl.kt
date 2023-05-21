@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.services.elasticsearch

import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions

@Deprecated(message =
    "software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions is deprecated in CDK.")
@Generated
public fun advancedSecurityOptions(initializer: AdvancedSecurityOptions.Builder.() -> Unit = {}):
    AdvancedSecurityOptions = AdvancedSecurityOptions.builder().apply(initializer).build()
