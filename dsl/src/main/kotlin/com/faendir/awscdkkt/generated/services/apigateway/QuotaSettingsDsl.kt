package com.faendir.awscdkkt.generated.services.apigateway

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.QuotaSettings

@Generated
public fun buildQuotaSettings(initializer: @AwsCdkDsl QuotaSettings.Builder.() -> Unit = {}):
    QuotaSettings = QuotaSettings.Builder().apply(initializer).build()
