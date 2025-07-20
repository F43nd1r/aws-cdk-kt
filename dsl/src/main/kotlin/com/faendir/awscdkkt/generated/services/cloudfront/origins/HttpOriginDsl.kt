package com.faendir.awscdkkt.generated.services.cloudfront.origins

import com.faendir.awscdkkt.AwsCdkDsl
import javax.`annotation`.Generated
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.cloudfront.origins.HttpOrigin

@Generated
public fun buildHttpOrigin(domainName: String, initializer: @AwsCdkDsl HttpOrigin.Builder.() -> Unit = {}): HttpOrigin = HttpOrigin.Builder.create(domainName).apply(initializer).build()
