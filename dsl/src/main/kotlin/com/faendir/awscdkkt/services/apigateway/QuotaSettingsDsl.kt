@file:Generated(value = ["Generated based on CDK v2.80.0"])

package com.faendir.awscdkkt.services.apigateway

import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.QuotaSettings

public fun quotaSettings(initializer: QuotaSettings.Builder.() -> Unit): QuotaSettings =
    QuotaSettings.builder().apply(initializer).build()
