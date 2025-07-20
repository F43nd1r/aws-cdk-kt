@file:Suppress("DEPRECATION")

package com.faendir.awscdkkt.generated.services.elasticsearch

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Deprecated
import kotlin.Suppress
import kotlin.Unit
import software.amazon.awscdk.services.elasticsearch.EbsOptions

@Deprecated(message = "software.amazon.awscdk.services.elasticsearch.EbsOptions is deprecated in CDK.")
@Generated
public fun buildEbsOptions(initializer: @AwsCdkDsl EbsOptions.Builder.() -> Unit = {}): EbsOptions = EbsOptions.Builder().apply(initializer).build()
