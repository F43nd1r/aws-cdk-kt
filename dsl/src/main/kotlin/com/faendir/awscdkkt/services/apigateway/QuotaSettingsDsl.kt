package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.QuotaSettings

@Generated
public fun quotaSettings(initializer: QuotaSettings.Builder.() -> Unit = {}): QuotaSettings =
    QuotaSettings.builder().apply(initializer).build()
