@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.elasticsearch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions

@Deprecated(message =
    "software.amazon.awscdk.services.elasticsearch.AdvancedSecurityOptions is deprecated in CDK.")
@Generated
public fun buildAdvancedSecurityOptions(initializer: @AwsCdkDsl
    AdvancedSecurityOptions.Builder.() -> Unit = {}): AdvancedSecurityOptions =
    AdvancedSecurityOptions.Builder().apply(initializer).build()
